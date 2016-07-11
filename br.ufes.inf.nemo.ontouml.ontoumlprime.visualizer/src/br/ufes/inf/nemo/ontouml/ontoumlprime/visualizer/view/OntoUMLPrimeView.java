package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view;

import java.util.Iterator;

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
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewManager;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action.ActionAddSelectedToModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action.ActionCreateModelViewFromSelected;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action.ActionCreateModelViewWithCustomViewPoint;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action.ActionDeleteModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action.ActionLoadModelViewList;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action.ActionRemoveElementFromModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action.ActionRenameModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action.ActionSaveModelViewList;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.action.ActionSetModelViewActive;
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
	
	private void fillContextMenu(IMenuManager manager) {
		
		IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
		
		if (selection.size() == 1) {
			TreeObject selectedObject = (TreeObject) selection.getFirstElement();
			if (selectedObject instanceof ModelViewTreeObject) {
				ModelView selectedModelView = ((ModelViewTreeObject) selectedObject).getModelView();
				if (((ModelViewTreeObject) selectedObject).getModelView().isDefault()) {
					fillContextMenuForDefaultModelView(manager);
				} else {
					fillContextMenuForOneModelView(manager, selectedModelView);
				}
			} else {
				fillContextMenuForOneOrMoreModelViewElements(manager);
			}
		} else {
			boolean fillMenu = true;
			for (Object o : selection.toList()) {
				if (o instanceof ModelViewTreeObject) {
					fillMenu = false;
					break;
				}
			}
			if (fillMenu) {
				fillContextMenuForOneOrMoreModelViewElements(manager);
			}
		}
		
		drillDownAdapter.addNavigationActions(manager);
		
		// Other plug-ins can contribute there actions here... and this is not working well, so... DISABLED!
		//manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillContextMenuForDefaultModelView(IMenuManager manager) {
		manager.add(ActionSetModelViewActive.sharedInstance());
		// TODO add create custom model view. Scope are all elements.
		
		manager.add(new Separator());
	}
	
	private void fillContextMenuForOneModelView(IMenuManager manager, ModelView modelView) {
		manager.add(ActionSetModelViewActive.sharedInstance());
		// TODO add create custom model view. Scope are all elements.
		
		manager.add(ActionRenameModelView.newInstance(modelView));
		manager.add(ActionDeleteModelView.sharedInstance());
		manager.add(new Separator());
	}
	
	private void fillContextMenuForOneOrMoreModelViewElements(IMenuManager manager) {
		manager.add(ActionCreateModelViewFromSelected.sharedInstance());
		manager.add(ActionCreateModelViewWithCustomViewPoint.sharedInstance());
		manager.add(new Separator());
		// -----------------------------------------
		MenuManager menuManager = new MenuManager();
		menuManager.setMenuText("Add to...");
		
		Iterator<ModelView> i = ModelViewManager.getModelViewList(ModelViewManager.getCurrentModelTitle()).getModelViewListIterator();
		while(i.hasNext()) {
			menuManager.add(ActionAddSelectedToModelView.newInstance(i.next()));
		}
		menuManager.add(new Separator());
		
		// Special case for this action.
		Action createNewModelViewFromSelected = new ActionCreateModelViewFromSelected();
		createNewModelViewFromSelected.setText("New model view...");
		menuManager.add(createNewModelViewFromSelected);
		// -----------------------------------------
		manager.add(menuManager);
		manager.add(ActionRemoveElementFromModelView.sharedInstance());
		
		manager.add(new Separator());		
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(new Separator());
	}	
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(ActionLoadModelViewList.sharedInstance());
		manager.add(new Separator());
		manager.add(ActionSaveModelViewList.sharedInstance());
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
	}
	
	
	private void makeActions() {

	}
	
	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				ITreeSelection selection = (ITreeSelection) event.getSelection();
				if (selection.size() == 1) {
					if (viewer.getExpandedState(selection.getPaths()[0])) {
						viewer.collapseToLevel(selection.getPaths()[0], 1);
					} else {
						viewer.expandToLevel(selection.getPaths()[0], 1);
					}
				}
			}
		});
	}
	
	private void hookSelectChangedListener() {
		/* Selection handler ignored because of permormance issues.
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			private TreeObject firstElement = null;
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				StructuredSelection viewerSelection = (StructuredSelection) viewer.getSelection();
				StructuredSelection eventSelection = (StructuredSelection) event.getSelection();
				
				if (eventSelection.size() == 0) {
					// Unselected everything. Do nothing.
					firstElement = null;
					return;
				}
				if (eventSelection.size() == 1) {
					// Brand new selection. Do nothing.
					return;
				}
				
				if (firstElement == null) {
					firstElement = (TreeObject) eventSelection.getFirstElement();
				}
				TreeObject newSelected = (TreeObject) eventSelection.toList().get(eventSelection.toList().size()-1);
				
				Log.e(100, this.getClass(), "Size: " + eventSelection.toList().size());
				
				if (firstElement instanceof ModelViewTreeObject) {
					// Only one model view can be selected at a time (as of now).
					List<?> selectionList = new ArrayList<>(eventSelection.toList());
					selectionList.remove(newSelected);
					StructuredSelection selectionUpdated = new StructuredSelection(selectionList);
					viewer.setSelection(selectionUpdated);
				} else if (firstElement instanceof ModelViewElementTreeObject) {
					if (!(newSelected instanceof ModelViewElementTreeObject)) {
						// In a selection of model view elements, a model view is not allowed.
						List<?> selectionList = new ArrayList<>(eventSelection.toList());
						selectionList.remove(newSelected);
						StructuredSelection selectionUpdated = new StructuredSelection(selectionList);
						viewer.setSelection(selectionUpdated);
					}
				}
			}
		});
		*/
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