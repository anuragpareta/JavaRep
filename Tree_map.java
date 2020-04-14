package sets;

import java.util.TreeMap;

public class Tree_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var map = new TreeMap<Character, Integer>();
		
		map.put('c', 1003);
		map.put('b', 10);
		map.put('e', 03);
		map.put('a', 13);
		map.put('f', 103);
		
		System.out.println(map);
		
		System.out.println("first Entry: "+map.firstEntry());
		System.out.println("first Key: "+map.firstKey());
		System.out.println("last Entry: "+map.lastEntry());
		System.out.println("last Key: "+map.lastKey());
		
		System.out.println(map.containsValue(100));
		map.put('e',397);    //map.replace('e',397);
		
		System.out.println("changed Map"+ map);
		
		System.out.println("**********poll removes values also********************");
		System.out.println(map.pollFirstEntry());
		System.out.println(map);
		System.out.println(map.pollLastEntry());
		System.out.println(map);
		

	}

}
