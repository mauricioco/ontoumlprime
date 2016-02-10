package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.pattern;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.pattern.RuleGeneralization.Direction;

public class Pattern {
	
	private String name;
	private List<Rule> ruleList;
	
	public static final Pattern GENERALIZATION_DOWN;
	static {
		GENERALIZATION_DOWN = new Pattern("Generalization Set Down");
		GENERALIZATION_DOWN.addRule(new RuleGeneralization(Direction.DOWN, 9));
	}
	
	public static final Pattern GENERALIZATION_UP;
	static {
		GENERALIZATION_UP = new Pattern("Generalization Set Up");
		GENERALIZATION_UP.addRule(new RuleGeneralization(Direction.UP, 9));
	}
	
	public static final Pattern GENERALIZATION_BOTH;
	static {
		GENERALIZATION_BOTH = new Pattern("Generalization Set Both");
		GENERALIZATION_BOTH.addRule(new RuleGeneralization(Direction.BOTH, 9));
	}
	
	public static final Pattern GENERALIZATION_FLOOD;
	static {
		GENERALIZATION_FLOOD = new Pattern("Generalization Set Down");
		GENERALIZATION_FLOOD.addRule(new RuleGeneralization(Direction.FLOOD, 9));
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
			
			for (EObject elementToProcess : selectedElements) {
				rule.processElement(modelViewElements, elementToProcess);
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