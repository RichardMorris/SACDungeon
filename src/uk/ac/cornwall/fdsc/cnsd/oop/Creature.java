package uk.ac.cornwall.fdsc.cnsd.oop;

public class Creature {
	int health;
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
}
