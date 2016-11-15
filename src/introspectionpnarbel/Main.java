package introspectionpnarbel;

public class Main {

	public static void main(String[] args) {
		AbstractFigure square = new Square();
		AbstractFigure circle = new Circle();
		AbstractFigure triangle = new Triangle();
		
		square.intersect(circle);
		square.intersect(square);
		square.intersect(triangle);
		
		circle.intersect(circle);
		circle.intersect(square);
		circle.intersect(triangle);
		
		triangle.intersect(circle);
		triangle.intersect(square);
		triangle.intersect(triangle);
	}
}