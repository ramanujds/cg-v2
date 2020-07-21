package com.cap.demos;

@FunctionalInterface
public interface MathOperation {

	int operate(int x, int y);
	
	default void defaultMethod() {
		System.out.println("Default Method Called...");
	}
	static void staticMethod() {
		System.out.println("Static Method Called...");
	}
}
