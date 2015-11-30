package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.model.OntoUMLPrimeModelElement;

public class TreeModelElement extends TreeObject {
	
	protected OntoUMLPrimeModelElement modelElement;
	
	public TreeModelElement(OntoUMLPrimeModelElement modelElement) {
		super();
		this.modelElement = modelElement;
	}
	
	public TreeModelElement(TreeObject parent, OntoUMLPrimeModelElement modelElement) {
		super(parent);
		this.modelElement = modelElement;
	}
	
	public OntoUMLPrimeModelElement getModelElement() {
		return modelElement;
	}
	
	// Both need to be defined here due to the nature of TreeViewer refresh.
	/*
	@Override
	public int hashCode() {
		return OntoUMLPrime2PlantUML.sharedInstance().toPlantUML(modelElement).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof TreeModelElement) {
			return OntoUMLPrime2PlantUML.sharedInstance().toPlantUML(modelElement).equals(OntoUMLPrime2PlantUML.sharedInstance().toPlantUML(((TreeModelElement) obj).getModelElement()));
		}
		return false;
	}
	*/
}
