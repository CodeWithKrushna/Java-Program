package com.corejava.demo;
//method return in array  Derive type:
class AB
{
	int i;
}
public class ArrayInJava11
{
	static AB[] methodOne()
	{
		AB[] a=new AB[8];
		a[2]=new AB();
		a[5]=new AB();
		a[2].i=10;
		a[5].i=20;
		return a;
		
		
	}

	public static void main(String[] args) 
	{
		
		AB[] a=methodOne();
		System.out.println(a[2]);
		System.out.println(a[5]);
		System.out.println();

	}

}
