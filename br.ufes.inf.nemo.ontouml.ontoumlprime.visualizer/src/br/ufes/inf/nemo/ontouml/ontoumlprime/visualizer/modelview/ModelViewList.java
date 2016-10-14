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

	private transient ModelView defaultModelView;	// Better not serialize it. Since it's synced to model, generate it again upon loading.
	private List<ModelView> modelViewList;
	private ModelView selectedModelView;	// This is UI related. It does not belong here. Better put it elsewhere.
	
	public ModelViewList(String modelTitle, Model model) {
		this.model = model;
		this.modelTitle = modelTitle;
		this.modelViewList = new ArrayList<>(1);
		this.defaultModelView = ModelView.newDefaultModelView(model.getElements());
		//this.modelViewList.add(defaultModelView); // I think its better not to do this...
		selectedModelView = defaultModelView;
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
		if (defaultModelView == null) {
			defaultModelView = ModelView.newDefaultModelView(newModel.getElements());
		} else {
			defaultModelView.resetElements(newModel);
		}
		this.model = newModel;
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