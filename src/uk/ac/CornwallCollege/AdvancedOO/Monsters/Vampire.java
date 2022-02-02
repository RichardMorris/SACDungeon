package uk.ac.CornwallCollege.AdvancedOO.Monsters;

public class Vampire extends Monster {

	public Vampire(int health, int attack) {
		super("Vampire", health, attack);
	}

	@Override
	public void attack(Hittable foe) {
		super.attack(foe);
		health += attack/2;
	}

	
}
