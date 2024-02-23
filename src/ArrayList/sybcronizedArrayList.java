package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class sybcronizedArrayList {

	public static void main(String[] args) {
		List<String> namelist = Collections.synchronizedList(new ArrayList<String>());
		
		namelist.add("Java");
		namelist.add("Python");
		
		synchronized (namelist) {
			
			Iterator<String> it = namelist.iterator();
			
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
			
		}
		
		CopyOnWriteArrayList<String> elmlist = new CopyOnWriteArrayList<String>();
		elmlist.add("Tom");
		elmlist.add("Rishabh");
		
		Iterator<String> it1 = elmlist.iterator();
		
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}

}
