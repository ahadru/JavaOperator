package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.ArithmeticOperators;

class OperatorTest {
	
	
	
	@Test
	void arithmeticOperatorTest() {
		ArithmeticOperators ao = new ArithmeticOperators();
		
		assertEquals(10,ao.add(5, 5));
		assertEquals(2,ao.sub(8, 6));
		assertEquals(40,ao.mul(8, 5));
		assertEquals(2,ao.div(16, 8));
		assertEquals(2,ao.sub(8, 6));
		assertEquals(2,ao.sub(7, 5));
	}
	
	@Test
	void logicalOperatorTest() {
		
	}
	
	@Test
	void bitwiseOperatorTest() {
		
	}

}
