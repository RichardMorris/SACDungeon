package uk.ac.cornwall.fdsc.cnsd.oop;


/**
 * Troll is a subclass of Creature
 * 
 * Creature is a superclass of Troll
 *
 */
public class Troll extends RandomHitCreature {

	public Troll(String n, int h) {
		super(n, h, 5);
	}

	/**
	 * This method is overridden 
	 */
	@Override
	public void receiveDamage(int damage) {
		health = health - damage + 2;		
	}

	
}
