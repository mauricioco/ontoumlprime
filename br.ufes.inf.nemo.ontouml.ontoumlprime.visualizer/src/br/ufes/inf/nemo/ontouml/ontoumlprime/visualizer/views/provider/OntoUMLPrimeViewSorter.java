package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

import br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.views.provider.tree.ModelViewElementTreeObject;

public class OntoUMLPrimeViewSorter extends ViewerSorter {
	private static final int ASCENDING = 0;

	private static final int DESCENDING = 1;

	private int column;
	private int direction;

	public void doSort(int column) {
		if (column == this.column) {
			direction = 1 - direction;
		} else {
			this.column = column;
			direction = ASCENDING;
		}
	}
	
	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		if(e1 instanceof ModelViewElementTreeObject && e2 instanceof ModelViewElementTreeObject) {
			ModelViewElementTreeObject p1 = (ModelViewElementTreeObject) e1;
		    ModelViewElementTreeObject p2 = (ModelViewElementTreeObject) e2;
		    return p1.getModelElementView().getDisplayName().compareTo(p2.getModelElementView().getDisplayName());
		}
		
	    return 0;
/*
	    switch (column) {
		    case Const.COLUMN_FIRST_NAME:
		    	rc = collator.compare(p1.getFirstName(), p2.getFirstName());
		    	break;
		    case Const.COLUMN_LAST_NAME:
		    	rc = collator.compare(p1.getLastName(), p2.getLastName());
		    	break;
		    case Const.COLUMN_MATH:
		    	rc = p1.getMath() > p2.getMath() ? 1 : -1;
		    	break;
		    case Const.COLUMN_CHEM:
		    	rc = p1.getChem() > p2.getChem() ? 1 : -1;
		    	break;
		    case Const.COLUMN_AVE:
		    	rc = p1.getAve() > p2.getAve() ? 1 : -1;
		    	break;
	    }
	    if (direction == DESCENDING) {
	    	rc = -rc;
	    }
	    	
	    return rc;
	    */
	  }
}
