package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview;

import org.eclipse.emf.ecore.EObject;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.OntoUMLPrimeUtils;

public class ModelElementView {
		
	private EObject modelElement;
	
	private String id;
	
	// If the element doesn't exist on model, this should be false. Kinda like logic exclusion.
	
	//private boolean isVisible = true;
	
	public ModelElementView(EObject modelElement) {
		this.modelElement = modelElement;
		this.id = OntoUMLPrimeUtils.generateId(modelElement);
	}

	public EObject getModelElement() {
		return modelElement;
	}

	//public void setModelElement(PackageableElement modelElement) {
	//	this.modelElement = modelElement;
	//}

	//public boolean isVisible() {
	//	return isVisible;
	//}

	//public void setVisible(boolean isVisible) {
	//	this.isVisible = isVisible;
	//}

	public String getId() {
		return id;
	}

	public String getDisplayName() {
		if(modelElement instanceof NamedElement && ((NamedElement) modelElement).getName() != null) {
			return ((NamedElement) modelElement).getName() + " <<"+OntoUMLPrimeUtils.getStereotype(modelElement)+">>";
		} else {
			return "<<"+OntoUMLPrimeUtils.getStereotype(modelElement)+">>";// + " " + modelElement.
		}
	}
	
}
