package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class AddElelmentAtFisrt {

public static void main(String args[]) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Red");
		list.add("Blue");
		list.add("Yellow");
		list.add("Orange");
		list.add("Purple");
		
		list.add(0,"White");
		
		
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
		}
		
	}

}
