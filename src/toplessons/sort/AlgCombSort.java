package toplessons.sort;

import jlm.universe.sort.SortingEntity;

/* BEGIN TEMPLATE */
public class AlgCombSort extends SortingEntity {
	public void run() {
		/* BEGIN SOLUTION */
		int gap = getValueCount();
		boolean swapped;
		do {
			if (gap>1) 
	            gap /= 1.3;
			swapped = false;
			for (int i=0; i+gap<getValueCount(); i++)
				if (!compare(i,i+gap)) {
					swap(i,i+gap);
					swapped =true;
				}	
		} while (gap>1 || swapped);
		checkme(); /* color everything in blue */
		/* END SOLUTION */
	}
}
/* END TEMPLATE */
