package uk.ac.CornwallCollege.AdvancedOO.pets;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import org.junit.jupiter.api.Test;

class PetTest {

	@Test
	void test() {
		Pet daftDog = new StupidDog();
		daftDog.walkTo(5, 3);
		String s = daftDog.speak();
		assertEquals("Bow wow",s);
	}

	@Test
	void testList() {
		List<Pet> pets = new ArrayList<>();
		pets.add(new Cat());
		pets.add(new Dog());
		pets.add(new StupidDog());
		
		Deque<Pet> stack = new ArrayDeque<>();
		Deque<Pet> queue = new ArrayDeque<>();
		stack.push(new Cat());
		Pet res = stack.pop();
		
		queue.offer(new Dog());
		res = queue.poll();
		
		
		
	}
	
	@Test
	public void testMyList() {
		MyList list = new MyList(5);
		
		list.add(new Cat());
		list.add(new Cat());
		list.add(new Cat());
		list.add(new Cat());
		list.add(new Cat());
		list.add(new Cat());

		
	}
}
