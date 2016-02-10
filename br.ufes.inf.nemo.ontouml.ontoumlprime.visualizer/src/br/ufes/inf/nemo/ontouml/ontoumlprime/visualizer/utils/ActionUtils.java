package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.utils;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.log.Log;
import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.view.OntoUMLPrimeView;

public class ActionUtils {
	
	public static OntoUMLPrimeView getOntoUMLPrimeView() {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		if (page == null) {
			Log.e(200, ActionUtils.class, "there's no active workbench page");
			return null;
		}
		
		IViewPart view = page.findView(OntoUMLPrimeView.ID);
		if (view == null || !(view instanceof OntoUMLPrimeView)) {
			Log.e(200, ActionUtils.class, "OntoUMLPrimeView not found");
			return null;
		}
		
		return ((OntoUMLPrimeView) view);
	}
	
	
}
