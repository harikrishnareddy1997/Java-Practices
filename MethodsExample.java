package com.cts.javaTraining;

public class MethodsExample {
	public void Add(int a, int b) {
		int c = a + b;
		System.out.println("addition is: " + c);
	}

	public void sub(int a, int b) {
		int c = a - b;
		System.out.println("substraction is: " + c);
	}

	public void multiply(int a, int b) {
		int c = a * b;
		System.out.println("Multiplication is:" + c);
	}
 
	public void division(int a, int b) {
		int c = a / b;
		System.out.println("Division: "+c);
	}

	public static void main(String[] args) {
		MethodsExample m = new MethodsExample();
		m.Add(4, 2);
		m.sub(9, 10);
		m.multiply(9, 2);
		m.division(2, 5);
	}
}
