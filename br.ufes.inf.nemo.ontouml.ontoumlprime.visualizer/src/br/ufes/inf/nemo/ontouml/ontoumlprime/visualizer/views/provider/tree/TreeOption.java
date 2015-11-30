package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree;

public class TreeOption extends TreeObject {

	private String option;

	public TreeOption(TreeModelElement parent, String option) {
		super(parent);
		this.option = option;
	}

	public TreeModelElement getParentElement() {
		return (TreeModelElement) super.getParent();
	}
	
	public TreeModelStereotype getParentStereotype() {
		return (TreeModelStereotype) super.getParent();
	}

	@Override
	public String toString() {
		return option;
	}
	
}
