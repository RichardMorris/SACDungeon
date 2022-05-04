package uk.ac.CornwallCollege.AdvancedOO.pets;

public class MyList {
	int maxSize;
	int curSize;
	Object data[];
	
	public MyList(int initialsize) {
		maxSize = initialsize;
		data = new Object[maxSize];
		curSize = 0;
	}
	
	/** Adds at end */
	public void add(Object element) {
		set(element,curSize);
		curSize++;
	}

	/** set item at a particulr posn */
	private void set(Object element, int posn) {
		checkSize(posn);
		data[posn] = element;
		
	}

	private void checkSize(int posn) {
		if(posn >= maxSize) {
			Object tmp[] = new Object[maxSize*2]; // make a new block of memory
			for(int i=0;i<maxSize;++i) {
				tmp[i] = data[i]; // copies data from the old array to new array
			}
			data = tmp; // data now points to the new block of memory
			maxSize = maxSize*2;
			checkSize(posn);
		}
		
	}
}
