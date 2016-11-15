package weapon;

import soldier.Soldier;

public class SoldierWithShield extends SoldierArmed {

	public SoldierWithShield(Soldier s) {
		super(s);
	}

	public boolean parry(float force) {
		float effectiveReceivedForce = force
				- (float) Math.log(2 * soldier.getHealthPoints());
		return soldier.parry(effectiveReceivedForce);
	}

	public float strike() {
		float effectiveGivenForce = soldier.strike() + 1;
		return effectiveGivenForce;
	}

}
