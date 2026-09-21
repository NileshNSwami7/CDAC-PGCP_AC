package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();

		list.add("Red");
		list.add("Blue");
		list.add("Yellow");
		list.add("Orange");
		list.add("Purple");
		
		
		System.out.println("Before reverse : "+list);
		Collections.reverse(list);
		System.out.println("After reverse : "+ list);
	}

}
