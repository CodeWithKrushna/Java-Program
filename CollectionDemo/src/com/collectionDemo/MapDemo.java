package com.collectionDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) 
	{
		HashSet hSet=new HashSet();
		hSet.add("Krushna");
		
		Map m = new HashMap();
		
		m.put(2, "ktushna");
		m.put("Krushnakant", 2);
		
		//System.out.println(m);
		
		HashMap <Integer , String> HS = new HashMap();
		HS.put(10,"Krushna");
		HS.put(5, "Jaya");
		HS.put(9, "Rohit");
		HS.put(7, null);
		HS.remove(9);
		
		
		
		System.out.println(HS);
		
	
		
		Map m1 = new LinkedHashMap();
		Map m3 = new TreeMap();
	}

}
