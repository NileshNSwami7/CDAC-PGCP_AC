package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();

		list.add("Red");
		list.add("Blue");
		list.add("Yellow");
		list.add("Orange");
		list.add("Purple");

		list.add(0, "White");
		
		list.remove(3);
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
