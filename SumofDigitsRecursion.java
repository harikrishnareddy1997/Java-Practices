package com.cts.javaTraining;

/**
 * @author 776480
 *
 */
public class SumofDigitsRecursion {
	static int sum(int n) {
		
		if (n == 0)
			return 0;
		return (n % 10 + sum(n / 10));
	}
	// Driven Program to check above
	public static void main(String args[]) {
		int num = 78963;
		int result = sum(num);
		System.out.println("Sum of digits in " + num + " is " + result);
	}
} 
