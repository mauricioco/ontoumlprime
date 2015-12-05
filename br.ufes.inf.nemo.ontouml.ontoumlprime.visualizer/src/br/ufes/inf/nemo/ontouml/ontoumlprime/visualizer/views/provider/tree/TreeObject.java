package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree;

import java.util.ArrayList;
import java.util.List;

abstract public class TreeObject {
	
	protected TreeObject parent;
	protected List<TreeObject> children;
	
	public TreeObject() {
		children = new ArrayList<>();
	}
	
	public TreeObject(TreeObject parent) {
		this.parent = parent;
	}
	
	public TreeObject getParent() {
		return parent;
	}
	
	public void setParent(TreeObject parent) {
		this.parent = parent;
	}
	
	public boolean hasParent() {
		return parent != null;
	}
	
	public void addChild(TreeObject child) {
		children.add(child);
		child.setParent(this);
	}
	
	public void removeChild(TreeObject child) {
		children.remove(child);
		child.setParent(null);
	}
	
	public TreeObject [] getChildren() {
		return (TreeObject [])children.toArray(new TreeObject[children.size()]);
	}
	
	public boolean hasChildren() {
		return children.size()>0;
	}
}
