package special_classes;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random  r1 = new Random();
		
		for(int i=1; i<=100;i++) {
			//System.out.println(r1.nextInt(12)+100);
			System.out.println((int)(Math.random()*20000)+5000);
		}
		

	}

}
