package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.log.Log;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewManager;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.pattern.Pattern;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.OntoUMLPrimeViewContentProvider;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.OntoUMLPrimeViewLabelProvider;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.OntoUMLPrimeViewSorter;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.OntoUMLPrimeViewStereotypeContentProvider;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.ElementVisionTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.ModelVisionTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.ModelElementView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.ModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.ModelViewList;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.ModelViewManager;

import org.eclipse.jface.viewers.*;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.ui.actions.ActionGroup;
import org.eclipse.ui.application.ActionBarAdvisor;
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
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		drillDownAdapter = new DrillDownAdapter(viewer);
		viewer.setContentProvider(new OntoUMLPrimeViewContentProvider(this));
		viewer.setLabelProvider(new OntoUMLPrimeViewLabelProvider());
		
		ViewerFilter[] e = new ViewerFilter[1];
		e[0] = new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		//viewer.setFilters(e);
		viewer.setSorter(new OntoUMLPrimeViewSorter());
		viewer.setInput(getViewSite());
		//viewer.
		
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
		manager.add(actionCreateModelViewFromSelected);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
		//manager.add(showTaxonomicStructureAction);
		manager.add(actionCreateVisionFromSelected);
		
		MenuManager menuManager = new MenuManager();
		menuManager.setMenuText("Add to...");
		final String modelTitle = OntoUMLDiagramTextProvider.currentModelTitle;
		Iterator<ModelView> i = ModelViewManager.getVisionList(modelTitle).getVisionListIterator();
		while(i.hasNext()) {
			ModelView mv = i.next();
			
			if (mv.isDefault()){
				continue;
			}
			
			Action a = new Action() {
				@Override
				public void run() {
					createModelViewFromSelected();
				}
			};

			a.setText(mv.getModelViewName());
			menuManager.add(a);
		}
		
		menuManager.add(new Separator());
		menuManager.add(actionCreateModelViewFromSelected);
		
		manager.add(menuManager);
		//manager.add(new Separator());
		//drillDownAdapter.addNavigationActions(manager);
		
		// Other plug-ins can contribute there actions here... and this is not working well, so... DISABLED!
		//manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(actionCreateModelViewFromSelected);
		manager.add(action2);
		manager.add(new Separator());
		//drillDownAdapter.addNavigationActions(manager);
	}

	private void createVisionFromSelected() {
		final String modelTitle = OntoUMLDiagramTextProvider.currentModelTitle;
		IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
		
		Iterator<Object> iterator = selection.iterator();
		
		final List<EObject> selectedElementList = new ArrayList<>();
		while(iterator.hasNext()) {
			Object obj = iterator.next();	
			if(obj instanceof ElementVisionTreeObject) {
				selectedElementList.add(((ElementVisionTreeObject) obj).getElementVision().getModelElement());
			}
		}
		/*
		final List<PackageableElement> hierarquicalElements = new ArrayList<>();
		
		IInputValidator validator = new IInputValidator() {
			@Override
			public String isValid(String newText) {
				if(newText.isEmpty()) {
					return "Enter name for your vision.";
				}
				
				Iterator<ModelView> i = ModelViewManager.getVisionList(modelTitle).getVisionListIterator();
				while(i.hasNext()) {
					ModelView v = i.next();
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
				ModelViewManager.getVisionList(modelTitle).addVision(i.getValue(), selectedElementList);
				refreshViewer();
				break;
			case Window.CANCEL:
			default:
				break;
		}
	}
	
	
	private void makeActions() {
		actionCreateModelViewFromSelected = new Action() {
			public void run() {
				createModelViewFromSelected();
			}
		};
		actionCreateVisionFromSelected.setText("Create vision...");
		actionCreateVisionFromSelected.setToolTipText("Creates vision with the selected elements.");
		actionCreateVisionFromSelected.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJ_ADD));
		
		actionCreateHierarquicalModelViewFromSelected = new Action() {
			public void run() {
				createHierarquicalModelViewFromElement();
			}
		};
		actionCreateHierarquicalModelViewFromSelected.setText("Create hierarquical model view...");
		actionCreateHierarquicalModelViewFromSelected.setToolTipText("Creates hierarquical model view from the selected element.");
		
		action2 = new Action() {
			public void run() {
				//showMessage("Action 2 executed");
				//viewer.setContentProvider(new OntoUMLPrimeViewStereotypeContentProvider(OntoUMLPrimeView.this));
				//((OntoUMLPrimeViewContentProvider)viewer.getContentProvider()).setAllVisibility(false);
				//OntoUMLDiagramTextProvider.updateDiagram();
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
					final String modelTitle = ModelViewManager.getCurrentModelTitle();
					IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
					Object selectedObject = selection.getFirstElement();
					
					if(selectedObject instanceof ModelVisionTreeObject) {
						ModelView selectedVision = ((ModelVisionTreeObject) selectedObject).getModelVision();
						ModelViewManager.getVisionList(modelTitle).setSelectedVision(selectedVision);
						OntoUMLDiagramTextProvider.updateDiagram();
					}
					
					//if(selectedObject instanceof ModelElementViewTreeObject) {
					//	ModelElementView selectedElement = ((ModelElementViewTreeObject) selectedObject).getModelElementView();
					//	selectedElement.setExists(exists);
					//	OntoUMLDiagramTextProvider.updateDiagram();
					//}
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
	
	public void refreshViewerAndSelectModelView(ModelView mv) {
		((OntoUMLPrimeViewContentProvider) viewer.getContentProvider()).inputChangedSelectingModelView(viewer, mv);	
	}
}
