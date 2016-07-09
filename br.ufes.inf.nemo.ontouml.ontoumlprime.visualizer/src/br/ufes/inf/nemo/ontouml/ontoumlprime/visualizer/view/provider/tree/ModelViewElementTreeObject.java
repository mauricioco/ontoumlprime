package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewElement;

public class ModelViewElementTreeObject extends TreeObject {

	private ModelViewElement modelViewElement;
	
	public ModelViewElementTreeObject(ModelViewElement modelViewElement) {
		super();
		this.modelViewElement = modelViewElement;
	}
	
	public ModelViewElementTreeObject(TreeObject parent, ModelViewElement modelViewElement) {
		super(parent);
		this.modelViewElement = modelViewElement;
	}

	public ModelViewElement getModelElementView() {
		return modelViewElement;
	}
	
	// Both need to be defined here due to the nature of TreeViewer refresh.
	@Override
	public int hashCode() {
		return modelViewElement.getId().hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ModelViewElementTreeObject) {
			return modelViewElement.getId().equals(((ModelViewElementTreeObject) obj).getModelElementView().getId());
		}
		return false;
	}
}
