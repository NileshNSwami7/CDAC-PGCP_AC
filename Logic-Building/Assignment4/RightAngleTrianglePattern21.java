import java.util.Scanner;

public class RightAngleTrianglePattern21{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int n=0;
			for(int i=1 ; i<=num ; i++){
				
				for(int j=0; j<i ;j++){
						
						if(i<3){
						System.out.print(n=j+i);
						}else{
						System.out.print(n+=1);
						}
					
				}
				System.out.println();
			}
	}
}