package uk.ac.CornwallCollege.AdvancedOO;

import java.util.List;

public class ComparibleArray implements Comparable<ComparibleArray> {

	List<Integer> data;
	
	
	public ComparibleArray(List<Integer> data) {
		super();
		this.data = data;
	}


	/**
	 * If the first number in the list is smaller that the first number in the other list then 
	 * we conside this list to be smaller.
	 * 
	 * If the first entries are the same, then compare the next two entries.
	 * 
	 * So (1,2,3,4)  < (2,3,1,4)
	 * and (1,2,3,4)  > (1,1,3,4)
	 * 
	 * Assume both are same length
	 * 
	 * @param o
	 * @return
	 */
	@Override
	public int compareTo(ComparibleArray o) {
		int len = data.size();
		for(int i=0;i<len;++i) {
			Integer A = data.get(i);
			Integer B = o.data.get(i);
			
			if(A < B) return -1;
			if(A > B) return 1;		
		}
		return 0;
	}


	@Override
	public String toString() {
		return "ComparibleArray [data=" + data + "]";
	}

	
}
