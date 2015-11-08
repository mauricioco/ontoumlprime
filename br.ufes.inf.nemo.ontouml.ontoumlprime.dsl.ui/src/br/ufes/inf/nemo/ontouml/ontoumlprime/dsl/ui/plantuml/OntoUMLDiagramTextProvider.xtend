package br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml

import net.sourceforge.plantuml.eclipse.utils.AbstractDiagramTextProvider
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IEditorInput
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model
import br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml.elements.KindPlantUML
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Kind

class OntoUMLDiagramTextProvider extends AbstractDiagramTextProvider {
	
	def dispatch String toPlantUML(Model it)
	'''
	@startuml
	«FOR e : elements»
    «e.toPlantUML»
    «ENDFOR»
    @enduml
	'''
	
	def dispatch String toPlantUML(Kind it) { KindPlantUML.toPlantUML(it) }
	
	override String getDiagramText(IEditorPart editorPart, IEditorInput editorInput) {
	
        val document = (editorPart as XtextEditor).getDocumentProvider().getDocument(editorInput) as XtextDocument;
        
        val Model model = document.readOnly[
            return contents.head as Model
        ]
        
        System.out.println(model.toPlantUML);
        model.toPlantUML;
        
    }
    
}