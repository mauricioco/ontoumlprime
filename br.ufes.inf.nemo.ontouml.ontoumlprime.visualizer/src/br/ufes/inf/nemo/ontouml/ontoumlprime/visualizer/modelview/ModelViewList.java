package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
public class ModelViewList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private transient Model model;	// Is not serialized.
	private String modelTitle;

	private ModelView defaultModelView;
	private List<ModelView> modelViewList;
	private ModelView selectedModelView;	// UI stuff only. Better put it elsewhere.
	
	public ModelViewList(String modelTitle, Model model) {
		this.model = model;
		this.modelTitle = modelTitle;
		this.modelViewList = new ArrayList<>(1);
		this.defaultModelView = ModelView.newDefaultModelView(model.getElements());
		this.modelViewList.add(defaultModelView); // I think its better not to do this...
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
	
	/**
	 * Adds new model view and returns it.
	 * @param modelViewName
	 * @param elementList
	 * @return
	 */
	public ModelView addModelView(String modelViewName, List<EObject> elementList) {
		ModelView newModelView = new ModelView(modelViewName);
		newModelView.addElements(elementList);
		modelViewList.add(newModelView);
		return newModelView;
	}
	
	public void addModelView(ModelView modelView) {
		modelViewList.add(modelView);
	}
	
	public void updateDefaultModelView(Model newModel) {
		defaultModelView.resetElements(newModel);
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

	// TODO: This is UI related. It does not belong here.
	public ModelView getSelectedModelView() {
		return selectedModelView;
	}

	public void setSelectedModelView(ModelView selectedModelView) {
		this.selectedModelView = selectedModelView;
	}
	
	public void removeModelView(ModelView modelView) {
		this.modelViewList.remove(modelView);
	}
	
}