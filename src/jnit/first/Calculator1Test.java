package jnit.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculator1Test {

	@Test
	public void testAdd() {
		Calculator1 c1=new Calculator1();
		assertEquals(5,c1.add(2, 3));
	}

	@Test
	public void testSub() {
		Calculator1 c1=new Calculator1();
		assertEquals(-2,c1.sub(1, 3));
	}

}
