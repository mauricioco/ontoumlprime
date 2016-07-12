package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewManager;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.ActionUtils;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.OntoUMLPrimeView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.ModelViewElementTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.ModelViewTreeObject;

public class ActionSetParentModelViewActive extends Action {
	
	private static ActionSetParentModelViewActive sharedInstance = new ActionSetParentModelViewActive();
	
	public static ActionSetParentModelViewActive sharedInstance() {
		if (sharedInstance == null) {
			sharedInstance = new ActionSetParentModelViewActive();
		}
		return sharedInstance;
	}
	
	public ActionSetParentModelViewActive() {
		super();
		setText("Set parent model view as active...");
		setToolTipText("Set the parent model view of this element as active.");
		setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_ELCL_SYNCED));
	}

	@Override
	public void run() {
		OntoUMLPrimeView oumlView = ActionUtils.getOntoUMLPrimeView();
		if (oumlView == null) {
			return;
		}
		
		TreeSelection selection = (TreeSelection) oumlView.getViewerSelection();
		final String modelTitle = ModelViewManager.getCurrentModelTitle();
		
		if (selection.size() == 1 && selection.getFirstElement() instanceof ModelViewElementTreeObject) {
			
			ModelViewElementTreeObject selectedModelViewObject = (ModelViewElementTreeObject) selection.getFirstElement();
			ModelViewTreeObject parentModelViewObject = (ModelViewTreeObject) selectedModelViewObject.getParent();
			ModelView selectedModelView = parentModelViewObject.getModelView();
			
			ModelViewManager.getModelViewList(modelTitle).setSelectedModelView(selectedModelView);
			ModelViewManager.updateOntoUMLPrimeView();
			ModelViewManager.updatePlantUMLView();
			
		}
		
	}
	
}
