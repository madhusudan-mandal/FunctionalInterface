package com.functionalInterface.example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Test";
		StringOperation<String> so = (s1)-> s1.toUpperCase();
		
		System.out.println("Oroginal string: " + s);
		System.out.println("After applying operation: "+so.toUpperCase(s));
	}

}
