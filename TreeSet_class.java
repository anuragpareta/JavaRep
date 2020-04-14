package sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set1 = new TreeSet<String>();
		
		set1.add("Bishal");
		set1.add("Guned");
		set1.add("Nowtham");
		set1.add("Rnurag");
		
		System.out.println(set1);
		
		
		Set<Integer> set2 = new TreeSet<Integer>();
		
		set2.add(258);
		set2.add(23);
		set2.add(1000);
		set2.add(873);
		
		System.out.println(set2);

	}

}
