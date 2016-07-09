package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action;

import java.util.Iterator;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewManager;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.ActionUtils;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.OntoUMLPrimeView;

public class ActionRenameModelView extends Action {
	
	// This one doesn't have shared instance because every action is different (it renames different model views).
	
	public static ActionRenameModelView newInstance(ModelView modelViewToAdd) {
		return new ActionRenameModelView(modelViewToAdd);
	}
	
	private ModelView modelViewToRename; 
	
	public ActionRenameModelView(ModelView modelViewToRename) {
		super();
		this.modelViewToRename = modelViewToRename;
		setText("Rename...");
		setToolTipText("Renames model view \"" + modelViewToRename.getName() + "\".");
		//setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			//	getImageDescriptor(ISharedImages.IMG_ETOOL_PRINT_EDIT));
	}
	
	@Override
	public void run() {
		OntoUMLPrimeView oumlView = ActionUtils.getOntoUMLPrimeView();
		if (oumlView == null) {
			return;
		}
		
		IInputValidator validator = new IInputValidator() {
			@Override
			public String isValid(String newText) {
				if(newText.equals(modelViewToRename.getName())) {
					return "Enter the new name for your model view.";
				}
				
				Iterator<ModelView> i = ModelViewManager.getCurrentModelViewList().getModelViewListIterator();
				while(i.hasNext()) {
					ModelView v = i.next();
					if(v.getName().equals(newText) && !v.equals(modelViewToRename)) {
						return "Model view " + newText + " already exists.";
					}
				}
				return null;
			}
		};
		
		InputDialog inputDialog = new InputDialog(oumlView.getSite().getShell(), "Rename "+ modelViewToRename.getName() + "..."
				, "", modelViewToRename.getName(), validator);
		
		switch(inputDialog.open()) {
			case Window.OK:
				modelViewToRename.setName(inputDialog.getValue());
				ModelViewManager.updateOntoUMLPrimeView();
				break;
			case Window.CANCEL:
			default:
				break;
		}
		
	}
	
}