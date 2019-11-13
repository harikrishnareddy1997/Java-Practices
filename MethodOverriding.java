package com.cts.javaTraining;

/**
 * @author 776480
 *
 */
class company {
	public void Address() {
		System.out.println("This is company address");
	}
}

class amazon extends company {
	public void Address() {
		System.out.println("this is amazon address");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		company c = new amazon();
		c.Address();
		company a = new company();
		a.Address();

	}

}
