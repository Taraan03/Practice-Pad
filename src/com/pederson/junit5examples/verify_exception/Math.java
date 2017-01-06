package com.pederson.junit5examples.verify_exception;

public class Math {

	public static int add(int a, int b) {
		return a + b;
	}

	public static int subtract(int a, int b) {
		return a - b;
	}

	public static double divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("cannot divide by zero");
		}

		return (double) a / (double) b;
	}

}
