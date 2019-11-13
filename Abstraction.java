package com.cts.javaTraining;

/**
 * @author 776480
 *
 */
abstract class Shape{
	abstract void draw();
	
	
}
 class Rectangle extends Shape{
 public void draw() {
	 System.out.println("draw rectangle");
 }
	
}

public class Abstraction {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s= new Rectangle();
		s.draw();
		

	}

}
