/**
 * @author 776480
 * @
 */
package com.cts.javaTraining;
import java.util.Scanner;

public class ControlStatements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num>=10 && num<100)
		{
			System.out.println("its a 2 digit number"+num);
			
		}
		else if(num>=100 && num<100) {
			System.out.println("its a 3 digit number"+num);
			
		}
		else if(num==0 && num <10)
		{
			System.out.println("its below one digit");
		}
		else if(num<0)
		{
			System.out.println("negative numbers");
		}
		else {
			System.out.println("number greater than 3 digits");
		}
	}

}
