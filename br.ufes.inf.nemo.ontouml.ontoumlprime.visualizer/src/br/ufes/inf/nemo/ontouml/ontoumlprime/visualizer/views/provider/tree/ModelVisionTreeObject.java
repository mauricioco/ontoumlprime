package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.ModelView;

public class ModelVisionTreeObject extends TreeObject {
	
	private ModelView modelView;
	
	public ModelVisionTreeObject(ModelView modelView) {
		super();
		this.modelView = modelView;
	}
	
	public ModelVisionTreeObject(TreeObject parent, ModelView modelView) {
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
		if(obj instanceof ModelVisionTreeObject) {
			return modelView.getVisionName().equals(((ModelVisionTreeObject) obj).getModelVision().getVisionName());
		}
		return false;
	}
	
}
