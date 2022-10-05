package edu.buffalo.cse116;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircuitResistanceTest {
	@Test
	public void test01() {
		
		assertEquals(Double.NaN,CircuitResistance.resistorsInParallel(0, 0, 0),0.0);
		
	}
	@Test
	public void test002() {
		
		assertEquals(Double.NaN,CircuitResistance.resistorsInParallel(1, 0, 0),0.0);
		
	}	@Test
	public void test006() {
		
		assertEquals(Double.NaN,CircuitResistance.resistorsInParallel(0, 0, 1),0.0);
		
	}
	@Test
	public void test007() {
		
		assertEquals(Double.NaN,CircuitResistance.resistorsInParallel(0, 5, 0),0.0);
		
	}
	@Test
	public void test008() {
		
		assertEquals(Double.NaN,CircuitResistance.resistorsInParallel(0, 5, 1),0.0);
		
	}
	@Test
	public void test003() {
		
		assertEquals(Double.NaN,CircuitResistance.resistorsInParallel(1, 2, 0),0.0);
		
	}
	@Test
	public void test004() {
		
		assertEquals(Double.NaN,CircuitResistance.resistorsInParallel(1, 0, 2),0.0);
		
	}
	@Test
	public void test02() {
	
		assertEquals(Double.NaN,CircuitResistance.resistorsInSerial(0, 0, 0),0.0);
		
	}
	@Test
	public void test03() {
	
		assertEquals(Double.NaN,CircuitResistance.resistorsInSerial(4, 0, 0),0.0);
		
	}
	@Test
	public void test04() {
	
		assertEquals(Double.NaN,CircuitResistance.resistorsInSerial(4, 5, 0),0.0);
		
	}
	@Test
	public void test040() {
	
		assertEquals(Double.NaN,CircuitResistance.resistorsInSerial(0, 5, 0),0.0);
		
	}
	@Test
	public void test05() {
	
		assertEquals(Double.NaN,CircuitResistance.resistorsInSerial(4, 0, 5),0.0);
		
	}
	@Test
	public void test06() {
	
		assertEquals(Double.NaN,CircuitResistance.resistorsInSerial(0, 0, 5),0.0);
		
	}
	@Test 
	public void testParallel() {
	assertEquals(1.0, CircuitResistance.resistorsInParallel(2.0, 4.0, 4.0),0.0);

	}

	@Test
	public void testSerial() {
	assertEquals(36.0, CircuitResistance.resistorsInSerial(11, 12, 13),0.0);
	}
}
