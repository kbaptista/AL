package weapon;

import soldier.Soldier;

public class SoldierWithSword extends SoldierArmed {

	public SoldierWithSword(Soldier s) {
		super(s);
	}

	public boolean parry(float force) {
		float effectiveReceivedForce = force - 1;
		return soldier.parry(effectiveReceivedForce);
	}

	public float strike() {
		float effectiveGivenForce = (float) Math.log(2 * soldier
				.getHealthPoints());
		return effectiveGivenForce;

	}
}
