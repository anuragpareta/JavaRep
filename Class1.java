package pkg1;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * boolean a = true; boolean b = false; System.out.println(a && b);
		 * System.out.println(a || b);
		 * 
		 * int num1 = 60; //11100 int num2 = 42; //101010 System.out.println(num1 &
		 * num2); // bitwise and
		 */	
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		for (int i=1; i<=18; i++) {
			num3 = num1 + num2;
			System.out.print(num3+" ");
			num1 = num2;
			num2 = num3;
			
		}
		
		
	}

}
