package SetAssignments;

import java.util.TreeSet;

public class AddAllElementInTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> treeset = new TreeSet<>();

		treeset.add("Red");
		treeset.add("Blue");
		treeset.add("Yellow");
		treeset.add("Orange");
		treeset.add("Purple");

		System.out.println(treeset);
		

		TreeSet<String> treeset2 = new TreeSet<>();
		
		treeset2.add("Green");
		treeset2.add("Pink");
		treeset2.add("Wine");
		treeset2.add("White");
		treeset2.add("OliVe Green");
		
		
		System.out.println(treeset2);
		
		
		treeset2.addAll(treeset);
		
		System.out.println("Aftering all element : "+treeset2);

	}

}
