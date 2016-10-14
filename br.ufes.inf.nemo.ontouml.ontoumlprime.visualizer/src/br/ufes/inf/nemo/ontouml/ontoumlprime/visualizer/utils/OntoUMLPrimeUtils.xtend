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
	public final static String STEREOTYPE_MODEL = "Model";
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
	
	def static dispatch String generateId(BinaryFormalRelation it) // This really has no name in oled?
	'''BinaryFormaRelation_«name»'''
	
	def static dispatch String generateId(BinaryMaterialRelation it)
	'''BinaryMaterialRelation_«name»'''
	
	def static dispatch String generateId(Category it)
	'''Category_«name»'''
	
	def static dispatch String generateId(Characterization it)
	'''Characterization_«source.name»_«target.name»'''
	
	def static dispatch String generateId(CollectiveUniversal it)
	'''CollectiveUniversal_«name»'''
	
	def static dispatch String generateId(ComplexDataType it)
	'''ComplexDataType_«name»'''
	
	def static dispatch String generateId(ComponentOfRelation it)
	'''ComponentOfRelation_«part.name»_«whole.name»'''
	
	def static dispatch String generateId(Enumeration it)
	'''Enumeration_«name»'''
	
	def static dispatch String generateId(GeneralizationSet it) {
		'''GeneralizationSet_«specializedUniversal.name»_«FOR sp : specializingUniversals»«sp.name»«ENDFOR» '''
	}
	
	//'''GeneralizationSet_«if (name != null && name.length > 0)  name else "anonymous"»_'''
	
	def static dispatch String generateId(Kind it)
	'''Kind_«name»'''
	
	def static dispatch String generateId(Mediation it)
	'''Mediation_«source.name»_«target.name»'''
	
	def static dispatch String generateId(MembershipRelation it)
	'''MembershipRelation_«part.name»_«whole.name»'''
	//has part and whole
	
	def static dispatch String generateId(Mixin it)
	'''Mixin_«name»'''
	
	def static dispatch String generateId(Model it)
	'''Model_(unique)'''
	
	def static dispatch String generateId(ModeUniversal it)
	'''ModeUniversal_«name»'''
	
	def static dispatch String generateId(nAryFormalRelation it) // This one has no target...
	'''nAryFormalRelation_(unique)'''
	
	def static dispatch String generateId(nAryMaterialRelation it)
	'''nAryMaterialRelation_(unique)'''
	
	def static dispatch String generateId(Package it)
	'''Package_«name»'''
	
	def static dispatch String generateId(Phase it)
	'''Phase_«name»'''
	
	def static dispatch String generateId(PrimitiveDataType it) // not implemented...
	'''PrimitiveDataType_«name»'''
	
	def static dispatch String generateId(RelatorUniversal it)
	'''RelatorUniversal_«name»'''
	
	def static dispatch String generateId(Role it)
	'''Role_«name»'''
	
	def static dispatch String generateId(RoleMixin it)
	'''RoleMixin_«name»'''
	
	def static dispatch String generateId(QualityUniversal it)
	'''QualityUniversal_«name»'''
	
	def static dispatch String generateId(QuantityUniversal it)
	'''QuantityUniversal_«name»'''
	
	def static dispatch String generateId(SubCollectionRelation it)
	'''SubCollectionRelation_«part.name»_«whole.name»'''
	
	def static dispatch String generateId(SubKind it)
	'''SubKind_«name»'''
	
	def static dispatch String generateId(SubQuantityRelation it)
	'''SubQuantityRelation_«part.name»_«whole.name»'''
	
	// ---------------------------------------------------
	
	def static dispatch String getStereotype(BinaryFormalRelation it) // This really has no name in oled?
	'''BinaryFormaRelation'''
	
	def static dispatch String getStereotype(BinaryMaterialRelation it)
	'''BinaryMaterialRelation'''
	
	def static dispatch String getStereotype(Category it)
	'''Category'''
	
	def static dispatch String getStereotype(Characterization it)
	'''Characterization'''
	
	def static dispatch String getStereotype(CollectiveUniversal it)
	'''CollectiveUniversal'''
	
	def static dispatch String getStereotype(ComplexDataType it)
	'''ComplexDataType'''
	
	def static dispatch String getStereotype(ComponentOfRelation it)
	'''ComponentOfRelation'''
	
	def static dispatch String getStereotype(Enumeration it)
	'''Enumeration'''
	
	def static dispatch String getStereotype(GeneralizationSet it)
	'''GeneralizationSet'''
	
	def static dispatch String getStereotype(Kind it)
	'''Kind'''
	
	def static dispatch String getStereotype(Mediation it)
	'''Mediation'''
	
	def static dispatch String getStereotype(MembershipRelation it)
	'''MembershipRelation'''
	
	def static dispatch String getStereotype(Mixin it)
	'''Mixin'''
	
	def static dispatch String getStereotype(Model it)
	'''Model'''
	
	def static dispatch String getStereotype(ModeUniversal it)
	'''ModeUniversal'''
	
	def static dispatch String getStereotype(nAryFormalRelation it) // This one has no target...
	'''nAryFormalRelation'''
	
	def static dispatch String getStereotype(nAryMaterialRelation it)
	'''nAryMaterialRelation'''
	
	def static dispatch String getStereotype(Package it)
	'''Package'''
	
	def static dispatch String getStereotype(Phase it)
	'''Phase'''
	
	def static dispatch String getStereotype(PrimitiveDataType it) // not implemented...
	'''PrimitiveDataType'''
	
	def static dispatch String getStereotype(RelatorUniversal it)
	'''RelatorUniversal'''
	
	def static dispatch String getStereotype(Role it)
	'''Role'''
	
	def static dispatch String getStereotype(RoleMixin it)
	'''RoleMixin'''
	
	def static dispatch String getStereotype(QualityUniversal it)
	'''QualityUniversal'''
	
	def static dispatch String getStereotype(QuantityUniversal it)
	'''QuantityUniversal'''
	
	def static dispatch String getStereotype(SubCollectionRelation it)
	'''SubCollectionRelation'''
	
	def static dispatch String getStereotype(SubKind it)
	'''SubKind'''
	
	def static dispatch String getStereotype(SubQuantityRelation it)
	'''SubQuantityRelation'''
}