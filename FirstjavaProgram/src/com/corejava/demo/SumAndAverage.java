package com.corejava.demo;
import java.util.*;
public class SumAndAverage {

	public static void main(String[] args)
	{
	
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the First Number");
		System.out.println("Enter the Second Number");
		System.out.println("Enter the Third Number");
		System.out.println("Enter the Fourth Number");
		System.out.println("Enter the Fifth Number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int sum=a+b+c+d+e;
		int avg=sum/5;
		System.out.println("Sum="+sum);
		System.out.println("Average of Sum :-"+avg);

	}

}
