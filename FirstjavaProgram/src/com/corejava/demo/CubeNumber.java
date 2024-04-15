package com.corejava.demo;
import java.util.*;
public class CubeNumber {

	public static void main(String[] args)
	{
	
		int cube;
		System.out.println("Enter a Number, which you Find Cube");
		Scanner sc=new Scanner(System.in);
		cube=sc.nextInt();
		int result=cube*cube*cube;
		System.out.println("You Enter a Number  is "+ cube+" And Cube is:= " +result);
		
		

	}

}
