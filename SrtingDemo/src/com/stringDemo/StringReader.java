package com.stringDemo;

public class StringReader 
{

	public static void main(String[] args)
	{
		String str = "Krushnakannt Patil";
		int index=3;
		
		if (index<0 || index>= str.length()) 
		{
			System.out.println("Invalid Index");
			
		}
		else 
		{
			System.out.println("The Charater at index is  "+index +" is "+ str.charAt(index));
		}
	}
 
}
