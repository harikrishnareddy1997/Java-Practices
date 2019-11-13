package com.cts.javaTraining;

/**
 * 
 * @author 776480
 *
 */
// Using Recursion
public class FibonacciRecursion {
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		return fib(n - 2) + fib(n - 1);
	}

	public static void main(String args[]) {
		int Number = 10;
		System.out.print("Fibonacci Series of " + Number + " numbers: ");
		for (int i = 1; i < Number; i++) {
			System.out.print(fib(i) + " ");
		}
	}
}
