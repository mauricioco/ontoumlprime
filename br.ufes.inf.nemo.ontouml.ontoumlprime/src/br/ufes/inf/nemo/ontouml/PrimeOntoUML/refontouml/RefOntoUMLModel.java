package br.ufes.inf.nemo.ontouml.PrimeOntoUML.refontouml;

import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Node;

import static br.ufes.inf.nemo.ontouml.PrimeOntoUML.refontouml.RefOntoUML2Ouml.*;

public class RefOntoUMLModel extends RefOntoUMLObject {

	private Map<String, RefOntoUMLElement> elements;

	public RefOntoUMLModel(Node element) {
		super(element);
		this.elements = new HashMap<>();
	}
	
	public void addElement(RefOntoUMLElement element) {
		elements.put(element.getId(), element);
	}
	
	public RefOntoUMLElement getElement(String id) {
		return elements.get(id);
	}
	
	public Map<String, RefOntoUMLElement> getElements() {
		return elements;
	}
	
	public String toOuml() {
		OumlBuilder builder = new OumlBuilder(this);
		for(RefOntoUMLElement element : elements.values()) {
			builder.addElement(element);
		}
		return builder.build();
	}
	
}
