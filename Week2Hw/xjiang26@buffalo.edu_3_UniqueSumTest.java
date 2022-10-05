package edu.buffalo.cse116;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueSumTest {

@Test
public void test1() {	
UniqueSum test1 = new UniqueSum();
int ans =test1.computeUniqueSum(5, 6, 7);
assertEquals(18,ans);
}
@Test
public void test2() {
	UniqueSum test2 = new UniqueSum();
	int ans = test2.computeUniqueSum(5, 5, 7);
	assertEquals(7,ans);
}
@Test
public void test3() {
	UniqueSum test3= new UniqueSum();
	int ans = test3.computeUniqueSum(5, 5, 5);
	assertEquals(0,ans);
}
@Test
public void test4() {
	UniqueSum test4= new UniqueSum();
	int ans = test4.computeUniqueSum(5, 6, 5);
	assertEquals(6,ans);
}
@Test
public void test5() {
	UniqueSum test5= new UniqueSum();
	int ans = test5.computeUniqueSum(5, 6, 6);
	assertEquals(5,ans);
}
}