package AnonnymousClass;


//public class MyRun implements Runnable
public class MyRun {

	
//	public void run() {
//		for(int i=0;i<10;i++) {
//			System.out.println("Child thread");
//		}
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Runnable r = new MyRun();
//		Thread t = new Thread(r);
//		
//		t.start();
//		
//		for(int i=0;i<10;i++) {
//			System.out.println("Main Thread");
//		}
		
		Runnable r = ()->{
			for(int i=0;i<10;i++) {
				System.out.println("Child thread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}

}
