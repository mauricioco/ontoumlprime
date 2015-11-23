package br.ufes.inf.nemo.ontouml.PrimeOntoUML.refontouml;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static br.ufes.inf.nemo.ontouml.PrimeOntoUML.refontouml.RefOntoUML2Ouml.*;

public class RefOntoUMLOwnedEnd extends RefOntoUMLObject {

	private int upperValue;
	private int lowerValue;
	
	// It's called type on the refontouml xml. But it's more like the id of who's connecting.
	private String typeId;
	
	public RefOntoUMLOwnedEnd(Node node) {
		super(node);
		NodeList childList = node.getChildNodes();
		this.upperValue = this.lowerValue = 0;
		this.typeId = node.getAttributes().getNamedItem(ATTRIBUTE_KEY_TYPE).getNodeValue();
		
		for(int i=0; i<childList.getLength(); i++) {
			Node child = childList.item(i);
			switch(child.getNodeName()) {
			case ELEMENT_UPPER_VALUE_TAG_NAME:
				this.upperValue = Integer.parseInt(child.getAttributes().getNamedItem(ATTRIBUTE_KEY_VALUE).getNodeValue());
				break;
			case ELEMENT_LOWER_VALUE_TAG_NAME:
				this.lowerValue = Integer.parseInt(child.getAttributes().getNamedItem(ATTRIBUTE_KEY_VALUE).getNodeValue());
				break;
			default:
				break;
			}
		}
	}

	public int getUpperValue() {
		return upperValue;
	}

	public int getLowerValue() {
		return lowerValue;
	}

	public String getTypeId() {
		return typeId;
	}

}
