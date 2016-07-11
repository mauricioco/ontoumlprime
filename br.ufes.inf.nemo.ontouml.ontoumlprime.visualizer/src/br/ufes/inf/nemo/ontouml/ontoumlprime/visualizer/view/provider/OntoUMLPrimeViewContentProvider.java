package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryFormalRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.EndurantUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.log.Log;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewList;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewManager;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.OntoUMLPrimeView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.ModelViewElementTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.ModelViewTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.RootTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.StringTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.TreeObject;


public class OntoUMLPrimeViewContentProvider implements IStructuredContentProvider, ITreeContentProvider {
	
	OntoUMLPrimeView ontoUMLPrimeView;
	RootTreeObject root;
	
	public OntoUMLPrimeViewContentProvider(OntoUMLPrimeView ontoUMLPrimeView) {
		super();
		this.ontoUMLPrimeView = ontoUMLPrimeView;
	}
	
	public void inputChangedSelectingModelView(Viewer v, ModelView mv) {
		inputChanged(v, null, null);
		
		if(v instanceof TreeViewer) {
			// Apparently it isn't asynchronous. According to debug, it ran on main thread.
			((TreeViewer) v).refresh();
			for (TreeObject mvto : root.getChildren()) {
				if (((ModelViewTreeObject) mvto).getModelView().equals(mv)) {
					TreeSelection selection = new TreeSelection(new TreePath(new Object[]{root, mvto})); 
					v.setSelection(selection);
					break;
				}
			}
		}

	}
	
	@Override
	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		Log.p(400, OntoUMLPrimeViewContentProvider.class, "refreshing OntoUMLPrime tree view");
		initialize();	// more like reinitialize... if it fails, content won't change.
		if(v instanceof TreeViewer) {
			((TreeViewer) v).refresh();
		}
	}
	
	public void dispose() {
	}
	
	public Object[] getElements(Object parent) {
		if (parent.equals(ontoUMLPrimeView.getViewSite())) {
			if(root == null && ModelViewManager.isCurrentModelViewListInitialized()) {
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
	
	private void processModelView(ModelView modelView) {
		ModelViewTreeObject modelRoot = new ModelViewTreeObject(modelView);
		root.addChild(modelRoot);
		for(ModelViewElement modelViewElement : modelView.getModelViewElementList()) {
			
			EObject e = modelViewElement.getModelElement();
			
			if (e instanceof GeneralizationSet) {
				// Generalization not gonna show anymore. Too messy.
			} else if (e instanceof Universal) {
				//EList<GeneralizationSet> isSpecializedVia = ((Universal) e).getIsSpecializedVia();
				EList<GeneralizationSet> specializesVia = ((Universal) e).getSpecializesVia();

				ModelViewElementTreeObject modelViewElementRoot = new ModelViewElementTreeObject(modelViewElement);
				modelRoot.addChild(modelViewElementRoot);
				
				for (GeneralizationSet g : specializesVia) {
					if (g.getSpecializedUniversal() != null) {
						modelViewElementRoot.addChild(new StringTreeObject("Generalization " + g.getSpecializedUniversal().getName()));
					}
				}
				
				if (e instanceof EndurantUniversal) {
					for (Characterization c : ((EndurantUniversal) e).getCharacterizedBy()) {
						ModelViewElementTreeObject characterizationRoot = new ModelViewElementTreeObject(modelView.getModelViewElement(c));
						modelViewElementRoot.addChild(characterizationRoot);
						characterizationRoot.addChild(new ModelViewElementTreeObject(modelView.getModelViewElement(c.getTarget())));
					}
				}
				
				if (e instanceof RelatorUniversal) {
					for (Mediation m : ((RelatorUniversal) e).getMediations()) {
						ModelViewElementTreeObject mediationRoot = new ModelViewElementTreeObject(modelView.getModelViewElement(m));
						modelViewElementRoot.addChild(mediationRoot);
						mediationRoot.addChild(new ModelViewElementTreeObject(modelView.getModelViewElement(m.getTarget())));
					}
				}
				
			} else if (e instanceof BinaryDirectedRelationship) {
				//ModelViewElementTreeObject modelViewElementRoot = new ModelViewElementTreeObject(modelViewElement);
				//modelRoot.addChild(modelViewElementRoot);
				/*
				if (e instanceof Characterization) {
					modelViewElementRoot.addChild(new StringTreeObject(((Characterization) e).getSource().getName() + " characterized by "));
					modelViewElementRoot.addChild(new StringTreeObject(((Characterization) e).getTarget().getName()));
				} else if (e instanceof Mediation) {
					modelViewElementRoot.addChild(new StringTreeObject(((Mediation) e).getSource().getName() + " mediates "));
					modelViewElementRoot.addChild(new StringTreeObject(((Mediation) e).getTarget().getName()));
				} else*/ if (e instanceof BinaryFormalRelation) {
					ModelViewElementTreeObject modelViewElementRoot = new ModelViewElementTreeObject(modelViewElement);
					modelRoot.addChild(modelViewElementRoot);
					modelViewElementRoot.addChild(new StringTreeObject(((BinaryFormalRelation) e).getSource().getName() + " " + ((BinaryFormalRelation) e).getName()));
					modelViewElementRoot.addChild(new StringTreeObject(((BinaryFormalRelation) e).getTarget().getName()));
				} else if (e instanceof BinaryMaterialRelation) {
					ModelViewElementTreeObject modelViewElementRoot = new ModelViewElementTreeObject(modelViewElement);
					modelRoot.addChild(modelViewElementRoot);
					modelViewElementRoot.addChild(new StringTreeObject(((BinaryMaterialRelation) e).getSource().getName() + " " + ((BinaryMaterialRelation) e).getName()));
					modelViewElementRoot.addChild(new StringTreeObject(((BinaryMaterialRelation) e).getTarget().getName()));
				} else if (e instanceof MeronymicRelation) {
					// TODO finish this!
				}
				
			}
			
			/*if (e instanceof RelatorUniversal) {
				for (Mediation m : ((RelatorUniversal) e).getMediations()) {
					modelViewElementRoot.addChild(new ModelViewElementTreeObject(new ModelViewElement(m)));
				}
				continue;
			}
			
			if (e instanceof EndurantUniversal) {
				for (Characterization c : ((EndurantUniversal) e).getCharacterizedBy()) {
					modelViewElementRoot.addChild(new ModelViewElementTreeObject(new ModelViewElement(c)));
				}
				continue;
			}*/
		}
	}
	
	private void initialize() {
		if (root == null) {
			Log.p(401, OntoUMLPrimeViewContentProvider.class, "initializing OntoUMLPrime view content provider tree");
		} else {
			Log.p(401, OntoUMLPrimeViewContentProvider.class, "re-initializing OntoUMLPrime view content provider tree");
		}
		
		ModelViewList modelViewList = ModelViewManager.getCurrentModelViewList();
		if(modelViewList == null) {
			Log.e(401, OntoUMLPrimeViewContentProvider.class, "cannot refresh the tree view for current model as it was not initialized yet");
			return;
		}
				
		Iterator<ModelView> modelViewIterator = modelViewList.getModelViewListIterator();
		
		root = new RootTreeObject();	// invisible element.
		processModelView(modelViewList.getDefaultModelView()); // adding default model view first.
		while(modelViewIterator.hasNext()) {
			ModelView modelView = modelViewIterator.next();
			processModelView(modelView);
		}
		
		Log.p(401, OntoUMLPrimeViewContentProvider.class, "OntoUMLPrime tree view built");
	}
	
	
	// ---------------------------------------------------------
	
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