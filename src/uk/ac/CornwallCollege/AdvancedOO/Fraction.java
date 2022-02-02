package uk.ac.CornwallCollege.AdvancedOO;

import java.util.Objects;

public class Fraction extends Number implements Comparable<Fraction> {
	// Needed to fix a warning message about serialisation
	// an advanced topic that we don't need to worry about
	// this is side effect of extending Number
	private static final long serialVersionUID = 1L;
	int numerator;   // top
	int denominator;  // bottom
	
	/**
	 * A Standard fraction
	 * @param numerator
	 * @param denominator
	 */
	
	public Fraction(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}

	/**
	 * Represents a whole number as a fraction. 
	 * 5 is 5/1
	 * @param numer
	 */
	public Fraction(int numer) {
		this.numerator = numer;
		this.denominator = 1;
	}


	/**
	 * Assume both denominators are positive
	 * a/b = c/d multiply boths sides by b
	 * a = c * b / d multiply both sides by d
	 * a * d = c * b
	 */
	@Override
	public int compareTo(Fraction o) {
		int lhs = this.numerator * o.denominator;
		int rhs = o.numerator * this.denominator;
		
		if(lhs < rhs) return -1;
		if(lhs > rhs) return 1;
		return 0;
	}

	/**
	 * This is broken in a subtile way
	 */
	@Override
	public int hashCode() {
		return Objects.hash(denominator, numerator);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof Integer) {
			Integer i = (Integer) obj;
			Fraction other = new Fraction(i,1);
			return equals(other);
		}
		
		if (getClass() != obj.getClass())
			return false;
		
		Fraction other = (Fraction) obj;
		
		int cmp = this.compareTo(other);
		return cmp == 0; 
	}

	@Override
	public String toString() {
		return "" + numerator + "/" + denominator;
	}

	/**
	 * Rounds the result to nearest int
	 * Uses Math.round() and casts result to an int
	 * @return
	 */
	@Override
	public int intValue() {
		return (int) Math.round(doubleValue());
	}

	@Override
	public long longValue() {
		return Math.round(doubleValue());
	}

	@Override
	public float floatValue() {
		return numerator/denominator;
	}

	@Override
	public double doubleValue() {
		return ((double) numerator)/((double) denominator);
	}

	
}
