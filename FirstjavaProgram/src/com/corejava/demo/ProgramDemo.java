package com.corejava.demo;
import java.util.*;
public class ProgramDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The alphabet");
		String input=sc.next().toLowerCase(); //A-a
		
		//input=a
		boolean upperCase=input.charAt(0)>=65 && input.charAt(0)<=90;
		boolean lowerCase=input.charAt(0)>=97 && input.charAt(0)<=122;
		boolean vowels=input.equals("a") || input.equals("e") ||input.equals("i")||input.equals("o")||input.equals("u");	
		
		if(input.length()>1) 
		{
		
			System.out.println("Error Not a Single Character");
			
		}
		else if(!(upperCase || lowerCase)) 
		{
			System.out.println("Error Not a Letter Upsercase or LowerCase");
		}	
		else if (vowels) 
		{
			System.out.println("Input Latter is Vowel");
			
			
		}
		else 
		{
			System.out.println("Input Letter is Consonant");
		}
		
		
	}

}
