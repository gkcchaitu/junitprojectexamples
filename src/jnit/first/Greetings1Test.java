package jnit.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class Greetings1Test {

	@Test
	public void testSayHello1() {
		Greetings1 g1=new Greetings1();
		assertEquals("hello",g1.sayHello1());
	}

}
