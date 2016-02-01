package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider;

import java.util.Iterator;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.plantuml.OntoUMLDiagramTextProvider;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.OntoUMLPrimeView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.ModelElementTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.ModelViewTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.RootTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.TreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelElementView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewList;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewManager;


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
		ModelViewList modelViewList = ModelViewManager.getModelViewList(modelTitle);
		if(modelViewList == null) {
			return;
		}
		
		System.out.println("Should update...");
		
		Iterator<ModelView> modelViewIterator = modelViewList.getModelViewListIterator();
		
		root = new RootTreeObject();	// invisible element.
		while(modelViewIterator.hasNext()) {
			ModelView modelView = modelViewIterator.next();
			
			ModelViewTreeObject modelRoot = new ModelViewTreeObject(modelView);
			root.addChild(modelRoot);
			for(ModelElementView modelElementView : modelView.getModelElementViewList()) {
				modelRoot.addChild(new ModelElementTreeObject(modelElementView));
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
