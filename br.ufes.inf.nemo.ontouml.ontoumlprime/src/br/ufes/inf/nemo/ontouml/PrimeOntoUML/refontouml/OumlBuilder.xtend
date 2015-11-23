package br.ufes.inf.nemo.ontouml.PrimeOntoUML.refontouml

import static br.ufes.inf.nemo.ontouml.PrimeOntoUML.refontouml.RefOntoUML2Ouml.*;
import java.util.HashMap
import java.util.Map
import java.util.Collections

class OumlBuilder {
	
	private RefOntoUMLModel model;
	private String result;

	new(RefOntoUMLModel model) {
		this.model = model;
		result = "";
	}
	
	def private String getMultiplicity(RefOntoUMLOwnedEnd it) {
		if(upperValue == 0 && lowerValue == 0) {
			return ''''''
		}
		if(upperValue < 0) {
			return '''[«lowerValue»..*]''';
		}
		return '''[«lowerValue»..«upperValue»]'''
	}
	
	def private String getRelatorUniversalMediations(RefOntoUMLElement it) {
		'''
		«FOR ref : model.elements.values»
		«IF TYPE_MEDIATION.equals(ref.type)»
			«IF id.equals(ref.memberStart.typeId)»
			mediates «getMultiplicity(ref.memberStart)» «model.getElement(ref.memberEnd.typeId).name» «getMultiplicity(ref.memberEnd)»;
			«ENDIF»
		«ENDIF»
		«ENDFOR»
		'''
		/*
		'''
		«FOR ref : model.elements.values»
		«IF TYPE_MEDIATION.equals(ref.type)»
			«IF it.id.equals(ref.getOwnedEndAt(0).typeId)»
			mediates «getMultiplicity(ref.getOwnedEndAt(0))» «model.getElement(ref.getOwnedEndAt(1).typeId).name» «getMultiplicity(ref.getOwnedEndAt(1))»;
			«ELSEIF it.id.equals(ref.getOwnedEndAt(1).typeId)»
			mediates «getMultiplicity(ref.getOwnedEndAt(1))» «model.getElement(ref.getOwnedEndAt(0).typeId).name» «getMultiplicity(ref.getOwnedEndAt(0))»;
			«ENDIF»
		«ENDIF»
		«ENDFOR»	
		'''
		*/
	}
	
	def private String getCharacterizations(RefOntoUMLElement it) {
		'''
		«FOR ref : model.elements.values»
		«IF TYPE_CHARACTERIZATION.equals(ref.type)»
			«IF id.equals(ref.memberEnd.typeId)»
			«getMultiplicity(ref.memberEnd)» characterizedBy «model.getElement(ref.memberStart.typeId).name» «getMultiplicity(ref.memberStart)»;
			«ENDIF»
		«ENDIF»
		«ENDFOR»	
		'''
	}
	
	def addElement(RefOntoUMLElement it) {
		
		val oumlType = getOumlFromRef(type);
		
		if(oumlType == null) {
			return;
		}
		
		/*
		 'relation'
	part=[SubstantialUniversal]
	('['sourceLowerBound=CardinalityBound '..' sourceUpperBound=CardinalityUpperBound ']')?	
	'isSubQuantityOf'
	whole=[SubstantialUniversal]
	('[' targetLowerBound=CardinalityBound '..' targetUpperBound=CardinalityUpperBound ']')?
	';'
		 */
		
		result += switch(type) {
			
			case TYPE_FORMAL_ASSOCIATION:
				'''
				«oumlType» «model.getElement(memberStart.typeId).name» «getMultiplicity(memberStart)» «name» «model.getElement(memberEnd.typeId).name» «getMultiplicity(memberEnd)»;
				'''			
			
			case TYPE_MEMBER_OF
			,case TYPE_ASSOCIATION:
				'''
				relation «model.getElement(memberStart.typeId).name» «getMultiplicity(memberStart)» «oumlType» «model.getElement(memberEnd.typeId).name» «getMultiplicity(memberEnd)»; 
				'''

			case TYPE_RELATOR:
				'''
				«oumlType» «name» {
					«characterizations»
					«getRelatorUniversalMediations»
				}
				'''
			
			case TYPE_COLLECTIVE
			,case TYPE_KIND
			,case TYPE_MODE
			,case TYPE_ROLE
			,case TYPE_SUBKIND:
				'''
				«oumlType» «name» {
					«characterizations»
				}
				'''
				
			case TYPE_CATEGORY:
				'''
				«oumlType» «name» {}
				'''
			default :
				''''''
				
		}
		
		/*
		result +=
		'''
		«oumlType» «name» {
			«switch(type) {
								
				case TYPE_RELATOR:
					characterizations
					+ getRelatorUniversalMediations
				
				case TYPE_COLLECTIVE
				,case TYPE_KIND
				,case TYPE_MODE
				,case TYPE_ROLE
				,case TYPE_SUBKIND:
					characterizations
				
				default :
					""
			}»
		}
		*/
		result += "\n";
	}
	
	def String build() { 
		return result;
	}
	
}