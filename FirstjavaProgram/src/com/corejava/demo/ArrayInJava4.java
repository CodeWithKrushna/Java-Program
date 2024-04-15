package com.corejava.demo;

public class ArrayInJava4
{

	public static void main(String[] args) 
	{
		int[] a= {12,21,1,70,5};
		int []b=a.clone(); // copy of the a variable using clone()variable 
		for (int i=0;i<b.length;i++) 
		{
			System.out.println(b[i]);
		}
		a[2]=10;
		System.out.println(a[2]);
		b[4]=100;
		System.out.println(b[4]);
	}

}
