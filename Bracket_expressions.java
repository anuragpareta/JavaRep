package regex;

public class Bracket_expressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String patt = "[ngvpl&*^%]ot";
		
		String patt2 ="[^A-X0-9]THI";   // except A to X and 0 to 9.
		String patt3 ="[A-X0-9]{2}API";    // first 2 position should contain A to X and 0 to 9
 		
		String str = "%ot";
		String str2 = "#THI";
		String str3 = "Y1API";
		
		
		System.out.println(str.matches(patt));
		System.out.println(str2.matches(patt2));
		System.out.println(str3.matches(patt3));

	}

}
