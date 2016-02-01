package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.plantuml

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewManager
import net.sourceforge.plantuml.eclipse.utils.DiagramTextProvider
import net.sourceforge.plantuml.eclipse.views.PlantUmlView
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.PlatformUI
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument

/**
 * This is the class that provides the PlantUML view with diagram code.
 */
class OntoUMLDiagramTextProvider implements DiagramTextProvider {
	
	enum UpdateMethod {
		
	}
	
	public static String currentModelTitle = "";
	public static Model currentModel = null;
	
	private static boolean updateModel = true;

	def static updateDiagram() {		
		val v = ModelViewManager.initialize(currentModelTitle, currentModel);
		ModelViewManager.updateView;
		updateDiagramWithCode(generatePlantUMLCode(currentModel, v.getSelectedModelView));
	}
	
	/**
	 * This method directly updates the PlantUML visualization. 
	 */
	def static private updateDiagramWithCode(String code) {
		val page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		if (page == null) {
			return;
		}
		val view = page.findView("net.sourceforge.plantuml.eclipse.views.PlantUmlView");
		if (view != null && view instanceof PlantUmlView) {
			(view as PlantUmlView).updateDiagram(code);
		}
	}
	
	override supportsEditor(IEditorPart editorPart) {
		if(editorPart instanceof XtextEditor) {
			return true;
		} else {
			System.out.println("Editor not supported.");
			updateDiagramWithCode(OntoUMLPrime2PlantUML.showPlantUMLMessage("Active editor is not a Xtext Editor"));
			return false;
		}
	}
	
	override supportsSelection(ISelection selection) {
		return true;
	}
		
	override String getDiagramText(IEditorPart editorPart, ISelection selection) {
						
		if(!supportsEditor(editorPart)) {
			OntoUMLPrime2PlantUML.showPlantUMLMessage("Active editor is not a Xtext Editor")
			return null;
		}
	
        val document = (editorPart as XtextEditor).getDocumentProvider().getDocument(editorPart.editorInput) as XtextDocument;
        
		//System.out.println("CALLED IT");
        
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
	    	
	    	val v = ModelViewManager.initialize(editorPart.title, model);
		    ModelViewManager.updateView;
		    
		    currentModel = model;
		    currentModelTitle = editorPart.title;
		    //System.out.println("Current title: " + currentModelTitle);
		    
	    	generatePlantUMLCode(model, v.getSelectedModelView);
		    	
	    }
        
    }
    //«val o = OntoUMLPrimeViewContentProvider.map.get(OntoUMLPrimeUtils.generateId(e))»
    //		«IF o == null || o.visible»
    // 	    «ENDIF»
    
    def static String generatePlantUMLCode(Model it, ModelView v) {
		'''
		@startuml
		hide circle
		hide methods
		skinparam classBackgroundColor white
		skinparam classBorderColor black
		skinparam classArrowColor black
		
		«FOR e : elements»
		
		«IF v.getModelElementView(e) != null»
		«OntoUMLPrime2PlantUML.toPlantUML(e)»
		«ENDIF»
		
	    «ENDFOR»
		
		@enduml
		'''
	}
	  
}