package uk.ac.CornwallCollege.AdvancedOO.pets;

public class StupidDog extends Dog{

	@Override
	public void walkTo(int x, int y) {
		super.walkTo(-x, -y);
	}

	
}
