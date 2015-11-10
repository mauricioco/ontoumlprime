package br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Kind
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package
import br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml.elements.KindPlantUML
import br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml.elements.PackagePlantUML
import br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml.elements.CharacterizationPlantUML
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.QualityUniversal
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ModeUniversal
import br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml.elements.ModeUniversalPlantUML
import br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml.elements.QualityUniversalPlantUML

class PlantUMLInterface {
	def public static String toPlantUML(String sourceName, Characterization it) { CharacterizationPlantUML.toPlantUML(sourceName, it) }
	 
	def public static dispatch String toPlantUML(Kind it) { KindPlantUML.toPlantUML(it) } 
	def public static dispatch String toPlantUML(ModeUniversal it) { ModeUniversalPlantUML.toPlantUML(it) }
	def public static dispatch String toPlantUML(Package it) { PackagePlantUML.toPlantUML(it) }
	def public static dispatch String toPlantUML(QualityUniversal it) { QualityUniversalPlantUML.toPlantUML(it) }
}