package introspection;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public void Exercice21a(String className){
		System.out.println("Classe : "+className);
		Object object ;
		
		try{
			object = Class.forName(className).newInstance();
		}
		catch(ClassNotFoundException e){
			System.out.println("La Classe "+className+" n'est pas trouvée.");
			return;
		}
		try{
			System.out.println(Class.forName(className).getSuperclass().getName());
		}
		catch(ClassNotFoundException e){
			System.out.println("La Classe "+className+" n'a pas de superclass.");
		}
		try{
			
		}
		catch(){
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure f1 = new Circle();
		Figure f2 = new Triangle();
		Figure f3 = new Square();
		Figure f4 = new Pentagon();
		
		List<Figure> list = new ArrayList<Figure>();
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		
		for (Figure figure : list) {
			for (Figure figure2 : list) {
				System.out.println(figure.intersect(figure2));
			}
			System.out.println();
		}
	}

}
