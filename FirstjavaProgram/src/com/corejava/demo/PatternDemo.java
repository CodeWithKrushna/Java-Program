package com.corejava.demo;

public class PatternDemo
{

	public static void main(String[] args)
	
	{
		int rows=4;
		//outer for loop
		for(int i=1;i<=rows;i++) 
		{
			//inner loop
			for(int j=1;j<=i;j++) 
			{
				System.out.print(i+" ");
			}
			//move to the next line after each row 
			System.out.println();
		}
		
	}

}
