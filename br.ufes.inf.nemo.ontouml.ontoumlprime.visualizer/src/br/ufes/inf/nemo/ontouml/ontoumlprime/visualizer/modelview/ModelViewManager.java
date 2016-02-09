package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.log.Log;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.plantuml.OntoUMLPrime2PlantUML;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.OntoUMLPrimeView;
import net.sourceforge.plantuml.eclipse.views.PlantUmlView;

public class ModelViewManager {
	
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
	
	public static void loadElements(String modelName) {
		
	}
	
	public static void saveElements(String modelName) {
		
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
		
		IViewPart view = page.findView("net.sourceforge.plantuml.eclipse.views.PlantUmlView");
		if (view != null && view instanceof PlantUmlView) {
			ModelViewList mvl = initializeModelView(currentModelTitle, currentModel);
			String code = OntoUMLPrime2PlantUML.generatePlantUMLCode(currentModel, mvl.getSelectedVision());
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
		// TODO improve code reuse.
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
			Log.p(200, ModelViewManager.class, "PlantUML view not found");
		}
		
	}
	
}