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

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.log.Log;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;
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
				// TODO finish this. So far, only filtering elements is working.
				final List<EObject> selectedElementList = new ArrayList<>();
				
				Log.p(500, this.getClass(), "List of allowed monadic universals: " + w.getCheckedMonadicUniversals());
				for (EObject e : scope) {
					Log.p(600, this.getClass(), "Checking " + ((NamedElement) e).getName() + " of metaclass " + e.getClass());
					/* Why equals instead of isIstance or similar? Efficiency.
					 * Classes are static objects, so better check directly if the elements in scope have
					 * the exact allowed classes.
					 */
					if (w.getCheckedMonadicUniversals().contains(e.getClass())) {
						selectedElementList.add(e);
					}
				}
				
				ModelView mv = ModelViewManager.getModelViewList(modelTitle).addModelView(w.getModelViewName(), selectedElementList);
				oumlView.refreshViewerAndSelectModelView(mv);
				
				break;
			case WizardDialog.CANCEL:
			default:
				break;
		}
		
	}
	
}
