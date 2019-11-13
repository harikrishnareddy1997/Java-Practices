package com.cts.javaTraining;

/**
 * @author 776480
 *
 */

public class PrinMtrix {

	public static void main(String[] args) {
		String[][] matrix = new String[10][10];
		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = "_ ";
			}
		}

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

	}
}
