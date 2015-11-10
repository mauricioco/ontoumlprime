package br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml.elements

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ModeUniversal
import static br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml.elements.CharacterizationPlantUML.toPlantUML;

class ModeUniversalPlantUML {
	def static private String getPlantUMLStereotype(ModeUniversal it) '''mode'''	
	def static private String getPlantUMLName(ModeUniversal it) '''«name»'''
		
	def static public String toPlantUML(ModeUniversal it)
	'''
	class «plantUMLName» <<«plantUMLStereotype»>> {

	}
	«FOR c : characterizedBy»
	«toPlantUML(name, c)»
	«ENDFOR»
	'''
}