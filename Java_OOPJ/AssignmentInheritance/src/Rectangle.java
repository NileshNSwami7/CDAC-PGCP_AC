
public class Rectangle {
	
	private double length;
	private double breadth;
	
	Rectangle(double length,double breadth){
		this.length = length;
		this.setBreadth(breadth);
	}
	
	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double calculateArea() {
		return length*getBreadth();
	}
	
	public double calculatePerimeter() {
		return 2*(length+getBreadth());
	}

	
}
