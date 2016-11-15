package soldier;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import weapon.*;

public class ArmedUnitSoldier implements ArmedUnit {
	protected Soldier soldier;
	protected List<String> equipments = new ArrayList<String>();

	@SuppressWarnings("unchecked")
	public ArmedUnitSoldier(String soldierType, String soldierName) {
		try {
			// ensures that the created soldier is an undecorated one
			// by constraining it to be a SoldierAbstract
			Class<? extends SoldierAbstract> c;
			c = (Class<? extends SoldierAbstract>) Class.forName("soldier."
					+ soldierType);

			Constructor<? extends SoldierAbstract>[] make;
			make = (Constructor<? extends SoldierAbstract>[]) c
					.getConstructors();

			Object[] argc = { soldierName };
			soldier = make[0].newInstance(argc);
		} catch (Exception e) {
			throw new UnknownSoldierTypeException("Unknown soldier type"
					+ e.toString());
		}
	}

	public void addEquipment(String equipmentType) throws BreakingRuleException {
	    // rule enforced: one instance of each weapon
		if (alive()) { 
			if (equipments.contains(equipmentType)) { 
				throw new BreakingRuleException(
						"too many weapon occurrences of this kind");
			} else {
				try { // simplification-assumption : it exists a class of 
					  // name SoldierWithWeapon associated with each Weapon
					Class<?> c = Class.forName("weapon.SoldierWith"
							+ equipmentType);
					Constructor<?>[] cons = c.getConstructors();
					//apply decoration:
					soldier = (SoldierArmed) cons[0].newInstance(soldier);  
					equipments.add(equipmentType);
				} catch (Exception e) {
					throw new RuntimeException("Unknown equipment type "
							+ e.toString());
				}
			}
		}
	}

	public String getName() {
		return soldier.getName();
	}

	public float getHealthPoints() {
		return soldier.getHealthPoints();
	}

	public boolean alive() {
		return soldier.alive();
	}

	public void heal() {
		soldier.heal();
	}

	public float strike() {
		return soldier.strike();
	}

	public boolean parry(float force) {
		return soldier.parry(force);
	}

	@Override
	public void addArmedUnit(ArmedUnit armedUnit) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void deleteArmedUnit(ArmedUnit armedUnit) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterator<ArmedUnit> getSubUnit() {
		// TODO Auto-generated method stub
		
		return new Iterator<ArmedUnit>() {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public ArmedUnit next() {
				// TODO Auto-generated method stub
				throw new NoSuchElementException();
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}

}
