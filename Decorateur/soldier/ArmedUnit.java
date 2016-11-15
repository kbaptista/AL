package soldier;

import java.util.Iterator;

import visitor.Visitor;

public interface ArmedUnit extends Iterable<ArmedUnit>{
	public String getName();
	public float getHealthPoints();
	public boolean alive();
	public void heal();
	public boolean parry(float force); // true if the receiver is still alive
										// after the strike
	public float strike();

	public void addEquipment(String weaponType);
	public Iterator<SoldierArmed> getWeapon();
	
	/* Composite */
	public void addArmedUnit(ArmedUnit armedUnit);
	public Iterator<ArmedUnit> iterator();
	public void deleteArmedUnit(ArmedUnit armedUnit);
	
	/* Visiteur */
	public void accept(Visitor v);
}