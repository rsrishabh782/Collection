package EnumSet;

import java.util.EnumSet;
import java.util.Iterator;

public class enumCreationandMethod {

	enum lung{
		Java,
		Python,
		Spring,
		Boot,
		CSharp
	}
	
	
	public static void main(String[] args) {
		 EnumSet<lung> langs=EnumSet.allOf(lung.class);
		 System.out.println(langs);
		 
		 EnumSet<lung> langs1= EnumSet.noneOf(lung.class);
		 System.out.println(langs1);
		
		 EnumSet<lung> langs2= EnumSet.range(lung.Java, lung.Spring);
		 System.out.println(langs2);
		 
		 EnumSet<lung> langs3= EnumSet.of(lung.Java);
		 System.out.println(langs3);
		 
		 EnumSet<lung> langs4= EnumSet.of(lung.Java, lung.Boot);
		 System.out.println(langs4);
		 
		 EnumSet<lung> lang5=EnumSet.allOf(lung.class);
		 System.out.println(lang5);
		 
		 EnumSet<lung> langs6= EnumSet.noneOf(lung.class);
		 System.out.println(langs6);
		
		 System.out.println("----------");
		 langs6.addAll(lang5);
		 
		 System.out.println(langs6);
		 
		 langs6.add(lung.Boot);
		 
		 System.out.println(langs6);
		 
		 EnumSet<lung> full=EnumSet.allOf(lung.class);
		 System.out.println(lang5);
		 
		 Iterator<lung> it=full.iterator();
		 
		 while(it.hasNext())
		 {
			 System.out.print(it.next());
			 System.out.print(",");
		 }
		 
		 EnumSet<lung> newlang=EnumSet.allOf(lung.class);
		 System.out.println(lang5);
		 
		 boolean b=newlang.remove(lung.Python);
		 System.out.println(b);
		 System.out.println(newlang);
		
		 newlang.removeAll(newlang);
		 System.out.println(newlang);
		 
		}

	}


