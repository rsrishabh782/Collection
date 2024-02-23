package Vector;

import java.util.Vector;

public class vector2DConcept {

	public static void main(String[] args) {

		Vector<String> myvector = new Vector<String>();
		myvector.add("Java");
		myvector.add("Ruby");
		myvector.add("Python");
		myvector.add("Java Script");
		
		Vector osVector = new Vector();
		osVector.add(myvector);
		
		for(int i=0;i<myvector.size();i++)
		{
			String str=((Vector<String>) osVector.get(0)).get(i);
			System.out.println(str);
		}

		
		
	}

}
