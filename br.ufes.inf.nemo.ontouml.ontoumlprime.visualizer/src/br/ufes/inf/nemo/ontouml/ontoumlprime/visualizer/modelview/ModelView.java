package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.OntoUMLPrimeUtils;

public class ModelView implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	final private boolean isDefault;
	
	private Map<String, ModelViewElement> elementMap;
	
	public ModelView(String name) {
		this.name = name;
		elementMap = new HashMap<>();
		isDefault = false;
	}
	
	private ModelView(String name, boolean isDefault) {
		this.name = name;
		this.elementMap = new HashMap<>();
		this.isDefault = isDefault;
	}
	
	static ModelView newDefaultModelView(EList<PackageableElement> elements) {
		ModelView v = new ModelView("Model", true);
		v.addElements(elements);
		return v;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addElement(PackageableElement element) {
		String id = OntoUMLPrimeUtils.generateId(element);
		if(elementMap.get(id) == null) {
			elementMap.put(id, new ModelViewElement(element));
		}
	}

	public void addElements(EList<PackageableElement> elements) {
		for(EObject e : elements) {
			String id = OntoUMLPrimeUtils.generateId(e);
			ModelViewElement v = elementMap.get(id);
			if(v == null) {
				v = new ModelViewElement(e);
				elementMap.put(v.getId(), v);
			}
		}
	}
	
	public void addElements(List<EObject> elements) {
		for(EObject e : elements) {
			String id = OntoUMLPrimeUtils.generateId(e);
			ModelViewElement v = elementMap.get(id);
			if(v == null) {
				v = new ModelViewElement(e);
				elementMap.put(v.getId(), v);
			}
		}
	}
	
	public void resetElements(Model newModel) {
		elementMap.clear();
		for(PackageableElement e : newModel.getElements()) {
			//String id = OntoUMLPrimeUtils.generateId(e);
			ModelViewElement v = new ModelViewElement(e);
			elementMap.put(v.getId(), v);
		}
	}
	
	/**
	 * Updates the modelElements fields from all ModelElementsView.
	 * It is possible that not all are updated (for instance, if the newModel
	 * doesn't contain an old element).
	 */
	public void resyncWithModel(Model newModel) {
		for(PackageableElement e : newModel.getElements()) {
			String id = OntoUMLPrimeUtils.generateId(e);
			ModelViewElement mve = elementMap.get(id);
			if (mve != null) {
				mve.setModelElement(e);
			}
		}
	}
	
	public void deleteElement(String id) {
		elementMap.remove(id);
	}
	
	public List<ModelViewElement> getModelElementViewList() {
		return new ArrayList<>(elementMap.values());
	}
	
	public ModelViewElement getModelElementView(PackageableElement element) {
		return elementMap.get(OntoUMLPrimeUtils.generateId(element));
	}
	
	public ModelViewElement getModelElementView(String id) {
		return elementMap.get(id);
	}

	public boolean isDefault() {
		return isDefault;
	}
	
}