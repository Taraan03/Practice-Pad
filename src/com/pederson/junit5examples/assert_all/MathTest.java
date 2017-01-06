package com.pederson.junit5examples.assert_all;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathTest {
	@Test
	void add() {
		assertAll("adding",
				() -> assertEquals(4, Math.add(1, 3)),
				() -> assertEquals(2, Math.add(1, 3)),
				() -> assertEquals(5, Math.add(1, 3))
		);
	}

	@Test
	void subtract() {
		assertAll("subtracting",
				() -> assertEquals(4, Math.subtract(7, 3)),
				() -> assertEquals(2, Math.subtract(6, 3)),
				() -> assertEquals(5, Math.subtract(7, 3))
		);
	}

}