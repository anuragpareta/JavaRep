package oops_concepts;

public class RoadToll {
	
	String type;
	int tireCount;
	
	public void calculateToll() {
		if (tireCount ==2) {
			System.out.println("Toll is 0");
		} else if(tireCount == 4) {
			System.out.println("Toll is 10");
		} else if(tireCount > 4) {
			System.out.println("Toll is 20");
		} else {
			System.out.println("Incorrect tire count");
		}
	}
	
	public RoadToll() {
		System.out.println("Constructor is executed");
	}
	
	public RoadToll(String type, int tireCount) {
		this.type = type;
		this.tireCount = tireCount;
	}
	

}
