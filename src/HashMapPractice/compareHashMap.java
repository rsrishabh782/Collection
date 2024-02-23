package HashMapPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class compareHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 =  new HashMap<Integer, String>();

		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		HashMap<Integer, String> map2 =  new HashMap<Integer, String>();

		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");


		HashMap<Integer, String> map3 =  new HashMap<Integer, String>();


		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");
		//	map3.put(4, "D");

		System.out.println(map1.equals(map2));
		System.out.println(map1.equals(map3));


		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map1.keySet().equals(map3.keySet()));

		HashMap<Integer, String> map4 =  new HashMap<Integer, String>();


		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");
		
		
		//Extra Key in map
		HashSet<Integer> combinekey = new HashSet<Integer>(map1.keySet());
		combinekey.addAll(map4.keySet());
		combinekey.removeAll(map1.keySet());
		System.out.println(combinekey);
		
		System.out.println("=============");
		/*
		HashSet<String> combineValue = new HashSet<String>(map1.values());
		combineValue.addAll(map1.values());
		combinekey.removeAll(map4.values());
		System.out.println(combineValue);
		
		System.out.println("Comi=============");*/
		
		//Duplicate value not allowed
		System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values())));
		System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map4.values())));
		
		System.out.println("=============");

		//Duplicate  value allowed

		System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map2.values())));
		System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map4.values())));

	}

}
