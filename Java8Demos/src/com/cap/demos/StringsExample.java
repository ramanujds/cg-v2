package com.cap.demos;

public class StringsExample {

	public static void main(String[] args) {
		
		String str1="rahul";
		String str2="pritam";
		String str3="";
		//str2.chars().filter(c->!str1.contains(String.valueOf((char)c))).forEach(c->System.out.print((char)c));
		
		for(char c:str2.toCharArray()) {
			if(!str1.contains(""+c)) {
				str3+=c;
			}
		}
		
		System.out.println(str3);
		
		//pitm
	}
}
