package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree;

public class StringTreeObject extends TreeObject {
	
	private String stringData;

	public StringTreeObject(String stringData) {
		super();
		this.stringData = stringData;
	}

	public StringTreeObject(TreeObject parent, String stringData) {
		super(parent);
		this.stringData = stringData;
	}

	public String getStringData() {
		return stringData;
	}
	
}
