package com.cts.javaTraining;
/**
 * @author 776480
 *
 */
public class ConcatUppercaseSubstring {
	public static void main(String[] args) {
		String s1="virat"; 
		String s2="Kohli"; 
		String s3="VIRAT";
		
		//Concat S1,S2.
		System.out.println("String concatenation is :"+s1+s2); //concating s1 and s2 and printing them
		
		//	Compare if S1 and S3 and returns true if equal
		if (s1.equals(s3)) {  
			System.out.println("True");
		} else {                         //checking conditon whether s1 and s3 are equal or not
			System.out.println("False");
		}
		
		//Print the 4th Substring of String S1.
		char ch=s1.charAt(3);  //to check characters in string 
		System.out.println("4Th substring of s1 "+ch); 
		
		//Convert String S1 to uppercase and String S3 to lowercase
		
		System.out.println("String Upper is: "+s1.toUpperCase());//uppercase
		System.out.println("String Lower is:"+s3.toLowerCase());//lowercase
		
		 	
	}

}
