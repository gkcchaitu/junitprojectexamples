package jnit.first;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class GreetingTest {

	
	//Greetings g;
	//@Before
	//public void init(){
	//	g=new Greetings();
	//}
	
	
	
	@Test
	public void testSayHello() {
		Greetings g=new Greetings();
		assertEquals("hello", g.sayHello());
	}

}
