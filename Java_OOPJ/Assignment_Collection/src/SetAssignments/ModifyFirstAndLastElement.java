package SetAssignments;

import java.util.Collections;
import java.util.TreeSet;

public class ModifyFirstAndLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> treeset = new TreeSet<>();

		treeset.add("Red");
		treeset.add("Blue");
		treeset.add("Yellow");
		treeset.add("Orange");
		treeset.add("Purple");
		
		
		System.out.println(treeset);
		
		System.out.println("First Element in Treeset : "+treeset.first());
		System.out.println("Last Element in Treeset : "+treeset.last());
	}

}
