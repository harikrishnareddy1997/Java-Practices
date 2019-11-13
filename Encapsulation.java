package com.cts.javaTraining;

/**
 * @author 776480
 *
 */

class Demo {
	private String name;
	private int rollno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

}

public class Encapsulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.setName("hari");
		d.setRollno(12);
		System.out.println(d.getName());
		System.out.println(d.getRollno());
		
	}

}
