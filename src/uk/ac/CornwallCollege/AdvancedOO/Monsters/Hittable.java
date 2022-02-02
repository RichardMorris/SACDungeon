package uk.ac.CornwallCollege.AdvancedOO.Monsters;

public interface Hittable {

	/**
	 * When the monster is hit by another monster
	 * @param points how much damage was done in the attack
	 */
	void receiveDamage(int points);

}