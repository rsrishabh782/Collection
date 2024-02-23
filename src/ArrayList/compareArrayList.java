package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class compareArrayList {

	public static void main(String[] args) {

		ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e"));
		ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "f"));
		ArrayList<String> arr3 = new ArrayList<String>(Arrays.asList("a", "b", "d", "c", "e"));

		Collections.sort(arr1);
		Collections.sort(arr2);
		Collections.sort(arr3);
		
		System.out.println(arr1.equals(arr2));
		System.out.println(arr1.equals(arr3));
		
		
		ArrayList<String> arr4 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e"));
		ArrayList<String> arr5 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "f"));
		
		arr4.removeAll(arr5);
		System.out.println(arr4);
		
		
		ArrayList<String> arr6 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e"));
		ArrayList<String> arr7 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "f"));
		
		
		arr7.removeAll(arr6);
		System.out.println(arr7);
		
		ArrayList<String> arr8 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e"));
		ArrayList<String> arr9 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "f"));
		
		
		arr8.retainAll(arr9);
		System.out.println(arr8);
	}
	

}
