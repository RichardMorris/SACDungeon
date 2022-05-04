package uk.ac.cornwall.fdsc.cnsd.oop;

/**
 * Things that can be hit.
 */
public interface Hitable {
	/**
	 * The method used to hit something
	 * @param damage how strong the attack was
	 */
	void receiveDamage(int damage);
}
