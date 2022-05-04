package uk.ac.CornwallCollege.AdvancedOO.pets;

public abstract class AbstractPet implements Pet {

	/** Sub-classes can read these variables. */
	protected int posX, posY;
	
	@Override
	public void walkTo(int x, int y) {
		posX = x;
		posY = y;
	}
	
	

}
