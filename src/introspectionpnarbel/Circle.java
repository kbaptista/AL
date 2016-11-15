package introspectionpnarbel;

import introspectionpnarbel.AbstractFigure;

public class Circle extends AbstractFigure {

	public void intersect(Circle f) {
		System.out.println("circle.circle applied!");
	}

	public void intersect(Square f) {
		System.out.println("circle.square applied!");
	}
}
