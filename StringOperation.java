package pkg1;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String s1= "God is great"; String s2="     Rajnikant is a robot      ";
		 * 
		 * System.out.println(s1); System.out.println(s2);
		 * 
		 * System.out.println(s1+s2);
		 * 
		 * String s3=s1.concat(s2); System.out.println(s3);
		 * 
		 * String s4=s2.trim(); System.out.println(s4);
		 * System.out.println(s1.toLowerCase()); System.err.println(s2.toUpperCase());
		 * System.out.println(s2.isEmpty());
		 */
		
		String st1= "Hrithik Roshan";
		String st3= "HRITHIKROSHAN";
		String st2= "hriThik rOshAn";
		System.out.println(st1.compareTo(st2));
		System.out.println(st1.compareToIgnoreCase(st2));
		System.out.println(st1.equals(st2));
		System.out.println(st1.equalsIgnoreCase(st2));
		
		String patt = "[A-Z]{1,}";
		System.out.println("******************");
		System.out.println(st3.matches(patt));
		System.out.println(st1.matches(patt));
		
	}

}
