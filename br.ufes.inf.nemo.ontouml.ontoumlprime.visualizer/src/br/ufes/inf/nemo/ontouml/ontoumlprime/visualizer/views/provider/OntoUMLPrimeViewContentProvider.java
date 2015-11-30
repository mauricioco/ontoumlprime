package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider;

import java.util.ArrayList;
import java.util.HashMap;
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
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.model.OntoUMLPrimeModelElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.plantuml.OntoUMLDiagramTextProvider;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.plantuml.OntoUMLPrime2PlantUML;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.OntoUMLPrimeUtils;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.OntoUMLPrimeView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.TreeModelElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.TreeOption;

public class OntoUMLPrimeViewContentProvider implements IStructuredContentProvider, ITreeContentProvider {
	
	public static Map<String, OntoUMLPrimeModelElement> map = new HashMap();
	
	// ------------------------------------
	
	OntoUMLPrimeView ontoUMLPrimeView;
	TreeModelElement root;
	
	public OntoUMLPrimeViewContentProvider(OntoUMLPrimeView ontoUMLPrimeView) {
		super();
		this.ontoUMLPrimeView = ontoUMLPrimeView;
	}
	
	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		initialize();
		if(v instanceof TreeViewer) {
			((TreeViewer) v).refresh();
		}
	}
	
	public void dispose() {
	}
	
	public Object[] getElements(Object parent) {
		if (parent.equals(ontoUMLPrimeView.getViewSite())) {
			if(root == null) initialize();
			return getChildren(root);
		}
		return getChildren(parent);
	}
	
	public Object getParent(Object child) {
		if (child instanceof TreeModelElement) {
			return ((TreeModelElement)child).getParent();
		}
		return null;
	}
	
	public Object [] getChildren(Object parent) {
		if (parent instanceof TreeModelElement) {
			return ((TreeModelElement)parent).getChildren();
		}
		return new Object[0];
	}
	
	public boolean hasChildren(Object parent) {
		if (parent instanceof TreeModelElement)
			return ((TreeModelElement)parent).hasChildren();
		return false;
	}
	
	private void initialize() {
		//TODO treat errror
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
		
		root = new TreeModelElement(null);
		TreeModelElement modelRoot = new TreeModelElement(null);
		root.addChild(modelRoot);
		for(PackageableElement e : model.getElements()) {
			String id = OntoUMLPrimeUtils.sharedInstance().generateId(e);
			OntoUMLPrimeModelElement o = map.get(id);
			
			if(o == null) {
				o = new OntoUMLPrimeModelElement(e);
				map.put(o.getId(), o);
			}
			
			TreeModelElement tm = new TreeModelElement(o);
			
			tm.addChild(new TreeOption(tm, "TAG"));
			modelRoot.addChild(tm);
		}
		
	}
	
	
	// ---------------------------------------------------------
	
	public void handleSelection(TreeViewer viewer) {
		ISelection selection = viewer.getSelection();
		Object obj = ((IStructuredSelection)selection).getFirstElement();	
		
		if(obj instanceof TreeModelElement) {
			ICompositeNode composite = NodeModelUtils.getNode(((TreeModelElement)obj).getModelElement().getModelElement());
			((XtextEditor)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor()).selectAndReveal(composite.getTextRegion().getOffset(), composite.getTextRegion().getLength());
		}
		
		if(obj instanceof TreeOption) {
			((TreeOption) obj).getParentElement().getModelElement().setVisible(false);
			OntoUMLDiagramTextProvider.updateDiagram();
		}
	}
	
}
