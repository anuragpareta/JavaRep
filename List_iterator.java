package lists;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var list = new ArrayList<Double>();
		
		list.add(1.2);
		list.add(3.6);
		list.add(5.4);
		list.add(9.6);
		list.add(2.5);
		
		ListIterator itr = list.listIterator(2);
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("----------------------");
		
		
		ListIterator itr1 = list.listIterator(list.size());
		
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}

	}

}
