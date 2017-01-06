package com.pederson.junit5examples.verify_exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MathTest {
	@Test
	void divide() {
		Exception ex = assertThrows(IllegalArgumentException.class,
				() -> Math.divide(4, 0));

		assertEquals("cannot divide by zero", ex.getMessage());
	}

/**
	@Test(expected = IllegalArgumentException.class)
	void oldWay() {

		someOtherMethod(); // Throws another IllegalArgumentException
						// Can't assert message this way

		Math.divide(2, 0);
	}
*/

}