package HashMapPractice;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class hashMapBasics {

	public static void main(String[] args) {

		HashMap<String, String> capitalMarket =  new HashMap<String, String>();
		
		capitalMarket.put("India", "Delhi");
		capitalMarket.put("US", "Washington DC");
		capitalMarket.put("UK", "London");
		capitalMarket.put(null, "London");
		capitalMarket.put("Saudi", null);
		capitalMarket.remove("Saudi");
		


		
		System.out.println(capitalMarket.get("India"));
		
		System.out.println(capitalMarket.get("US"));
		
		System.out.println(capitalMarket.get("Saudi"));

		System.out.println(capitalMarket.get(null));
		
	//	System.out.println(capitalMarket);
		
		System.out.println("========");
		
		Iterator<String> it = capitalMarket.keySet().iterator();
		
		while(it.hasNext())
		{
			String keys = it.next();
			//System.out.println(keys);
			
			String value = capitalMarket.get(keys);
			
			System.out.println("key is "+ keys + " Value is " + value);
		}

		System.out.println("========");
		
		Iterator<java.util.Map.Entry<String, String>> it1 = capitalMarket.entrySet().iterator();
		
		while(it1.hasNext())
		{
			java.util.Map.Entry<String, String> entry = it1.next();
			
			System.out.println("key is "+ entry.getKey()+ " value is "+ entry.getValue());
		}
		
		System.out.println("========");
		
		capitalMarket.forEach((K,V)-> System.out.println("key is " +K+ " value is " +V));

		System.out.println("========");
		
	}

}
