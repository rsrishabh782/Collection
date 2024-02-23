package TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapCreation {

	public static void main(String[] args) {

		TreeMap<Integer, String > treemap = new TreeMap<Integer, String>();

		treemap.put(1000, "Google" );
		treemap.put(2000, "Amazon" );
		treemap.put(3000, "Walmart");
		treemap.put(4000, "Flipkart" );

		System.out.println(treemap);

		treemap.forEach((k,v)->System.out.println("Key =" +k+ " value = "+v));

		System.out.println(treemap.lastKey());

		System.out.println(treemap.firstKey());

		//System.out.println(treemap.get("Amazon"));

		Set<Integer> lesstthan=treemap.headMap(3000).keySet();
		System.out.println(lesstthan);

		Set<Integer> greaterthan=treemap.tailMap(3000).keySet();
		System.out.println(greaterthan);

		System.out.println("-------");

		Set<Integer> decending = treemap.descendingKeySet();
		System.out.println(decending);

	}

}
