package com.corejava.demo;
import java.util.*;
public class AverageArray {

	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Tha Size of Array:-");
		int a=sc.nextInt();
		int [] b = new int[a];
		int avg=0;
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
		//System.out.println("Sum="+sum);
		avg=sum/a;
		System.out.println("Average is array Element:="+avg);
		
		

	}

}
