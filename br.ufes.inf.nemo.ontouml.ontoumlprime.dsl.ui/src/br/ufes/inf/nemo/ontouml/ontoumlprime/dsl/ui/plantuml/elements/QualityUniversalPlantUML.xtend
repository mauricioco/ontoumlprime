package br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml.elements

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.QualityUniversal
import static br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml.elements.CharacterizationPlantUML.toPlantUML;

class QualityUniversalPlantUML {
	def static private String getPlantUMLStereotype(QualityUniversal it) '''quality'''
	def static private String getPlantUMLName(QualityUniversal it) '''«name»'''
	def static public String toPlantUML(QualityUniversal it)
	'''
	class «plantUMLName» <<«plantUMLStereotype»>> {
		
	}
	«toPlantUML("characterizes", name, characterization)»
	«FOR c : characterizedBy»
	«toPlantUML(name, c)»
	«ENDFOR»
	'''
}