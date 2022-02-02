package uk.ac.CornwallCollege.AdvancedOO.Monsters;

/**
 * A base class for a monster, allows subclasses to override methods
 * @author Richard.Morris
 * @version 0.1
 */
public class Character implements Hittable {
	int health;
	int attack;
	String name;

	/**
	 * Create a monster
	 * @param name	its name
	 * @param health the health point
	 * @param attack how much dammage it causes
	 */
	public Character(String name, int health, int attack) {
		super();
		this.name = name;
		this.health = health;
		this.attack = attack;
	}
	
	/**
	 * When an entity is hit by another monster
	 * @param points how much damage was done in the attack
	 */
	@Override
	public void receiveDamage(int points) {
		health -= points;
	}
	
	/**
	 * Attempt to attack another monster.
	 * The default calls the {@link #receiveDamage(int)} method.
	 * @param foe the monster being attacked
	 * 
	 */
	public void attack(Hittable foe) {
		foe.receiveDamage(attack);
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", health=" + health + ", attack=" + attack + "]";
	}
	
	
}
