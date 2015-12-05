package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision;

import org.eclipse.emf.ecore.EObject;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.OntoUMLPrimeUtils;

public class ElementVision {
		
	private PackageableElement modelElement;
	
	private String id;
	
	private boolean isVisible = true;
	
	public ElementVision(PackageableElement modelElement) {
		this.modelElement = modelElement;
		this.id = OntoUMLPrimeUtils.generateId(modelElement);
	}

	public PackageableElement getModelElement() {
		return modelElement;
	}

	public void setModelElement(PackageableElement modelElement) {
		this.modelElement = modelElement;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public String getId() {
		return id;
	}
	
}
