package army;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import soldier.ArmedUnit;

public class Army implements ArmedUnit {
	
	private String name;
	private Set<ArmedUnit> group ;

	public Army (){
		name = "";
		group = new HashSet<ArmedUnit>();
	}
	
	public Army(String name, ArmedUnit units){
		this.name=name;
		group.add(units);
	}
	
	public void addArmedUnit(ArmedUnit armedUnit){
		group.add(armedUnit);
	}

	@Override
	public Iterator<ArmedUnit> getSubUnit() {
		// TODO Auto-generated method stub
		return group.iterator() ;
	}
	
	@Override
	public void deleteArmedUnit(ArmedUnit armedUnit) {
		// TODO Auto-generated method stub
		group.remove(armedUnit);
		
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public float getHealthPoints() {
		// TODO Auto-generated method stub
		int life = 0;
		for (ArmedUnit armedUnit : group) {
			life+=armedUnit.getHealthPoints();
		}
		return life;
	}

	@Override
	public boolean alive() {
		// TODO Auto-generated method stub
		for (ArmedUnit armedUnit : group) {
			if (armedUnit.alive()) {
				return true;
			}
		}
		return false ;
	}

	@Override
	public void heal() {
		// TODO Auto-generated method stub
		for (ArmedUnit armedUnit : group) {
			armedUnit.heal();
		}
	}

	@Override
	public boolean parry(float force) {
		// TODO Auto-generated method stub
		float damage = force;
		for (ArmedUnit armedUnit : group) {
			if (damage <= 0.0f) {
				return true;
			}
			if (armedUnit.alive()) {
				armedUnit.parry(damage);
				damage -= armedUnit.getHealthPoints();
			}
		}
		return false;
	}

	@Override
	public float strike() {

		float totalPower = 0.0f;
		for (ArmedUnit armedUnit : group) {
			totalPower+=armedUnit.strike();
		}
		return totalPower;
	}

	@Override
	public void addEquipment(String weaponType) {
		for (ArmedUnit armedUnit : group) {
			armedUnit.addEquipment(weaponType);
		}
		
	}
}
