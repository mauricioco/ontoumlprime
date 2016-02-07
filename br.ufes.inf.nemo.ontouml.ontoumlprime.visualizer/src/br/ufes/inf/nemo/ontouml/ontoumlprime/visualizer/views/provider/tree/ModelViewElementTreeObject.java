package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelElementView;

public class ModelViewElementTreeObject extends TreeObject {

	private ModelElementView modelElementView;
	
	public ModelViewElementTreeObject(ModelElementView modelElementView) {
		super();
		this.modelElementView = modelElementView;
	}
	
	public ModelViewElementTreeObject(TreeObject parent, ModelElementView modelElementView) {
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
		if(obj instanceof ModelViewElementTreeObject) {
			return modelElementView.getId().equals(((ModelViewElementTreeObject) obj).getElementVision().getId());
		}
		return false;
	}
}
