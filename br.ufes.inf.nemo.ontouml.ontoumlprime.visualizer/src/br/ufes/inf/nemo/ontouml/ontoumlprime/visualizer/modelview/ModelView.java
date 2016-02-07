package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.OntoUMLPrimeUtils;

public class ModelView {
	
	private String modelViewName;
	
	private Map<String, ModelElementView> elementMap;
	
	static ModelView newDefaultModelVision(EList<PackageableElement> elements) {
		ModelView v = new ModelView("Model");
		
		v.addElements(new ArrayList<>(elements));
		return v;
	}
	
	public ModelView(String visionName) {
		this.modelViewName = visionName;
		elementMap = new HashMap<>();
	}
	/*
	public ModelView(String modelViewName, List<PackageableElement> elements) {
		this.modelViewName = modelViewName;
		addElements(elements);
	}
	*/
	public String getVisionName() {
		return modelViewName;
	}

	public void setVisionName(String visionName) {
		this.modelViewName = visionName;
	}
	
	public void addElement(PackageableElement element) {
		String id = OntoUMLPrimeUtils.generateId(element);
		if(elementMap.get(id) == null) {
			elementMap.put(id, new ModelElementView(element));
		}
		//System.out.println("");
	}

	public void addElements(List<EObject> elements) {
		for(EObject e : elements) {
			String id = OntoUMLPrimeUtils.generateId(e);
			ModelElementView v = elementMap.get(id);
			if(v == null) {
				v = new ModelElementView(e);
				elementMap.put(v.getId(), v);
			}
		}
	}
	
	public void reloadElements(Model newModel) {
		elementMap.clear();
		for(PackageableElement e : newModel.getElements()) {
			String id = OntoUMLPrimeUtils.generateId(e);
			ModelElementView v = new ModelElementView(e);
			elementMap.put(v.getId(), v);
		}
	}
	
	public List<ModelElementView> getElementVisionList() {
		return new ArrayList<>(elementMap.values());
	}
	
	public ModelElementView getElementVision(PackageableElement element) {
		return elementMap.get(OntoUMLPrimeUtils.generateId(element));
	}
	
	public ModelElementView getElementVision(String id) {
		return elementMap.get(id);
	}
	
	// ------------------------------------------------------------------------
	//public void setAllVisibility(boolean visibility) {
	//	for(String key : elementMap.keySet()) {
	//		elementMap.get(key).setVisible(visibility);
	//	}
	//}
	
}