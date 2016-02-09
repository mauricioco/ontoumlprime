package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;

public class ModelViewTreeObject extends TreeObject {
	
	private ModelView modelView;
	
	public ModelViewTreeObject(ModelView modelView) {
		super();
		this.modelView = modelView;
	}
	
	public ModelViewTreeObject(TreeObject parent, ModelView modelView) {
		super(parent);
		this.modelView = modelView;
	}

	public ModelView getModelVision() {
		return modelView;
	}
	
	
	// Both need to be defined here due to the nature of TreeViewer refresh.
	@Override
	public int hashCode() {
		return modelView.getVisionName().hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ModelViewTreeObject) {
			return modelView.getVisionName().equals(((ModelViewTreeObject) obj).getModelVision().getVisionName());
		}
		return false;
	}
	
}
