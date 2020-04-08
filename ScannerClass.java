package special_classes;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		
		String st=s1.nextLine();
		
		String temp = "";
		
		for (int i =0; i<st.length();i++) {
			temp = st.charAt(i) + temp ;
						
		}
		System.out.println("Reverse String is: ");
		System.out.println(temp);
		

	}

}
