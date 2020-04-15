package regex;

public class OR_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String patt = "x(abc|123|g|h)";
		
		String str = "x123";
		
		System.out.println(str.matches(patt));
	}

}
