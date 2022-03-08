package uk.ac.cornwall.fdsc.cnsd.oop;

public class Troll extends Creature {

	public Troll(String n, int h) {
		super(n, h);
	}

	@Override
	public void receiveDamage(int damage) {
		health = health - damage + 2;		
	}

	
}
