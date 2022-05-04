package uk.ac.cornwall.fdsc.cnsd.oop.hotel;

public class Room {
	int roomNumber;
	int costPerNight;
	int totalIncome=0;
	
	Guest currentGuest;
	
	public Room(int roomNumber, int costPerNight) {
		super();
		this.roomNumber = roomNumber;
		this.costPerNight = costPerNight;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public float getCostPerNight() {
		return costPerNight;
	}

	public Guest getCurrentGuest() {
		return currentGuest;
	}

	public void setCurrentGuest(Guest currentGuest) {
		this.currentGuest = currentGuest;
	}

	public Guest checkOutAfter_n_Nights(int n) {
		int cost = n * costPerNight;
		totalIncome += cost;
		currentGuest.addToBill(cost);
		Guest g = currentGuest; // use local variable 
		currentGuest = null; // makes sure the room has no guest
		return g; // return that local variable
	}
	
	public String toString() {
		if(currentGuest == null) {
			return "Room number "+roomNumber+" cost/night "+ costPerNight +" total income "+totalIncome+" Empty";
		} else {
			return "Room number "+roomNumber+" cost/night "+ costPerNight +" total income "+totalIncome+" Guest "+currentGuest;
			
		}
	}
}
