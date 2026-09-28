package AnonnymousClass;

public class AnonymousWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(()->{
				for(int i=0;i<10;i++) {
					System.out.println("Child main");
				}
		});
	}

}
