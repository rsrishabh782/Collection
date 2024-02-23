package Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class setCreation {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("Rishabh");
		set.add("Srivastava");
		set.add("Shilpi");
		set.add("Shrivastava");
		
		System.out.println(set);
		
		set.remove("Shrivastava");
		System.out.println(set);
		
		for(String s:set)
		{
			System.out.println(s);
		}
		
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6}));
		
		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {1,4,5,6,7,8,9,10}));
		
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);
		
		Set<Integer> intesection = new HashSet<Integer>(first);
		intesection.retainAll(second);
		System.out.println(intesection);
		
		Set<Integer> difference = new HashSet<Integer>(second);
		difference.removeAll(first);
		System.out.println(difference);
		
		
		
	}

}
