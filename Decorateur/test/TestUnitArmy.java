package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import army.Army;
import soldier.*;
import weapon.*;

public class TestUnitArmy {

	ArmedUnit army1, army2;
	
	public void setUp()throws Exception{
		army1 = new ArmedUnitSoldier("Horseman", "Lancelot");
		
		
		army2 = new ArmedUnitSoldier("InfantryMan", "Ike");
		
		
	}
}
