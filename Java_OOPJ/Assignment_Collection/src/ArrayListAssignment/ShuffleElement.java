package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();

		list.add("Red");
		list.add("Blue");
		list.add("Yellow");
		list.add("Orange");
		list.add("Purple");
		
		
		Collections.shuffle(list);
		
		System.out.println(list);
	}

}
