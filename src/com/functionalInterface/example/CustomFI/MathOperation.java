package com.functionalInterface.example.CustomFI;


/*
 * Create a functional interface MathOperation that takes two integers and returns an integer.
 * Implement this interface using a lambda expression for addition, subtraction, multiplication, and division operations.
 */

@FunctionalInterface
public interface MathOperation<Integer> {
	
	Integer operation(Integer input1, Integer input2);
	
}
