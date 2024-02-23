package HashMapPractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class hashMapSync {

	public static void main(String[] args) {


		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("A", "Test1");
		map1.put("B", "Test2");
		map1.put("C", "Test3");
		
		Map<String, String> map2 = Collections.synchronizedMap(map1);
		System.out.println(map2);
		map1.put("D", "Test4");
		System.out.println(map2.get("D"));
		
		
		ConcurrentHashMap<String, String> map3 = new ConcurrentHashMap<String, String>();
		
		map3.put("E", "Test5");
		map3.put("F", "Test6");
		map3.put("G", "Test7");
		
		System.out.println(map3.get("G"));
		System.out.println(map3);
		
		
		
	}

}
