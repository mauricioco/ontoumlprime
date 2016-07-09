package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action;

import java.io.File;
import java.io.IOException;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.ui.editor.XtextEditor;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.log.Log;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewManager;

public class ActionLoadModelViewList extends Action {
	private static ActionLoadModelViewList sharedInstance = new ActionLoadModelViewList();

	public static ActionLoadModelViewList sharedInstance() {
		if (sharedInstance == null) {
			sharedInstance = new ActionLoadModelViewList();
		}
		return sharedInstance;
	}
	
	public ActionLoadModelViewList() {
		super();
		setText("Load ModelView List...");
		setToolTipText("Load the Model Views for this model.");
		setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJ_FOLDER));
	}
	
	@Override
	public void run() {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		if (page == null) {
			Log.e(200, this.getClass(), "there's no active workbench page");
			return;
		}
		
		IEditorPart editor = page.getActiveEditor();
		if (editor == null || !(editor instanceof XtextEditor)) {
			Log.e(200, this.getClass(), "Active editor is not a Xtext Editor");
			return;
		}
		XtextEditor xtextEditor = (XtextEditor) editor;
		
		File currentFolder = ((IFileEditorInput) xtextEditor.getEditorInput()).getFile().getFullPath().toFile().getParentFile();
		
		try {
			ModelViewManager.loadElements(currentFolder.getCanonicalPath(), xtextEditor.getTitle());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
