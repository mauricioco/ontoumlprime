package br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml

import net.sourceforge.plantuml.eclipse.utils.AbstractDiagramTextProvider
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IEditorInput
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model
import static br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui.plantuml.PlantUMLInterface.*

class OntoUMLDiagramTextProvider extends AbstractDiagramTextProvider {
	
	def String toPlantUML(Model it)
	'''
	@startuml
	hide circle
	hide methods
	«FOR e : elements»
    «toPlantUML(e)»
    «ENDFOR»
	@enduml
	'''
	
	
	override String getDiagramText(IEditorPart editorPart, IEditorInput editorInput) {
	
        val document = (editorPart as XtextEditor).getDocumentProvider().getDocument(editorInput) as XtextDocument;
        
        val Model model = document.readOnly[
            return contents.head as Model
        ]
        
        model.toPlantUML;
        
    }
    
}