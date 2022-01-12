package uk.ac.CornwallCollege.AdvancedOO.Monsters;

public class Troll extends Monster {

	public Troll(int health,int attack) {
		super("Troll",health,attack);
	}

	@Override
	public void receiveDamage(int points) {
		super.receiveDamage(points);
		if(health>0)
			health += 1;
	}
	
	
}
