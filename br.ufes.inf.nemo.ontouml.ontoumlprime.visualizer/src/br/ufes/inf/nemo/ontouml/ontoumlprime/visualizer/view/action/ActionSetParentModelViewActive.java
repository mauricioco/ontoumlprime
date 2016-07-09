package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action;

import java.util.Iterator;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.Model;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.log.Log;
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
				getImageDescriptor(ISharedImages.IMG_DEF_VIEW)); //TODO - change icon!
	}

	@Override
	public void run() {
		OntoUMLPrimeView oumlView = ActionUtils.getOntoUMLPrimeView();
		if (oumlView == null) {
			return;
		}
		
		IStructuredSelection selection = (IStructuredSelection) oumlView.getViewerSelection();
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
