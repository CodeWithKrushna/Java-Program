package com.corejava.demo;

public class ForEachLoop {

	public static void main(String[] args) {
		int[] marks= {12,4,5};
		//for-Each Loop
		System.out.println("Using a For Each Loop");
		for(int a : marks )  //a=0;a<marks;a++
		{
			System.out.println(a);
		}

	}

}
