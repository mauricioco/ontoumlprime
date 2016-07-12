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
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.log.Log;
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
		
	}

	// Two equal methods just to make it easier for process stuff.
	public void addElements(EList<PackageableElement> elements) {
		for(EObject e : elements) {
			addElement(e);
			/*
			String id = OntoUMLPrimeUtils.generateId(e);
			ModelViewElement v = elementMap.get(id);
			if(v == null) {
				v = new ModelViewElement(e);
				elementMap.put(v.getId(), v);
			}
			*/
		}
	}
	
	public void addElements(List<EObject> elements) {
		for(EObject e : elements) {
			addElement(e);
			//String id = OntoUMLPrimeUtils.generateId(e);
			//ModelViewElement v = elementMap.get(id);
			//if(v == null) {
			//	v = new ModelViewElement(e);
			//	elementMap.put(v.getId(), v);
			//}
		}
	}
	
	public void resetElements(Model newModel) {
		elementMap.clear();
		for(EObject e : newModel.getElements()) {
			try {
				//ModelViewElement v = new ModelViewElement(e);
				//elementMap.put(v.getId(), v);
				addElement(e);
			} catch (NullPointerException ex) {
				
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
			
			if (e instanceof EndurantUniversal) {
				for (Characterization c : ((EndurantUniversal) e).getCharacterizedBy()) {
					String idChar = OntoUMLPrimeUtils.generateId(c);
					ModelViewElement mveChar = elementMap.get(idChar);
					if (mveChar != null) {
						mveChar.setModelElement(e);
					}
				}
			}
			
			if (e instanceof RelatorUniversal) {
				for (Mediation m : ((RelatorUniversal) e).getMediations()) {
					String idMed = OntoUMLPrimeUtils.generateId(m);
					ModelViewElement mveMed = elementMap.get(idMed);
					if (mveMed != null) {
						mveMed.setModelElement(e);
					}
				}
			}
			
		}
	}
	
	public void deleteElement(String id) {
		elementMap.remove(id);
	}
	
	public List<ModelViewElement> getModelViewElementList() {
		return new ArrayList<>(elementMap.values());
	}
	
	public ModelViewElement getModelViewElement(EObject element) {
		return elementMap.get(OntoUMLPrimeUtils.generateId(element));
	}
	
	public ModelViewElement getModelViewElement(String id) {
		return elementMap.get(id);
	}
	
	// Inneficcient! And only works for NamedElements.
	public ModelViewElement getModelViewElementWithElementName(String elementName) {
		for (ModelViewElement mve : elementMap.values()) {
			if (mve.getModelElement() instanceof NamedElement 
					&& elementName.equals(((NamedElement) mve.getModelElement()).getName())) {
				return mve;
			}
		}
		return null;
	}

	public boolean isDefault() {
		return isDefault;
	}
	
}