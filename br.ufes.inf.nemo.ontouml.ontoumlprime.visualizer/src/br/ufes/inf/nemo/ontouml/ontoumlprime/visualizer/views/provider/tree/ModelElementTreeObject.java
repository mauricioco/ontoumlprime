package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelElementView;

public class ModelElementTreeObject extends TreeObject {

	private ModelElementView modelElementView;
	
	public ModelElementTreeObject(ModelElementView modelElementView) {
		super();
		this.modelElementView = modelElementView;
	}
	
	public ModelElementTreeObject(TreeObject parent, ModelElementView modelElementView) {
		super(parent);
		this.modelElementView = modelElementView;
	}

	public ModelElementView getModelElementView() {
		return modelElementView;
	}
	
	// Both need to be defined here due to the nature of TreeViewer refresh.
	@Override
	public int hashCode() {
		return modelElementView.getId().hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ModelElementTreeObject) {
			return modelElementView.getId().equals(((ModelElementTreeObject) obj).getModelElementView().getId());
		}
		return false;
	}
}
