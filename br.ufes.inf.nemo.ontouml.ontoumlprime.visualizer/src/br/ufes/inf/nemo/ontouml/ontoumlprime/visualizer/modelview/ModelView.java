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
	
	private String visionName;
	final private boolean isDefault;
	
	private Map<String, ModelElementView> elementMap;
	
	public ModelView(String visionName) {
		this.visionName = visionName;
		elementMap = new HashMap<>();
		isDefault = false;
	}
	
	private ModelView(String modelViewName, boolean isDefault) {
		this.visionName = modelViewName;
		this.elementMap = new HashMap<>();
		this.isDefault = isDefault;
	}
	
	static ModelView newDefaultModelVision(EList<PackageableElement> elements) {
		ModelView v = new ModelView("Model", true);
		v.addElements(elements);
		return v;
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

	// TODO: remember to check this. It's better to be most generic, so use EOBJECT!
	public void addElements(EList<PackageableElement> elements) {
		for(EObject e : elements) {
			String id = OntoUMLPrimeUtils.generateId(e);
			ModelElementView v = elementMap.get(id);
			if(v == null) {
				v = new ModelElementView(e);
				elementMap.put(v.getId(), v);
			}
		}
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
			//String id = OntoUMLPrimeUtils.generateId(e);
			ModelElementView v = new ModelElementView(e);
			elementMap.put(v.getId(), v);
		}
	}
	
	public void deleteElement(String id) {
		elementMap.remove(id);
	}
	
	public List<ModelElementView> getModelElementViewList() {
		return new ArrayList<>(elementMap.values());
	}
	
	public ModelElementView getModelElementView(PackageableElement element) {
		return elementMap.get(OntoUMLPrimeUtils.generateId(element));
	}
	
	public ModelElementView getModelElementView(String id) {
		return elementMap.get(id);
	}

	public boolean isDefault() {
		return isDefault;
	}
	
	
	
	// ------------------------------------------------------------------------
	//public void setAllVisibility(boolean visibility) {
	//	for(String key : elementMap.keySet()) {
	//		elementMap.get(key).setVisible(visibility);
	//	}
	//}
	
}
