package com.capg.demos;

public class App {
	
	public static void main(String[] args) {
		
		int n=-5;
		int fact;
		FactorialFinder f=new FactorialFinder();
		try {
		fact=f.facto(n);
		System.out.println("Factorial = "+fact);
		}
		catch (NegativeNumberException e) {
			e.printStackTrace();
		}
		
	}

}
