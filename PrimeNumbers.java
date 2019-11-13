package com.cts.javaTraining;

/**
 * @author 776480
 */
import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		// Corner case
		boolean flag = true;
		// Check from 2 to n-1
		if (n <= 1) {
			System.out.println(n + "is not a prime");

		} else {

			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					flag = false;
					break;

				} else {
					flag = true;
				}

			}
			if (flag) {
				System.out.println(n + " is a prime number");
			} else {
				System.out.println(n + " not a prime number");
			}
		}
	}
}
