package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.OntoUMLPrimeUtils;

public class VisionList {

	private Model model;
	private String modelTitle;

	private ModelVision defaultVision;
	private List<ModelVision> visionList;
	private ModelVision selectedVision;
	
	public VisionList(String modelTitle, Model model) {
		this.model = model;
		this.modelTitle = modelTitle;
		this.visionList = new ArrayList<>(1);
		this.defaultVision = ModelVision.newDefaultModelVision(model.getElements());
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
	
	public void addVision(String visionName, List<PackageableElement> elementList) {
		ModelVision newModelVision = new ModelVision(visionName);
		newModelVision.addElements(elementList);
		visionList.add(newModelVision);
	}
	
	public void updateDefaultVision(Model newModel) {
		defaultVision.reloadElements(newModel);
	}
	
	public ModelVision getDefaultVision() {
		return defaultVision;
	}

	public Iterator<ModelVision> getVisionListIterator() {
		return visionList.iterator();
	}

	public Model getModel() {
		return model;
	}

	public ModelVision getSelectedVision() {
		return selectedVision;
	}

	public void setSelectedVision(ModelVision selectedVision) {
		this.selectedVision = selectedVision;
	}
	
	
	
}
