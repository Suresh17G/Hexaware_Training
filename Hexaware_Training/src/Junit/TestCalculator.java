package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestCalculator {
	static Calculator calculator;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calculator = new Calculator();
	}
	
	@Disabled
	@Test
	void testadd() {
		 int result = calculator.add(7, -3);
	        assertEquals(4, result,"Addition must be 10");
	}

	@Test
	void testsub() {
		 int result = calculator.sub(-2, -3);
	        assertEquals(1, result);
	}

	@Test
	void testmul() {
		 int result = calculator.mul(2, 3);
	        assertEquals(6, result);
	}

}
