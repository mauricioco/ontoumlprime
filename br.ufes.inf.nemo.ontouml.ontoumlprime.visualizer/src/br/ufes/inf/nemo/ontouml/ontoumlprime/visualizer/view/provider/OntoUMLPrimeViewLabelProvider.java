package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelViewElement;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.modelview.ModelView;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.ModelViewElementTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.ModelViewTreeObject;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.provider.tree.StringTreeObject;

public class OntoUMLPrimeViewLabelProvider extends LabelProvider {
	public String getText(NamedElement obj) {
		return obj.getName();
	}
	
	@Override
	public String getText(Object element) {
		if (element instanceof ModelViewElementTreeObject) {
			ModelViewElement ev = ((ModelViewElementTreeObject) element).getModelElementView();
			return ev.getDisplayName();
		} else if (element instanceof ModelViewTreeObject) {
			ModelView mv = ((ModelViewTreeObject) element).getModelView();
			return mv.getName();
		} else if (element instanceof StringTreeObject) {
			return ((StringTreeObject) element).getStringData();
		}
		return "Unknown";
	}
	
	public Image getImage(Object obj) {
		String imageKey = ISharedImages.IMG_LCL_LINKTO_HELP;	// unknown
		if (obj instanceof ModelViewElementTreeObject) {
			imageKey = ISharedImages.IMG_OBJ_ELEMENT;
		} else if (obj instanceof ModelViewTreeObject) {
			imageKey = ISharedImages.IMG_OBJ_FOLDER;
		} else if (obj instanceof StringTreeObject) {
			imageKey = "";
		}
		
		return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
		
	}
}