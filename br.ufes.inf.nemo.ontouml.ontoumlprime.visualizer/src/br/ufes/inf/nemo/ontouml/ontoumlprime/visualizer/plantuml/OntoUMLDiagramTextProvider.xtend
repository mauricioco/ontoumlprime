package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.plantuml

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.log.Log
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewManager
import net.sourceforge.plantuml.eclipse.utils.DiagramTextProvider
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument

import static br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewManager.*
import org.eclipse.ui.IFileEditorInput

/**
 * This is the class that provides the PlantUML view with diagram code.
 */
class OntoUMLDiagramTextProvider implements DiagramTextProvider {
	
	enum UpdateMethod {
		
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
	    	// Model names are based on the file name. If you rename it, it's gone.
	    	val String modelName = (editorPart.editorInput as IFileEditorInput).file.name;
	    	Log.p(100, OntoUMLDiagramTextProvider, "retrieving model view for " + modelName);
	    	val modelView = ModelViewManager.initializeModelView(modelName, model);
	    	
	    	Log.p(100, OntoUMLDiagramTextProvider, "requesting OntoUMLPrime view update for " + modelName);
	    	ModelViewManager.currentModel = model;
		    ModelViewManager.currentModelTitle = editorPart.title;
		    ModelViewManager.updateOntoUMLPrimeView;
		    
		    Log.p(100, OntoUMLDiagramTextProvider, "generating PlantUML code for visualizer");
		    Log.p(100, OntoUMLDiagramTextProvider, "---------------------------------------");
	    	return OntoUMLPrime2PlantUML.generatePlantUMLCode(modelView.selectedModelView);
	    }
        
    }
    	  
}