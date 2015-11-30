package br.ufes.inf.nemo.ontouml.ontoumlprime.ui.outline;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.xtext.ui.PluginImageHelper;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.actions.AbstractFilterOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;

import com.google.inject.Inject;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;

public class FilterOperationsContribution extends AbstractFilterOutlineContribution {

	public static final String PREFERENCE_KEY = "ui.outline.filterOperations";
	
	@Inject
	private PluginImageHelper imageHelper;
	
	@Override
	protected boolean apply(IOutlineNode node) {
		return !(node instanceof EObjectNode)
		    || !((EObjectNode) node).getEClass()
		      .equals(PrimeOntoUMLPackage.Literals.KIND);
	}
	
	@Override
	public String getPreferenceKey() {
		return PREFERENCE_KEY;
	}
	
	@Override
	protected void configureAction(Action action) {
		action.setText("Hide operations");
		action.setDescription("Hide operations");
		action.setToolTipText("Hide operations");
		action.setMenuCreator(new IMenuCreator() {
			
			private Menu menu;
			
			@Override
			public Menu getMenu(Menu parent) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Menu getMenu(Control parent) {
				if (menu != null) {
					menu.dispose();
				}
				menu = new Menu(parent);
				int i= 0;
				Action filterAction = new Action("Filter") {
					public void run() {
						
					}
				};
				Action gen = new Action("gen",IAction.AS_DROP_DOWN_MENU){
					public void run() {
						
					}
				};
				addActionToMenu(menu, filterAction);
				new MenuItem(menu, SWT.SEPARATOR);
				addActionToMenu(menu, gen);

				return menu;
			}
			
			protected void addActionToMenu(Menu parent, Action action) {
				ActionContributionItem item = new ActionContributionItem(action);
				item.fill(parent, -1);
			}
			
			@Override
			public void dispose() {
				if (menu != null) {
					menu.dispose();
					menu = null;
				}
			}
			
			void clear() {
				dispose();
			}
		});
		//action.setImageDescriptor(getImageDescriptor());
	}
	
	
	
	//protected ImageDescriptor getImageDescriptor(String imagePath) {
		//return ImageDescriptor.createFromImage(imageHelper.getImage("Operation.gif"));
	//}
	
	
	

}