package uk.ac.CornwallCollege.AdvancedOO.Monsters;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static java.lang.System.out;

class MonsterTest {

	@Test
	void testBaseMonster() {
		Monster m1 = new Monster("foo", 20, 5);
		out.println( m1 ); // implictly uses the toString methods
		
		Monster m2 = new Monster("bar", 10, 3);
		out.println( m2 ); // implictly uses the toString methods
		
		m1.attack(m2);
		out.println( m2 ); // implictly uses the toString methods
		
	}

}
