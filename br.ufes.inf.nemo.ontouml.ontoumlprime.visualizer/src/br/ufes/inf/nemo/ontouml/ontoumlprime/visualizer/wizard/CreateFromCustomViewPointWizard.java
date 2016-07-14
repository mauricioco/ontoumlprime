package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.wizard;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryFormalRelationImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryMaterialRelationImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.CategoryImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.CharacterizationImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.CollectiveUniversalImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ComplexDataTypeImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ComponentOfRelationImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.EnumerationImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.KindImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MediationImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MembershipRelationImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MixinImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ModeUniversalImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PhaseImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.QualityUniversalImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.QuantityUniversalImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RelatorUniversalImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RoleImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RoleMixinImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubCollectionRelationImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubKindImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubQuantityRelationImpl;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.wizard.page.SelectStereotypeWizardPage;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.wizard.page.RuleOptionsWizardPage;

public class CreateFromCustomViewPointWizard extends Wizard {
	
	/*
	 * p1 - must select at least one. It filters the scope.
	 * p2 - which generalizations stereotypes are allowed.
	 * p3 - final rule options.
	 */
	// TODO think about making one page for everything... (see if it'd fit in an 1366x768 window).

	SelectStereotypeWizardPage p1 = new SelectStereotypeWizardPage("Allowed Stereotypes", "Select allowed stereotypes...", null, new Class[] {
			CategoryImpl.class
			, CollectiveUniversalImpl.class
			, ComplexDataTypeImpl.class	// this and enumeration are not monadic, but better not make another page just for them...
			, EnumerationImpl.class
			, KindImpl.class
			, MixinImpl.class
			, ModeUniversalImpl.class
			, PhaseImpl.class
			, RelatorUniversalImpl.class
			, RoleImpl.class
			, RoleMixinImpl.class
			, QualityUniversalImpl.class
			, QuantityUniversalImpl.class
			, SubKindImpl.class
			, BinaryFormalRelationImpl.class
			, BinaryMaterialRelationImpl.class 
			, CharacterizationImpl.class
			, ComponentOfRelationImpl.class
			, MediationImpl.class
			, MembershipRelationImpl.class
			//, nAryFormalRelationImpl.class
			//, nAryMaterialRelationImpl.class
			, SubCollectionRelationImpl.class
			, SubQuantityRelationImpl.class
	}, false, true);
	
	SelectStereotypeWizardPage p3 = new SelectStereotypeWizardPage("Allowed Specialized Elements", "Select allowed specialized elements' stereotypes...\n", null, new Class[] {
			CategoryImpl.class
			, CollectiveUniversalImpl.class
			, ComplexDataTypeImpl.class	// this and enumeration are not monadic, but better not make another page just for them...
			, EnumerationImpl.class
			, KindImpl.class
			, MixinImpl.class
			, ModeUniversalImpl.class
			, PhaseImpl.class
			, RelatorUniversalImpl.class
			, RoleImpl.class
			, RoleMixinImpl.class
			, QualityUniversalImpl.class
			, QuantityUniversalImpl.class
			, SubKindImpl.class
	}, false, false);
	
	RuleOptionsWizardPage p4 = new RuleOptionsWizardPage("Options", "Options", null);

	/*
	SelectStereotypeWizardPage p4 = new SelectStereotypeWizardPage("Specialization Rules", "Select allowed specialized stereotypes...\n", null, new Class[] {
			CategoryImpl.class
			, CollectiveUniversalImpl.class
			, ComplexDataTypeImpl.class	// this and enumeration are not monadic, but better not make another page just for them...
			, EnumerationImpl.class
			, KindImpl.class
			, MixinImpl.class
			, ModeUniversalImpl.class
			, PhaseImpl.class
			, RelatorUniversalImpl.class
			, RoleImpl.class
			, RoleMixinImpl.class
			, QualityUniversalImpl.class
			, QuantityUniversalImpl.class
			, SubKindImpl.class
	}, true);
	*/
	
	public CreateFromCustomViewPointWizard() {
		super();
		setNeedsProgressMonitor(true);	// https://www.eclipse.org/forums/index.php/t/369944/
	}
	
	@Override
	public void addPages() {
		addPage(p1);
		addPage(p3);
		addPage(p4);
	}

	@Override
	public boolean canFinish() {
		return p1.isPageComplete() && p3.isPageComplete() && p4.isPageComplete();
	}
	
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		IWizardPage next = super.getNextPage(page);
		
		if (p3.equals(next)) {
			//p3.setDescription(p1.getCheckedStereotypesAsString() + "\n" + p2.getCheckedStereotypesAsString());
		}
		
		if (p4.equals(next)) {
			//p4.setDescription(p1.getCheckedStereotypesAsString() + "\n" + p2.getCheckedStereotypesAsString() + p3.getCheckedStereotypesAsString());
		}
		
		return next;
	}
	
	private List<Object> checkedFilteredStereotypes;
	//private List<Object> checkedRelatedStereotypes;
	private List<Object> checkedSpecializedStereotypes;
	private int generalizationMaxLevel;
	private String modelViewName;

	@Override
	public boolean performFinish() {
		
		checkedFilteredStereotypes = Arrays.asList(p1.getCheckedStereotypes());
		//checkedRelatedStereotypes = Arrays.asList(p2.getCheckedStereotypes());
		checkedSpecializedStereotypes = Arrays.asList(p3.getCheckedStereotypes());
		generalizationMaxLevel = p4.getGeneralizationMaxLevel();
		modelViewName = p4.getModelViewName();
		
		return true;
	}

	public List<Object> getCheckedFilteredStereotypes() {
		return checkedFilteredStereotypes;
	}

	//public List<Object> getCheckedRelatedStereotypes() {
	//	return checkedRelatedStereotypes;
	//}

	public List<Object> getCheckedSpecializedStereotypes() {
		return checkedSpecializedStereotypes;
	}

	public int getGeneralizationMaxLevel() {
		return generalizationMaxLevel;
	}

	public String getModelViewName() {
		return modelViewName;
	}

}