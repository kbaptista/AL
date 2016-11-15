package visitor;

import army.Army;
import soldier.ArmedUnit;
import soldier.InfantryMan;

public interface Visitor {
	
	void visit(Army army){
		for (ArmedUnit a : army){
			
		}
	}
}
