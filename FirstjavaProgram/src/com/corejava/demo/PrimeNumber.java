package com.corejava.demo;

public class PrimeNumber 
{

	public static void main(String[] args)
	{
		
		System.out.println("Prime Number Between 1 TO 1000");
		for (int i=2; i<1000;i++)
		{
			boolean isPrime=true;
			
			for (int j=2; j<i; j++) 
			{
				if(i%j==0) 
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime) 
			{
				System.out.println(i);
			}
			
		}

	}

}
