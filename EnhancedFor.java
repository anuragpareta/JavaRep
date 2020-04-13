package arrays;

import java.util.Scanner;

public class EnhancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num1 = sc.nextInt();
		int[] arr = new int[10];
		for (int i=1;i<=10;i++) {
			arr[i-1] = num1*i;		
		}
		
		System.out.println("-----------------------");
		
		for (int n: arr) {
		System.out.println(n);
			
		}

	}

}
