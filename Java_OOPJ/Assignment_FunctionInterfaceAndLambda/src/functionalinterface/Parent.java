package functionalinterface;

@FunctionalInterface
public interface Parent {
	public void add(int a,int b);
}

//interface Child extends Parent{
//	
//}

//@FunctionalInterface
//interface Child extends Parent{
//	
//}

//@FunctionalInterface
//interface Child extends Parent{
//	
//	public void add(int a,int b);
//}


interface Child extends Parent{
	public void sub(int a,int b);
}

//@FunctionalInterface
//interface Child extends Parent{
//	public void sub(int a,int b);
//}