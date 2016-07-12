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
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.wizard.page.SpecializationRulesWizardPage;

public class CreateFromCustomViewPointWizard extends Wizard {

	/*
	 			BinaryFormalRelationImpl.class
				, BinaryMaterialRelationImpl.class 
				, CategoryImpl.class
				, CharacterizationImpl.class
				, CollectiveUniversalImpl.class
				, ComplexDataTypeImpl.class
				, ComponentOfRelationImpl.class
				, EnumerationImpl.class
				//, GeneralizationSetImpl.class // has it own page
				, KindImpl.class
				, MediationImpl.class
				, MembershipRelationImpl.class
				, MixinImpl.class
				, ModeUniversalImpl.class
				//, nAryFormalRelationImpl.class
				//, nAryMaterialRelationImpl.class
				//, PackageImpl.class // have this??
				, PhaseImpl.class
				, RelatorUniversalImpl.class
				, RoleImpl.class
				, RoleMixinImpl.class
				, QualityUniversalImpl.class
				, QuantityUniversalImpl.class
				, SubCollectionRelationImpl.class
				, SubKindImpl.class
				, SubCollectionRelationImpl.class
	 */
	
	// TODO if none are selected in p1, allow to go further. ViewPoint will allow all selected relations in p2.
	// TODO if none are selected in p2, skip to p4.
	// TODO if none are selected in p1 AND p2, STAHP!
	// TODO now that everything is Impl, display name is not good anymore...
	// TODO new page detected... create a generalization page - what stereotypes are allowed in generalizations of universals allowed in p1.

	SelectStereotypeWizardPage p1 = new SelectStereotypeWizardPage("Monadic Universal Rules", "Select allowed Monadic Universal stereotypes...", null, new Class[] {
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
	}, false);
	
	SelectStereotypeWizardPage p2 = new SelectStereotypeWizardPage("Relation Rules", "Select allowed Relation stereotypes the Monadic Universal may have...", null, new Class[] {
			BinaryFormalRelationImpl.class
			, BinaryMaterialRelationImpl.class 
			, CharacterizationImpl.class
			, ComponentOfRelationImpl.class
			, MediationImpl.class
			, MembershipRelationImpl.class
			//, nAryFormalRelationImpl.class
			//, nAryMaterialRelationImpl.class
			, SubCollectionRelationImpl.class
			, SubQuantityRelationImpl.class
	}, false);
	
	SelectStereotypeWizardPage p3 = new SelectStereotypeWizardPage("Related Monadic Universal Rules", "Select allowed related Monadic Universal stereotypes...\n", null, new Class[] {
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
	
	SpecializationRulesWizardPage p4 = new SpecializationRulesWizardPage("Options", "Options", null);

	
	public CreateFromCustomViewPointWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	
	
	@Override
	public void addPages() {
		addPage(p1);
		addPage(p2);
		addPage(p3);
		addPage(p4);
	}



	@Override
	public boolean canFinish() {
		return p1.isPageComplete() && p2.isPageComplete() && p3.isPageComplete() && p4.isPageComplete();
	}
	
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		IWizardPage next = super.getNextPage(page);
		
		if (p2.equals(next)) {
			//p2.setDescription(p1.getCheckedStereotypesAsString());
		}
		
		if (p3.equals(next)) {
			//p3.setDescription(p1.getCheckedStereotypesAsString() + "\n" + p2.getCheckedStereotypesAsString());
		}
		
		if (p4.equals(next)) {
			//p4.setDescription(p1.getCheckedStereotypesAsString() + "\n" + p2.getCheckedStereotypesAsString() + p3.getCheckedStereotypesAsString());
		}
		
		return next;
	}
	
	private List<Object> checkedMonadicUniversals;
	private List<Object> checkedRelations;
	private List<Object> checkedRelatedMonadicUniversals;
	private int generalizationMaxLevel;
	private String modelViewName;

	@Override
	public boolean performFinish() {
		
		checkedMonadicUniversals = Arrays.asList(p1.getCheckedStereotypes());
		checkedRelations = Arrays.asList(p2.getCheckedStereotypes());
		checkedRelatedMonadicUniversals = Arrays.asList(p3.getCheckedStereotypes());
		generalizationMaxLevel = p4.getGeneralizationMaxLevel();
		modelViewName = p4.getModelViewName();
		
		return true;
	}

	public List<Object> getCheckedMonadicUniversals() {
		return checkedMonadicUniversals;
	}

	public List<Object> getCheckedRelations() {
		return checkedRelations;
	}

	public List<Object> getCheckedRelatedMonadicUniversals() {
		return checkedRelatedMonadicUniversals;
	}

	public int getGeneralizationMaxLevel() {
		return generalizationMaxLevel;
	}

	public String getModelViewName() {
		return modelViewName;
	}

}