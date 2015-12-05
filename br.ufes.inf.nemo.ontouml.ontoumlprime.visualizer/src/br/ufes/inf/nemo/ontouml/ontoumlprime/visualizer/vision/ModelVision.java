package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.OntoUMLPrimeUtils;

public class ModelVision {
	
	private String visionName;
	
	private Map<String, ElementVision> elementMap;
	
	static ModelVision newDefaultModelVision(EList<PackageableElement> elements) {
		ModelVision v = new ModelVision("Model");
		v.addElements(elements);
		return v;
	}
	
	public ModelVision(String visionName) {
		this.visionName = visionName;
		elementMap = new HashMap<>();
	}
	
	public String getVisionName() {
		return visionName;
	}

	public void setVisionName(String visionName) {
		this.visionName = visionName;
	}
	
	public void addElement(PackageableElement element) {
		String id = OntoUMLPrimeUtils.generateId(element);
		if(elementMap.get(id) == null) {
			elementMap.put(id, new ElementVision(element));
		}
		//System.out.println("");
	}

	public void addElements(List<PackageableElement> elements) {
		for(PackageableElement e : elements) {
			String id = OntoUMLPrimeUtils.generateId(e);
			ElementVision v = elementMap.get(id);
			if(v == null) {
				v = new ElementVision(e);
				elementMap.put(v.getId(), v);
			}
		}
	}
	
	public List<ElementVision> getElementVisionList() {
		return new ArrayList<>(elementMap.values());
	}
	
	public ElementVision getElementVision(PackageableElement element) {
		return elementMap.get(OntoUMLPrimeUtils.generateId(element));
	}
	
	public ElementVision getElementVision(String id) {
		return elementMap.get(id);
	}
	
	// ------------------------------------------------------------------------
	
	public void setAllVisibility(boolean visibility) {
		for(String key : elementMap.keySet()) {
			elementMap.get(key).setVisible(visibility);
		}
	}
	
}