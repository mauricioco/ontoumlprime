package br.ufes.inf.nemo.ontouml.PrimeOntoUML.refontouml;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class RefOntoUML2Ouml {
		
	public static final String ELEMENT_PACKAGED_TAG_NAME = "packagedElement";
	public static final String ELEMENT_GENERALIZATION_TAG_NAME = "generalization";
	public static final String ELEMENT_OWNED_ATTRIBUTE_TAG_NAME = "ownedAttribute";
	public static final String ELEMENT_OWNED_END_TAG_NAME = "ownedEnd";
	public static final String ELEMENT_UPPER_VALUE_TAG_NAME = "upperValue";
	public static final String ELEMENT_LOWER_VALUE_TAG_NAME = "lowerValue";
	
	public static final String NS_XMI = "xmi:";
	public static final String NS_XSI = "xsi:";
	
	public static final String ATTRIBUTE_KEY_NAME = "name";
	public static final String ATTRIBUTE_KEY_ID = "id";
	public static final String ATTRIBUTE_KEY_TYPE = "type";
	public static final String ATTRIBUTE_KEY_VALUE = "value";
	public static final String ATTRIBUTE_KEY_MEMBER_END = "memberEnd";
	
	public static final String TYPE_PRIMITIVE_TYPE = "RefOntoUML:PrimitiveType";
	public static final String TYPE_PACKAGE = "RefOntoUML:Package";
	public static final String TYPE_KIND = "RefOntoUML:Kind";
	public static final String TYPE_ROLE = "RefOntoUML:Role";
	public static final String TYPE_RELATOR = "RefOntoUML:Relator";
	public static final String TYPE_SUBKIND = "RefOntoUML:SubKind";
	public static final String TYPE_GENERALIZATION_SET = "RefOntoUML:GeneralizationSet";
	public static final String TYPE_MEDIATION = "RefOntoUML:Mediation";
	public static final String TYPE_ASSOCIATION = "RefOntoUML:Association";
	public static final String TYPE_FORMAL_ASSOCIATION = "RefOntoUML:FormalAssociation";
	public static final String TYPE_MODE = "RefOntoUML:Mode";
	public static final String TYPE_CATEGORY = "RefOntoUML:Category";
	public static final String TYPE_COLLECTIVE = "RefOntoUML:Collective";
	public static final String TYPE_CHARACTERIZATION = "RefOntoUML:Characterization";
	public static final String TYPE_MEMBER_OF = "RefOntoUML:memberOf";
	
	private static final Map<String, String> ref2OumlTypeMap = Collections.unmodifiableMap(
		    new HashMap<String, String>() {{
		        put(TYPE_RELATOR, "RelatorUniversal");
		        put(TYPE_ROLE, "Role");
		        put(TYPE_COLLECTIVE, "CollectiveUniversal");
				put(TYPE_CATEGORY, "Category");
				put(TYPE_MODE, "ModeUniversal");
				put(TYPE_MEMBER_OF, "isMemberOf");
				put(TYPE_FORMAL_ASSOCIATION, "formal rel");
				put(TYPE_ASSOCIATION, "isSubQuantityOf");
		    }});
	
	public static String getOumlFromRef(String refType) {
		return ref2OumlTypeMap.get(refType);
	}
	
	public static String openRefontoUMLFile(File file) throws SAXException, IOException, ParserConfigurationException {
			Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

			//optional, but recommended
			//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			document.getDocumentElement().normalize();
			
			RefOntoUMLModel refontouml = new RefOntoUMLModel(document.getDocumentElement());
			
			NodeList children = document.getElementsByTagName(ELEMENT_PACKAGED_TAG_NAME);
			System.out.println(refontouml.getName() + " " + refontouml.getId());

			for(int i=0; i<children.getLength(); i++) {
				Node n = children.item(i);
				if(n.getNodeType() == Node.TEXT_NODE) {
					continue;
				}
				System.out.println(n.getNodeName());
				refontouml.addElement(new RefOntoUMLElement(n));
				
				/*
				for(int j=0; j<n.getChildNodes().getLength(); j++) {
					if(n.getChildNodes().item(i).getNodeType() == Node.TEXT_NODE) {
						continue;
					}
					System.out.println(n.getChildNodes().item(j).getNodeName());
					System.out.println(new RefOntoUMLObject(n.getChildNodes().item(j).getAttributes()).getName());
				}*/
			}
			
			// Post-processing
			
			
			return refontouml.toOuml();
					/*
			NodeList nList = document.getElementsByTagName();
					
			System.out.println("----------------------------");

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);
						
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
						
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					System.out.println("Staff id : " + eElement.getAttribute("id"));
					System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
					System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());

				}
			}
		    } catch (Exception e) {
			e.printStackTrace();
		    }*/
	}
}
