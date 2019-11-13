package com.cts.javaTraining;

/**
 * @author 776480
 *
 */
public class CheckingInArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 43, 32, 53, 23, 12, 34, 3, 12, 43, 32 };
		int k = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == Integer.parseInt("23")) {
				k = 1;
				break;
			}

		}
		if (k == 1) {
			System.out.println("23 is Present");
		} else {
			System.out.println("23 is Absent");
		}

	}

}
