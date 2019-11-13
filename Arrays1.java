package com.cts.javaTraining;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 776480
 *
 */
public class Arrays1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Arr = new int[10];
		for (int i = 0; i < 10; i++)
		{
			Arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(Arr));
	}
}
