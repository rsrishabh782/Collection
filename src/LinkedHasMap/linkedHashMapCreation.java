package LinkedHasMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMapCreation {

	public static void main(String[] args) {
		
	
	LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
	

	map.put("Google", 1000);
	map.put("Amazon", 2000);
	map.put("Walmart", 3000);
	map.put("Flipkart", 4000);
	
	System.out.println(map);
	
	map.forEach((k,v)->System.out.println("Key =" +k+ " value = "+v));
	
	
	
}
}
