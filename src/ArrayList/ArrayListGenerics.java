package ArrayList;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(100);
		arr.add(101);
		
		System.out.println(arr);

		ArrayList<Double> arr1 = new ArrayList<Double>();

		arr1.add(100.22);
		arr1.add(101.55);

		System.out.println(arr1);
		
		ArrayList<String> arr2 = new ArrayList<String>();

		arr2.add("Test1");
		arr2.add("Test2");
		
		System.out.println(arr2);

	}

}
