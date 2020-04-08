package special_classes;

public class StringBuilderClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb1 = new StringBuilder("I love India");
		
		sb1.insert(7, "people of ");
		System.out.println(sb1);
		
		sb1.replace(7, 13, "culture");
		System.out.println(sb1);
		
		sb1.deleteCharAt(0);
		System.out.println(sb1);
		
		sb1.delete(2, 7);
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		

	}

}
