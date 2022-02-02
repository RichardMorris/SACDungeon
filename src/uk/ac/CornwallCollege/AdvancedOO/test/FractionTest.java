package uk.ac.CornwallCollege.AdvancedOO.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import uk.ac.CornwallCollege.AdvancedOO.Fraction;

class FractionTest {

	@Test
	void testConstruction() {
		{
		Fraction f1 = new Fraction(1,8);
		String r1 = f1.toString();
		System.out.println(r1);
		assertEquals("1/8",r1);
		}
		
		{
		Fraction f2 = new Fraction(5);
		String r2 = f2.toString();
		System.out.println(r2);
		assertEquals("5/1",r2);
		}
	}

	@Test
	void testNumbers() {
		{
			Fraction f1 = new Fraction(1,8);
			double d1 = f1.doubleValue();
			assertEquals(0.125,d1);
			int n1 = f1.intValue();
			assertEquals(0,n1);
		}
		{
			// 1/2 = 0.5, 1/4 = 0.25 1/8 = 0.125 7/8=0.875
			Fraction f1 = new Fraction(7,8);
			double d1 = f1.doubleValue();
			assertEquals(0.875,d1);
			int n1 = f1.intValue();
			assertEquals(1,n1);
		}

	}
	
	@Test 
	void testCompare() {
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(2,3);
		Fraction f3 = new  Fraction(2,4);
		
		assertEquals(-1,f1.compareTo(f2));
		assertEquals(1,f2.compareTo(f1));
		
		assertEquals(0,f1.compareTo(f3));
			
	}

	@Test 
	void testEquals() {
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(2,3);
		Fraction f3 = new  Fraction(2,4);
		Fraction f4 = new Fraction(5);
		Fraction f5 = new Fraction(10,2);

		assertFalse(f1.equals(f2));
		assertFalse(f2.equals(f1));
		
		assertTrue(f1.equals(f3));
		
		assertTrue(f4.equals(5));
		assertTrue(f5.equals(5));

	}
	
	@Test 
	void testHash() {
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(2,3);
		Fraction f3 = new  Fraction(2,4);
		Fraction f4 = new Fraction(5);
		Fraction f5 = new Fraction(10,2);

		int h1 = f1.hashCode();
		int h2 = f2.hashCode();
		int h3 = f3.hashCode();
		int h4 = f4.hashCode();
		int h5 = f5.hashCode();

		System.out.printf("%x %x %x %x %x%n", h1,h2,h3,h4,h5);
		
		// Things which are equals should have equal hashcodes
	
		assertEquals(h4,h5,"Ideally these two fractions representing the same number should have equal hashcodes");
	}
	
	

}
