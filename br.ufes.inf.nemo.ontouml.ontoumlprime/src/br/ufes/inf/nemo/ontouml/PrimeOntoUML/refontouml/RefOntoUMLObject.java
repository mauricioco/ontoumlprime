package br.ufes.inf.nemo.ontouml.PrimeOntoUML.refontouml;

import org.w3c.dom.Node;

import static br.ufes.inf.nemo.ontouml.PrimeOntoUML.refontouml.RefOntoUML2Ouml.*;


public class RefOntoUMLObject {
	
	private String id;
	private String name;
	
	public RefOntoUMLObject(Node node) {
		this.id = node.getAttributes().getNamedItem(NS_XMI + ATTRIBUTE_KEY_ID).getNodeValue();//.getNamedItem(RefOntoUML2Ouml.ATTRIBUTE_KEY_ID).getNodeValue();
		Node nameAttr = node.getAttributes().getNamedItem(ATTRIBUTE_KEY_NAME);
		this.name = nameAttr == null ? "" : nameAttr.getNodeValue().replaceAll(" ", "_");
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
}
