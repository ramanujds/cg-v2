package com.cap.demos;

public class Calculator {
	
	public static int calculate(int a, int b,MathOperation op) {
		return op.operate(a, b);
	}

public static void main(String[] args) {
		
	MathOperation add=(x,y)->x*y+x+y;
	
		int result=calculate(5, 6,add );
		
		add.defaultMethod();
		MathOperation.staticMethod();
		
		System.out.println(result);
		
	}
	
}
