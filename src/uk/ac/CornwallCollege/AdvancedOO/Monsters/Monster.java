package uk.ac.CornwallCollege.AdvancedOO.Monsters;

public class Monster {
	int health;
	int attack;
	String name;

	
	public Monster(String name, int health, int attack) {
		super();
		this.name = name;
		this.health = health;
		this.attack = attack;
	}
	
	public void receiveDamage(int points) {
		health -= points;
	}
	
	public void attack(Monster foe) {
		foe.receiveDamage(attack);
	}

	@Override
	public String toString() {
		return "Monster [name=" + name + ", health=" + health + ", attack=" + attack + "]";
	}
	
	
}
