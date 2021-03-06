package com.pederson.junit5examples.nested_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class MathTest {

	@Nested
	class AddTests {
		@Test
		void add() {
			assertEquals(4, Math.add(1, 3));
		}

		@Test
		void addIncorrect() {
			assertEquals(2, Math.add(1, 2));
		}

		@Test
		void addIncorrect2() {
			assertEquals(5, Math.add(1, 2));
		}
	}

	@Nested
	class SubtractTests {
		@Test
		void subtract() {
			assertEquals(3, Math.subtract(7, 4));
		}

		@Test
		void subtractIncorrect() {
			assertEquals(3, Math.subtract(3, 1));
		}

		@Test
		void subtractIncorrect2() {
			assertEquals(5, Math.subtract(3, 1));
		}
	}

}