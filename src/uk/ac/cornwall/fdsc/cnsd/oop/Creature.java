package uk.ac.cornwall.fdsc.cnsd.oop;

/**
 * Objectives for next week,
 * 1) Get hold of this code and get it running on your own system
 * 1a) Do this using git!
 * 1b) Copy and paste code from https://github.com/RichardMorris/SACDungeon
 * 2) Create a subclass
 * 2a) Push this to the master using git push
 * 2b) Let me have the the code in any other way, say by email

 */
public class Creature implements Hitable {
	protected int health;
	String name;
	
	public Creature(String n, int h) {
		name = n;
		health = h;		
	}

	public void attack(Creature enemy) {
		enemy.receiveDamage(5);		
	}
	
	public void receiveDamage(int damage) {
		health = health - damage;		
	}
	
	public String toString() {
		return name + ": " + health;
	}
}
