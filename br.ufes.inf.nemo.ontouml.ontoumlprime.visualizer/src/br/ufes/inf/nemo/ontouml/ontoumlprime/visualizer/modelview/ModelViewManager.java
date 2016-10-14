package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.log.Log;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.plantuml.OntoUMLPrime2PlantUML;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.OntoUMLPrimeView;
import net.sourceforge.plantuml.eclipse.views.PlantUmlView;

public class ModelViewManager {
	
	private static String MODEL_VIEW_FILE_EXTENSION = ".smv"; // Serialized Model View
	
	private static Model currentModel;	// Keep in mind that this guy is generated EVERY TIME the editor is updated. EVERY TIME.
	private static String currentModelTitle;
	
	private static Map<String, ModelViewList> modelViewMap = new HashMap<>(); 
	
	/**
	 * Initializes the model view for the model generated by the active Xtext editor.
	 * If the model view exists, it returns it.
	 * @param modelTitle
	 * @param model
	 * @return
	 */
	public static ModelViewList initializeModelView(String modelTitle, Model model) {
		Log.p(200, ModelViewManager.class, "verifying model view list for " + modelTitle);
		ModelViewList v = modelViewMap.get(modelTitle);
		if (v == null) {
			Log.p(200, ModelViewManager.class, "creating model view list for " + modelTitle);
			v = new ModelViewList(modelTitle, model);
			modelViewMap.put(modelTitle, v);
		}
		v.updateDefaultModelView(model);
		Log.p(200, ModelViewManager.class, "returning model view list for " + modelTitle);
		return v;
	}
	
	public static ModelViewList getModelViewList(String modelTitle) {
		return modelViewMap.get(modelTitle);
	}
	
	public static Iterator<ModelView> getVisionListIterator(String modelName) {
		ModelViewList modelViewList = modelViewMap.get(modelName);
		if(modelViewList != null) {
			return modelViewList.getModelViewListIterator();
		} else {
			return null;
		}
	}
	
	/**
	 * Loads model view for current model from disk and overwrites the current ones.
	 * @param folderPath
	 * @param modelName
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void loadElements(String folderPath, String modelName) throws IOException, ClassNotFoundException {
		Log.p(100, ModelViewManager.class, "Loading model views for " + modelName + "...");
		final String workspacePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		
		FileInputStream fin;
		if (!folderPath.endsWith(File.separator)) {
			fin = new FileInputStream(workspacePath + folderPath + File.separator + modelName + MODEL_VIEW_FILE_EXTENSION);
		} else {
			fin = new FileInputStream(workspacePath + folderPath + modelName + MODEL_VIEW_FILE_EXTENSION);
		}
		
		ObjectInputStream ois = new ObjectInputStream(fin);
		ModelViewList mvl = (ModelViewList) ois.readObject();
		fin.close();
		
		Log.p(100, ModelViewManager.class, "Model views for " + modelName + " loaded.");
		
		Log.p(100, ModelViewManager.class, "Syncing loaded model views for " + modelName + "...");
		mvl.updateDefaultModelView(currentModel);
		Iterator<ModelView> mvi = mvl.getModelViewListIterator();
		while (mvi.hasNext()) {
			mvi.next().resyncWithModel(currentModel);
		}
		
		Log.p(100, ModelViewManager.class, "Loaded model views for " + modelName + " synced.");
		Log.printDivider();
		
		modelViewMap.put(modelName, mvl);
		
		updateOntoUMLPrimeView();
	}
	
	public static void saveElements(String folderPath, String modelName) throws IOException {
		Log.p(100, ModelViewManager.class, "Saving model views for " + modelName + "...");
		final String workspacePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		
		File modelViewFile;
		if (!folderPath.endsWith(File.separator)) {
			modelViewFile = new File(workspacePath + folderPath, File.separator + modelName + MODEL_VIEW_FILE_EXTENSION);
		} else {
			modelViewFile = new File(workspacePath + folderPath, modelName + MODEL_VIEW_FILE_EXTENSION);
		}
		
		modelViewFile.createNewFile();
		
		FileOutputStream fout = new FileOutputStream(modelViewFile);
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(modelViewMap.get(modelName));
		fout.close();
		
		Log.p(100, ModelViewManager.class, "Model views for " + modelName + " saved successfully at " + modelViewFile.getAbsolutePath() + ".");
		Log.printDivider();
	}
	
	// -------------------------------------------------------------------------
	
	public static Model getCurrentModel() {
		return currentModel;
	}

	public static void setCurrentModel(Model currentModel) {
		ModelViewManager.currentModel = currentModel;
	}

	public static String getCurrentModelTitle() {
		return currentModelTitle;
	}

	public static void setCurrentModelTitle(String currentModelTitle) {
		ModelViewManager.currentModelTitle = currentModelTitle;
	}
	
	public static ModelViewList getCurrentModelViewList() {
		return ModelViewManager.getModelViewList(currentModelTitle);
	}
	
	public static boolean isCurrentModelViewListInitialized() {
		String modelTitle = ModelViewManager.getCurrentModelTitle();
		ModelViewList modelViewList = ModelViewManager.getModelViewList(modelTitle);
		return modelViewList != null;
		
	}
	
	// -------------------------------------------------------------------------
	// UI methods
	// -------------------------------------------------------------------------
		
	/**
	 * Updates the OntoUMLPrime view if it's visible. Remember it refreshes based on 
	 * the current model attributes.
	 */
	public static void updateOntoUMLPrimeView() {
		Log.p(200, ModelViewManager.class, "OntoUMLPrime view refresh begun");
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IViewPart view = page.findView(OntoUMLPrimeView.ID);
		if (view != null && view instanceof OntoUMLPrimeView) {
			((OntoUMLPrimeView) view).refreshViewer();
			Log.p(200, ModelViewManager.class, "OntoUMLPrime view refresh ended");
		} else {
			Log.p(200, ModelViewManager.class, "OntoUMLPrime view not found");
		}
	}
	
	/**
	 * Directly updates the PlantUML visualization ONLY. Use it wisely as it may
	 * cause inconsistency if used before updating the OntoUMLPrime view, for example. 
	 */
	public static void updatePlantUMLView() {
		Log.p(200, ModelViewManager.class, "PlantUML view refresh begun");		
		
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		if (page == null) {
			Log.p(200, ModelViewManager.class, "there's no active workbench page");
			return;
		}
		
		IViewPart view = page.findView("net.sourceforge.plantuml.eclipse.views.PrimePlantUmlView");
		if (view != null && view instanceof PlantUmlView) {
			ModelViewList mvl = initializeModelView(currentModelTitle, currentModel);
			String code = OntoUMLPrime2PlantUML.generatePlantUMLCode(mvl.getSelectedModelView());
			((PlantUmlView) view).updateDiagram(code);
			Log.p(200, ModelViewManager.class, "PlantUML view refresh ended");
		} else {
			Log.p(200, ModelViewManager.class, "PlantUML view not found");
		}
		
	}
	
	/**
	 * Shows a message in the PlantUML view.
	 */
	public static void showMessageInPlantUMLView(String message) {
		Log.p(200, ModelViewManager.class, "PlantUML view refresh begun");		

		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		if (page == null) {
			Log.p(200, ModelViewManager.class, "there's no active workbench page");
			return;
		}
		
		IViewPart view = page.findView("net.sourceforge.plantuml.eclipse.views.PlantUmlView");
		if (view != null && view instanceof PlantUmlView) {
			((PlantUmlView) view).updateDiagram(OntoUMLPrime2PlantUML.showPlantUMLMessage("Active editor is not a Xtext Editor"));
			Log.p(200, ModelViewManager.class, "PlantUML view refresh ended");
		} else {
			Log.e(200, ModelViewManager.class, "PlantUML view not found");
		}
		
	}
	
}