package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.ElementVisionTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.ModelVisionTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.ModelElementView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.vision.ModelView;

public class OntoUMLPrimeViewLabelProvider extends LabelProvider {
	public String getText(NamedElement obj) {
		return obj.getName();
	}
	
	@Override
	public String getText(Object element) {
		if(element instanceof ElementVisionTreeObject) {
			ModelElementView ev = ((ElementVisionTreeObject) element).getElementVision();
			return ev.getDisplayName();
		} else if (element instanceof ModelVisionTreeObject) {
			ModelView mv = ((ModelVisionTreeObject) element).getModelVision();
			return mv.getVisionName();
		}
		return "Unknown";
	}
	
	public Image getImage(Object obj) {
		String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
		if (obj instanceof ModelVisionTreeObject) {
		   imageKey = ISharedImages.IMG_OBJ_FOLDER;
		}
		return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
	}
}
