package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.ModelVision;

public class ModelVisionTreeObject extends TreeObject {
	
	private ModelVision modelVision;
	
	public ModelVisionTreeObject(ModelVision modelVision) {
		super();
		this.modelVision = modelVision;
	}
	
	public ModelVisionTreeObject(TreeObject parent, ModelVision modelVision) {
		super(parent);
		this.modelVision = modelVision;
	}

	public ModelVision getModelVision() {
		return modelVision;
	}
	
	
	// Both need to be defined here due to the nature of TreeViewer refresh.
	@Override
	public int hashCode() {
		return modelVision.getVisionName().hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ModelVisionTreeObject) {
			return modelVision.getVisionName().equals(((ModelVisionTreeObject) obj).getModelVision().getVisionName());
		}
		return false;
	}
	
}
