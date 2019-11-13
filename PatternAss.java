
package com.cts.javaTraining;

/**
 * @author 776480
 * @date 29/10/2019
 *
 */
public class PatternAss {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) //rows
		{
			for (int j = 4; j >= i; j--) {//
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
