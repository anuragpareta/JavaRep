package regex;

public class RegexExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String patt ="www.(dezlearn|dez).(com|us)";
		String patt2 ="www\\.(dezlearn|dez)\\.(com|us)";
		
		
		String str = "www.dez.us";
		String str2 = "www1dez2us";
		
		System.out.println(str.matches(patt));
		System.out.println(str2.matches(patt));
		
		System.out.println("--------------------");
		System.out.println(str.matches(patt2));
		System.out.println(str2.matches(patt2));
		

	}

}
