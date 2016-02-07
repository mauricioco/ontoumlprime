package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.OntoUMLPrimeUtils;

public class ModelViewList {

	private Model model;
	private String modelTitle;

	private ModelView defaultVision;
	private List<ModelView> visionList;
	private ModelView selectedVision;
	
	public ModelViewList(String modelTitle, Model model) {
		this.model = model;
		this.modelTitle = modelTitle;
		this.visionList = new ArrayList<>(1);
		this.defaultVision = ModelView.newDefaultModelVision(model.getElements());
		this.visionList.add(defaultVision);
		selectedVision = defaultVision;
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
	 * @param visionName
	 * @param elementList
	 * @return
	 */
	public ModelView addVision(String visionName, List<PackageableElement> elementList) {
		ModelView newModelVision = new ModelView(visionName);
		newModelVision.addElements(elementList);
		visionList.add(newModelVision);
		return newModelVision;
	}
	
	public void updateDefaultVision(Model newModel) {
		defaultVision.reloadElements(newModel);
	}
	
	public ModelView getDefaultVision() {
		return defaultVision;
	}

	public Iterator<ModelView> getVisionListIterator() {
		return visionList.iterator();
	}

	public Model getModel() {
		return model;
	}

	public ModelView getSelectedVision() {
		return selectedVision;
	}

	public void setSelectedVision(ModelView selectedVision) {
		this.selectedVision = selectedVision;
	}
	
	
	
}
