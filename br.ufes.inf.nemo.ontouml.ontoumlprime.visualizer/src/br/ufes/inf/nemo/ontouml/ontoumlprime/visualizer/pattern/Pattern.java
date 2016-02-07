package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.pattern;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.log.Log;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.pattern.RuleTaxonomy.Direction;

public class Pattern {
	
	private String name;
	private List<Rule> ruleList;
	
	public static final Pattern LOWER_GENERALIZATION;
	static {
		LOWER_GENERALIZATION = new Pattern("GENSET");
		LOWER_GENERALIZATION.addRule(new RuleTaxonomy(RelatorUniversal.class, Direction.FLOOD, 9));
	}
	
	public Pattern(String name) {
		this.name = name;
		this.ruleList = new ArrayList<>();
	}
	
	public Pattern(String name, List<Rule> ruleList) {
		this.name = name;
		this.ruleList = ruleList;
	}
	
	public ModelView createModelView(String name, Model model, List<EObject> selectedElements) {
		
		List<EObject> modelViewElements = new ArrayList<>();
		modelViewElements.addAll(selectedElements);
		
		for (Rule rule : ruleList) {
			
			if (rule instanceof RuleTaxonomy) {
				for (EObject elementToProcess : selectedElements) {
					rule.processElement(modelViewElements, elementToProcess);
				}
			}
			
		}
		
		ModelView mv = new ModelView(name);
		mv.addElements(modelViewElements);
		return mv;
	}

	public String getName() {
		return name;
	}

	public List<Rule> getRuleList() {
		return ruleList;
	}
	
	public void addRule(Rule newRule) {
		ruleList.add(newRule);
	}
}