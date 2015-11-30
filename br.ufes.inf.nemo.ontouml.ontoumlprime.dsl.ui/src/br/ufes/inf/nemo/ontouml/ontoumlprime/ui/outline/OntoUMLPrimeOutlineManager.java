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

public class OntoUMLPrimeOutlineManager {
	
	
	
	public static AbstractFilterOutlineContribution getFilterOperations() {
		return new AbstractFilterOutlineContribution() {
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
				action.setText("H");
				action.setDescription("Hide operations");
				action.setToolTipText("Hide operations");
				//action.setImageDescriptor(getImageDescriptor());
			}
		};
	}
	
}
