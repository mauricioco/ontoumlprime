package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.ModelElementView;

public class ElementVisionTreeObject extends TreeObject {

	private ModelElementView modelElementView;
	
	public ElementVisionTreeObject(ModelElementView modelElementView) {
		super();
		this.modelElementView = modelElementView;
	}
	
	public ElementVisionTreeObject(TreeObject parent, ModelElementView modelElementView) {
		super(parent);
		this.modelElementView = modelElementView;
	}

	public ModelElementView getElementVision() {
		return modelElementView;
	}
	
	// Both need to be defined here due to the nature of TreeViewer refresh.
	@Override
	public int hashCode() {
		return modelElementView.getId().hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ElementVisionTreeObject) {
			return modelElementView.getId().equals(((ElementVisionTreeObject) obj).getElementVision().getId());
		}
		return false;
	}
}
