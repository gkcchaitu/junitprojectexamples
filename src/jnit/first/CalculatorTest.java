package jnit.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		Calculator c=new Calculator();
		assertEquals("Result",5,c.add(3,3));
	}

	@Test
	public void testSub() {
		Calculator c=new Calculator();
		assertEquals("Result",20,c.sub(100,80));
	}

}
