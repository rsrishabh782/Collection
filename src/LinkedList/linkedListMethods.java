package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedListMethods {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Test1");
		ll.add("Test2");
		ll.add("Test3");
		ll.add("Test4");

		System.out.println(ll.size());

		System.out.println(ll.get(1));

		ll.add("Rishabh");
		System.out.println(ll.size());

		System.out.println(ll);

		Iterator<String> it=ll.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		ll.add(4, "Shilpi");
		System.out.println(ll);

		ll.add(6, "Shilpi");
		System.out.println(ll);
		
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.add("Java");
		ll1.add("Selenium");
		
		ll.addAll(ll1);
		System.out.println(ll);
		
		System.out.println(ll.size());
		
		Iterator<String> its=ll.descendingIterator();
		
		while(its.hasNext())
		{
			System.out.println(its.next());
			
		}
		
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);
		
		ll.removeAll(ll1);
		System.out.println(ll);
		
		Collections.sort(ll);
		System.out.println(ll);
		
		for(String str:ll)
		{
			System.out.println(str);
		}
		
		
		ll.clear();
		System.out.println(ll);
		
	}

}
