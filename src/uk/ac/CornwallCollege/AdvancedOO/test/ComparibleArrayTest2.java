package uk.ac.CornwallCollege.AdvancedOO.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import uk.ac.CornwallCollege.AdvancedOO.ComparibleArray;

class ComparibleArrayTest2 {

	@Test
	public void testSimple() {
		List<Integer> l1 = Arrays.asList(1,2,3,4);
		ComparibleArray ca1 = new ComparibleArray(l1);
		List<Integer> l2 = Arrays.asList(2,2,3,4);
		ComparibleArray ca2 = new ComparibleArray(l2);		
		
		assertEquals( -1, ca1.compareTo(ca2));
		assertEquals( 1, ca2.compareTo(ca1));
		
	}

	@Test
	public void testSort() {
		List<Integer> l1 = Arrays.asList(1,2,3,4);
		ComparibleArray ca1 = new ComparibleArray(l1);
		List<Integer> l2 = Arrays.asList(2,2,3,4);
		ComparibleArray ca2 = new ComparibleArray(l2);		
		List<Integer> l3 = Arrays.asList(1,2,1,4);
		ComparibleArray ca3 = new ComparibleArray(l3);
		
		List<ComparibleArray> unsorted = new ArrayList<>();
		unsorted.add(ca1);
		unsorted.add(ca2);
		unsorted.add(ca3);
		System.out.println(unsorted);
		Collections.sort(unsorted);
		System.out.println(unsorted);
		
		
	}
}
