package com.collectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class Iterator_Lab {

	public static void main(String[] args)
	{
		HashSet<String> Hset = new HashSet<String>();
		Hset.add("Krushna");
		Hset.add("Omkar");
		Hset.add("Sukesh");
		Hset.add("Jyesh");
		Hset.add("Nishant");
		Hset.add("Akshay");
		Hset.add("Pushkar");
		
		Iterator<String> iterator = Hset.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		

	}

}
