package arrays;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] arr = 	{{"ab","cd","ef"},{"gh","ij"},{"kl"}};
		
//		System.out.println(arr.length);
//		System.out.println(arr[2].length);
		
		for(String [] x : arr) {
			for (String y: x) {
				System.out.println(y);
			}
			
			System.out.println(".............................");
		}

	}

}
