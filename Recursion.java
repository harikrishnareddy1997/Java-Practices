package com.cts.javaTraining;

import java.util.Scanner;

/**
 * @author 776480
 *
 */
public class Recursion {
		public int fact(int a) {
			if (a <= 1) {
				return 1;
			} else {
				return a * fact(a - 1);
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		Recursion re = new Recursion();
		int result = re.fact(a);
		System.out.println("Facotrial is: " + result);

	}

}

