package com.corejava.demo;

public class ContinuneBreakDemo {

	public static void main(String[] args) 
	{
	
		for (int i=0;i<10;i++)
		{
			if(i==5)
				continue;
			System.out.println("i = "+i);
		}
	}

}
