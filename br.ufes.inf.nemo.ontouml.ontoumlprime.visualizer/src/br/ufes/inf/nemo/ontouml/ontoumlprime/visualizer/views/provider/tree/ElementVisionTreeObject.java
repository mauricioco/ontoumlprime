package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.ElementVision;

public class ElementVisionTreeObject extends TreeObject {

	private ElementVision elementVision;
	
	public ElementVisionTreeObject(ElementVision elementVision) {
		super();
		this.elementVision = elementVision;
	}
	
	public ElementVisionTreeObject(TreeObject parent, ElementVision elementVision) {
		super(parent);
		this.elementVision = elementVision;
	}

	public ElementVision getElementVision() {
		return elementVision;
	}
	
	// Both need to be defined here due to the nature of TreeViewer refresh.
	@Override
	public int hashCode() {
		return elementVision.getId().hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ElementVisionTreeObject) {
			return elementVision.getId().equals(((ElementVisionTreeObject) obj).getElementVision().getId());
		}
		return false;
	}
}
