package regex;

public class Quantifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String patt	= "abc*";
		String patt2 = "abc+";
		String patt3	= "abc?";
		String patt4 = "abc(xyz)";
		String patt5	= "ab(xyz){2,3}";
		String patt6 = "ab(xyz){3,}";
		
		String str1 = "abccc";
		
		String str2 ="abc";
		
		String str3 ="abcxyz";
		
		String str4 = "abxyzxyzxyz";
		
		String str5 = "abxyzxyzxyzxyzxyzxyz";
		
		
		System.out.println("patt: " +str1.matches(patt));
		System.out.println("patt2: "+str1.matches(patt2));
		System.out.println("patt3: "+str2.matches(patt3));
		System.out.println("patt4: "+str3.matches(patt4));
		System.out.println("patt5: "+str4.matches(patt5));
		System.out.println("patt6: "+str5.matches(patt6));
		
		

	}

}
