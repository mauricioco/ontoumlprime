package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.log.Log;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewList;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewManager;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.ActionUtils;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.OntoUMLPrimeView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.ModelViewTreeObject;

public class ActionDeleteModelView extends Action {
	
	private static ActionDeleteModelView sharedInstance = new ActionDeleteModelView();
	
	public static ActionDeleteModelView sharedInstance() {
		if (sharedInstance == null) {
			sharedInstance = new ActionDeleteModelView();
		}
		return sharedInstance;
	}
	
	public ActionDeleteModelView() {
		super();
		setText("Delete model view");
		setToolTipText("Deletes selected model view (irreversible).");
		setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
	}

	@Override
	public void run() {
		OntoUMLPrimeView oumlView = ActionUtils.getOntoUMLPrimeView();
		if (oumlView == null) {
			return;
		}
		
		TreeSelection selection = (TreeSelection) oumlView.getViewerSelection();
		
		if (selection.size() == 1 && selection.getFirstElement() instanceof ModelViewTreeObject) {
			
			ModelViewTreeObject selectedModelViewObject = (ModelViewTreeObject) selection.getFirstElement();
			ModelView selectedModelView = selectedModelViewObject.getModelView();
			ModelViewList currentModelViewList = ModelViewManager.getCurrentModelViewList();
			
			if (selectedModelView.isDefault()) {
				Log.e(200, this.getClass(), "Cannot delete default model view.");
				return;
			}
			
			currentModelViewList.removeModelView(selectedModelView);
			if (currentModelViewList.getSelectedModelView().equals(selectedModelView)) {
				currentModelViewList.setSelectedModelView(currentModelViewList.getDefaultModelView());
			}
			
			ModelViewManager.updateOntoUMLPrimeView();
			ModelViewManager.updatePlantUMLView();
			
		}
		
	}
}
