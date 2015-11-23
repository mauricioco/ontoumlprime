package br.ufes.inf.nemo.ontouml.PrimeOntoUML.refontouml;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static br.ufes.inf.nemo.ontouml.PrimeOntoUML.refontouml.RefOntoUML2Ouml.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static br.ufes.inf.nemo.ontouml.PrimeOntoUML.refontouml.RefOntoUML2Ouml.*;

public class RefOntoUMLElement extends RefOntoUMLObject {

	private String type;
	
	private String memberStartId;
	private String memberEndId;
	
	private Map<String, RefOntoUMLOwnedEnd> ownedEndMap = new HashMap<>();
	//private Map<String, RefOntoUMLOwnedEnd> relationshipMap = new HashMap<>();
	
	public RefOntoUMLElement(Node node) {
		super(node);
		this.type = node.getAttributes().getNamedItem(NS_XSI + ATTRIBUTE_KEY_TYPE).getNodeValue();
		
		this.memberStartId = this.memberEndId = "";
		
		switch(type) {
		
			case TYPE_ASSOCIATION:
			case TYPE_FORMAL_ASSOCIATION:
			case TYPE_MEMBER_OF: 
			case TYPE_CHARACTERIZATION: 
			case TYPE_MEDIATION:
				
				String[] memberEndValues = node.getAttributes().getNamedItem(ATTRIBUTE_KEY_MEMBER_END).getNodeValue().split(" ");
				this.memberStartId = memberEndValues[0];
				this.memberEndId = memberEndValues[1];
				
				NodeList childList = node.getChildNodes();
				for(int i=0; i<childList.getLength(); i++) {
					Node child = childList.item(i);
					
					switch(child.getNodeName()) {
					
						case ELEMENT_OWNED_END_TAG_NAME:
							RefOntoUMLOwnedEnd refOwnedEnd = new RefOntoUMLOwnedEnd(child);
							ownedEndMap.put(refOwnedEnd.getId(), refOwnedEnd);
							break;
							
							
						default:
							break;
					
					}
				}
			
			break;
		}
	}

	public String getType() {
		return type;
	}
	
	public RefOntoUMLOwnedEnd getMemberStart() {
		return ownedEndMap.get(memberStartId);
	}

	public RefOntoUMLOwnedEnd getMemberEnd() {
		return ownedEndMap.get(memberEndId);
	}

}
