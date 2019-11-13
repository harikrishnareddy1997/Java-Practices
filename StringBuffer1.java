package com.cts.javaTraining;

import java.util.Scanner;

/**
 * @author 776480
 *
 */
public class StringBuffer1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		String str1 = "example.com";
		StringBuffer sb = new StringBuffer(str1);//passing string as a argument
		if (str.equals(str1)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
