package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewManager;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.ActionUtils;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.OntoUMLPrimeView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.ModelViewTreeObject;

public class ActionSetModelViewActive extends Action {
	
	private static ActionSetModelViewActive sharedInstance = new ActionSetModelViewActive();
	
	public static ActionSetModelViewActive sharedInstance() {
		if (sharedInstance == null) {
			sharedInstance = new ActionSetModelViewActive();
		}
		return sharedInstance;
	}
	
	public ActionSetModelViewActive() {
		super();
		setText("Set model view as active...");
		setToolTipText("Set the selected model view as active.");
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
		
		if (selection.size() == 1 && selection.getFirstElement() instanceof ModelViewTreeObject) {
			
			ModelViewTreeObject selectedModelViewObject = (ModelViewTreeObject) selection.getFirstElement();
			//ModelViewTreeObject parentModelViewObject = (ModelViewTreeObject) selectedModelViewObject.getParent();
			ModelView selectedModelView = selectedModelViewObject.getModelView();
			
			ModelViewManager.getModelViewList(modelTitle).setSelectedModelView(selectedModelView);
			ModelViewManager.updateOntoUMLPrimeView();
			ModelViewManager.updatePlantUMLView();
			
		}
		
	}
	
}
