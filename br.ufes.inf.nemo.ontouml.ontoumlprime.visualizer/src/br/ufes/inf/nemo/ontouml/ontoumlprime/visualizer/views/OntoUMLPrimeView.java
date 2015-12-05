package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.plantuml.OntoUMLDiagramTextProvider;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.OntoUMLPrimeViewContentProvider;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.OntoUMLPrimeViewLabelProvider;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.OntoUMLPrimeViewStereotypeContentProvider;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.ElementVisionTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.ModelVisionTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.ElementVision;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.ModelVision;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.VisionList;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.VisionManager;

import org.eclipse.jface.viewers.*;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


public class OntoUMLPrimeView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.OntoUMLPrimeView";

	private TreeViewer viewer;
	private DrillDownAdapter drillDownAdapter;
	private Action actionCreateVisionFromSelected;
	private Action action2;
	private Action selectAction;
	private Action doubleClickAction;
	private Action showTaxonomicStructureAction;
	
	/**
	 * The constructor.
	 */
	public OntoUMLPrimeView() {
	}
	
	final IPropertyListener propertyListener = new IPropertyListener() {	
		@Override
		public void propertyChanged(Object source, int propId) {
			// TODO source can be any part... even project explorer. Insert instanceof treatments
			//System.out.println("Updating model settings from " + ((IEditorPart)source).getTitle());
			//viewer.getContentProvider().inputChanged(viewer, null, null);
		}
	};
	
	public void unbindToEditor(final IWorkbenchPartReference editorPart) {
		editorPart.removePropertyListener(propertyListener);
	}
	
	public void bindToEditor(final IWorkbenchPartReference partRef) {
		partRef.addPropertyListener(propertyListener);
	}
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		drillDownAdapter = new DrillDownAdapter(viewer);
		viewer.setContentProvider(new OntoUMLPrimeViewContentProvider(this));
		viewer.setLabelProvider(new OntoUMLPrimeViewLabelProvider());
		//viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());
		//viewer.
		
		getSite().getPage().addPartListener(new IPartListener2() {
			
			@Override
			public void partVisible(IWorkbenchPartReference partRef) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void partOpened(IWorkbenchPartReference partRef) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void partInputChanged(IWorkbenchPartReference partRef) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void partHidden(IWorkbenchPartReference partRef) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void partDeactivated(IWorkbenchPartReference partRef) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void partClosed(IWorkbenchPartReference partRef) {
				// TODO Auto-generated method stub
				unbindToEditor(partRef);
			}
			
			@Override
			public void partBroughtToTop(IWorkbenchPartReference partRef) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void partActivated(IWorkbenchPartReference partRef) {
				// TODO Auto-generated method stub
				bindToEditor(partRef);
			}
		});
		
		
		
		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.viewer");
		getSite().setSelectionProvider(viewer);
		
		makeActions();
		hookContextMenu();
		hookSelectAction();
		hookDoubleClickAction();
		contributeToActionBars();
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				OntoUMLPrimeView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(actionCreateVisionFromSelected);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
		//manager.add(action1);
		//manager.add(action2);
		manager.add(showTaxonomicStructureAction);
		manager.add(new Separator());
		
		// Adds tree actions (go into, go back, go home). Commented because it's unnecessary.
		//drillDownAdapter.addNavigationActions(manager);
		
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(actionCreateVisionFromSelected);
		manager.add(action2);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
	}

	private void createVisionFromSelected() {
		final String modelTitle = OntoUMLDiagramTextProvider.currentModelTitle;
		IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
		Iterator<Object> iterator = selection.iterator();
		
		final List<PackageableElement> selectedElementList = new ArrayList<>();
		while(iterator.hasNext()) {
			Object obj = iterator.next();	
			if(obj instanceof ElementVisionTreeObject) {
				selectedElementList.add(((ElementVisionTreeObject) obj).getElementVision().getModelElement());
			}
		}
		
		IInputValidator validator = new IInputValidator() {
			@Override
			public String isValid(String newText) {
				if(newText.isEmpty()) {
					return "Enter name for your vision.";
				}
				
				Iterator<ModelVision> i = VisionManager.getVisionList(modelTitle).getVisionListIterator();
				while(i.hasNext()) {
					ModelVision v = i.next();
					if(v.getVisionName().equals(newText)) {
						return "Vision name " + newText + " already exists.";
					}
				}
				return null;
			}
		};
		
		InputDialog i = new InputDialog(getSite().getShell(), "Create new vision for "+modelTitle+"...", "", "", validator);
		switch(i.open()) {
			case Window.OK:
				VisionManager.getVisionList(modelTitle).addVision(i.getValue(), selectedElementList);
				refreshViewer();
				break;
			case Window.CANCEL:
			default:
				break;
		}
	}
	
	
	private void makeActions() {
		actionCreateVisionFromSelected = new Action() {
			public void run() {
				createVisionFromSelected();
			}
		};
		actionCreateVisionFromSelected.setText("Set all visible");
		actionCreateVisionFromSelected.setToolTipText("Set all elements visible.");
		actionCreateVisionFromSelected.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJ_ADD));
		
		action2 = new Action() {
			public void run() {
				//showMessage("Action 2 executed");
				//viewer.setContentProvider(new OntoUMLPrimeViewStereotypeContentProvider(OntoUMLPrimeView.this));
				//((OntoUMLPrimeViewContentProvider)viewer.getContentProvider()).setAllVisibility(false);
				OntoUMLDiagramTextProvider.updateDiagram();
			}
		};
		action2.setText("Set all invisible");
		action2.setToolTipText("Sets all elements invisible.");
		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
		showTaxonomicStructureAction = new Action("Show taxonomic structure", Action.AS_CHECK_BOX) {
			@Override
			public void run() {
				//setChecked(!isChecked());
			}
		};
		
		selectAction = new Action() {
			public void run() {
				IContentProvider cp = viewer.getContentProvider();
				if(cp instanceof OntoUMLPrimeViewContentProvider) {
					final String modelTitle = OntoUMLDiagramTextProvider.currentModelTitle;
					IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
					Object selectedObject = selection.getFirstElement();
					
					if(selectedObject instanceof ModelVisionTreeObject) {
						ModelVision selectedVision = ((ModelVisionTreeObject) selectedObject).getModelVision();
						VisionManager.getVisionList(modelTitle).setSelectedVision(selectedVision);
						OntoUMLDiagramTextProvider.updateDiagram();
					}
					
					//((OntoUMLPrimeViewContentProvider) cp).handleSelection(viewer);
				}
				//if(cp instanceof OntoUMLPrimeViewStereotypeContentProvider) {
				//	((OntoUMLPrimeViewStereotypeContentProvider) cp).handleSelection(viewer);
				//}
			}
		};
		
		doubleClickAction = new Action() {
			public void run() {
				
			}
		};
	}
	
	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
		        IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
		        viewer.expandToLevel(selection.getFirstElement(), 1);
			}
			
		});
	}
	
	private void hookSelectAction() {
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				selectAction.run();
			}
		});
	}
	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"OntoUMLPrime View",
			message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	// ------------------------------------------------------------------------
	
	public void refreshViewer() {
		viewer.getContentProvider().inputChanged(viewer, null, null);
	}
}
