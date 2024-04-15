package com.stringDemo;

public class StringDemo1 
{
	
	public static void main(String[] args)
	{
		// concat String
		String name1="Krushna";
		String name2="Patil";
		String name3=name1.concat(name2);
		System.out.println(name3);
		
		String name4="Krushna";
		String name5="Patil";
		String name6=name4+name5;
		System.out.println(name6);
		/*using equal()method
		 * equal() method compares two string for equality
		 * it compare the content of the string
		 * it will return true if sting match,else return false*/
		String s="Hell";
		String s1="Hello";
		String s2="Hello";
		System.out.println(s.equals(s1));//false
		System.out.println(s1.equals(s2)); //true

		

	}

}
