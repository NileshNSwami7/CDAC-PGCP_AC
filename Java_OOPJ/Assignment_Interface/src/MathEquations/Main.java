package MathEquations;

import Default.ConsolInput;

public class Main {

	public static void main(String[] args) {
		
		EquilateralTriangle tringle = new EquilateralTriangle();
		
		RegularPolygon regularPolygon = tringle;
		
		System.out.println("Please enter the sides.");
		
		double sideLength = ConsolInput.getDouble();
		
		tringle.setSideLength(sideLength);
		
		System.out.println("Number of Side :"+regularPolygon.getNumSides());
		System.out.println("Side length : "+regularPolygon.getSideLength());
		
		System.out.println("**************************************************");
		
		Square square = new Square();
		RegularPolygon regularPolygon1 = square;
		
		System.out.println("Please enter Sides :");
		double sides = ConsolInput.getDouble();
		square.setSide(sides);
		
		System.out.println("Number of Side Square:"+regularPolygon1.getNumSides());
		System.out.println("Side length of Square : "+regularPolygon1.getSideLength());
		
		System.out.println("**************************************************");

		System.out.println("Please enter number of tringles.");
		
		int noOfTringle = ConsolInput.getInt();
		
		EquilateralTriangle tri[] = new EquilateralTriangle[noOfTringle];
		RegularPolygon shapes[] = new RegularPolygon[tri.length];
		System.out.println("Eners sides.");
		for(int temp=0;temp<tri.length;temp++) {
			
		shapes[temp] = new EquilateralTriangle(ConsolInput.getDouble()); 
		
		}

		int total=RegularPolygon.totalSide(shapes);
		System.out.println("Total : "+total);
		
		System.out.println("*****************************************************");
		
		System.out.println("Perimeter " + tringle.getPerimeter());
		System.out.println("Interior Angle (rad) :"+tringle.getInteriorAngle());
	}


}
