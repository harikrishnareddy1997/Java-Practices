package com.cts.javaTraining;

import java.util.Scanner;

/**
 * @author 776480
 *
 */
public class Palindrome {

	public static void main(String[] args) {
		// write your code here
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String st1 = s.nextLine(); //input string 
		StringBuilder sb = new StringBuilder(st1); //assigning string builder for 1st string
		String st2 = String.valueOf(sb.reverse());
		if (st1.equals(st2)) {  //checking palindrome condition 
			System.out.println("palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}
}