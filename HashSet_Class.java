package sets;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var set1 = new HashSet<Integer>();
		
		set1.add(10);
		set1.add(36);
		set1.add(990);
		set1.add(359);
		set1.add(25);
		set1.add(35);
//		set1.add(25);   No duplicates
		
		System.out.println("set1: "+set1);
		
		
		var set2 = new HashSet<Integer>();
		
		set2.add(25);
		set2.add(36);
		set2.add(90);
		set2.add(399);
		set2.add(359);
		set2.add(39);
		
		System.out.println("set2: "+set2);
		
//		set1.addAll(set2);       // UNION
//		System.out.println(set1);
		
//		set1.retainAll(set2);    // INTERSECTION
//		System.out.println(set1);
		
		
		var list1 = new ArrayList<Integer>();
		
		list1.addAll(set1);
		System.out.println("LIST: "+list1);

	}

}
