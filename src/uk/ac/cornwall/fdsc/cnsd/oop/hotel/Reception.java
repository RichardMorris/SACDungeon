package uk.ac.cornwall.fdsc.cnsd.oop.hotel;

import java.util.Scanner;

public class Reception {

	Room allRooms[];

	public Reception() {
		super();
		allRooms = new Room[5];
		
		allRooms[0] = new Room(1,100);
		allRooms[1] = new Room(2,150);
		allRooms[2] = new Room(3,75);
		allRooms[3] = new Room(4,100);
		allRooms[4] = new Room(5,500);
	}

	public void runDesk() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter option: 1 to check in, 2 to check out, 3 to list rooms, 4 to exit");
			int choice = scan.nextInt();
			switch (choice ) {
			case 1:
				checkInGuest(scan);
				break;
			case 2:
				checkOutGuest(scan);
				break;
			case 3:
				listRooms();
				break;
			}
			
			
		}
		
	}

	private void listRooms() {
		for(Room r:allRooms) {
			System.out.println(r);
		}
	}
	private void checkOutGuest(Scanner scan) {
		System.out.println("What room were you staying in?");
		int rn = scan.nextInt();
		System.out.println("How many nights did you stay?");
		int nights = scan.nextInt();
		
		Room r = allRooms[rn-1];
		Guest g = r.checkOutAfter_n_Nights(nights);
		System.out.println("Leaving "+ g);
		
	}

	private void checkInGuest(Scanner scan) {
		System.out.println("What is your first name?");
		String fn = scan.next();
		System.out.println("What is your surame?");
		String sn = scan.next();
		System.out.println("Which room do you want?");
		int rn = scan.nextInt();
		
		Guest g = new Guest(fn,sn);
		Room r = allRooms[rn-1];

		r.setCurrentGuest(g); // Sets that the guest is staying in room r.
	}
	
	
	
	
	public static void main(String[] args) {
		Reception recp = new Reception();
		recp.runDesk();
	}

}
