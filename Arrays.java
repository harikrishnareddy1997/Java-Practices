
package com.cts.javaTraining;

import java.util.Scanner;

/**
 * @author 776480
 *
 */
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int a[]=new int[5];
		System.out.println("input:");
		for(int i=1;i<=n;i++) {
			a[i]=Integer.parseInt(sc.nextLine());
		}
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.print(sum);
			
		}

}
