package br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml.elements

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ModeUniversal
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.QualityUniversal
import static br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml.elements.MultiplicityPlantUML.toPlantUML

class CharacterizationPlantUML {
	def private static dispatch String getTargetPlantUMLName(ModeUniversal it) '''«name»'''
	def private static dispatch String getTargetPlantUMLName(QualityUniversal it) '''«name»'''
	
	def static public String toPlantUML(String sourceName, Characterization it)
	'''
	«sourceName» "«toPlantUML(sourceLowerBound, sourceUpperBound)»" --|> "«toPlantUML(sourceLowerBound, sourceUpperBound)»" «getTargetPlantUMLName(target)»
	'''
	
	def static public String toPlantUML(String label, String sourceName, Characterization it)
	'''
	«sourceName» "«toPlantUML(sourceLowerBound, sourceUpperBound)»" --|> "«toPlantUML(targetLowerBound, targetUpperBound)»" «getTargetPlantUMLName(target)» : «label»
	'''
}