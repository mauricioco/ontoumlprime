package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.model;

public class OntoUMLPrimeStereotype {
	
	private String name;
	
	private boolean visible = false; 
	
	public OntoUMLPrimeStereotype(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
}