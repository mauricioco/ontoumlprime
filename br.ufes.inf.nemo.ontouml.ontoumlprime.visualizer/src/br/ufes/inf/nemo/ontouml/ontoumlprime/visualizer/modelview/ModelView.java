package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryFormalRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.EndurantUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.log.Log;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.OntoUMLPrimeUtils;

public class ModelView implements Serializable {
	/* TODO confirm this: relationship may only be in modelview if related elements are as well.
	 * If single relationship is added to modelview, add its related elements as well.
	 * If single relationship is removed from modelview, remove its related elements as well.
	 */
	
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
	
	/**
	 * Returns true if the EObject e is not complete.
	 * @param e
	 * @return
	 */
	public boolean checkElement(EObject e) {
		if (e instanceof Characterization) {
			if(((Characterization) e).getTarget() == null
					|| ((Characterization) e).getSource() == null) {
				return true;
			}
		}
		
		if (e instanceof Mediation) {
			if(((Mediation) e).getTarget() == null
					|| ((Mediation) e).getSource() == null) {
				return true;
			}
		}
		
		if (e instanceof BinaryMaterialRelation) {
			if(((BinaryMaterialRelation) e).getSource() == null
					|| ((BinaryMaterialRelation) e).getTarget() == null
					|| ((BinaryMaterialRelation) e).getDerivedFrom() == null) {
				return true;
			}
		}
		
		if (e instanceof BinaryFormalRelation) {
			if(((BinaryFormalRelation) e).getSource() == null
					|| ((BinaryFormalRelation) e).getTarget() == null) {
				return true;
			}
		}
		
		return false;
	}

	public void addElement(EObject element) {
		if (checkElement(element)) {
			Log.e(300, this.getClass(), "Element " + element + " could not be added.");
			return;
		}
		
		String id = OntoUMLPrimeUtils.generateId(element);
		if(elementMap.get(id) == null) {
			elementMap.put(id, new ModelViewElement(element, this));
		}
			
		if (isDefault) {
			// Default model views add Characterizations and Mediations from their sources.
			if (element instanceof EndurantUniversal) {
				for (Characterization c : ((EndurantUniversal) element).getCharacterizedBy()) {
					addElement(c);
				}
			}
			if (element instanceof RelatorUniversal) {
				for (Mediation m : ((RelatorUniversal) element).getMediations()) {
					addElement(m);
				}
			}
		} else {
			// Custom model views force both source and target being added when a relation/genSet is added.
			// However, deletion doesn't check this.
			if (element instanceof Characterization) {
				addElement(((Characterization) element).getSource());
				addElement(((Characterization) element).getTarget());
			}
			if (element instanceof Mediation) {
				addElement(((Mediation) element).getSource());
				addElement(((Mediation) element).getTarget());
			}
			if (element instanceof GeneralizationSet) {
				addElement(((GeneralizationSet) element).getSpecializedUniversal());
				for (Universal u : ((GeneralizationSet) element).getSpecializingUniversals()) {
					addElement(u);
				}
			}
		}
	}

	// Two equal methods just to make it easier for process stuff.
	public void addElements(EList<PackageableElement> elements) {
		for(EObject e : elements) {
			addElement(e);
		}
	}
	
	public void addElements(List<EObject> elements) {
		for(EObject e : elements) {
			addElement(e);
		}
	}
	
	public void resetElements(Model newModel) {
		elementMap.clear();
		for(EObject e : newModel.getElements()) {
			try {
				addElement(e);
			} catch (NullPointerException ex) {
				// TODO handle.
			}
		}
	}
	
	/**
	 * Updates the modelElements fields from all ModelElementsView.
	 * It is possible that not all are updated (for instance, if the newModel
	 * doesn't contain an old element).
	 */
	public void resyncWithModel(Model newModel) {
		for(EObject e : newModel.getElements()) {
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
	
	public List<ModelViewElement> getModelViewElementList() {
		return new ArrayList<>(elementMap.values());
	}
	
	public List<EObject> getModelElementList() {
		List<EObject> modelElementList = new ArrayList<>(elementMap.size());
		for (ModelViewElement mve : elementMap.values()) {
			modelElementList.add(mve.getModelElement());
		}
		return modelElementList;
	}
	
	public ModelViewElement getModelViewElement(EObject element) {
		if (checkElement(element)) {
			return null;
		}
		return elementMap.get(OntoUMLPrimeUtils.generateId(element));
	}
	
	public ModelViewElement getModelViewElement(String id) {
		return elementMap.get(id);
	}
	
	public boolean isDefault() {
		return isDefault;
	}
	
}