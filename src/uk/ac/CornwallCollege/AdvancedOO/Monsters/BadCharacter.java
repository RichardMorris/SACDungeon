package uk.ac.CornwallCollege.AdvancedOO.Monsters;

public class BadCharacter extends Character {

	public BadCharacter(String name, int health, int attack) {
		super(name, health, attack);
	}

	@Override
	public final void receiveDamage(int points) {
		health -= 2* points;
	}

	@Override
	public void attack(Hittable foe) {
		// TODO Auto-generated method stub
		
	}

}
