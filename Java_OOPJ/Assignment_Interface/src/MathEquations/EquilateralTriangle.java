package MathEquations;

public class EquilateralTriangle implements RegularPolygon {
	
	private double sideLength;
	
	public EquilateralTriangle() {
		
	}
	public EquilateralTriangle(double sideLength) {
		this.sideLength = sideLength;
	}
	
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	
	public int getNumSides() {
		return 3;
	}
	
	public double getSideLength() {
		return this.sideLength;
	}
	
	
}
