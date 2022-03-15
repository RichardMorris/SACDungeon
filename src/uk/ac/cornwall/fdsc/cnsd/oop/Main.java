package uk.ac.cornwall.fdsc.cnsd.oop;

import java.util.Random;

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
		
		Creature c1 = new Troll(n1,h1);
			
		Creature c2 = new RandomHitCreature("Other",25,8);
		
		System.out.println(c1.name + " "+  c1.health);
		System.out.println(c2.name + " "+  c2.health);
		
		do {
			c1.attack(c2);
			c2.attack(c1);
			System.out.println(c1.name + " "+  c1.health);
			System.out.println(c2.name + " "+  c2.health);
		} while( c1.health > 0 && c2.health > 0);
	}

}
