package com.collectionDemo;

import java.util.LinkedList;

public class LinkList_Lab 
{

	public static void main(String[] args) 
	{
		 LinkedList<String> LL= new LinkedList<String>();
		
		 LL.add("JAVA");
		 LL.add("Programming");
		 LL.add("RED");
		 LL.add("YELLO");
		 LL.add("GREEN");
		 LL.add("BLACK");
		 LL.add("KALPESH");
		 LL.add("OMKAR");
		 LL.add("KRUSHNKANNT");
		 
		 //Original link list Print
		 System.out.println("Original link list"+ LL);
		
		 
		 //first Occurrence Display
		 System.out.println("first Occurrence:- "+LL.getFirst());
		 
		 //last Occurrence Display
		 System.out.println("Last Occurrence:- " +LL.getLast());
	}

}
