package oops_concepts;

public class RoadToll_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RoadToll rt = new RoadToll();
		
		rt.type = "Sadan";
		rt.tireCount= 4;
		rt.calculateToll();
		
		RoadToll rt2 = new RoadToll("Truck",6);
		rt2.calculateToll();
		

	}

}
