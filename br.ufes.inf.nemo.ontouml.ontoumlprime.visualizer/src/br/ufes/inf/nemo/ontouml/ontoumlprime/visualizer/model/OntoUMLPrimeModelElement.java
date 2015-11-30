package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.model;

import org.eclipse.emf.ecore.EObject;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.OntoUMLPrimeUtils;

public class OntoUMLPrimeModelElement {
	
	protected EObject modelElement;
	
	private String id;
	
	private boolean isVisible = true;
	
	public OntoUMLPrimeModelElement(EObject modelElement) {
		this.modelElement = modelElement;
		this.id = OntoUMLPrimeUtils.sharedInstance().generateId(modelElement);
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
