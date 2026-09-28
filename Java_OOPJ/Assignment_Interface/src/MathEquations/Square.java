package MathEquations;

public class Square implements RegularPolygon{
	
	private double getSideLength;
	
	public Square() {
		
	}
	
	public Square(double getSideLength) {
		this.getSideLength = getSideLength;
	}

	public void setSide(double getSideLength) {
		this.getSideLength=getSideLength;
	}
	
	public int getNumSides() {
		return 4;
	}
	
	public double getSideLength() {
		return this.getSideLength;
	}
}
