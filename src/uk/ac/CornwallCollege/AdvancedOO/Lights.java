package uk.ac.CornwallCollege.AdvancedOO;

public class Lights {
	int id;
	Colours state = Colours.RED;
	public Lights() {
	}
	public void movement() {
		switch (state) {
		case RED:
			state = Colours.RAA;
			break;
		case RAA:
			state = Colours.GREEN;
			break;			
		case GREEN:
			state = Colours.AMBER;
			break;
		case AMBER:
			state = Colours.RED;
			break;			
		}
	}
	
	
	public Colours getState() {
		return state;
	}
	
	public String toString() {
		switch (state) {
		case RED:
			return "Red";
		case RAA:
			return "Red and Amber";
		case AMBER:
			return "Amber";
		case GREEN:
			return "Green";
		default:
			return "Oh no. Our switch case. Its broken";
		}		
	}
}
