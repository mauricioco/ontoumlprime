package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.pattern;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;

public class RuleGeneralization extends Rule {
	public enum Direction {
		DOWN, UP, BOTH, FLOOD
	}
	
	private Direction direction;
	private int depth;
	
	public RuleGeneralization(Direction direction, int depth) {
		super();
		this.direction = direction;
		this.depth = depth;
	}
	
	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	@Override
	public boolean processElement(List<EObject> modelViewElements, EObject elementToProcess) {
		return processElementInternal(0, modelViewElements, elementToProcess);
	}
	
	private boolean processElementInternal(int currentLevel, List<EObject> modelViewElements, EObject elementToProcess) {
		for(EObject rel : elementToProcess.eCrossReferences()) {
			if (rel instanceof GeneralizationSet) {
				
				List<EObject> refList = rel.eCrossReferences();
				
				switch(direction) {
				
				case UP:
					if (!modelViewElements.contains(rel) && !modelViewElements.contains(refList.get(0))) {
						/* 
						 * If the first element from the references is contained in modelViewElements, then
						 * it means we already reached through another reference. This is to avoid adding a
						 * reference that contains elements not added to model view. This also happens in
						 * DOWN case, but it's the elements beside the first one that are checked.
						 */
						modelViewElements.add((PackageableElement) rel);
					}
					EObject endUp = refList.get(0);
					if (!modelViewElements.contains(endUp)) {
						modelViewElements.add((PackageableElement) endUp);
						if (currentLevel+1 < depth) {
							processElementInternal(currentLevel+1, modelViewElements, (EObject) endUp);
						}
					}
					break;
					
				case DOWN:
					if (!modelViewElements.contains(rel)) {
						int i=1;
						for (; i<refList.size(); i++) {
							if (modelViewElements.contains(refList.get(i))) {
								break;
							}
						}
						if(i==refList.size()) {
							modelViewElements.add((PackageableElement) rel);
						}
					}
					for(int i=1; i<refList.size(); i++) {
						EObject endDown = refList.get(i);
						if (!modelViewElements.contains(endDown)) {
							modelViewElements.add((PackageableElement) endDown);
							if (currentLevel+1 < depth) {
								processElementInternal(currentLevel+1, modelViewElements, (EObject) endDown);
							}
						}
					}
					break;
					
				case BOTH:
					modelViewElements.addAll(processElementInternalForBoth(0, modelViewElements, elementToProcess));
					break;

				case FLOOD:
					for (EObject end : refList) {
						if (!modelViewElements.contains(end)) {
							modelViewElements.add((PackageableElement) end);
							if (currentLevel+1 < depth) {
								processElementInternal(currentLevel+1, modelViewElements, (EObject) end);
							}
						}
					}
					break;
					
				}
			}
		}
		return true;
	}
	
	private List<EObject> processElementInternalForBoth(int currentLevel, List<EObject> modelViewElements, EObject elementToProcess) {
		
		List<EObject> modelViewElementsUp = new ArrayList<>(modelViewElements);
		direction = Direction.UP;
		processElementInternal(0, modelViewElementsUp, elementToProcess);
		
		List<EObject> modelViewElementsDown = new ArrayList<>(modelViewElements);
		direction = Direction.DOWN;
		processElementInternal(0, modelViewElementsDown, elementToProcess);
		
		direction = Direction.BOTH;
		
		List<EObject> modelViewElementsBoth = new ArrayList<>();
		modelViewElementsBoth.addAll(modelViewElementsDown);
		modelViewElementsBoth.addAll(modelViewElementsUp);
		
		return modelViewElementsBoth;
	}
	
}
