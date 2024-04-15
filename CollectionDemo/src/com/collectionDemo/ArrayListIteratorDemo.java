package com.collectionDemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIteratorDemo 
{

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		list.add("JVM");
		list.add("JDK");
		list.add("JRE");
		list.add("ABC");
		list.add("XYZ");
		
		
		//Traversing list element using Iterator
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) 
		{
			System.out.println("1 "+iterator.next());
			
		}
		
		// Traversing list element using List Iterator
		
		ListIterator<String> listIterator =list.listIterator();
		while(listIterator.hasNext()) 
		{
			System.out.println("2 "+listIterator.next());
		}
		
		while(listIterator.hasPrevious()); 
		{
			System.out.println("3 "+list);
			System.out.println("4 "+listIterator.previous());
			
		}
	}
}