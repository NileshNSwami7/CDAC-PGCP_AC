package Queue;

import java.util.Scanner;

public class SimpleQueueMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the capacity.");
		int capacity = scan.nextInt();
		SimpleQueue simpleQueue = new SimpleQueue(capacity);
		int choice;
		do {
			System.out.println("Enter the choice");
			System.out.println("1.Insert");
			System.out.println("2.Delete");
			System.out.println("3.Display");
			System.out.println("4.Exit.");
			choice = scan.nextInt();
			switch(choice) {
			case 1: System.out.println("Enter how many value.");
					int num = scan.nextInt();
					if(capacity<num) {
						System.out.println("Capacity always greater than number values.please enter less number value than capacity. ");
						return;
					}else {
						System.out.println("Enter the values");
						for(int i=0;i<num;i++) {
							simpleQueue.insert(scan.nextInt());
						}
						break;
					}
			case 2: int value = simpleQueue.delete();
					System.out.println(value+" ");
					break;
			case 3: simpleQueue.display();
					break;
			case 4: System.exit(0);
					break;
			default : System.out.println("Wrong selection please select value.");
						break;
			}
		}while(choice != 4 );
	}

}
