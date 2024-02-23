package HashMapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class convertHasmapToArrayList {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Google", 1000);
		map.put("Amazon", 2000);
		map.put("Walmart", 3000);
		map.put("Flipkart", 4000);
		
		//System.out.println(map.get("Google"));
		
		System.out.println(map.size());
		
		Iterator it =map.entrySet().iterator();
		
		while(it.hasNext())
		{
		Map.Entry pairs = (Entry) it.next();
		
		System.out.println(pairs.getKey() + "=" +pairs.getValue());
		}
		
		map.forEach((k,v)->System.out.println("key =" +k+ ", value =" +v));
		
		List<String> listkey = new ArrayList<String>(map.keySet());
		System.out.println(listkey.size());
		for(String its : listkey)
		{
			System.out.println(its);
		}
		
		List<Integer> listvalues = new ArrayList<Integer>(map.values());
		System.out.println(listvalues.size());
		for(Integer its1 : listvalues)
		{
			System.out.println(its1);
		}
	}

}
