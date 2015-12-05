package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.plantuml.OntoUMLDiagramTextProvider;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.OntoUMLPrimeUtils;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.OntoUMLPrimeView;

public class VisionManager {
	
	private static Map<String, VisionList> visionMap = new HashMap<>(); 
	
	public static VisionList initialize(String modelTitle, Model model) {
		System.out.println("Verifying vision list for " + modelTitle);
		VisionList v = visionMap.get(modelTitle);
		if (v == null) {
			System.out.println("Creating vision list for " + modelTitle);
			v = new VisionList(modelTitle, model);
			visionMap.put(modelTitle, v);
		}
		return v;
	}
	
	public static VisionList getVisionList(String modelTitle) {
		return visionMap.get(modelTitle);
	}
	
	public static Iterator<ModelVision> getVisionListIterator(String modelName) {
		VisionList visionList = visionMap.get(modelName);
		if(visionList != null) {
			return visionList.getVisionListIterator();
		} else {
			return null;
		}
	}
	
	public static void loadElements(String modelName) {
		
	}
	
	public static void saveElements(String modelName) {
		
	}
		
	// ---------------------------------------------------------
	
	
	
	// ---------------------------------------------------------
	
	public static void updateView() {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IViewPart view = page.findView(OntoUMLPrimeView.ID);
		if (view != null && view instanceof OntoUMLPrimeView) {
			((OntoUMLPrimeView) view).refreshViewer();
		}
	}
	
}
