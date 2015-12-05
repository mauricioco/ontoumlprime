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

	private List<ModelVision> visionList;
	
	public VisionList(String modelTitle, Model model) {
		this.model = model;
		this.modelTitle = modelTitle;
		this.visionList = new ArrayList<>(1);
		this.visionList.add(ModelVision.newDefaultModelVision(model.getElements()));	// Default model visualization.
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
	
	public Iterator<ModelVision> getVisionListIterator() {
		return visionList.iterator();
	}

	public Model getModel() {
		return model;
	}
	
}
