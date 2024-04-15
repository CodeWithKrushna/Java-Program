package com.stringDemo;

public class ImmutableDemo  
{

	public static void main(String[] args) 
	{
		String s1="JAVA";
		String s2="JAVA";
		System.out.println(s1==s2);//true
		
		//System.out.println(s1.concat("J2EE"));//JAVAJ2EE
		
		System.out.println(s1);//JAVA
		
		s1.concat("XYZ");
		System.out.println(s1);
		
				
		
	}

}
