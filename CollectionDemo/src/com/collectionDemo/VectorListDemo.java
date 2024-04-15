package com.collectionDemo;

import java.util.Vector;

public class VectorListDemo 
{

	public static void main(String[] args) 
	{
		Vector vector =new Vector();
		
		vector.add("vector");
		vector.add(1);
		vector.add(true);
		vector.add(null);
		vector.add(2.3);
		vector.add("vector");
		vector.add(1);
		vector.add("vector");
		vector.addFirst(50);
		vector.addLast(null);
		vector.getFirst();
		
		
		System.out.println(vector);
		

	}

}
