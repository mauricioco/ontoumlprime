package br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml

import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IEditorInput
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument
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
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.text.TextSelection

class OntoUMLDiagramTextProvider extends AbstractDiagramTextProvider {
	
	def dispatch String toPlantUML(int lowerBound, int upperBound) {
		if(upperBound == 0 && lowerBound == 0) {
			return ''''''
		}
		if(upperBound < 0) {
			return '''"«lowerBound»..*"''';
		}
		return '''"«lowerBound»..«upperBound»"'''
	}
	
	def dispatch String toPlantUML(BinaryFormalRelation it) // This really has no name in oled?
	'''
	«source.name» «toPlantUML(sourceLowerBound, sourceUpperBound)» -- «toPlantUML(targetLowerBound, targetUpperBound)» «target.name» : <<formal>>
	'''
	
	def dispatch String toPlantUML(BinaryMaterialRelation it)
	'''
	«source.name» «toPlantUML(sourceLowerBound, sourceUpperBound)» -- «toPlantUML(targetLowerBound, targetUpperBound)» «target.name» : <<formal>>
	(«source.name», «target.name») .. «derivedFrom.name»
	'''
	
	def dispatch String toPlantUML(Category it)
	'''
	class «name» <<category>> {
		
	}
	'''
	
	def dispatch String toPlantUML(String sourceName, Characterization it)
	'''
	«sourceName» «toPlantUML(sourceLowerBound, sourceUpperBound)» -- «toPlantUML(targetLowerBound, targetUpperBound)» «target.name» : characterizes >
	'''

	def String toPlantUML(String label, String sourceName, Characterization it)
	'''
	«sourceName» «toPlantUML(sourceLowerBound, sourceUpperBound)» -- «toPlantUML(targetLowerBound, targetUpperBound)» «target.name» «if(label.empty) ": characterizes >" else ": "+label+" >"»
	'''
	
	def dispatch String toPlantUML(CollectiveUniversal it)
	'''
	class «name» <<collective>> {
		
	}
	«FOR c : characterizedBy»
	«toPlantUML(name, c)»
	«ENDFOR»
	'''
	
	def dispatch String toPlantUML(ComplexDataType it)
	'''
	class «name» <<datatype>> {
		«FOR a : attributes»
		«a.name»
		«ENDFOR»
	}
	'''
	
	def dispatch String toPlantUML(ComponentOfRelation it)
	'''
	«part.name» «toPlantUML(sourceLowerBound, sourceUpperBound)» -- «toPlantUML(targetLowerBound, targetUpperBound)» «whole.name» : isComponentOf >
	'''
	
	def dispatch String toPlantUML(Enumeration it)
	'''
	enum «name»	<<enumeration>> {
		«FOR e : enumerationLiterals»
		«e»
		«ENDFOR»
	}
	'''
	
	def dispatch String toPlantUML(GeneralizationSet it)
	'''
	«FOR sp : specializingUniversals»
	«specializedUniversal.name» <|-- «sp.name» «if(name==null || name.empty) "" else ":"+name»
	«ENDFOR»
	'''
	
	def dispatch String toPlantUML(Kind it)
	'''
	class «name» <<kind>> {
		
	}
	«FOR c : characterizedBy»
	«toPlantUML(name, c)»
	«ENDFOR»
	'''
	
	def dispatch String toPlantUML(String sourceName, Mediation it)
	'''
	«sourceName» «toPlantUML(sourceLowerBound, sourceUpperBound)» -- «toPlantUML(targetLowerBound, targetUpperBound)» «target.name» : mediates >
	'''
	
	def dispatch String toPlantUML(MembershipRelation it)
	'''
	«part.name» «toPlantUML(sourceLowerBound, sourceUpperBound)» o-- «toPlantUML(targetLowerBound, targetUpperBound)» «whole.name» : isMemberOf >
	'''
	
	def dispatch String toPlantUML(Mixin it)
	'''
	class «name» <<mixin>> {
		
	}
	'''
	
	def dispatch String toPlantUML(Model it)
	'''
	@startuml
	hide circle
	hide methods
	«FOR e : elements»
    «e.toPlantUML»
    «ENDFOR»
	
	'''
	
	def dispatch String toPlantUML(ModeUniversal it)
	'''
	class «name» <<mode>> {

	}
	«FOR c : characterizedBy»
	«toPlantUML(name, c)»
	«ENDFOR»
	'''
	
	def dispatch String toPlantUML(nAryFormalRelation it) // This one has no target...
	'''
	'''
	
	def dispatch String toPlantUML(nAryMaterialRelation it)
	'''
	«FOR t : targetRelata»
	«derivedFrom.name» «toPlantUML(sourceLowerBound, sourceUpperBound)» --> «t.name» : «name» >
	«ENDFOR»
	'''
	
	def dispatch String toPlantUML(Package it)
	'''
	package «name» {
	«FOR e : elements»
    «e.toPlantUML»
    «ENDFOR»
	}
	'''
	
	def dispatch String toPlantUML(Phase it)
	'''
	class «name» <<phase>> {
		
	}
	«FOR c : characterizedBy»
	«toPlantUML(name, c)»
	«ENDFOR»
	'''
	
	def dispatch String toPlantUML(PrimitiveDataType it)
	'''
	class «name» <<primitivetype>> {
		
	}
	'''
	
	def dispatch String toPlantUML(RelatorUniversal it)
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
	
	def dispatch String toPlantUML(Role it)
	'''
	class «name» <<role>> {
		
	}
	«FOR c : characterizedBy»
	«toPlantUML(name, c)»
	«ENDFOR»
	'''
	
	def dispatch String toPlantUML(RoleMixin it)
	'''
	class «name» <<rolemixin>> {
		
	}
	'''
	
	def dispatch String toPlantUML(QualityUniversal it)
	'''
	class «name» <<quality>> {
		
	}
	«toPlantUML("characterizes", name, characterization)»
	«FOR c : characterizedBy»
	«toPlantUML(name, c)»
	«ENDFOR»
	'''
	
	def dispatch String toPlantUML(QuantityUniversal it)
	'''
	class «name» <<quantity>> {
		
	}
	«FOR c : characterizedBy»
	«toPlantUML(name, c)»
	«ENDFOR»
	'''
	
	def dispatch String toPlantUML(SubCollectionRelation it)
	'''
	«part.name» «toPlantUML(sourceLowerBound, sourceUpperBound)» o-- «toPlantUML(targetLowerBound, targetUpperBound)» «whole.name»
	'''
	
	def dispatch String toPlantUML(SubKind it)
	'''
	class «name» <<kind>> {
		
	}
	«FOR c : characterizedBy»
	«toPlantUML(name, c)»
	«ENDFOR»
	'''
	
	def dispatch String toPlantUML(SubQuantityRelation it)
	'''
	«part.name» «toPlantUML(sourceLowerBound, sourceUpperBound)» *-- «toPlantUML(targetLowerBound, targetUpperBound)» «whole.name»
	'''
	
	
	override String getDiagramText(IEditorPart editorPart, IEditorInput editorInput, ISelection selection) {
	
        val document = (editorPart as XtextEditor).getDocumentProvider().getDocument(editorInput) as XtextDocument;
        
        try {
	        val Model model = document.readOnly[
	            return contents.head as Model
	        ]
	        
	        model.toPlantUML;
	        
	    } catch(NullPointerException e) {
	    	
	    }
        
    }
				
	override supportsSelection(ISelection selection) {
		// TODO check what is this for...
		return true;
	}
    
}