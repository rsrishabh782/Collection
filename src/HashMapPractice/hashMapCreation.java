package HashMapPractice;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.management.ImmutableDescriptor;

public class hashMapCreation {

	public static Map<String, String> marksMap;

	static
	{
		marksMap = new HashMap<>();
		marksMap.put("Test", "Test1");
		marksMap.put("A", "100");
	}

	public static void main(String[] args) {

		HashMap<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();


		System.out.println(hashMapCreation.marksMap.get("Test"));
		System.out.println(hashMapCreation.marksMap.get("A"));

		//	Immutable Map
		Map<String, Integer> map3 = Collections.singletonMap("Test", 1001);
		System.out.println(map3.get("Test"));
		//map3.put("Test1", 102);
		//System.out.println(map3.get("Test1"));

		//JDK 8, Creating using array with stream
		Map<String, String> map4 = Stream.of(new String[][]

				{{"Tom", "Grade A"},
			    {"Naveen", "A+Grade"}
				}).collect(Collectors.toMap(data->data[0], data->data[1]));

		System.out.println(map4.get("Tom"));

		map4.put("Rishabh", "Srivastava");
		System.out.println(map4.get("Rishabh"));
		
		//Using SimpleEntry //Mutable Map
		
		Map<String, String> map5 = Stream.of(
				
				new AbstractMap.SimpleEntry<>("Rishabh", "Srivastava"),
				new AbstractMap.SimpleEntry<>("Shilpi", "Srivastava")
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(map5.get("Shilpi"));
		
		map5.put("Yash", "Dhul");
		
		System.out.println(map5.get("Yash"));
		
		//Using SimpleEntry //ImMutable Map
		
		Map<String, String> map6 =Stream.of(
				
				new AbstractMap.SimpleImmutableEntry<>("Prashant", "Gupta"),
				new AbstractMap.SimpleImmutableEntry<>("Srivastava", "Sachin")
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(map6.get("Srivastava"));
		
		map6.put("Gupta", "Simran");
		
		System.out.println(map6.get("Gupta"));
		
		//JDK 1.9
		//empty map
		
		Map<String, Integer> emptymap = Map.of();
	//	emptymap.put("Testing", 100);
	//	System.out.println(emptymap.get("Testing"));//UnsupportedOperationException
		
		//singletonMap
		Map<String, String> singletonMap=Map.of("K1", "V1");
		//System.out.println(singletonMap.get("K1"));//UnsupportedOperationException
		//singletonMap.put("k2", "V2");
		
		//MultiValuesMap//Immutable//Max 10 entry allowed
		
		Map<String, String> multiMap = Map.of("K1", "V1", "k2", "V2");
		System.out.println(multiMap.get("K1"));
		//multiMap.put("K3", "V3");
		//System.out.println(multiMap.get("K3"));
		
		
		
		//No Limitation for entry//Immutable
		Map<String, String> map7 = Map.ofEntries(
				new AbstractMap.SimpleImmutableEntry<>("Prashant", "Gupta"),
				new AbstractMap.SimpleImmutableEntry<>("Srivastava", "Sachin")
				);
		
		System.out.println(map7.get("Srivastava"));
		
		//map7.put("Ghanta", "Pull");
		//System.out.println(map7.get("Ghanta"));
		
		//This way we can create Map which is mutable.
		Map<Integer, String> m1 = new HashMap<>(Map.of(1, "A", 2, "B", 3, "C")); 
		System.out.println(m1.get(1));
		m1.put(4, "D");
		System.out.println(m1.get(4));
		
		
		
	}

}
