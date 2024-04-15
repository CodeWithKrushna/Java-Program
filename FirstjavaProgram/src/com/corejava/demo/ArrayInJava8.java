package com.corejava.demo;

import java.util.Arrays;

public class ArrayInJava8 {

	public static void main(String[] args) 
	{
		//using copyOf()method
		int a[]= {5,10,15,20,25,30};
		int b[]=Arrays.copyOf(a, 3);
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]+ " ");
		}
		
		System.out.println("==============");
		for(int j=0;j<b.length;j++) 
		{
			System.out.println(b[j]);
		}

	}

}
