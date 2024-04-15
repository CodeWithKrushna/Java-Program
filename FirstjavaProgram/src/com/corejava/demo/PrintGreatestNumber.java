package com.corejava.demo;
import java.util.*;
public class PrintGreatestNumber 
{
	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any  3 Number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if (c>b & c>a) // 30>20&30>10
			System.out.println(" Greatest Number is := "+c);
		else if (b>a)//20>10
			System.out.println(" Greatest Number is := "+b);
		else
			System.out.println(" Greatest Number is := "+a);
		
		
	}

}
