
package com.cts.javaTraining;

import java.util.Scanner;

/**
 * @author 776480
 *
 */
public class Patterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int rows = sc.nextInt();

		for (i = 1; i <= rows; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("1 ");
			}
			System.out.println();

		}

	}
}