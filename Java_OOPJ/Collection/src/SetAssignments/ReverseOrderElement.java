package SetAssignments;

import java.util.Collections;
import java.util.TreeSet;

public class ReverseOrderElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> treeset = new TreeSet<>(Collections.reverseOrder());

		treeset.add("Red");
		treeset.add("Blue");
		treeset.add("Yellow");
		treeset.add("Orange");
		treeset.add("Purple");
		
		
		
		
		System.out.println("Reverse : "+treeset);
	}
	

}
