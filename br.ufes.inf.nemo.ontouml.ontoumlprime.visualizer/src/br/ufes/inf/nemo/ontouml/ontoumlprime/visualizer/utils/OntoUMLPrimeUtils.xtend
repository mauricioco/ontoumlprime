package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Enumeration
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.QualityUniversal
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubCollectionRelation
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubQuantityRelation
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComponentOfRelation
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Kind
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ModeUniversal
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.QuantityUniversal
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.CollectiveUniversal
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubKind
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Category
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mixin
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.RoleMixin
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Role
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Phase
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataType
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComplexDataType
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryFormalRelation
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.MembershipRelation

class OntoUMLPrimeUtils {
	
	static OntoUMLPrimeUtils sharedInstance;
	
	def static OntoUMLPrimeUtils sharedInstance() {
		if(sharedInstance == null) {
			sharedInstance = new OntoUMLPrimeUtils();
		}
		return sharedInstance;
	}
	
	public final static String STEREOTYPE_BINARY_FORMAL_RELATION = "BinaryFormaRelation";
	public final static String STEREOTYPE_BINARY_MATERIAL_RELATION = "BinaryMaterialRelation";
	public final static String STEREOTYPE_CATEGORY = "Category";
	public final static String STEREOTYPE_CHARACTERIZATION = "Characterization";
	public final static String STEREOTYPE_COLLECTIVE_UNIVERSAL = "CollectiveUniversal";
	public final static String STEREOTYPE_COMPLEX_DATA_TYPE = "ComplexDataType";
	public final static String STEREOTYPE_COMPONENT_OF_RELATION = "ComponentOfRelation";
	public final static String STEREOTYPE_ENUMERATION = "Enumeration";
	public final static String STEREOTYPE_GENERALIZATION_SET = "GeneralizationSet";
	public final static String STEREOTYPE_KIND = "Kind";
	public final static String STEREOTYPE_MEDIATION = "Mediation";
	public final static String STEREOTYPE_MEMBERSHIP_RELATION = "MembershipRelation";
	public final static String STEREOTYPE_MIXIN = "Mixin";
	public final static String STEREOTYPE_MODE_UNIVERSAL = "ModeUniversal";
	public final static String STEREOTYPE_N_ARY_FORMAL_RELATION = "nAryFormalRelation";
	public final static String STEREOTYPE_N_ARY_MATERIAL_RELATION = "nAryMaterialRelation";
	public final static String STEREOTYPE_PACKAGE = "Package";
	public final static String STEREOTYPE_PHASE = "Phase";
	public final static String STEREOTYPE_PRIMITIVE_DATA_TYPE = "PrimitiveDataType";
	public final static String STEREOTYPE_RELATOR_UNIVERSAL = "RelatorUniversal";
	public final static String STEREOTYPE_ROLE = "Role";
	public final static String STEREOTYPE_ROLE_MIXIN = "RoleMixin";
	public final static String STEREOTYPE_QUALITY_UNIVERSAL = "QualityUniversal";
	public final static String STEREOTYPE_QUANTITY_UNIVERSAL = "QuantityUniversal";
	public final static String STEREOTYPE_SUB_COLLECTION_RELATION = "SubCollectionRelation";
	public final static String STEREOTYPE_SUB_KIND = "SubKind";
	public final static String STEREOTYPE_SUB_QUANTITY_RELATION = "SubQuantityRelation";
	
	// ----------------------------------------------------------
	
	def dispatch String generateId(BinaryFormalRelation it) // This really has no name in oled?
	'''BinaryFormaRelation_«name»'''
	
	def dispatch String generateId(BinaryMaterialRelation it)
	'''BinaryMaterialRelation_«name»'''
	
	def dispatch String generateId(Category it)
	'''Category_«name»'''
	
	def dispatch String generateId(Characterization it)
	'''Characterization_(unique)'''
	
	def dispatch String generateId(CollectiveUniversal it)
	'''CollectiveUniversal_«name»'''
	
	def dispatch String generateId(ComplexDataType it)
	'''ComplexDataType_«name»'''
	
	def dispatch String generateId(ComponentOfRelation it)
	'''ComponentOfRelation_«part.name»_«whole.name»'''
	
	def dispatch String generateId(Enumeration it)
	'''Enumeration_«name»'''
	
	def dispatch String generateId(GeneralizationSet it)
	'''GeneralizationSet_(unique)'''
	//'''GeneralizationSet_«if (name != null && name.length > 0)  name else "anonymous"»_'''
	
	def dispatch String generateId(Kind it)
	'''Kind_«name»'''
	
	def dispatch String generateId(Mediation it)
	'''Mediation_(unique)'''
	
	def dispatch String generateId(MembershipRelation it)
	'''MembershipRelation_(unique)'''
	//has part and whole
	
	def dispatch String generateId(Mixin it)
	'''Mixin_«name»'''
	
	def dispatch String generateId(ModeUniversal it)
	'''ModeUniversal_«name»'''
	
	def dispatch String generateId(nAryFormalRelation it) // This one has no target...
	'''nAryFormalRelation_(unique)'''
	
	def dispatch String generateId(nAryMaterialRelation it)
	'''nAryMaterialRelation_(unique)'''
	
	def dispatch String generateId(Package it)
	'''Package_«name»'''
	
	def dispatch String generateId(Phase it)
	'''Phase_«name»'''
	
	def dispatch String generateId(PrimitiveDataType it) // not implemented...
	'''PrimitiveDataType_«name»'''
	
	def dispatch String generateId(RelatorUniversal it)
	'''RelatorUniversal_«name»'''
	
	def dispatch String generateId(Role it)
	'''Role_«name»'''
	
	def dispatch String generateId(RoleMixin it)
	'''RoleMixin_«name»'''
	
	def dispatch String generateId(QualityUniversal it)
	'''QualityUniversal_«name»'''
	
	def dispatch String generateId(QuantityUniversal it)
	'''QuantityUniversal_«name»'''
	
	def dispatch String generateId(SubCollectionRelation it)
	'''SubCollectionRelation_(unique)'''
	
	def dispatch String generateId(SubKind it)
	'''SubKind_«name»'''
	
	def dispatch String generateId(SubQuantityRelation it)
	'''SubQuantityRelation_(unique)'''
	
	// ---------------------------------------------------
	
	def dispatch String getStereotype(BinaryFormalRelation it) // This really has no name in oled?
	'''BinaryFormaRelation'''
	
	def dispatch String getStereotype(BinaryMaterialRelation it)
	'''BinaryMaterialRelation'''
	
	def dispatch String getStereotype(Category it)
	'''Category'''
	
	def dispatch String getStereotype(Characterization it)
	'''Characterization'''
	
	def dispatch String getStereotype(CollectiveUniversal it)
	'''CollectiveUniversal'''
	
	def dispatch String getStereotype(ComplexDataType it)
	'''ComplexDataType'''
	
	def dispatch String getStereotype(ComponentOfRelation it)
	'''ComponentOfRelation'''
	
	def dispatch String getStereotype(Enumeration it)
	'''Enumeration'''
	
	def dispatch String getStereotype(GeneralizationSet it)
	'''GeneralizationSet'''
	
	def dispatch String getStereotype(Kind it)
	'''Kind'''
	
	def dispatch String getStereotype(Mediation it)
	'''Mediation'''
	
	def dispatch String getStereotype(MembershipRelation it)
	'''MembershipRelation'''
	
	def dispatch String getStereotype(Mixin it)
	'''Mixin'''
	
	def dispatch String getStereotype(ModeUniversal it)
	'''ModeUniversal'''
	
	def dispatch String getStereotype(nAryFormalRelation it) // This one has no target...
	'''nAryFormalRelation'''
	
	def dispatch String getStereotype(nAryMaterialRelation it)
	'''nAryMaterialRelation'''
	
	def dispatch String getStereotype(Package it)
	'''Package'''
	
	def dispatch String getStereotype(Phase it)
	'''Phase'''
	
	def dispatch String getStereotype(PrimitiveDataType it) // not implemented...
	'''PrimitiveDataType'''
	
	def dispatch String getStereotype(RelatorUniversal it)
	'''RelatorUniversal'''
	
	def dispatch String getStereotype(Role it)
	'''Role'''
	
	def dispatch String getStereotype(RoleMixin it)
	'''RoleMixin'''
	
	def dispatch String getStereotype(QualityUniversal it)
	'''QualityUniversal'''
	
	def dispatch String getStereotype(QuantityUniversal it)
	'''QuantityUniversal'''
	
	def dispatch String getStereotype(SubCollectionRelation it)
	'''SubCollectionRelation'''
	
	def dispatch String getStereotype(SubKind it)
	'''SubKind'''
	
	def dispatch String getStereotype(SubQuantityRelation it)
	'''SubQuantityRelation'''
}