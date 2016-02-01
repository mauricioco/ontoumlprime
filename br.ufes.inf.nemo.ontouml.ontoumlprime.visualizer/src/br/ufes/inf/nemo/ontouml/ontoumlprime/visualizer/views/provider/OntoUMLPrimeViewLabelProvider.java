package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.ModelElementTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.ModelViewTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelElementView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;

public class OntoUMLPrimeViewLabelProvider extends LabelProvider {
	public String getText(NamedElement obj) {
		return obj.getName();
	}
	
	@Override
	public String getText(Object element) {
		if(element instanceof ModelElementTreeObject) {
			ModelElementView ev = ((ModelElementTreeObject) element).getModelElementView();
			return ev.getDisplayName();
		} else if (element instanceof ModelViewTreeObject) {
			ModelView mv = ((ModelViewTreeObject) element).getModelView();
			return mv.getModelViewName();
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
