package com.corejava.demo;

public class ArrayInJava08 
{
	static void methodOne(double d[]) 
	
{
		d[2]=25.35;
		d[5]=45.35;
		
}

	public static void main(String[] args) 
	
	{
		double[] d=new double[8];
		d[2]=10.35;  // change the valu of 2
		d[5]=15.35;   //change the valu of 2
		
		methodOne(d); // passing array of element method 
		System.out.println(d[2]);
		System.out.println(d[5]);

	}

}
