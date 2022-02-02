package uk.ac.CornwallCollege.AdvancedOO.Monsters;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static java.lang.System.out;

class MonsterTest {

	@Test
	void testBaseMonster() {
		Monster m1 = new Monster("foo", 20, 5);
		out.println( m1 ); // implictly uses the toString methods
		assertEquals("Monster [name=foo, health=20, attack=5]",m1.toString());
		Monster m2 = new Monster("bar", 10, 3);
		out.println( m2 ); // implictly uses the toString methods
		
		m1.attack(m2);
		out.println( m2 ); // implictly uses the toString methods
		
	}
	
	@Test
	void testTroll() {

		Monster m1 = new Monster("foo", 20, 15);
		out.println( m1 ); // implictly uses the toString methods

		Troll t1 = new Troll(20,5,5);
		out.println( t1 );

		m1.attack(t1);
		out.println( t1 );
		
		m1.attack(t1);
		out.println( t1 );
		
	}

	@Test
	void testVampire() {

		Monster m1 = new Monster("foo", 20, 15);
		out.println( m1 ); // implictly uses the toString methods

		Vampire v1 = new Vampire(20,5);
		out.println( v1 );

		v1.attack(m1);
		out.println( m1 );
		out.println( v1 );
		
	}

}
