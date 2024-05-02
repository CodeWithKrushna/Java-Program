package com.anudip.jdbc.demo;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayList_Lab 
{

	private static final Comparator<? super Integer> Integer = null;

	public static void main(String[] args) 
	{
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(50);
		arr.add(55);
		arr.add(40);
		arr.add(42);
		arr.add(10);
		arr.add(12);
		arr.add(32);
		arr.add(25);
		arr.add(18);
		arr.add(20);
		arr.add(30);
		arr.add(1);
		
		System.out.println(arr);
		 arr.sort(Integer);
		 System.out.println(arr);
	}

}
