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
import org.eclipse.ui.part.FileEditorInput
import java.beans.PropertyChangeEvent
import org.eclipse.ui.IWorkbenchPage
import net.sourceforge.plantuml.eclipse.views.PlantUmlView
import net.sourceforge.plantuml.eclipse.utils.DiagramTextProvider
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.ModelViewManager
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.ModelViewList
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.ModelView

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
		updateDiagramWithCode(generatePlantUMLCode(currentModel, v.selectedVision));
	}
	
	/**
	 * Returns true if the active eclipse editor is supported by this text provider.
	 */
	override supportsEditor(IEditorPart editorPart) {
		if (editorPart instanceof XtextEditor) {
			return true;
		} else {
			Log.e(100, OntoUMLDiagramTextProvider, "editor not supported");
			ModelViewManager.showMessageInPlantUMLView("Active editor is not a Xtext Editor");
			return false;
		}
	}
	
	/**
	 * Returns true if the active eclipse editor selection is supported by this text provider.
	 */
	override supportsSelection(ISelection selection) {
		return true;
	}
	
	/**
	 * The PlantUML visualizer calls this method to update the diagram visualization.
	 * Everytime there's an update to editorPart or selection, this method is called.
	 */
	override String getDiagramText(IEditorPart editorPart, ISelection selection) {
		Log.p(100, OntoUMLDiagramTextProvider, "getDiagramText called");
		
		if(!supportsEditor(editorPart)) {
			Log.e(100, OntoUMLDiagramTextProvider, "active editor is not a xtext editor");
			return OntoUMLPrime2PlantUML.showPlantUMLMessage("Active editor is not a Xtext Editor");
		}
		
        val document = (editorPart as XtextEditor).getDocumentProvider().getDocument(editorPart.editorInput) as XtextDocument;
        
        val Model model = document.readOnly[
	        	val result = contents.head;
	        	if(result instanceof Model) {
	        		return result as Model;
	        	} else {
	        		return null;
	        	}
	        ];
	    
	    if (model == null) {
	    	Log.e(100, OntoUMLDiagramTextProvider, "active editor is not an OntoUMLPrime Xtext editor");
	    	return OntoUMLPrime2PlantUML.showPlantUMLMessage("Active editor is not an OntoUMLPrime Xtext editor");
	    } else {
	    	// TODO dude, editorPart.title?? Don't depend on UI parameters for model attributes.
	    	Log.p(100, OntoUMLDiagramTextProvider, "retrieving model view for " + editorPart.title);
	    	val modelView = ModelViewManager.initializeModelView(editorPart.title, model);
	    	
	    	Log.p(100, OntoUMLDiagramTextProvider, "requesting OntoUMLPrime view update for " + editorPart.title);
	    	ModelViewManager.currentModel = model;
		    ModelViewManager.currentModelTitle = editorPart.title;
		    ModelViewManager.updateOntoUMLPrimeView;
		    
		    currentModel = model;
		    currentModelTitle = editorPart.title;
		    //System.out.println("Current title: " + currentModelTitle);
		    
	    	generatePlantUMLCode(model, v.selectedVision);
		    	
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
		
		«IF v.getElementVision(e) != null»
		«OntoUMLPrime2PlantUML.toPlantUML(e)»
		«ENDIF»
		
	    «ENDFOR»
		
		@enduml
		'''
	}
	  
}
