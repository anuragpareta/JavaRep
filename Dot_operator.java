package regex;

public class Dot_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String patt1 = "ABC.";
		String str1 = "ABC9";
		
		String patt2 = "ABC.*";
		String str2 = "ABCCCCC$%#^$";
		
		System.out.println(str1.matches(patt1));
		System.out.println(str2.matches(patt2));

	}

}
