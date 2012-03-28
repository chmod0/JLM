package toplessons.sort;

import jlm.universe.sort.SortingEntity;

/* BEGIN TEMPLATE */
public class AlgSelectionSort extends SortingEntity {
	public void run() {
		/* BEGIN SOLUTION */
		for (int i = 0; i < getValueCount(); i++) {
			int min = i;	
			int j;

			/*  Find the smallest element in the unsorted list */
			for (j = i + 1; j < getValueCount(); j++) {
				if (compare(j,min))
					min = j;				
			}

			/* Swap the smallest unsorted element into the end of the sorted list. */
			swap(min,i);
			sorted(i);
		}
		checkme(); /* color everything in blue */
		/* END SOLUTION */
	}
}
/* END TEMPLATE */
