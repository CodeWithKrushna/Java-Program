package com.collectionDemo;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) 
	{
		TreeSet Tset=new TreeSet();
		
		Tset.add(12);
		//Tset.add("Krushna"); // string are not allowed
		Tset.add(12); // duplicate are not allowed
		//Tset.add(2.5);
		Tset.add(22);
		Tset.add(152);
		Tset.add(10);
		Tset.add(100);
		//Tset.add(null);
		//Tset.add(null);
		//Tset.add(true);
		//Tset.add(false);
		
		TreeSet<String> Tset1=new TreeSet(); // only enter a string data

		Tset1.add("Krushna");
		Tset1.add("Abhishek");
		Tset1.add("Rohit");
		Tset1.add("Dannya");
		Tset1.add("Hardik");
		Tset1.add("Krushna"); // duplicate are not  allowed  
		
		
		TreeSet<Float> Tset2=new TreeSet();
		
		Tset2.add(2.3f);
		Tset2.add(3.5f);
		Tset2.add(10.8f);
		Tset2.add(63.4f);
		Tset2.add(33.9f);
		//Tset2.addFirst(10.5f);
		//Tset.addLast(100.3f);
		

		
		System.out.println(Tset);
		System.out.println(Tset1);
		System.out.println(Tset2);
		
	}
	

}
