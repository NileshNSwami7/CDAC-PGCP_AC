import java.util.Scanner;

public class AreaOfRectangle{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double area;
		System.out.println("Enter your length : ");
		double length = sc.nextDouble();
		System.out.println("Enter your width : ");
		double width = sc.nextDouble();
		
		area = length * width;
		
		System.out.println("Area of Rectagnle: "+ area);
		
		}
		
}