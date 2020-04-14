package sets;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map_iterating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var map = new TreeMap<Integer, Double>();
		
		map.put(10, Math.sqrt(10));
		map.put(20, Math.sqrt(20));
		map.put(4, Math.sqrt(4));
		map.put(3, Math.sqrt(3));
		map.put(81, Math.sqrt(81));
		
		for(Entry<Integer,Double> e : map.entrySet()) {
			System.out.println(e);
		}
		
		System.out.println("**************************");
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
