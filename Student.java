package com.cts.javaTraining;

/**
 * @author 776480
 *
 */
public class Student {
	Student(String name, int rollNo) {
		System.out.println("Name: " + name + "\nRoll Number: " + rollNo);
	}

	public static void main(String[] args) {
		Student std = new Student("john", 2);
	}
}
