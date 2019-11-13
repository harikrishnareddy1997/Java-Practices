
package com.cts.javaTraining;

/**
 * @author 776480
 *
 */
import java.util.Scanner;

public class AverageofArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[7];
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		double average = sum / num.length;
		System.out.println("Average value of the array elements is : " + average);
	}
}
