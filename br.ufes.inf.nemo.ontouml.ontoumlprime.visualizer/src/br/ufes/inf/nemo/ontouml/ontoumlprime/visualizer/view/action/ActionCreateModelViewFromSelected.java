package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.log.Log;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewManager;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.OntoUMLPrimeView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.ModelViewElementTreeObject;

public class ActionCreateModelViewFromSelected extends Action {
	
	private static ActionCreateModelViewFromSelected sharedInstance = new ActionCreateModelViewFromSelected();
	
	public static ActionCreateModelViewFromSelected sharedInstance() {
		if (sharedInstance == null) {
			sharedInstance = new ActionCreateModelViewFromSelected();
		}
		return sharedInstance;
	}
	
	public ActionCreateModelViewFromSelected() {
		super();
		setText("Create model view...");
		setToolTipText("Creates a model view containing selected elements.");
		setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJ_ADD));
	}
	
	@Override
	public void run() {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		if (page == null) {
			Log.e(200, this.getClass(), "there's no active workbench page");
			return;
		}
		
		IViewPart view = page.findView(OntoUMLPrimeView.ID);
		if (view == null || !(view instanceof OntoUMLPrimeView)) {
			Log.e(200, this.getClass(), "OntoUMLPrimeView not found");
			return;
		}
		
		OntoUMLPrimeView oumlView = ((OntoUMLPrimeView) view);
		IStructuredSelection selection = (IStructuredSelection) oumlView.getViewerSelection();
		Iterator<Object> iterator = selection.iterator();
		
		final List<EObject> selectedElementList = new ArrayList<>();
		while(iterator.hasNext()) {
			Object obj = iterator.next();	
			if(obj instanceof ModelViewElementTreeObject) {
				selectedElementList.add(((ModelViewElementTreeObject) obj).getModelElementView().getModelElement());
			}
		}
		
		final String modelTitle = ModelViewManager.getCurrentModelTitle();
		
		IInputValidator validator = new IInputValidator() {
			@Override
			public String isValid(String newText) {
				if(newText.isEmpty()) {
					return "Enter name for your model view.";
				}
				
				Iterator<ModelView> i = ModelViewManager.getModelViewList(modelTitle).getModelViewListIterator();
				while(i.hasNext()) {
					ModelView v = i.next();
					if(v.getVisionName().equals(newText)) {
						return "Model view " + newText + " already exists.";
					}
				}
				return null;
			}
		};
		
		InputDialog i = new InputDialog(oumlView.getSite().getShell(), "Create new model view for "+modelTitle+"...", "", "", validator);
		
		switch(i.open()) {
			case Window.OK:
				ModelView mv = ModelViewManager.getModelViewList(modelTitle).addModelView(i.getValue(), selectedElementList);
				oumlView.refreshViewerAndSelectModelView(mv);
				break;
			case Window.CANCEL:
			default:
				break;
		}
	}
	
}
