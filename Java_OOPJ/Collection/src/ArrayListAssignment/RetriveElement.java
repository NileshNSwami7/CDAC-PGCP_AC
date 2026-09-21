package ArrayListAssignment;

import java.util.ArrayList;

public class RetriveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();

		list.add("Red");
		list.add("Blue");
		list.add("Yellow");
		list.add("Orange");
		list.add("Purple");

		list.add(0, "White");
		
		
		System.out.println("Specific Position : "+ list.get(4));

	}

}
