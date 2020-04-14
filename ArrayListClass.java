package lists;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Green");
		arr.add("Red");
		arr.add("Blue");
		arr.add("Brown");
		arr.add("Black");
		
		System.out.println(arr);
		
		System.out.println(arr.get(2));
		
		arr.set(3, "Pink");
		arr.set(4, "Red");
		
//		arr.remove(1);
//		arr.remove("Pink");
		
		System.out.println(arr.isEmpty());
		System.out.println(arr.indexOf("Red"));
		System.out.println(arr.lastIndexOf("Red"));
		System.out.println(arr.contains("Brown"));
		System.out.println(arr.size());
		System.out.println(arr);
		
		System.out.println(".........................");
		
//		arr.clear();
//		
//		System.out.println(arr);
		
		for (String x: arr) {
			System.out.println(x);
		}
	}

}
