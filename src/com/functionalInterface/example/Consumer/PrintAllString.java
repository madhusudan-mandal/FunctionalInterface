package com.functionalInterface.example.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * Write a program that uses Consumer<String> to print each string from a list of strings in uppercase.
 * 
 */

public class PrintAllString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Apple", "Banana", "Cherry", "Pineapple", "Grapes", "Pomegrate");
		
		Consumer<String> consumer = (a)-> System.out.println(a.toUpperCase());
		
		for(String s:list)
			consumer.accept(s);
	}

}
