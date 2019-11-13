
package com.cts.javaTraining;

import java.util.Scanner;

/**
 * @author 776480
 *
 */
public class TwoDArray {

	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int b[][] = new int[5][5];
		int c[][] = new int[5][5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbr");
		int n = sc.nextInt();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				b[i][j] = Integer.parseInt(sc.nextLine());
			}
		}

	}

}
