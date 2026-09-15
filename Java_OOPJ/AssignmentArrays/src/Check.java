
public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Parent  p = new Parent();
		
		p.display();
		
		System.out.println("==========================");
		
		Child c = new Child();
		
		c.display();
		
		System.out.println("==========================");

		
		Parent p1 = new Child();
		p1.display();
	
		System.out.println("==========================");

		Child c1 = (Child)p1;
		
		c1.display();
		c1.show();
		System.out.println("==========================");

		
		
//		Child c2 = (Parent)p1;
		

	}

}
