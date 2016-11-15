package introspectionpnarbel;

public class Triangle extends AbstractFigure{
	public void intersect(Triangle f){
		System.out.println("triangle.triangle applied!");
	}
	public void intersect(Square f){
		System.out.println("triangle.square applied!");
	}
	public void intersect(Circle f){
		System.out.println("triangle.circle applied!");
	}

}
