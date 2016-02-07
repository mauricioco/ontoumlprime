package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.pattern;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;

abstract public class Rule {
		
	public Rule() {
		super();
	}

	abstract public boolean processElement(List<EObject> modelViewElements, EObject elementToProcess);
	
}
