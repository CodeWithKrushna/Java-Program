package com.collectionDemo;
//Duplicate value Are not Allowd
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo

{

	public static void main(String[] args) 
	{
		Set se=new LinkedHashSet();
		se.add(1);
		se.add("krushna");
		se.add("krushna");
		se.add("krushna");
		se.add(null);
		se.add(1);// duplicate are not allowed
		se.add(1);
		se.add(1);
		se.add(8.1);
		se.add(true);
		se.add(14435);
		se.add(100);
		
		System.out.println(se);
		
		System.out.println(se.removeAll(se));
		
		System.out.println(se);
		
		
		
	}

}
