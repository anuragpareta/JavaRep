package arrays;

public class ArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object [][] arr = {
				{"Jackson", 36, 5.9, 'M'},
				{"Moly", 28,4.11,'F'},
				{"Sherlock", 30, 5.9, 'M'},
				{"Watson", 32, 4.9,'M'}
					};

		
		
		for (Object[] x:arr) {
			for (Object y:x){
			System.out.print(y+" ");
		}
		System.out.println();
		
		}

	}

}

