package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision;

import org.eclipse.emf.ecore.EObject;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.OntoUMLPrimeUtils;

public class ElementVision {
	
	private EObject modelElement;
	
	private String id;
	
	private boolean isVisible = true;
	
	public ElementVision(EObject modelElement) {
		this.modelElement = modelElement;
		this.id = OntoUMLPrimeUtils.generateId(modelElement);
	}

	public EObject getModelElement() {
		return modelElement;
	}

	public void setModelElement(EObject modelElement) {
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
