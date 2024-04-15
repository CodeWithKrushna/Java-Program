package com.collectionDemo;

import java.util.LinkedList;

public class LinkedSetDemo {

	public static void main(String[] args) 
	{
		LinkedList LList= new LinkedList();
		
		LList.add(1);
		LList.add(1);
		LList.add(500);
		LList.add(0);
		LList.add("Krushnakant");
		LList.add(null);
		LList.add(null);
		LList.add(1);
		LList.add(true);
		LList.add(false);
		LList.add(100);
		
		LList.add(3, "Tejas");  // add a index no 3 
		
		LList.addFirst(2000);
		LList.addLast(LList);
		System.out.println(LList);
		
		
	}

}
