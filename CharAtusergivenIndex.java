package com.cts.javaTraining;

import java.util.Scanner;

/**
 * @author 776480
 *
 */
public class CharAtusergivenIndex {

	public static void main(String[] args) {
		String s = "Java Exercises";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index number: ");
		int index1 = sc.nextInt();
		int index2 = sc.nextInt();
		System.out.println("The character at position" + index1 + "is: " + s.charAt(index1));
		System.out.println("The character at position" + index2 + "is: " + s.charAt(index2));
	}
}
