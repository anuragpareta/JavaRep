package pkg1;

public class StringSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "I love my India and my people";
		String str2= "INDIA";
		System.out.println(str1.toLowerCase().contains(str2.toLowerCase()));
		System.out.println(str1.startsWith("I"));
		System.out.println(str1.endsWith("Ind"));
		System.out.println(str1.indexOf("my"));
		System.out.println(str1.lastIndexOf("my"));
				
	}

}
