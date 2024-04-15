package com.collectionDemo;
// shorted key 
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) 
	{
		TreeMap< Integer , String> Tm=new TreeMap< Integer , String>();
		
		Tm.put(10, "Omkar");
		Tm.put(10, "Krushnakant");// Duplicate Key is not allowed
		Tm.put(8, "Tushar");
		Tm.put(5, "sukesh");
		Tm.put(1, "Nishant");
		Tm.put(20, "Sagar");
		Tm.put(15, "Omkar");
		Tm.put(13, null); // 
		Tm.put(14, null);
		Tm.put(22, "kalpesh");
		
		System.out.println(Tm);
	}

}
