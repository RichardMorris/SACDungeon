package uk.ac.cornwall.fdsc.cnsd.oop;

import java.util.Random;

import uk.ac.cornwall.fdsc.cnsd.oop.wierd.Wierd;

public class Main {

	public static void modifyCreature(Creature g2, int h2) {
		g2.name = "balrog";
		h2 = 10;
		
	}
	
	
	public static void main(String[] args) {
		String n1;
		int h1;
		n1 = "Grendle";
		h1 = 20;
		
		System.out.println(n1);
		System.out.println(h1);
		System.out.println(Math.PI);
		System.out.printf("%6.3f",Math.PI);
		String message = "Pi is "+Math.PI;

		
		
		Creature w = new Wierd("foo",10);
		System.out.println(w.toString());
		
		Creature c1 = new Troll(n1,h1);
			
		Creature c2 = new RandomHitCreature("Other",25,8);
		
		System.out.println(c1);
		System.out.println(c2);
		
		do {
			c1.attack(c2);
			c2.attack(c1);
			System.out.println(c1);
			System.out.println(c2);
		} while( c1.health > 0 && c2.health > 0);
	}

}
