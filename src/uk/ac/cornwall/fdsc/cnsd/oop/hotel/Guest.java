package uk.ac.cornwall.fdsc.cnsd.oop.hotel;

public class Guest {
	String surname;
	String firstname;
	int bill;
	
	public Guest(String firstname, String surname) {
		this.firstname = firstname;
		this.surname = surname;
		bill = 0;
	}

	public double getBill() {
		return bill;
	}
	
	public String getName() {
		return firstname + " " + surname;
	}

	public void addToBill(int cost) {
		bill += cost;
	}

	@Override
	public String toString() {
		return getName() + " bill: " + bill;
	}
	
	
}
