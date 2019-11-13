package com.cts.javaTraining;

/**
 * @author 776480
 *
 */
public class SumValuesOfArray {

	public static void main(String[] args) {

		int Arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;

		for (int i = 0; i < Arr.length; i++) {
			sum = sum + Arr[i];
		}
		System.out.println("sum of values is " + sum);

	}

}
