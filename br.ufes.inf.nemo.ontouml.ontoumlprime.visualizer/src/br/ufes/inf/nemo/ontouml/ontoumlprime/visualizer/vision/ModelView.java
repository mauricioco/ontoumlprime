package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.OntoUMLPrimeUtils;

public class ModelView {
	
	private String visionName;
	
	private Map<String, ModelElementView> elementMap;
	
	static ModelView newDefaultModelVision(EList<PackageableElement> elements) {
		ModelView v = new ModelView("Model");
		v.addElements(elements);
		return v;
	}
	
	public ModelView(String visionName) {
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
			elementMap.put(id, new ModelElementView(element));
		}
		//System.out.println("");
	}

	public void addElements(List<PackageableElement> elements) {
		for(PackageableElement e : elements) {
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