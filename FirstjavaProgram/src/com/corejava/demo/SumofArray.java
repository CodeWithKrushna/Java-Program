package com.corejava.demo;

import java.util.Scanner;

//import java.util.*;

public class SumofArray {

	public static void main(String[] args)
	{
	/*
		int[] a= {1,2,3,4,5};
		int sum=0;
		 for(int i=0;i< a.length;i++) 
		 {
			sum+=a[i];
			
		 }
		 System.out.println("The sum of the Array Element of= "+sum);
	*/
		// array declaretion 
		// int [];
		//int a[];
		//int[] a=new int [10];
		// Another Way
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Tha Size of Array:-");
		int a=sc.nextInt();
		int [] b = new int[a];
		System.out.println("Enter the Element of Array:-");
		for(int i=0;i<a;i++)
		{
			b[i] =sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a;i++) 
		{
			sum+=b[i];
			
		}
		System.out.println("Sum of The Array Element="+sum);
		

	}

}
