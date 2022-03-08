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
		
		Creature g1 = new God(n1,h1);
			
		System.out.println(g1.name + " "+  h1);

		modifyCreature(g1, h1);
		
		System.out.println(g1.name + " "+  h1);
		
		Random r1 = new Random();
		while( g1.health > 0) {
			int rnd = r1.nextInt(10);
			System.out.println("Hit for "+rnd);
			g1.receiveDamage(rnd);
			System.out.println(g1.name + " "+  g1.health);
		}
		
	}

}
