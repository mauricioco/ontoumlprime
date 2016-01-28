package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.plantuml

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Enumeration
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.QualityUniversal
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubCollectionRelation
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubQuantityRelation
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComponentOfRelation
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Kind
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ModeUniversal
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.QuantityUniversal
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.CollectiveUniversal
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubKind
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Category
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mixin
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.RoleMixin
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Role
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Phase
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataType
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComplexDataType
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryFormalRelation
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.MembershipRelation
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.OntoUMLPrimeViewContentProvider
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.OntoUMLPrimeUtils
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.OntoUMLPrimeViewStereotypeContentProvider

class OntoUMLPrime2PlantUML {
	
	static OntoUMLPrime2PlantUML sharedInstance;
	
	def static OntoUMLPrime2PlantUML sharedInstance() {
		if(sharedInstance == null) {
			sharedInstance = new OntoUMLPrime2PlantUML();
		}
		return sharedInstance;
	}
	
	def static String showPlantUMLMessage(String message)
	'''
	legend
	«message»
	endlegend
	'''
	
	def static dispatch String toPlantUML(int lowerBound, int upperBound) {
		if(upperBound == 0 && lowerBound == 0) {
			return ''''''
		}
		if(upperBound < 0) {
			return '''" **«lowerBound»..* **"''';
		}
		return '''" **«lowerBound»..«upperBound»** "'''
	}
	
	def static dispatch String toPlantUML(BinaryFormalRelation it) {
		'''
		«source.name» «toPlantUML(sourceLowerBound, sourceUpperBound)» -- «toPlantUML(targetLowerBound, targetUpperBound)» «target.name» : <<formal>>
		'''
	}
	
	def static dispatch String toPlantUML(BinaryMaterialRelation it)
	'''
	«source.name» «toPlantUML(sourceLowerBound, sourceUpperBound)» -- «toPlantUML(targetLowerBound, targetUpperBound)» «target.name» : «derivedFrom.name»_«name»
	'''
	// («source.name», «target.name») .. «derivedFrom.name»
	
	def static dispatch String toPlantUML(Category it)
	'''
	class «name» <<category>> {
		
	}
	'''
	
	def static dispatch String toPlantUML(String sourceName, Characterization it)
	'''
	«sourceName» «toPlantUML(sourceLowerBound, sourceUpperBound)» -- «toPlantUML(targetLowerBound, targetUpperBound)» «target.name» : <<characterization>> <
	'''

	def static String toPlantUML(String label, String sourceName, Characterization it)
	'''
	«sourceName» «toPlantUML(sourceLowerBound, sourceUpperBound)» -- «toPlantUML(targetLowerBound, targetUpperBound)» «target.name» «if(label.empty) ": characterizes <" else ": "+label+" <"»
	'''
	
	def static dispatch String toPlantUML(CollectiveUniversal it)
	'''
	class «name» <<collective>> {
		
	}
	«FOR c : characterizedBy»
	«toPlantUML(name, c)»
	«ENDFOR»
	'''
	
	def static dispatch String toPlantUML(ComplexDataType it)
	'''
	class «name» <<datatype>> {
		«FOR a : attributes»
		«a.isOfType.name» «a.name»
		«ENDFOR»
	}
	'''
	
	def static dispatch String toPlantUML(ComponentOfRelation it)
	'''
	«part.name» «toPlantUML(sourceLowerBound, sourceUpperBound)» -- «toPlantUML(targetLowerBound, targetUpperBound)» «whole.name» : isComponentOf >
	'''
	
	def static dispatch String toPlantUML(Enumeration it)
	'''
	enum «name»	<<enumeration>> {
		«FOR e : enumerationLiterals»
		«e»
		«ENDFOR»
	}
	'''
	
	def static dispatch String toPlantUML(GeneralizationSet it)
	'''
	«FOR sp : specializingUniversals»
	«specializedUniversal.name» <|-- «sp.name» «if(name==null || name.empty) "" else ":"+name»
	«ENDFOR»
	'''
	
	def static dispatch String toPlantUML(Kind it)
	'''
	class «name» <<kind>> {
		
	}
	«FOR c : characterizedBy»
	«toPlantUML(name, c)»
	«ENDFOR»
	'''
		
	
	def static dispatch String toPlantUML(String sourceName, Mediation it)
	'''
	«sourceName» «toPlantUML(sourceLowerBound, sourceUpperBound)» -- «toPlantUML(targetLowerBound, targetUpperBound)» «target.name» : <<mediation>> >
	'''
	
	def static dispatch String toPlantUML(MembershipRelation it)
	'''
	«part.name» «toPlantUML(sourceLowerBound, sourceUpperBound)» --o «toPlantUML(targetLowerBound, targetUpperBound)» «whole.name» : isMemberOf
	'''
	
	def static dispatch String toPlantUML(Mixin it)
	'''
	class «name» <<mixin>> {
		
	}
	'''
	
	def static dispatch String toPlantUML(ModeUniversal it)
	'''
	class «name» <<mode>> {

	}
	«FOR c : characterizedBy»
	«toPlantUML(name, c)»
	«ENDFOR»
	'''
	
	def static dispatch String toPlantUML(nAryFormalRelation it) // This one has no source...
	'''
	'''
	
	def static dispatch String toPlantUML(nAryMaterialRelation it)
	// This one has no source, but it can be infered.
	//It's not easy to do so though, so it's not gonna be implemented by now.
	'''
	'''
	
	def static dispatch String toPlantUML(Package it)
	'''
	package «name» {
	«FOR e : elements»
    «e.toPlantUML»
    «ENDFOR»
	}
	'''
	
	def static dispatch String toPlantUML(Phase it)
	'''
	class «name» <<phase>> {
		
	}
	«FOR c : characterizedBy»
	«toPlantUML(name, c)»
	«ENDFOR»
	'''
	
	def static dispatch String toPlantUML(PrimitiveDataType it) // not implemented...
	'''
	class «name» <<primitivetype>> {
		
	}
	'''
	
	def static dispatch String toPlantUML(RelatorUniversal it)
	'''
	class «name» <<relator>> {
		
	}
	«FOR c : characterizedBy»
	«toPlantUML(name, c)»
	«ENDFOR»
	«FOR m : mediations»
	«toPlantUML(name, m)»
	«ENDFOR»
	'''
	
	def static dispatch String toPlantUML(Role it)
	'''
	class «name» <<role>> {
		
	}
	«FOR c : characterizedBy»
	«toPlantUML(name, c)»
	«ENDFOR»
	'''
	
	def static dispatch String toPlantUML(RoleMixin it)
	'''
	class «name» <<rolemixin>> {
		
	}
	'''
	
	def static dispatch String toPlantUML(QualityUniversal it)
	'''
	class «name» <<quality>> {
		
	}
	«toPlantUML("characterizes", name, characterization)»
	«FOR c : characterizedBy»
	«toPlantUML(name, c)»
	«ENDFOR»
	'''
	
	def static dispatch String toPlantUML(QuantityUniversal it)
	'''
	class «name» <<quantity>> {
		
	}
	«FOR c : characterizedBy»
	«toPlantUML(name, c)»
	«ENDFOR»
	'''
	
	def static dispatch String toPlantUML(SubCollectionRelation it)
	'''
	«part.name» «toPlantUML(sourceLowerBound, sourceUpperBound)» --o «toPlantUML(targetLowerBound, targetUpperBound)» «whole.name» : isSubCollectionOf
	'''
	
	def static dispatch String toPlantUML(SubKind it)
	'''
	class «name» <<subkind>> {
		
	}
	«FOR c : characterizedBy»
	«toPlantUML(name, c)»
	«ENDFOR»
	'''
	
	def static dispatch String toPlantUML(SubQuantityRelation it)
	'''
	«part.name» «toPlantUML(sourceLowerBound, sourceUpperBound)» --* «toPlantUML(targetLowerBound, targetUpperBound)» «whole.name» : isSubQuantityOf
	'''
	
}