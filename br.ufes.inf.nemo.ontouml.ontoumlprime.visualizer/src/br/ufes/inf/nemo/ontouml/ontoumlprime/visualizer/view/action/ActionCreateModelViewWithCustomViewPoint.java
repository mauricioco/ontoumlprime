package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.EndurantUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.log.Log;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewManager;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.ActionUtils;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.OntoUMLPrimeView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.ModelViewElementTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.wizard.CreateFromCustomViewPointWizard;

public class ActionCreateModelViewWithCustomViewPoint extends Action {
	
	private static ActionCreateModelViewWithCustomViewPoint sharedInstance = new ActionCreateModelViewWithCustomViewPoint();
	
	public static ActionCreateModelViewWithCustomViewPoint sharedInstance() {
		if (sharedInstance == null) {
			sharedInstance = new ActionCreateModelViewWithCustomViewPoint();
		}
		return sharedInstance;
	}
	
	public ActionCreateModelViewWithCustomViewPoint() {
		super();
		setText("Create model view from custom view point...");
		setToolTipText("Creates a model view from a custom view point. Selected elements are the scope and the rules are set through a wizard.");
		setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJ_ADD));
	}
	
	// TODO needs to be different for Characterization and Mediation.
	private void addRelation(BinaryDirectedRelationship e, final List<String> selectedElementNameList, final List<EObject> selectedElementList, CreateFromCustomViewPointWizard w) {
		String sourceName = ((BinaryDirectedRelationship) e).getSourceEndName();
		String targetName = ((BinaryDirectedRelationship) e).getTargetEndName();
		
		Log.p(500, this.getClass(), "Relation: " + e);
		Log.p(500, this.getClass(), "Source: " + sourceName);
		Log.p(500, this.getClass(), "Target: " + targetName);
		/*
		if (selectedElementNameList.contains(sourceName)
				&& selectedElementNameList.contains(targetName)) {
			// Both are allowed. Nothing to be done.
			selectedElementList.add(e);
			Log.p(500, this.getClass(), "Relation added.");
			return;
		}
		*/
		String checkForName = "";
		if (selectedElementNameList.contains(sourceName)) {
			checkForName = targetName;
		}
		if (selectedElementNameList.contains(targetName)) {
			checkForName = sourceName;
		}
		
		if (checkForName == null || checkForName.isEmpty()) {
			Log.p(500, this.getClass(), "Relation not allowed.");
			return;
		}
		
		Log.p(500, this.getClass(), "Check for name: " + checkForName);
		
		ModelView defaultModelView = ModelViewManager.getCurrentModelViewList().getDefaultModelView();
		ModelViewElement relatedModelViewElement = defaultModelView.getModelViewElementWithElementName(checkForName);
		
		Log.p(500, this.getClass(), "Related element found: " + relatedModelViewElement);
		if (relatedModelViewElement != null 
				&& w.getCheckedRelatedMonadicUniversals().contains(relatedModelViewElement.getModelElement().getClass())) {
			// Check! Element allowed! Phew...
			selectedElementList.add(relatedModelViewElement.getModelElement());
			Log.p(500, this.getClass(), "Relation added.");
		}
	}
	
	@Override
	public void run() {
		OntoUMLPrimeView oumlView = ActionUtils.getOntoUMLPrimeView();
		if (oumlView == null) {
			return;
		}
		
		IStructuredSelection selection = (IStructuredSelection) oumlView.getViewerSelection();
		Iterator<Object> iterator = selection.iterator();
		
		final List<EObject> scope = new ArrayList<>();
		while(iterator.hasNext()) {
			Object obj = iterator.next();	
			if(obj instanceof ModelViewElementTreeObject) {
				scope.add(((ModelViewElementTreeObject) obj).getModelElementView().getModelElement());
			}
		}
		
		final String modelTitle = ModelViewManager.getCurrentModelTitle();
		
		CreateFromCustomViewPointWizard w = new CreateFromCustomViewPointWizard();
		WizardDialog wd = new WizardDialog(oumlView.getSite().getShell(), w);
		switch(wd.open()) {
			case WizardDialog.OK:
				final List<EObject> selectedElementList = new ArrayList<>();
				final List<String> selectedElementNameList = new ArrayList<>();	// Workaround to speed up Parts II and III.
				
				// TODO Modularize this later... sheesh.
				
				// Part I: filtering monadic universals...
				Log.p(500, this.getClass(), "List of allowed monadic universals: " + w.getCheckedMonadicUniversals());
				for (EObject e : scope) {
					// TODO not everybody is named.
					Log.p(600, this.getClass(), "Checking " + ((NamedElement) e).getName() + " of metaclass " + e.getClass());
					/* Why equals instead of isIstance or similar? Efficiency.
					 * Classes are static objects, so better check directly if the elements in scope have
					 * the exact allowed classes.
					 */
					if (w.getCheckedMonadicUniversals().contains(e.getClass())) {
						selectedElementList.add(e);
						selectedElementNameList.add(((NamedElement) e).getName());
					}
				}
				Log.p(500, this.getClass(), "Allowed elements names: " + selectedElementNameList);
				
				// Part II and III:
				// Relationships in OntoUMLPrime only have the name of related elements.
				// We have to iterate over ALL OF THEM and check...
				List<EObject> newScope = new ArrayList<>(selectedElementList);
				
				Model currentModel = ModelViewManager.getCurrentModelViewList().getModel();
				
				for (EObject e : currentModel.getElements()) {
					
					// Remember that relator is also an endurant.
					if (e instanceof RelatorUniversal) {
						Log.p(500, this.getClass(), "Relator found");
						for (Mediation m : ((RelatorUniversal) e).getMediations()) {
							addRelation(m, selectedElementNameList, selectedElementList, w);
						}
						continue;
					}
					
					if (e instanceof EndurantUniversal) {
						Log.p(500, this.getClass(), "Endurant found");
						for (Characterization c : ((EndurantUniversal) e).getCharacterizedBy()) {
							addRelation(c, selectedElementNameList, selectedElementList, w);
						}
						continue;
					}
					
					if (e instanceof BinaryDirectedRelationship) {
						addRelation((BinaryDirectedRelationship) e, selectedElementNameList, selectedElementList, w);
					}
					
				}
				Log.p(500, this.getClass(), "Allowed elements: " + selectedElementList);
				
				ModelView mv = ModelViewManager.getModelViewList(modelTitle).addModelView(w.getModelViewName(), selectedElementList);
				oumlView.refreshViewerAndSelectModelView(mv);
				
				break;
			case WizardDialog.CANCEL:
			default:
				break;
		}
		
	}
	
}
