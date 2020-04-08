package special_classes;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "I ";
		str1 = str1 + "Love ";
		str1 = str1 + "my India.";
		
		System.out.println(str1);
		
		StringBuilder sb1 = new StringBuilder("My ");
		sb1.append("love ");
		sb1.append(" is Python");
		
		System.out.println(sb1);

	}

}
