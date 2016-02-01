package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;

public class ModelViewList {

	private Model model;
	private String modelTitle;

	private ModelView defaultModelView;
	private List<ModelView> modelViewList;
	private ModelView selectedModelView;
	
	public ModelViewList(String modelTitle, Model model) {
		this.model = model;
		this.modelTitle = modelTitle;
		this.modelViewList = new ArrayList<>(1);
		this.defaultModelView = ModelView.newDefaultModelView(model.getElements());
		this.modelViewList.add(defaultModelView);
		selectedModelView = defaultModelView;
		/*
		EList<PackageableElement> elements = model.getElements();
		for(PackageableElement e : elements) {
			String id = OntoUMLPrimeUtils.generateId(e);
			OntoUMLPrimeModelElement o = elementMap.get(id);
			if(o == null) {
				o = new OntoUMLPrimeModelElement(e);
				elementMap.put(o.getId(), o);
			}
		}
		*/
	}
	
	public void addModelView(String modelViewName, List<PackageableElement> elementList) {
		ModelView newModelView = new ModelView(modelViewName);
		newModelView.addElements(elementList);
		modelViewList.add(newModelView);
	}
	
	public void updateDefaultModelView(Model newModel) {
		defaultModelView.reloadElements(newModel);
	}
	
	public ModelView getDefaultModelView() {
		return defaultModelView;
	}

	public Iterator<ModelView> getModelViewListIterator() {
		return modelViewList.iterator();
	}

	public Model getModel() {
		return model;
	}

	public String getModelTitle() {
		return modelTitle;
	}

	public ModelView getSelectedModelView() {
		return selectedModelView;
	}

	public void setSelectedModelView(ModelView selectedModelView) {
		this.selectedModelView = selectedModelView;
	}
	
}
