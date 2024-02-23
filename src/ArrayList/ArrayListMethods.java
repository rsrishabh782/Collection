package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();

		arr.add("Tom");
		arr.add("Lathem");
		arr.add("Nikhil");
		arr.add("Rishabh");

		System.out.println(arr);
		
		ArrayList<String> arr1 = new ArrayList<String>();

		arr1.add("Tom1");
		arr1.add("Lathem1");


		//	arr.addAll(arr1);

		/*	System.out.println(arr);

		arr.addAll(2, arr1);

		System.out.println(arr);

		arr.clear();
		System.out.println(arr);
		 */

		ArrayList<String> Clone = (ArrayList<String>)arr1.clone();
		System.out.println(Clone);

		System.out.println(arr.contains("Rishabh"));

		System.out.println(arr.contains("Test"));

		System.out.println(arr.indexOf("Nikhil") > 0);


		ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList("Tom", "Rishabh", "Latham", "Rishabh", "Moddy"));

		System.out.println("15" + arr2);

		System.out.println(arr.indexOf("Rishabh"));

		int i = arr2.indexOf("Rishabh");
		System.out.println(i);

		int j = arr2.lastIndexOf("Rishabh");
		System.out.println(j);

		arr2.remove(1);
		System.out.println(arr2);


		ArrayList<Integer> arr3 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4,5,6,7,8,9,10));

		arr3.removeIf(num-> num%2==0);

		System.out.println(arr3);


		ArrayList<Integer> arr4 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4,5,6,7,8,9,10));

		arr4.removeIf(num-> num%2!=0);

		System.out.println(arr4);


		ArrayList<String> arr5 = new ArrayList<String>(Arrays.asList("Tom", "Rishabh", "Latham", "Rishabh", "Moddy"));

		arr5.retainAll(Collections.singleton("Rishabh"));

		System.out.println(arr5);

		ArrayList<Integer> arr6 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4,5,6,7,8,9,10));

		ArrayList<Integer> subList = new ArrayList<Integer>(arr6.subList(3, 7));
		System.out.println(subList);

		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Tom", "Rishabh", "Latham", "Rishabh", "Moddy"));
		Object arr11[] = nameList.toArray();
		System.out.println(Arrays.toString(arr11));
		

	}

}
