
public class CheckProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentClass pc  = new ParentClass();
		pc.parentMethod();
		pc.ownClass();
		System.out.println("====================================");
		
		ChildClass cc = new ChildClass();
		cc.childMethod();
		cc.ownClass();
		System.out.println("====================================");

		ParentClass pcc = new ChildClass();
		pcc.parentMethod();
		pcc.ownClass();
		System.out.println("====================================");
		
		ChildClass cd =  (ChildClass) pcc;
		cd.childMethod();
		cd.parentMethod();
		cd.ownClass();
	}

}
