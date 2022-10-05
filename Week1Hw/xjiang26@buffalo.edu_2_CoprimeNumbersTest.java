
package edu.buffalo.cse116;

import static org.junit.Assert.*;

import org.junit.Test;

public class CoprimeNumbersTest {
	@Test
	public void testCoprime01() {
		CoprimeNumbers cp = new CoprimeNumbers();
		int arg1 = 5;
		int arg2 = 4;
		assertTrue(cp.isCoprime(5, 4));
	}
	@Test
	public void testCoprime02() {
		CoprimeNumbers op = new CoprimeNumbers();
		int arg3 = 12;
		int arg4 = 18;
		assertFalse(op.isCoprime(12, 18));
	}
}
