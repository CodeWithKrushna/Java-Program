package com.iodemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class ConsoleIo
{

	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter a String");
		
	//	Scanner sc = new Scanner( System.in);
		
		InputStreamReader ir = new InputStreamReader(System.in);
		
		BufferedReader bf = new BufferedReader(ir);
		
		String line;
		while((line= bf.readLine())!= null &&(line.length()!=0)) 
		{
			System.out.println("gdg"+line);
		}
	
	}

}
