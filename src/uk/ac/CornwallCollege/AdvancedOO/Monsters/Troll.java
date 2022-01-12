package uk.ac.CornwallCollege.AdvancedOO.Monsters;

public class Troll extends Monster {
	int regenAmount=1;
	
	public Troll(int health,int attack) {
		super("Troll",health,attack);
	}

	public Troll(int health,int attack,int ra) {
		super("Troll",health,attack);
		this.regenAmount = ra;
	}

	@Override
	public void receiveDamage(int points) {
		super.receiveDamage(points);
		if(health>0)
			health += regenAmount;
	}
	
	
}
