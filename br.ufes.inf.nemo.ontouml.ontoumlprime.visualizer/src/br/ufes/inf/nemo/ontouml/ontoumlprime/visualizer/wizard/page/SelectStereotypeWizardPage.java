package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.wizard.page;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Element;

public class SelectStereotypeWizardPage extends WizardPage {
	
	private CheckboxTableViewer listViewer;
	private final Class<? extends Element> selectableStereotypes[];
	private final boolean startChecked;
	
	public SelectStereotypeWizardPage(String pageName, String title, ImageDescriptor titleImage, Class<? extends Element> selectableStereotypes[], boolean startChecked) {
		super(pageName, title, titleImage);
		this.selectableStereotypes = selectableStereotypes;
		this.startChecked = startChecked;
	}
	
	@Override
	public void createControl(Composite arg0) {
		// REMEMBER: never use the parent composite. Create an empty one from the parent.
		// (Stupid arg0...)
		// http://www.eclipse.org/articles/article.php?file=Article-JFaceWizards/index.html
		
		Composite composite = new Composite(arg0, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		
		listViewer = CheckboxTableViewer.newCheckList(composite, SWT.BORDER);
		listViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));		
		listViewer.setLabelProvider(new LabelProvider());
		listViewer.setContentProvider(ArrayContentProvider.getInstance());
		listViewer.setInput(selectableStereotypes);
		listViewer.addCheckStateListener(new ICheckStateListener() {
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				getContainer().updateButtons();
			}
		});
		
		listViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				Object selected = ((IStructuredSelection)event.getSelection()).getFirstElement();
				listViewer.setChecked(selected, !listViewer.getChecked(selected));
				getContainer().updateButtons();
			}
		});
		
		listViewer.setAllChecked(startChecked);
		
		setControl(composite);

	}
	
	@Override
	public boolean isPageComplete() {
		return listViewer.getCheckedElements().length > 0;
	}
	
	public Object[] getCheckedStereotypes() {
		return listViewer.getCheckedElements();
	}

	public String getCheckedStereotypesAsString() {
		Object[] checked = (Object[]) listViewer.getCheckedElements();

		String result = "";
		for (Object s : checked) {
			result += ((Class) s).getSimpleName() + ", ";
		}
		
		return result.isEmpty() ? result : result.substring(0, result.length()-2);
	}

}
