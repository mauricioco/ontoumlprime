package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider;
/*
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
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

import static br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils.OntoUMLPrimeUtils.*;
*/
public class OntoUMLPrimeViewStereotypeContentProvider {/*implements IStructuredContentProvider, ITreeContentProvider {
	/*
	public static Map<String, OntoUMLPrimeStereotype> map = new HashMap();
	
	static {
		
		// TODO read from config...
		
		map.put(STEREOTYPE_BINARY_FORMAL_RELATION, new OntoUMLPrimeStereotype(STEREOTYPE_BINARY_FORMAL_RELATION));
		map.put(STEREOTYPE_BINARY_MATERIAL_RELATION, new OntoUMLPrimeStereotype(STEREOTYPE_BINARY_MATERIAL_RELATION));
		map.put(STEREOTYPE_CATEGORY, new OntoUMLPrimeStereotype(STEREOTYPE_CATEGORY));
		map.put(STEREOTYPE_CHARACTERIZATION, new OntoUMLPrimeStereotype(STEREOTYPE_CHARACTERIZATION));
		map.put(STEREOTYPE_COLLECTIVE_UNIVERSAL, new OntoUMLPrimeStereotype(STEREOTYPE_COLLECTIVE_UNIVERSAL));
		map.put(STEREOTYPE_COMPLEX_DATA_TYPE, new OntoUMLPrimeStereotype(STEREOTYPE_COMPLEX_DATA_TYPE));
		map.put(STEREOTYPE_COMPONENT_OF_RELATION, new OntoUMLPrimeStereotype(STEREOTYPE_COMPONENT_OF_RELATION));
		map.put(STEREOTYPE_ENUMERATION, new OntoUMLPrimeStereotype(STEREOTYPE_ENUMERATION));
		map.put(STEREOTYPE_GENERALIZATION_SET, new OntoUMLPrimeStereotype(STEREOTYPE_GENERALIZATION_SET));
		map.put(STEREOTYPE_KIND, new OntoUMLPrimeStereotype(STEREOTYPE_KIND));
		map.put(STEREOTYPE_MEDIATION, new OntoUMLPrimeStereotype(STEREOTYPE_MEDIATION));
		map.put(STEREOTYPE_MEMBERSHIP_RELATION, new OntoUMLPrimeStereotype(STEREOTYPE_MEMBERSHIP_RELATION));
		map.put(STEREOTYPE_MIXIN, new OntoUMLPrimeStereotype(STEREOTYPE_MIXIN));
		map.put(STEREOTYPE_MODE_UNIVERSAL, new OntoUMLPrimeStereotype(STEREOTYPE_MODE_UNIVERSAL));
		map.put(STEREOTYPE_N_ARY_FORMAL_RELATION, new OntoUMLPrimeStereotype(STEREOTYPE_N_ARY_FORMAL_RELATION));
		map.put(STEREOTYPE_N_ARY_MATERIAL_RELATION, new OntoUMLPrimeStereotype(STEREOTYPE_N_ARY_MATERIAL_RELATION));
		map.put(STEREOTYPE_PACKAGE, new OntoUMLPrimeStereotype(STEREOTYPE_PACKAGE));
		map.put(STEREOTYPE_PHASE, new OntoUMLPrimeStereotype(STEREOTYPE_PHASE));
		map.put(STEREOTYPE_PRIMITIVE_DATA_TYPE, new OntoUMLPrimeStereotype(STEREOTYPE_PRIMITIVE_DATA_TYPE));
		map.put(STEREOTYPE_RELATOR_UNIVERSAL, new OntoUMLPrimeStereotype(STEREOTYPE_RELATOR_UNIVERSAL));
		map.put(STEREOTYPE_ROLE, new OntoUMLPrimeStereotype(STEREOTYPE_ROLE));
		map.put(STEREOTYPE_ROLE_MIXIN, new OntoUMLPrimeStereotype(STEREOTYPE_ROLE_MIXIN));
		map.put(STEREOTYPE_QUALITY_UNIVERSAL, new OntoUMLPrimeStereotype(STEREOTYPE_QUALITY_UNIVERSAL));
		map.put(STEREOTYPE_QUANTITY_UNIVERSAL, new OntoUMLPrimeStereotype(STEREOTYPE_QUANTITY_UNIVERSAL));
		map.put(STEREOTYPE_SUB_COLLECTION_RELATION, new OntoUMLPrimeStereotype(STEREOTYPE_SUB_COLLECTION_RELATION));
		map.put(STEREOTYPE_SUB_KIND, new OntoUMLPrimeStereotype(STEREOTYPE_SUB_KIND));
		map.put(STEREOTYPE_SUB_QUANTITY_RELATION, new OntoUMLPrimeStereotype(STEREOTYPE_SUB_QUANTITY_RELATION));
		
	}
	
	// ------------------------------------
	
	OntoUMLPrimeView ontoUMLPrimeView;
	TreeModelStereotype root;
	
	public OntoUMLPrimeViewStereotypeContentProvider(OntoUMLPrimeView ontoUMLPrimeView) {
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
		if (child instanceof TreeModelStereotype) {
			return ((TreeModelStereotype)child).getParent();
		}
		return null;
	}
	
	public Object [] getChildren(Object parent) {
		if (parent instanceof TreeModelStereotype) {
			return ((TreeModelStereotype)parent).getChildren();
		}
		return new Object[0];
	}
	
	public boolean hasChildren(Object parent) {
		if (parent instanceof TreeModelStereotype)
			return ((TreeModelStereotype)parent).hasChildren();
		return false;
	}
	
	private void initialize() {
				
		root = new TreeModelStereotype(null);
		
		for(String stereotypeName : map.keySet()) {
			root.addChild(new TreeModelStereotype(map.get(stereotypeName)));
		}
		
	}
	
	
	// ---------------------------------------------------------
	
	public void handleSelection(TreeViewer viewer) {
		ISelection selection = viewer.getSelection();
		Object obj = ((IStructuredSelection)selection).getFirstElement();	
		
		if(obj instanceof TreeModelStereotype) {
			((TreeModelStereotype) obj).getModelElement().setVisible(true);
			OntoUMLDiagramTextProvider.updateDiagram();
			//ICompositeNode composite = NodeModelUtils.getNode(((TreeModelElement)obj).getModelElement().getModelElement());
			//((XtextEditor)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor()).selectAndReveal(composite.getTextRegion().getOffset(), composite.getTextRegion().getLength());
		}
		
	}
	*/
}
