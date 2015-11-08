package br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml.elements

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Kind

class KindPlantUML {
	
	def static private String getPlantUMLName(Kind it)
	'''«name»'''
	
	def static public String toPlantUML(Kind it)
	'''
	class «plantUMLName» {
		
	}
	'''
}