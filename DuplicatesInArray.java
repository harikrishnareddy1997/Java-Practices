
package com.cts.javaTraining;

/**
 * @author 776480
 *
 */
public class DuplicatesInArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 10, 20, 30, 40, 20, 70, 80, 80, 30 };
		int[] arr1 = new int[10];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j] && i != j) {
					arr1[count] = arr[i];
					count++;
				}
			}
		}
		for (int k = 0; k < count; k++) {
			System.out.println(+arr1[k]);
		}

	}

}
