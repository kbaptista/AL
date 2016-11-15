package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import soldier.*;
import weapon.*;

public class TestUnitSoldier {
	Soldier si, sc, si_sh, si_sw, si_multiple;

	@Before
	public void setUp() throws Exception {
		si = new InfantryMan("Gogol");
		sc = new Horseman("Sanchez");
	}

	@Test
	public void combat() {
		int i;
		for (i = 0; si.parry(sc.strike()); i++) {
			;
		}
		assertEquals("Unexpected death of soldier " + si.getName(), i, 4);

		si.heal(); // resurrection
		si_sh = new SoldierWithShield(si);
		for (i = 0; si_sh.parry(sc.strike()); i++) {
			;
		}
		assertEquals(
				"Unexpected death of  " + si_sh.getName() + " with shield", i,
				6);

		si_sh.heal(); // resurrection
		si_sw = new SoldierWithSword(si_sh);
		for (i = 0; si_sw.parry(sc.strike()); i++) {
			;
		}
		assertEquals("Unexpected death of " + si_sw.getName()
				+ " with shield and sword", i, 6);

		si.heal();
		for (i = 0; sc.parry(si_sw.strike()); i++) {
			;
		}
		assertEquals("Unexpected death of " + sc.getName(), i, 22);
	}

}
