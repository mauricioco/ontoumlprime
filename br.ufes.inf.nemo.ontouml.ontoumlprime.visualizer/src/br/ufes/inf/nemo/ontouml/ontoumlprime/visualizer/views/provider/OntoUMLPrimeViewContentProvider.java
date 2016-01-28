package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Element;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.plantuml.OntoUMLDiagramTextProvider;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.plantuml.OntoUMLPrime2PlantUML;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.OntoUMLPrimeUtils;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.OntoUMLPrimeView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.ElementVisionTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.ModelVisionTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.RootTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.TreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.ElementVision;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.ModelVision;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.VisionList;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.VisionManager;


public class OntoUMLPrimeViewContentProvider implements IStructuredContentProvider, ITreeContentProvider {
	
	OntoUMLPrimeView ontoUMLPrimeView;
	RootTreeObject root;
	
	public OntoUMLPrimeViewContentProvider(OntoUMLPrimeView ontoUMLPrimeView) {
		super();
		this.ontoUMLPrimeView = ontoUMLPrimeView;
	}
	
	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		initialize();	// more like reinitialize... if it fails, content won't change.
		if(v instanceof TreeViewer) {
			((TreeViewer) v).refresh();
		}
	}
	
	public void dispose() {
	}
	
	public Object[] getElements(Object parent) {
		if (parent.equals(ontoUMLPrimeView.getViewSite())) {
			if(root == null) {
				initialize();
			}
			return getChildren(root);
		}
		return getChildren(parent);
	}
	
	public Object getParent(Object child) {
		if (child instanceof TreeObject) {
			return ((TreeObject)child).getParent();
		}
		return null;
	}
	
	public Object [] getChildren(Object parent) {
		if (parent instanceof TreeObject) {
			return ((TreeObject)parent).getChildren();
		}
		return new Object[0];
	}
	
	public boolean hasChildren(Object parent) {
		if (parent instanceof TreeObject)
			return ((TreeObject)parent).hasChildren();
		return false;
	}
	
	private void initialize() {
		/*
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		IEditorInput editorInput = editor.getEditorInput();
		XtextDocument doc = (XtextDocument) ((XtextEditor) editor).getDocumentProvider().getDocument(editorInput);
		
		final IUnitOfWork<Model, XtextResource> getModel = new IUnitOfWork<Model, XtextResource>() {

			@Override
			public Model exec(XtextResource state) throws Exception {
				EList<EObject> _contents = state.getContents();
				final EObject result = IterableExtensions.<EObject>head(_contents);
				if ((result instanceof Model)) {
					return ((Model) result);
				} else {
					return null;
				}
			}
			
		};
		
		Model model = doc.<Model>readOnly(getModel);
		*/
		
		String modelTitle = OntoUMLDiagramTextProvider.currentModelTitle;
		VisionList visionList = VisionManager.getVisionList(modelTitle);
		if(visionList == null) {
			return;
		}
		
		System.out.println("Should update...");
		
		Iterator<ModelVision> visionIterator = visionList.getVisionListIterator();
		
		root = new RootTreeObject();	// invisible element.
		while(visionIterator.hasNext()) {
			ModelVision vision = visionIterator.next();
			
			ModelVisionTreeObject modelRoot = new ModelVisionTreeObject(vision);
			root.addChild(modelRoot);
			for(ElementVision elementVision : vision.getElementVisionList()) {
				modelRoot.addChild(new ElementVisionTreeObject(elementVision));
			}
			
		}
		
	}
	
	
	// ---------------------------------------------------------

	
	//public void 
	
	public void handleSelection(TreeViewer viewer) {
		
		/*
		IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
		Iterator<Object> iterator = selection.iterator();
				
		while(iterator.hasNext()) {
			Object obj = iterator.next();	
			if(obj instanceof TreeModelElement) {
				ICompositeNode composite = NodeModelUtils.getNode(((TreeModelElement)obj).getModelElement().getModelElement());
				((XtextEditor)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor()).selectAndReveal(composite.getTextRegion().getOffset(), composite.getTextRegion().getLength());
				((TreeModelElement) obj).getModelElement().setVisible(true);
				OntoUMLDiagramTextProvider.updateDiagram();
			}
		}
		*/
	}
	
}
