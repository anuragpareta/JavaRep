package newJava10;

import java.util.Scanner;

public class VarKeyword {
	
	String str6;
	//we can't create class var variable
	//var str7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 100;
		var num2 = 200;
		var str2 = "Anuvisjit";
		var num3 = 12.998;
		
		Scanner s1 = new Scanner(System.in);
		var s2 = new Scanner(System.in);
		int x = add(200,300);
		var y = add(250,320);
		int [] arr = new int[10];
		var arr2 = new int[10];
		int [] arr3 = {10,20,30,40};
		//var arr4 = {10,20,3,4};


	}
	private static int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
