package com.threaddemo;
//1 way of creating the thread by extendng Thread Class
//ThreadOne is a Thread

class ThreadOne extends Thread
//(internally implemnts runnable)
{
	@Override
	public void run() 
	{
		for (int i= 0;i<=5;i++) 
		{
			System.out.println("Thread one= "+i);
		}
		
	}
}
class ThreadTwo extends Thread
{
	@Override
	public void run() 
	{
		for (int i= 0;i<=5;i++) 
		{
			System.out.println("Thread Two= "+i);
		}
		
	}
}
public class ThreadInJava 
{

	public static void main(String[] args)
	{
		ThreadOne t1 = new ThreadOne();
		ThreadTwo t2 = new ThreadTwo();
		//t1.start();
		//t2.start(); //  start method use kiya to wo multithread jaise work karega
		t1.run();// run method use kiya to wo multithread jaise work nhi karega wo single thread jaise hi work karega
		t2.run();
	}

}
