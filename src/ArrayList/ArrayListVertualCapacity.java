package ArrayList;

import java.util.ArrayList;

public class ArrayListVertualCapacity {

	public static void main(String[] args) {
		
		ArrayList<Object> arr = new ArrayList<Object>(20);
		
		System.out.println(arr.size());

		arr.add(100);
		arr.add(200);
		
		
		System.out.println(arr.size());
		
		arr.add(101);
		arr.add(200);
		
		System.out.println(arr);
		System.out.println(arr.size());

	}

}
