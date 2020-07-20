package com.capg.demos;

public class FactorialFinder {

	public int facto(int n){
		if(n<0) {
			throw new NegativeNumberException("Value cannot be less than zero");
		}
		int f=1;
		while(n!=0) {
			f*=n;
			n--;
		}
		return f;
	}
}
