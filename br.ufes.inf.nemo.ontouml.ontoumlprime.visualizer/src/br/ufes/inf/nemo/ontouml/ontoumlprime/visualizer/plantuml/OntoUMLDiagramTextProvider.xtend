package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.plantuml

import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IEditorInput
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.text.TextSelection
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.model.OntoUMLPrimeModelElement
import java.util.HashMap
import java.util.Map
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Element
import org.eclipse.emf.ecore.EObject
import org.eclipse.ui.PlatformUI
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.OntoUMLPrimeViewContentProvider

/**
 * This is the class that provides the PlantUML view with diagram code.
 */
class OntoUMLDiagramTextProvider extends AbstractDiagramTextProvider {
	
	static private Model previousModel = null;
	static public boolean updateModel = true;

	static def updateDiagram() {
		val editor = PlatformUI.workbench.activeWorkbenchWindow.activePage.activeEditor as XtextEditor;
		updateModel = false;
		editor.setFocus();
	}
	
	override String getDiagramText(IEditorPart editorPart, IEditorInput editorInput, ISelection selection) {
		
		val OntoUMLPrime2PlantUML o2p = OntoUMLPrime2PlantUML.sharedInstance;
		
		System.out.println("IT WORKED");
		
		if(!(editorPart instanceof XtextEditor)) {
			return o2p.showPlantUMLMessage("Active editor is not a Xtext Editor");
		}
	
        val document = (editorPart as XtextEditor).getDocumentProvider().getDocument(editorInput) as XtextDocument;
        
        val Model model = document.readOnly[
	        	val result = contents.head;
	        	if(result instanceof Model) {
	        		return result as Model;
	        	} else {
	        		return null;
	        	}
	        ]
	    
	    if(model == null) {
	    	o2p.showPlantUMLMessage("Active editor is not an OntoUMLPrime Xtext editor");
	    } else {
	    	if(updateModel) {
		    	previousModel = model;
	    		generatePlantUMLCode(model);
		    } else {
		    	updateModel = true;
		    	generatePlantUMLCode(previousModel);
		    }
	    	
	    }
        
    }
    
    def String generatePlantUMLCode(Model it) {
    	val OntoUMLPrime2PlantUML o2p = OntoUMLPrime2PlantUML.sharedInstance;
		'''
		@startuml    
		hide circle
		hide methods
		skinparam classBackgroundColor white
		skinparam classBorderColor black
		skinparam classArrowColor black
		
		«FOR e : elements»
	    «o2p.toPlantUML(e)»
	    «ENDFOR»
		
		@enduml
		'''
	}
				
	override supportsSelection(ISelection selection) {
		// TODO check what is this for...
		return true;
	}
    
}