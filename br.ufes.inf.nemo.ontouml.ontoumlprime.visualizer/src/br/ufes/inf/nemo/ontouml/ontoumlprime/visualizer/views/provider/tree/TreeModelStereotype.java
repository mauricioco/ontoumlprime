package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.model.OntoUMLPrimeModelElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.model.OntoUMLPrimeStereotype;

public class TreeModelStereotype extends TreeObject {
	
	protected OntoUMLPrimeStereotype stereotype;
	
	public TreeModelStereotype(OntoUMLPrimeStereotype stereotype) {
		super();
		this.stereotype = stereotype;
	}
	
	public TreeModelStereotype(TreeObject parent, OntoUMLPrimeStereotype stereotype) {
		super(parent);
		this.stereotype = stereotype;
	}
	
	public OntoUMLPrimeStereotype getModelElement() {
		return stereotype;
	}

}
