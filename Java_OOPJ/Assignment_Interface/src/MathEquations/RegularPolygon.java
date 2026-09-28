package MathEquations;

public interface RegularPolygon {
	
	public int getNumSides();
	
	public double getSideLength();
	
	public static int totalSide(RegularPolygon[] polygon) {
		int total=0;
		
		for(RegularPolygon poly : polygon) {
			if(poly != null) {
				total+=poly.getNumSides();
			}
		}
		return total;
	}
	
	default double getPerimeter() {
		int n = getNumSides();
		double l = getSideLength();
		return n * l;
	}
	
	default double getInteriorAngle() {
		int n = getNumSides();
		return((n-2)*Math.PI /n);
	}
}
