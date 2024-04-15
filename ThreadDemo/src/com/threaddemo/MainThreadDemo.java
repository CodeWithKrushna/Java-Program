package com.threaddemo;
// u can change the main method name
public class MainThreadDemo {

	public static void main(String[] args) 
	{
		//Thread t=Thread.currentThread();
		//t.setName("heyy I am Main Thread");
		//System.out.println(t.getName());
		
		//Thread.currentThread().setName("Mai main thread hu");
		//System.out.println(Thread.currentThread().getName());
		
		//System.out.println(Thread.currentThread().getName());
		
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		
		System.out.println(Thread.currentThread().getPriority());
		
	}

}