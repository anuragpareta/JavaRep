package sets;

import java.util.HashMap;

public class Hash_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var map = new HashMap<Integer,String>();
		
		map.put(1,"Jan");
		map.put(2,"Feb");
		map.put(3,"Mar");
		map.put(4,"Apr");
		map.put(5,"May");
		
		System.out.println(map);
		
		System.out.println(map.get(2));
		System.out.println(map.containsKey(7));
		map.put(4, "July");
		System.out.println("New Map: "+map);
		
//		map.remove(4);
//		map.remove(5, "May");
//		System.out.println("changed map"+map);
//		
//		map.clear();
//		System.out.println("Cleared "+map);
		
		var set1 = map.keySet();
		var set2 = map.values();
		var set3 = map.entrySet();
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		
		

	}

}
