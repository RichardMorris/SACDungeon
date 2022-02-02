package uk.ac.CornwallCollege.AdvancedOO.Monsters;

public class TreasureChest implements Hittable {

	@Override
	public void receiveDamage(int points) {
		if(points> 5)
			System.out.println("You got treasure");

	}

}
