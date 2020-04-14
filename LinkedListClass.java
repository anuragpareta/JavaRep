package lists;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var list = new LinkedList<Double>();
		
		list.add(1.1);
		list.add(2.1);
		list.add(3.2);
		list.add(4.2);
		list.add(5.3); 	
		list.add(2.1);
		
		System.out.println(list.indexOf(3.2));
		System.out.println(list.lastIndexOf(2.1));
		System.out.println(list.contains(5.4));
		System.out.println(list);
		System.out.println(list.subList(2,5));
		
		System.out.println("+++++++++++++++++++++++++++++++");
		list.add(4, 9.9);
//		System.out.println(list.set(3, 8.9));
//		list.clear();
//		list.remove(5.3);
		System.out.println(list);
		
		
		System.out.println("----------------------------");
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		System.out.println(list);
		
		System.out.println("*****************************");
		System.out.println(list.pollFirst());
		System.out.println(list.pollLast());
		System.out.println(list);
		
		

	}

}
