
package com.cts.javaTraining;

import java.util.Scanner;

/**
 * @author 776480
 *
 */
public class ReverseInteger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num to be reversed");
		int n = sc.nextInt();
		while (n > 0) {
			int r = n % 10;
			n = n / 10;
			System.out.print(r);
		}

	}

}
