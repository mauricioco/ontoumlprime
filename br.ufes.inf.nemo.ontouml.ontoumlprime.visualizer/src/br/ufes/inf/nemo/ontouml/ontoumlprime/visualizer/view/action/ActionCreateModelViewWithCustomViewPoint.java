package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryFormalRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.EndurantUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ExternallyDependentUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.IntrinsicMomentUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.log.Log;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewManager;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.ActionUtils;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.OntoUMLPrimeView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.ModelViewElementTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.ModelViewTreeObject;
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
				getImageDescriptor(ISharedImages.IMG_TOOL_NEW_WIZARD));
	}
	
	@Override
	public void run() {
		OntoUMLPrimeView oumlView = ActionUtils.getOntoUMLPrimeView();
		if (oumlView == null) {
			return;
		}
		
		TreeSelection selection = (TreeSelection) oumlView.getViewerSelection();
		Iterator<Object> iterator = selection.iterator();
		
		final List<EObject> scope = new ArrayList<>();
		while(iterator.hasNext()) {
			Object obj = iterator.next();	
			if (obj instanceof ModelViewElementTreeObject) {
				scope.add(((ModelViewElementTreeObject) obj).getModelElementView().getModelElement());
			} else if (obj instanceof ModelViewTreeObject) {
				scope.addAll(((ModelViewTreeObject) obj).getModelView().getModelElementList());
			}
		}
		
		final String modelTitle = ModelViewManager.getCurrentModelTitle();
		
		CreateFromCustomViewPointWizard w = new CreateFromCustomViewPointWizard();
		WizardDialog wd = new WizardDialog(oumlView.getSite().getShell(), w);
		wd.setMinimumPageSize(0, 300);
		switch(wd.open()) {
			case WizardDialog.OK:
				final List<EObject> allowedElementList = new ArrayList<>();
				final List<String> allowedElementNameList = new ArrayList<>();	// Workaround to speed up Parts II and III.
				
				// TODO Modularize this later... sheesh.
				
				// Part I: filtering elements...
				Log.p(500, this.getClass(), "List of allowed monadic universals: " + w.getCheckedFilteredStereotypes());
				for (EObject e : scope) {
					Log.p(600, this.getClass(), "Checking " + e);
					/* Why equals instead of isIstance or similar? Efficiency.
					 * Classes are static objects, so better check directly if the elements in scope have
					 * the exact allowed classes.
					 */
					if (w.getCheckedFilteredStereotypes().contains(e.getClass())) {
						allowedElementList.add(e);
						if (e instanceof NamedElement) {
							allowedElementNameList.add(((NamedElement) e).getName());
						}
					}
				}
				Log.p(500, this.getClass(), "Allowed elements names: " + allowedElementNameList);
				
				// TODO Part II: filtering generalization sets...
				
				Log.p(500, this.getClass(), "Allowed elements: " + allowedElementList);
				
				ModelView mv = ModelViewManager.getModelViewList(modelTitle).addModelView(w.getModelViewName(), allowedElementList);
				oumlView.refreshViewerAndSelectModelView(mv);
				
				break;
			case WizardDialog.CANCEL:
			default:
				break;
		}
		
	}
	
}
