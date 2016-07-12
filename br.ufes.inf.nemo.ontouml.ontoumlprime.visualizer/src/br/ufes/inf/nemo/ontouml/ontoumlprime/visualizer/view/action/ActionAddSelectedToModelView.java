package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewManager;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.ActionUtils;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.OntoUMLPrimeView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.ModelViewElementTreeObject;

public class ActionAddSelectedToModelView extends Action {
	
	// This one doesn't have shared instance because every action is different (it adds to different model views).
	// I just left the same static constructor to mantain consistency with other Actions and to make refactoring easy in case of bad performance.
	
	public static ActionAddSelectedToModelView newInstance(ModelView modelViewToAdd) {
		return new ActionAddSelectedToModelView(modelViewToAdd);
	}
	
	private ModelView modelViewToAdd; 
	
	public ActionAddSelectedToModelView(ModelView modelViewToAdd) {
		super();
		this.modelViewToAdd = modelViewToAdd;
		setText(modelViewToAdd.getName());
		setToolTipText("Adds selected elements to model view " + modelViewToAdd.getName() + ".");
	}
	
	@Override
	public void run() {
		OntoUMLPrimeView oumlView = ActionUtils.getOntoUMLPrimeView();
		if (oumlView == null) {
			return;
		}
		
		TreeSelection selection = (TreeSelection) oumlView.getViewerSelection();
		
		List<EObject> eObjectList = new ArrayList<EObject>();
		for(Object o : selection.toList()) {
			if(o instanceof ModelViewElementTreeObject) {
				eObjectList.add(((ModelViewElementTreeObject) o).getModelElementView().getModelElement());
			}
		}
		
		modelViewToAdd.addElements(eObjectList);
		
		ModelViewManager.updateOntoUMLPrimeView();
		ModelViewManager.updatePlantUMLView();
		
	}
	
}