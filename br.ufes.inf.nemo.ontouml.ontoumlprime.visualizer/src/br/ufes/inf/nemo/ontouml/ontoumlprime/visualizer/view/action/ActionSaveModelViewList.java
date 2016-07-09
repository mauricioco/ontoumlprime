package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action;

import java.io.File;
import java.io.IOException;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.ui.editor.XtextEditor;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.log.Log;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewManager;

public class ActionSaveModelViewList extends Action {
	private static ActionSaveModelViewList sharedInstance = new ActionSaveModelViewList();

	public static ActionSaveModelViewList sharedInstance() {
		if (sharedInstance == null) {
			sharedInstance = new ActionSaveModelViewList();
		}
		return sharedInstance;
	}
	
	public ActionSaveModelViewList() {
		super();
		setText("Save ModelView List...");
		setToolTipText("Saves the Model Views for this model on disk.");
		setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_ETOOL_SAVE_EDIT));
	}
	
	@Override
	public void run() {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		if (page == null) {
			Log.e(200, this.getClass(), "there's no active workbench page");
			return;
		}
		
		//IViewPart view = page.findView(XtextEditor.ID);
		IEditorPart editor = page.getActiveEditor();
		if (editor == null || !(editor instanceof XtextEditor)) {
			Log.e(200, this.getClass(), "Active editor is not a Xtext Editor");
			return;
		}
		XtextEditor xtextEditor = (XtextEditor) editor;
		
		File currentFolder = ((IFileEditorInput) xtextEditor.getEditorInput()).getFile().getFullPath().toFile().getParentFile();
		
		try {
			ModelViewManager.saveElements(currentFolder.getCanonicalPath(), xtextEditor.getTitle());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
