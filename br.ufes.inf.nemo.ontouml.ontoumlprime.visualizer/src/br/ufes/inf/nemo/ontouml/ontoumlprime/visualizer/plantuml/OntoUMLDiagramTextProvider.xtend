package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.plantuml

import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IEditorInput
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument
import net.sourceforge.plantuml.text.AbstractDiagramTextProvider
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.text.TextSelection
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model
import java.util.HashMap
import java.util.Map
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Element
import org.eclipse.emf.ecore.EObject
import org.eclipse.ui.PlatformUI
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.OntoUMLPrimeViewContentProvider
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.OntoUMLPrimeUtils
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.VisionManager
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.ModelVision
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.VisionList

/**
 * This is the class that provides the PlantUML view with diagram code.
 */
class OntoUMLDiagramTextProvider extends AbstractDiagramTextProvider {
	
	enum UpdateMethod {
		
	}
	
	public static String currentModelTitle = "";
	public static Model currentModel = null;
	
	private static boolean updateModel = true;

	static def updateDiagram() {
		val editor = PlatformUI.workbench.activeWorkbenchWindow.activePage.activeEditor as XtextEditor;
		updateModel = false;
		editor.setFocus();
	}
	
	override String getDiagramText(IEditorPart editorPart, IEditorInput editorInput, ISelection selection) {
		
		val OntoUMLPrime2PlantUML o2p = OntoUMLPrime2PlantUML.sharedInstance;
				
		if(!(editorPart instanceof XtextEditor)) {
			return OntoUMLPrime2PlantUML.showPlantUMLMessage("Active editor is not a Xtext Editor");
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
	    	OntoUMLPrime2PlantUML.showPlantUMLMessage("Active editor is not an OntoUMLPrime Xtext editor");
	    } else {
	    	
	    	val v = VisionManager.initialize(editorPart.title, model);
		    VisionManager.updateView;
		    
	    	if(updateModel) {
		    	currentModel = model;
		    	currentModelTitle = editorPart.title;
		    	//System.out.println("Current title: " + currentModelTitle);
		    	
	    		generatePlantUMLCode(model, v.selectedVision);
		    } else {
		    	updateModel = true;
		    	generatePlantUMLCode(currentModel, v.selectedVision);
		    }
	    	
	    }
        
    }
    //«val o = OntoUMLPrimeViewContentProvider.map.get(OntoUMLPrimeUtils.generateId(e))»
    //		«IF o == null || o.visible»
    // 	    «ENDIF»
    
    def String generatePlantUMLCode(Model it, ModelVision v) {
		'''
		@startuml
		hide circle
		hide methods
		skinparam classBackgroundColor white
		skinparam classBorderColor black
		skinparam classArrowColor black
		
		«FOR e : elements»
		
		«IF v.getElementVision(e) != null»
		«OntoUMLPrime2PlantUML.toPlantUML(e)»
		«ENDIF»
		
	    «ENDFOR»
		
		@enduml
		'''
	}
				
	override supportsSelection(ISelection selection) {
		// TODO check what is this for...
		return true;
	}
    
}