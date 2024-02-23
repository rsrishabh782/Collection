package Vector;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class vectorCreation {

	public static void main(String[] args) {

		Vector<Integer> myvector = new Vector<Integer>();
		
		myvector.add(100);
		myvector.add(200);
		myvector.add(300);
		myvector.add(800);
		myvector.add(400);
		myvector.add(500);
		
		System.out.println(myvector);
		
		System.out.println(myvector.get(3));
		
		//Integer my = myvector.remove(1);
		//System.out.println(my);
		
		myvector.remove(1);
		
		System.out.println(myvector);
		
		Vector<Integer> yourvector = new Vector<Integer>();
		yourvector.add(600);
		yourvector.add(700);
		
		System.out.println(yourvector);
		
		myvector.addAll(yourvector);
		
		System.out.println(myvector);
		
		for(int it : myvector)
		{
			System.out.println(it);
		}
		System.out.println("-----------");

		for(int i =0; i<myvector.size();i++)
		{
			System.out.println(myvector.get(i));
		}
		System.out.println("-----------");

		myvector.forEach(ele->System.out.println(ele));
		
		System.out.println("-----------");

		
		Iterator<Integer> it =myvector.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("-----------");

		Collections.sort(myvector);
		
		System.out.println(myvector);
		
		
	}

}
