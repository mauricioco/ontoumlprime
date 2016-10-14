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
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComponentOfRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.EndurantUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.MembershipRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubCollectionRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubQuantityRelation;
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
	
	// TODO CHECK FOR MODELVIEWELEMENT EXISTENCE BEFORE ADDING TO LIST!!!
	// If Endurant or Relator dont exist but its characterizations/mediations do, show on list
	private void processModelView(ModelView modelView) {
		ModelViewTreeObject modelRoot = new ModelViewTreeObject(modelView);
		root.addChild(modelRoot);
		for(ModelViewElement modelViewElement : modelView.getModelViewElementList()) {
			
			EObject e = modelViewElement.getModelElement();
			
			if (e instanceof GeneralizationSet) {
				// Generalization not gonna show anymore. Too messy.
			} else if (e instanceof Package) {
				
			
			} else if (e instanceof Universal) {
				EList<GeneralizationSet> specializesVia = ((Universal) e).getSpecializesVia();

				ModelViewElementTreeObject modelViewElementRoot = new ModelViewElementTreeObject(modelViewElement);
				modelRoot.addChild(modelViewElementRoot);
				
				for (GeneralizationSet g : specializesVia) {
					if (g.getSpecializedUniversal() != null && modelView.getModelViewElement(g) != null) {
						ModelViewElementTreeObject genRoot = new ModelViewElementTreeObject(modelView.getModelViewElement(g));
						modelViewElementRoot.addChild(genRoot);
						for (Universal otherSpec : g.getSpecializingUniversals()) {
							if (!otherSpec.equals(e) && modelView.getModelViewElement(otherSpec) != null) {
								genRoot.addChild(new StringTreeObject("also " + modelView.getModelViewElement(otherSpec).getDisplayName()));
							}
						}
					}
				}
				
				if (e instanceof EndurantUniversal) {
					for (Characterization c : ((EndurantUniversal) e).getCharacterizedBy()) {
						if (modelView.getModelViewElement(c) == null) {
							continue;
						}
						ModelViewElementTreeObject characterizationRoot = new ModelViewElementTreeObject(modelView.getModelViewElement(c));
						modelViewElementRoot.addChild(characterizationRoot);
					}
				}
				
				if (e instanceof RelatorUniversal) {
					for (Mediation m : ((RelatorUniversal) e).getMediations()) {
						if (modelView.getModelViewElement(m) == null) {
							continue;
						}
						ModelViewElementTreeObject mediationRoot = new ModelViewElementTreeObject(modelView.getModelViewElement(m));
						modelViewElementRoot.addChild(mediationRoot);
					}
				}
				
			} else if (e instanceof BinaryDirectedRelationship) {
				if (e instanceof Characterization) {
					EndurantUniversal source = ((Characterization) e).getSource();
					if (modelView.getModelViewElement(source) == null) {
						ModelViewElementTreeObject characterizationRoot = new ModelViewElementTreeObject(modelView.getModelViewElement(e));
						modelRoot.addChild(characterizationRoot);
					}
				} else if (e instanceof Mediation) {
					RelatorUniversal source = ((Mediation) e).getSource();
					if (modelView.getModelViewElement(source) == null) {
						ModelViewElementTreeObject mediationRoot = new ModelViewElementTreeObject(modelView.getModelViewElement(e));
						modelRoot.addChild(mediationRoot);
					}
				} else if (e instanceof BinaryFormalRelation) {
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
					ModelViewElementTreeObject modelViewElementRoot = new ModelViewElementTreeObject(modelViewElement);
					modelRoot.addChild(modelViewElementRoot);
					modelViewElementRoot.addChild(new StringTreeObject(((MeronymicRelation) e).getPart().getName() + " " + getMeronymicRelationDescription((MeronymicRelation) e)));
					modelViewElementRoot.addChild(new StringTreeObject(((MeronymicRelation) e).getWhole().getName()));
				}
			}
		}
	}
	
	private String getMeronymicRelationDescription(MeronymicRelation m) {
		if (m instanceof ComponentOfRelation) {
			return "is component of";
		}
		if (m instanceof MembershipRelation) {
			return "is member of";
		}
		if (m instanceof SubCollectionRelation) {
			return "is sub collection of";
		}
		if (m instanceof SubQuantityRelation) {
			return "is sub quantity of";
		}
		return "";
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