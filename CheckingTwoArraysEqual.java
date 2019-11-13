package com.cts.javaTraining;

/**
 * @author 776480
 *
 */
public class CheckingTwoArraysEqual {
	public static void main(String[] args) {

		int[] Arr = { 2, 5, 7, 9, 11 };
		int[] Arr1 = { 2, 5, 7, 8, 11 };
		int k = -1;

		for (int i = 0; i < Arr.length; i++) {
			if (Arr[i] != Arr1[i]) {
				k = 1;
				break;
			}
		}

		if (k == 1) {
			System.out.println("arrays are equal");
		} else {
			System.out.println("arrays are not equal");
		}
	}

}
