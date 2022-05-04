package uk.ac.cornwall.fdsc.cnsd.oop.wierd;

import uk.ac.cornwall.fdsc.cnsd.oop.Hitable;

public class TreasureChest implements Hitable {

	@Override
	public void receiveDamage(int damage) {
		System.out.println("You have money");
	}

}
