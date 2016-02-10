package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view;

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
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewManager;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action.ActionCreateHierarquicalModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action.ActionCreateModelViewFromSelected;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action.ActionRemoveElementFromModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action.ActionSetParentModelViewActive;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.OntoUMLPrimeViewContentProvider;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.OntoUMLPrimeViewLabelProvider;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.OntoUMLPrimeViewSorter;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.ModelViewElementTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.ModelViewTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.TreeObject;


public class OntoUMLPrimeView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.OntoUMLPrimeView";

	private TreeViewer viewer;
	private DrillDownAdapter drillDownAdapter;
	private Action action2;
	private Action selectAction;
	private Action doubleClickAction;
	
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
		/*
		ViewerFilter[] e = new ViewerFilter[1];
		e[0] = new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		*/
		//viewer.setFilters(e);
		viewer.setSorter(new OntoUMLPrimeViewSorter());
		viewer.setInput(getViewSite());
		
		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.viewer");
		getSite().setSelectionProvider(viewer);
		
		makeActions();
		hookContextMenu();
		hookSelectChangedListener();
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
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
		
		IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
		
		if (selection.size() == 1 && selection.getFirstElement() instanceof ModelViewTreeObject) {			
			drillDownAdapter.addNavigationActions(manager);
		} else {
			
			if (selection.size() == 1) {
				manager.add(ActionSetParentModelViewActive.sharedInstance());
				manager.add(new Separator());
			}
			
			manager.add(ActionCreateModelViewFromSelected.sharedInstance());
			manager.add(ActionCreateHierarquicalModelView.sharedInstance());
			manager.add(new Separator());
			
			// -----------------------------------------
			MenuManager menuManager = new MenuManager();
			menuManager.setMenuText("Add to...");
			final String modelTitle = ModelViewManager.getCurrentModelTitle();
			final List selectedElements = selection.toList();
			
			Iterator<ModelView> i = ModelViewManager.getModelViewList(modelTitle).getModelViewListIterator();
			while(i.hasNext()) {
				final ModelView current = i.next();
				Action a = new Action() {

					@Override
					public void run() {
						List<EObject> eObjectList = new ArrayList<EObject>();
						for(Object o : selectedElements) {
							if(o instanceof ModelViewElementTreeObject) {
								eObjectList.add(((ModelViewElementTreeObject) o).getModelElementView().getModelElement());
							}
						}
						
						current.addElements(eObjectList);
					}
					
				};
				a.setText(current.getVisionName());
				menuManager.add(a);
			}
			menuManager.add(new Separator());
			Action createNewModelViewFromSelected = new ActionCreateModelViewFromSelected();
			createNewModelViewFromSelected.setText("New model view...");
			menuManager.add(createNewModelViewFromSelected);
			// -----------------------------------------
			manager.add(menuManager);
			manager.add(ActionRemoveElementFromModelView.sharedInstance());
			
			manager.add(new Separator());			
			
			drillDownAdapter.addNavigationActions(manager);
		}
		
		// Other plug-ins can contribute there actions here... and this is not working well, so... DISABLED!
		//manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		//manager.add(actionCreateModelViewFromSelected);
		manager.add(action2);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
	}
	
	
	private void makeActions() {
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
		/*
		showTaxonomicStructureAction = new Action("Show taxonomic structure", Action.AS_CHECK_BOX) {
			@Override
			public void run() {
				//setChecked(!isChecked());
			}
		};
		*/
		
		doubleClickAction = new Action() {
			public void run() {
				
			}
		};
	}
	
	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				ActionSetParentModelViewActive.sharedInstance().run();
			}
			
		});
	}
	
	private void hookSelectChangedListener() {
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				/*final String modelTitle = ModelViewManager.getCurrentModelTitle();
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				
				if (selection.size() == 1 && selection.getFirstElement() instanceof ModelViewTreeObject) {
					
					ModelViewTreeObject selectedModelViewObject = (ModelViewTreeObject) selection.getFirstElement();
					
					ModelView selectedVision = ((ModelViewTreeObject) selectedModelViewObject).getModelVision();
					ModelViewManager.getModelViewList(modelTitle).setSelectedVision(selectedVision);
					ModelViewManager.updateOntoUMLPrimeView();
					ModelViewManager.updatePlantUMLView();
					
				} else if (selection.size() > 1 && selection.getFirstElement() instanceof ModelViewTreeObject){
				/*
					List<ModelViewElementTreeObject> selectedList = selection.toList();
					if(selectedList.size() > 1) {
						if (!selectedList.get(0).getParent().equals(selectedList.get(1).getParent())) { 
							selectedList.remove(0);
						} else if (!selectedList.get(selectedList.size()-2).getParent().equals(selectedList.get(selectedList.size()-1).getParent())) {
							selectedList.remove(selectedList.size()-1);
						}
					}
				
				}
			*/	
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

	public ISelection getViewerSelection() {
		return viewer.getSelection();
	}
	
}