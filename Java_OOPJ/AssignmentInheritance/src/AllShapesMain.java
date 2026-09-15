
public class AllShapesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape sh = new Shape();
		sh.printShape();
		sh.shapclassMethod();
		System.out.println("============================");
		
		RectangleClass rc = new RectangleClass();
		rc.printShape();
		rc.rectangleClassMethod();
		System.out.println("============================");

		
		Circle c = new Circle();
		c.printShape();
		c.circleMethod();
		System.out.println("============================");

		Shape shs = new RectangleClass();
		shs.printShape();
		shs.shapclassMethod();
		System.out.println("============================");
		
		
		RectangleClass rcc = (RectangleClass)shs;
		rcc.printShape();
		rcc.shapclassMethod();
		rcc.rectangleClassMethod();
		System.out.println("============================");

		
		Shape sv = new SquareClass();
		sv.printShape();
		sv.shapclassMethod();
		System.out.println("============================");
		
		SquareClass svc = (SquareClass)sv;
		svc.printShape();
		svc.shapclassMethod();
		svc.rectangleClassMethod();
		svc.SquareClassMethod();
		
	}

}
