package net.slipp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator cal;
	
	@Before
    public void setup() {
		cal = new Calculator();
    }
	
	@Test
	public void add() {
		int result = cal.add( 7, 3 ); 
		assertEquals(10,result);
	}
	
	@Test
	public void subtract(){ 
		int result = cal.subtract(7,3);
		assertEquals(4,result); 
	}
	 

	@Test
	public void calculator1(){
		String s = "";
		int result = cal.calculator(s);  
		assertEquals(0,result); 
	}
}
