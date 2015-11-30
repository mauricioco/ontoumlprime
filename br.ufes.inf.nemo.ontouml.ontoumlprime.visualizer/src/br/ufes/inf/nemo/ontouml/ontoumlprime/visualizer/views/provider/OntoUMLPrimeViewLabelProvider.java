package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.model.OntoUMLPrimeModelElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.TreeModelElement;

public class OntoUMLPrimeViewLabelProvider extends LabelProvider {
	public String getText(NamedElement obj) {
		return obj.getName();
	}
	
	@Override
	public String getText(Object element) {
		if(element instanceof TreeModelElement) {
			OntoUMLPrimeModelElement tme = ((TreeModelElement) element).getModelElement();
			if(tme == null) {
				return "Model";
			}else{
				return tme.getId();
			}
		}
		return "Unknown";
	}
	
	public Image getImage(Object obj) {
		String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
		if (obj instanceof TreeModelElement && !((TreeModelElement) obj).hasParent()) {
		   imageKey = ISharedImages.IMG_OBJ_FOLDER;
		}
		return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
	}
}
