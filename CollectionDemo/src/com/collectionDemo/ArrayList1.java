package com.collectionDemo;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args)
	{
ArrayList list=new ArrayList();
		
		list.add(5);
		list.add("krushna");
		list.add(true);
		list.add(2.3f);
		list.add(0);    //it's allowed duplicate elements.
		list.add(null);
		list.add(0);
		list.add(null);//duplicate unll value are also allowed
		list.add(0);
		list.add(null);
		list.add(0);
		list.add(null);
		
		System.out.println(list);
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("abc");
		list2.add("jdk");
		list2.add("jvm");
		list2.add("jvr");
		
		System.out.println("1 "+list2.size());
		
		list2.add("123");
		list2.add("456");
		
		System.out.println("2 "+list2.size());
		
		list2.remove(1);
		System.out.println(list2);
		System.out.println("3 "+list2.size()); // return size of arraylist 5 
		
		System.out.println("4 "+list2.get(3)); // get the return string o/p 123
		
		System.out.println("5 "+list2.clone());// Returns a shallow copy of this ArrayList  
		System.out.println("6 ");list2.clear();//Removes all elements from this list. The list willbe empty after this call returns.
		System.out.println("7 ");
		
		ArrayList<Integer> list3=new ArrayList<Integer>();
		
		list3.add(10);
		list3.add(20);
		list3.add(10);
		list3.add(20);
		list3.add(30);
		list3.add(50);
		list3.add(1);
		list3.add(20);
		
		System.out.println(list3);
		
		System.out.println("8 ");

	}

}

/*
iterable

<<extends>>

collection

<<extends>>

list

<<implements>>

abstractlist

<<ectends>>

arraylist*/

/*Java ArrayList class uses a dynamic array for storing the 
 * elements. It is like an array, but there is no size limit.
 *  We can add or remove elements anytime. 
 *  So, it is much more flexible than the traditional array.
 *  t inherits the AbstractList class and implements List interface.

Java ArrayList class can contain duplicate elements.
Java ArrayList class maintains insertion order.
Java ArrayList allows random access because the array works on an index basis.
*/
/* iteration is a technique used to sequence through a block 
 * of code repeatedly until a specific condition either exists or no longer exists.
 *  Iterations are a very common approach used with loops.*/

