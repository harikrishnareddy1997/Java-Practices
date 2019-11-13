package com.cts.javaTraining;

/**
 * @author 776480
 *
 */
public class AreaOfRectangle {

	int length = 0;
	int breadth = 0;

	AreaOfRectangle(int length, int breadth) {
		System.out.println("length " + length);
		System.out.println("breadth " + breadth);
		int ar = area(length, breadth);
		System.out.println("Area of rectangle: " + ar);
	}

	public int area(int length, int breadth) {
		return length * breadth;
	}	

	public static void main(String[] args) {

		AreaOfRectangle ar1 = new AreaOfRectangle(4, 5);
		AreaOfRectangle ar2 = new AreaOfRectangle(5, 8);

	}

}
