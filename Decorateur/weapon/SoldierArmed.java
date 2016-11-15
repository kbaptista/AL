package weapon;

import soldier.Soldier;

public abstract class SoldierArmed implements Soldier {
	protected Soldier soldier;

	SoldierArmed(Soldier s) {
		soldier = s;
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
}
