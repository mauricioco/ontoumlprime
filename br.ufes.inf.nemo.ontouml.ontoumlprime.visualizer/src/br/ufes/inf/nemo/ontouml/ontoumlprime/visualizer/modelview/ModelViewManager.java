package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.OntoUMLPrimeView;

public class ModelViewManager {
	
	private static Map<String, ModelViewList> modelViewMap = new HashMap<>(); 
	
	public static ModelViewList initialize(String modelTitle, Model model) {
		System.out.println("Verifying model view list for " + modelTitle);
		ModelViewList v = modelViewMap.get(modelTitle);
		if (v == null) {
			System.out.println("Creating model view list for " + modelTitle);
			v = new ModelViewList(modelTitle, model);
			modelViewMap.put(modelTitle, v);
		}
		v.updateDefaultModelView(model);
		return v;
	}
	
	public static ModelViewList getModelViewList(String modelTitle) {
		return modelViewMap.get(modelTitle);
	}
	
	public static Iterator<ModelView> getModelViewListIterator(String modelName) {
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
		
	// ---------------------------------------------------------
	
	
	
	// ---------------------------------------------------------
	
	public static void updateView() {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IViewPart view = page.findView(OntoUMLPrimeView.ID);
		if (view != null && view instanceof OntoUMLPrimeView) {
			((OntoUMLPrimeView) view).refreshViewer();
		}
	}
	
}
