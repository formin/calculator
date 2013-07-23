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

	@Test
	public void calculator2(){
		String s = "1";
		int result = cal.calculator(s);  
		assertEquals(1,result); 
	}

	@Test
	public void calculator3(){
		String s = "1,2";
		int result = cal.calculator(s);  
		assertEquals(3,result); 
	}

	@Test
	public void calculator4(){
		String s = "1,2,3";
		int result = cal.calculator(s);  
		assertEquals(6,result); 
	}

	@Test
	public void calculator5(){
		String s = "1,2\n3";
		int result = cal.calculator(s);  
		assertEquals(6,result); 
	}

	@Test
	public void calculator6(){
		String s = "//;\n1;2;3";
		int result = cal.calculator(s);  
		assertEquals(6,result); 
	}

	@Test
	public void calculator7(){
		String s = "-1,2,3";
		int result = cal.calculator(s);  
		assertEquals(4,result); 
	}
	
}
