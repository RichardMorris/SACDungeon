package uk.ac.cornwall.fdsc.cnsd.oop;

import java.util.Random;

public class RandomHitCreature extends Creature {
	int maxDamage;
	private Random rng;  // want to hide internal from the rest of the world#
	
	/** Chained constructor */
	public RandomHitCreature(String n, int h, int max) {
		super(n, h);
		maxDamage = max;
		
		rng = new Random();
	}

	@Override
	public void attack(Creature enemy) {
		enemy.receiveDamage(rng.nextInt(maxDamage)+1);
	}

	
}
