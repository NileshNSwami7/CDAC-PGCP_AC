import java.util.Scanner;

public class OddRightTringle{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
			for(int i=1 ; i<=num ; i++){
				
				for(int j= 1; j<=i ;j++){
					int n=0;
						if(j>1){
							System.out.print((n+=j*2-1));
						}else{
							System.out.print((n+=j));
						}
					
						if(j<i){
							System.out.print("*");
						}
				}
				System.out.println();
			}
	}
	
}