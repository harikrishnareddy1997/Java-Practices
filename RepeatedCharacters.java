package com.cts.javaTraining;

import java.util.Scanner;

/**
 * @author 776480
 *
 */
public class RepeatedCharacters {
	public static void main(String[] args) {
		// write your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine(); // input string
		for (int i = 0; i < s.length(); i++) { // takes the length of string loops within the length
			for (int j = i + 1; j < s.length(); j++) { // assign that string to j by incrementing
				if (s.charAt(i) == s.charAt(j)) {
					System.out.println(s.charAt(j));
					break;
				}
			}
		}
	}
}
