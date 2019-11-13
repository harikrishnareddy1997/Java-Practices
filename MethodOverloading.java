package com.cts.javaTraining;

/**
 * @author 776480
 *
 */
class Sum
{
	public int Sum(int a,int b) {
		return a+b;
	}
	public float Sum(float a,int b)
	{
		float c=a+b;
		return c;
		
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s=new Sum();
		System.out.println(s.Sum(10, 11));
		System.out.println(s.Sum(20.6f, 2));

	}

}
