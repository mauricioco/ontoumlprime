package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action;

import java.util.Iterator;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewManager;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.ActionUtils;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.OntoUMLPrimeView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.ModelViewElementTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.ModelViewTreeObject;

public class ActionRemoveElementFromModelView extends Action {
	private static ActionRemoveElementFromModelView sharedInstance = new ActionRemoveElementFromModelView();
	
	public static ActionRemoveElementFromModelView sharedInstance() {
		if (sharedInstance == null) {
			sharedInstance = new ActionRemoveElementFromModelView();
		}
		return sharedInstance;
	}
	
	public ActionRemoveElementFromModelView() {
		super();
		setText("Delete from parent model view...");
		setToolTipText("Delete this element from its parent model view.");
		setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_ELCL_REMOVE));
	}

	@Override
	public void run() {
		OntoUMLPrimeView oumlView = ActionUtils.getOntoUMLPrimeView();
		if (oumlView == null) {
			return;
		}
		
		IStructuredSelection selection = (IStructuredSelection) oumlView.getViewerSelection();
		Iterator<Object> iterator = selection.iterator();
		
		while(iterator.hasNext()) {
			Object obj = iterator.next();	
			if(obj instanceof ModelViewElementTreeObject) {
				ModelViewElementTreeObject mveto = ((ModelViewElementTreeObject) obj);
				ModelViewTreeObject mvto = (ModelViewTreeObject) mveto.getParent();
				if (!mvto.getModelView().isDefault()) {
					mvto.getModelView().deleteElement(mveto.getModelElementView().getId());
				}
			}
		}
		// TODO needs clearing selection.		
		ModelViewManager.updateOntoUMLPrimeView();
		ModelViewManager.updatePlantUMLView();
		
	}
	
}
