package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview;

import java.io.Serializable;

import org.eclipse.emf.ecore.EObject;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.OntoUMLPrimeUtils;

public class ModelViewElement implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Refers to the Model object that this ModelViewElement represents. 
	 * Model elements are only accessible in a list. It wouldn't be efficient to access
	 * them all the time. Also, it's not serialized, so it must be set after loading.
	 */
	private transient EObject modelElement;
	
	private String id;
	
	public ModelViewElement(EObject modelElement) {
		this.modelElement = modelElement;
		this.id = OntoUMLPrimeUtils.generateId(modelElement);
	}

	public EObject getModelElement() {
		return modelElement;
	}
	
	public boolean hasModelElement() {
		return modelElement != null;
	}

	public void setModelElement(PackageableElement modelElement) {
		this.modelElement = modelElement;
	}

	public String getId() {
		return id;
	}

	public String getDisplayName() {
		if (modelElement instanceof NamedElement && ((NamedElement) modelElement).getName() != null) {
			return ((NamedElement) modelElement).getName() + " <<"+OntoUMLPrimeUtils.getStereotype(modelElement)+">>";
		} else if (modelElement != null) {
			return "<<"+OntoUMLPrimeUtils.getStereotype(modelElement)+">>";// + " " + modelElement.
		} else {
			return id;
		}
	}
	
}