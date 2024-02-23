package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
	/*	int arr[] = new int[4];
		
		arr[0] = 1;
		arr[1] = 2;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		*/
		
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add("Test");
		arr.add(1);
		arr.add(true);
		System.out.println(arr);
		
		System.out.println(arr.get(1));
		System.out.println(arr.size());
		
		System.out.println("LI = " + 0);
		System.out.println("HI = " +(arr.size()-1));
		
		arr.add("Test1");
		arr.add(2);
		arr.add(false);
		System.out.println(arr);
		System.out.println(arr.size());
	}

}
