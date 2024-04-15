package com.corejava.demo;
//method return in array  Primitive type:
public class ArrayInJava10 
{
	static int[] methodOne() 
	{
		int[] a=new int[8];
		a[2]=10;
		a[3]=20;
		return a;
	}

	public static void main(String[] args) 
	{
		int[] a=methodOne();
		System.out.println(a[2]);
		System.out.println(a[3]);
		
	}

}
