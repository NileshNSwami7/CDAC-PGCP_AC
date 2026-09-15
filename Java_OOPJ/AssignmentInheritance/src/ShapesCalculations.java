
public class ShapesCalculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rect = new Rectangle(4.5,8.2);
		double area = rect.calculateArea();
		double reactparamater = rect.calculatePerimeter();
		
		System.out.println("Area of Reactangle : "+ area);
		System.out.println("Perimeter of Reactangle : "+ reactparamater);
		
		Square sq = new Square(5.0);
		double squareArea= sq.calculateArea();
		double sqrperimeter= sq.calculatePerimeter();
		
		System.out.println("Area of Square : "+ squareArea);
		System.out.println("Perimeter of Square : "+ sqrperimeter);
	}

}
