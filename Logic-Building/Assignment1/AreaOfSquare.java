import java.util.Scanner;

public class AreaOfSquare{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Add your sides:");
		int area;
		int side = sc.nextInt();
		
		area = side * side;
		
		System.out.println("Area of Square:" + area);
		
		}
}
		