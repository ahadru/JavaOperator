package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.ArithmeticOperators;
import main.BitwiseOperator;
import main.LogicalOperator;

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
		LogicalOperator lo = new LogicalOperator();
		
		assertEquals(true,lo.or(true, false));
		assertEquals(false,lo.and(true, false));
		assertEquals(false,lo.not(true));
		assertEquals(true,lo.xor(true, false));
		
	}
	
	@Test
	void bitwiseOperatorTest() {
		BitwiseOperator bo = new BitwiseOperator();
		
		assertEquals(3,bo.or(1, 3));
		assertEquals(1,bo.and(1, 3));
		assertEquals(-4,bo.not(3));
		assertEquals(2,bo.xor(1, 3));
		assertEquals(10,bo.leftShift(5, 1));
		assertEquals(2,bo.rightShift(5, 1));
		
	}

}
