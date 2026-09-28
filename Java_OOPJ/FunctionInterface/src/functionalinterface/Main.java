package functionalinterface;

import Default.ConsolInput;

public class Main {
	
	
	public static void main(String args[]) {
		
		
		Parent P = (a,b)-> System.out.println(a+b);
//		Child c = (a,b)-> System.out.println(a+b);
		
		int a = ConsolInput.getInt();
		int b = ConsolInput.getInt();
		P.add(a,b);
//		c.sub(a,b);
	}

}
