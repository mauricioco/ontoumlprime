package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelElementView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.ModelViewElementTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.ModelViewTreeObject;

public class OntoUMLPrimeViewLabelProvider extends LabelProvider {
	public String getText(NamedElement obj) {
		return obj.getName();
	}
	
	@Override
	public String getText(Object element) {
		if(element instanceof ModelViewElementTreeObject) {
			ModelElementView ev = ((ModelViewElementTreeObject) element).getElementVision();
			return ev.getDisplayName();
		} else if (element instanceof ModelViewTreeObject) {
			ModelView mv = ((ModelViewTreeObject) element).getModelVision();
			return mv.getVisionName();
		}
		return "Unknown";
	}
	
	public Image getImage(Object obj) {
		String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
		if (obj instanceof ModelViewTreeObject) {
		   imageKey = ISharedImages.IMG_OBJ_FOLDER;
		}
		return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
	}
}
