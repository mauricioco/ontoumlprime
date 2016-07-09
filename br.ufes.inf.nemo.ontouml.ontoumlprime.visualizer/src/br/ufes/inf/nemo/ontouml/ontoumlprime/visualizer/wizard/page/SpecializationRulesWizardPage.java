package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.wizard.page;

import java.awt.Checkbox;
import java.util.Iterator;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.IME;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewManager;

// TODO refactor class as it it doesnt contain only specializations stuff.
public class SpecializationRulesWizardPage extends WizardPage {
	
	private int generalizationMaxLevel = 0;
	private String modelViewName = "";
	
	public SpecializationRulesWizardPage(String pageName, String title, ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
	}

	@Override
	public void createControl(Composite arg0) {
		Composite composite = new Composite(arg0, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		
		
		final Text generalizationLevelText = new Text(composite, SWT.BORDER | SWT.SINGLE);
		generalizationLevelText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		generalizationLevelText.setMessage("Maximum hierarchy depth...");
		generalizationLevelText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				try {
					final int maxLevel = Integer.parseInt(generalizationLevelText.getText());
					generalizationMaxLevel = maxLevel;
				} catch (NumberFormatException exc) {
					generalizationMaxLevel = 0;
				}
				getContainer().updateButtons();
			}
		});
		
		Button allowSpecializedCheckboxButton = new Button(composite, SWT.CHECK);
		allowSpecializedCheckboxButton.setText("Allow specialized elements in relationships");
		allowSpecializedCheckboxButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		
		final Text modelViewNameText = new Text(composite, SWT.BORDER | SWT.SINGLE);
		modelViewNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		modelViewNameText.setMessage("Enter model view name...");
		
		final Label modelViewNameErrorLabel = new Label(composite, SWT.NONE);
		modelViewNameErrorLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		modelViewNameText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				modelViewNameErrorLabel.setText("");
				Iterator<ModelView> i = ModelViewManager.getModelViewList(ModelViewManager.getCurrentModelTitle()).getModelViewListIterator();
				modelViewName = modelViewNameText.getText();
				while(i.hasNext()) {
					ModelView v = i.next();
					if(v.getName().equals(modelViewNameText.getText())) {
						modelViewNameErrorLabel.setText("Model view " + modelViewNameText.getText() + " already exists.");
						modelViewName = "";
						break;
					}
				}
				getContainer().updateButtons();
			}
		});
		
		
		setControl(composite);

	}

	public int getGeneralizationMaxLevel() {
		return generalizationMaxLevel;
	}

	public String getModelViewName() {
		return modelViewName;
	}

	@Override
	public boolean isPageComplete() {
		return generalizationMaxLevel > 0
				&& modelViewName.length() > 0;
	}
	
}