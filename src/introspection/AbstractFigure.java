package introspection;

import java.lang.reflect.Method;

public abstract class AbstractFigure implements Figure {
	public String intersect(Figure f){
		
		Method truc []= this.getClass().getMethods();
		//tester si j'ai la méthod qui a comme argument son type réel
		for (Method method : truc) {
			if()
				
			}
		}
		//sinon si il a la methode avec comme argument, mon type réel
	
		//sinon, on peut pas faire
	}
	
	
/*
	public String intersect(Figure f){
		StringBuffer res = new StringBuffer("Intersection of a ");
		
		if(this instanceof Circle){
			res.append("Circle");
		}
		else if(this instanceof Triangle){
			res.append("Triangle");
		}
		else if(this instanceof Square){
			res.append("Square");
		}
		else if(this instanceof Pentagon){
			res.append("Pentagon");
		}
		
		res.append(" and a ");
		
		if(f instanceof Circle){
			res.append("Circle");
		}
		else if(f instanceof Triangle){
			res.append("Triangle");
		}
		else if(f instanceof Square){
			res.append("Square");
		}
		else if(f instanceof Pentagon){
			res.append("Pentagon");
		}
		
		return res.toString();
	}
	*/
}
