package lists;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_iteratorProg2 {

	public static void main(String[] args) {
		// Update all Odd numbers from a LinkedList to Even numbers
		
		var list = new ArrayList<Integer>();
		
		list.add(18);
		list.add(209);
		list.add(59);
		list.add(888);
		list.add(81);
		list.add(7);
		
		System.out.println(list);
		
		ListIterator itr =list.listIterator();
		
		while(itr.hasNext()) {
			int i = (int) itr.next();
			if(i%2 ==1) {
				i++;
				itr.set(i);
				
			}
		}
		
		System.out.println(list);

	}

}
