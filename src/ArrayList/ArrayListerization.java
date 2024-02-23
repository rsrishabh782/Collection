package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListerization {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();

		arr.add("Tom");
		arr.add("Lathem");
		arr.add("Nikhil");
		arr.add("Rishabh");

		for(int i=0; i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}

		System.out.println("------------------");

		for(String st:arr)
		{
			System.out.println(st);
		}

		System.out.println("------------------");

		//Lamda
		arr.stream().forEach(ele->System.out.println(ele));

		System.out.println("------------------");

		Iterator<String> it= arr.iterator();

		while (it.hasNext())
		{
			System.out.println(it.next());	
		}

		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		System.out.println(arr1);
	}

	
	}




