/**
 * @author 776480
 * @
 */
package com.cts.javaTraining;

import java.util.Scanner;

public class PostiveOrNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check");
		int a = sc.nextInt();
		if (a >= 0) {
			System.out.println("this is positive number--> " + a);

		} else {
			System.out.println("this is negative number--> " + a);
		}
	}

}
