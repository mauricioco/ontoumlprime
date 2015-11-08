/*
 * generated by Xtext
 */
package br.ufes.inf.nemo.ontouml.ontoumlprime.validation

import org.eclipse.xtext.validation.EValidatorRegistrar
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.ocl.examples.xtext.completeocl.validation.CompleteOCLEObjectValidator

//import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class DslValidator extends AbstractDslValidator {

	@Override
	override public void register(EValidatorRegistrar registar){
		super.register(registar);

		val ePackage = PrimeOntoUMLPackage::eINSTANCE;
		val oclURI = URI::createPlatformPluginURI("/br.ufes.inf.nemo.ontouml.ontoumlprime/model/ontoumlprime.ocl", true);
		//val validator = new CompleteOCLEObjectValidator(ePackage, oclURI);

		//registar.register(ePackage, validator);
	}

//  public static val INVALID_NAME = 'invalidName'

//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character::isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage$Literals::GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
}
