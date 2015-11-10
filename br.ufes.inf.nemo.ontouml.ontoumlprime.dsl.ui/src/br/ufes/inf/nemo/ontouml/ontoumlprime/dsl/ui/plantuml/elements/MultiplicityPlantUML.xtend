package br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml.elements

class MultiplicityPlantUML {
	def static String toPlantUML(int lowerBound, int upperBound) {
		if(upperBound < 0) {
			return '''«lowerBound»..*''';
		}
		return '''«lowerBound»..«upperBound»'''
	}
}