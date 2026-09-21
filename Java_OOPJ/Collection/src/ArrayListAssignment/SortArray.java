package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> list = new ArrayList<>();

		list.add("Red");
		list.add("Blue");
		list.add("Yellow");
		list.add("Orange");
		list.add("Purple");
		
		System.out.println("Before sorting : "+list);
		
		Collections.sort(list);
		
		
		System.out.println("After sorting : "+list);


	}

	
}
