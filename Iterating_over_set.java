package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Iterating_over_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var set1 = new HashSet<Integer>();
		
		set1.add(10);
		set1.add(20);
		set1.add(90);
		set1.add(60);
		set1.add(55);
		set1.add(15);
		
		for(int x : set1) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		
		var set2 = new TreeSet<String>();
		
		set2.add("Mon");
		set2.add("Tue");
		set2.add("Wed");
		set2.add("Fri");
		set2.add("Sun");
		
		Iterator it1 = set2.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}

	}

}
