package SetAssignments;

import java.util.TreeSet;

public class CeilingIingElementTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> treeset = new TreeSet<>();

		treeset.add(20);
		treeset.add(52);
		treeset.add(42);
		treeset.add(8);
		treeset.add(4);
		
		int element = 22;
		Integer itr= treeset.ceiling(element);
		
		 System.out.println("TreeSet: " + treeset);
		 System.out.println("Element greater than or equal to "
	                + element + " : " + itr);
	}

}
