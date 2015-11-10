package br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml.elements

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Kind
import static br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml.elements.CharacterizationPlantUML.toPlantUML;

class KindPlantUML {
	def static private String getPlantUMLStereotype(Kind it) '''kind'''
	def static private String getPlantUMLName(Kind it) '''«name»'''
	
	def static public String toPlantUML(Kind it)
	'''
	class «plantUMLName» <<«plantUMLStereotype»>> {
		
	}
	«FOR c : characterizedBy»
	«toPlantUML(name, c)»
	«ENDFOR»
	'''
}