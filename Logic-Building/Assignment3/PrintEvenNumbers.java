
public class PrintEvenNumbers {
	
	public static void printEvenNumbers(int num) {
		
		int i=1;
		while(i<=num) {
			
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}
	}

	public static void main(String[] args) {
		
		int num = 50;
		
		printEvenNumbers(num);

	}

}
