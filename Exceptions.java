package com.cts.javaTraining;

/**
 * @author 776480
 *
 */
public class Exceptions {
	public static void main(String[] args) {
		int a = 15;
		float b = 0;
		float rs;
		try {
			// Statement 1
			rs = a / b; // Statement 2
			System.out.print("\n\tThe result is : " + rs);
		} catch (ArithmeticException Ex) {
			System.out.print("\n\tError : "+Ex);
		} 
		finally {
			System.out.print("\n\tEnd of program.");
		}
		
	}
}
