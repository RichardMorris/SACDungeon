package uk.ac.cornwall.fdsc.cnsd.oop.wierd;

import uk.ac.cornwall.fdsc.cnsd.oop.Creature;

public class Wierd extends Creature {


	public Wierd(String n, int h) {
		super(n, h);
	}

	@Override
	public String toString() {
		String sup =  super.toString();
		String twice = sup + sup;
		return twice;
	}

	@Override
	public void receiveDamage(int damage) {
		health = health - (int)( 0.5 * damage);
	}


	
}
