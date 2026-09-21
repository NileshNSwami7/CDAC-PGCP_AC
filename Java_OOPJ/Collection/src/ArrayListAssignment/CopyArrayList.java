package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CopyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();

		list.add("Red");
		list.add("Blue");
		list.add("Yellow");
		list.add("Orange");
		list.add("Purple");
		
		
		ArrayList<String> copyArrayList = new ArrayList<>();

		for(int temp=0;temp<list.size();temp++) {
			copyArrayList.add(null);
		}
		
		Collections.copy(copyArrayList, list);
		
		System.out.println("Before Copy : "+list);
		
		Collections.sort(copyArrayList);
		
		System.out.println("After Copy :"+copyArrayList);
		

	}

}
