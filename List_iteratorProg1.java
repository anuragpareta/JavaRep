package lists;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_iteratorProg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(125);
		list.add(null);
		list.add(598);
		list.add(89);
		list.add(null);
		list.add(null);
		list.add(897);
		
		System.out.println(list);
		
		ListIterator itr =list.listIterator();
		
		while(itr.hasNext()) {
			if (itr.next() == null) {
//				itr.remove();
				itr.set(0);
				
			}
		}
		
		System.out.println(list);
		
	}

}
