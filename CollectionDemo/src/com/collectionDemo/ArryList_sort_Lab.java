package com.collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArryList_sort_Lab {

	public static void main(String[] args)
	{
		ArrayList<Integer> Alist = new ArrayList<Integer>();
		
		Alist.add(50);
		Alist.add(45);
		Alist.add(42);
		Alist.add(55);
		Alist.add(10);
		Alist.add(40);
		Alist.add(20);
		Alist.add(30);
		Alist.add(15);
		Alist.add(25);
		Alist.add(5);
		Alist.add(1);
		
		// sort the ArrayList in ascending order
		Collections.sort(Alist);
		
		
		System.out.println("Sorted ArrayList: "+Alist);
	}
	

}
