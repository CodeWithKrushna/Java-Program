package com.collectionDemo;

import java.util.LinkedList;

public class LinkedListDemo 
{
	//Linked list allowed Duplicate value
	// Linked list is maintaing insertion 
	//

	public static void main(String[] args) 
	{
		LinkedList list =new LinkedList();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(23);
		list.add("A");
		list.add("String");
		list.add("Krushna");
		list.add(2.3);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(true);
		list.addFirst("krushna");
		list.getFirst();
		list.getLast();
		System.out.println(list);
		
		LinkedList list2 =new LinkedList();
		
		list2.add(2);
		list2.add(3);
		list2.add(5);
		list2.add(8);
		list2.add(1);
		System.out.println(list2);
		
		LinkedList<Integer> list3 =new LinkedList();
		
		list3.add(50);
		list3.add(30);
		list3.add(15);
		System.out.println(list3);
		
		
	}

}
