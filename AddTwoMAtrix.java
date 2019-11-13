package com.cts.javaTraining;

import java.util.Scanner;

/**
 * @author 776480
 *
 */
public class AddTwoMAtrix {

	public static void main(String[] args) {

		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		int c[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Give The Numbers for 1st Matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Give Numbers for 2 matrix");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println("");

			{

			}
		}

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Adding two matrices : ");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print((a[i][j] + b[i][j]));
			}
			System.out.println();
		}
	}

}
