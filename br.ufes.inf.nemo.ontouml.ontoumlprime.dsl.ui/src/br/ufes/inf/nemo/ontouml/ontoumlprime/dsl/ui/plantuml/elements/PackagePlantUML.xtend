package br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml.elements

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package
import static br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml.PlantUMLInterface.*


class PackagePlantUML {
	
	def static private String getPlantUMLName(Package it)
	'''«name»'''
	
	def static public String toPlantUML(Package it)
	'''
	package «plantUMLName» {
	«FOR e : elements»
    «toPlantUML(e)»
    «ENDFOR»
	}
	'''
}