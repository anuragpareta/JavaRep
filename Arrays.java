package arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] Days = {"Mo", "Tu", "We", "Th", "Fr"};
		System.out.println(Days.length);
		System.out.println(Days[2]);
		Days[2]="Wednesday";
		System.out.println(Days[2]);
		System.out.println("***********************");
		
		for (int i = 0; i<= Days.length-1;i++) {
			System.out.println(Days[i]);
		}
		
		

	}

}
