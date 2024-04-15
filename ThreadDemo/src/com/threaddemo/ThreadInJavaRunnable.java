package com.threaddemo;
//new state- runnable state- running state -blocks state - dead
//2nd way to create the thraed by implementing Runnable interface
class threadFirst implements Runnable
 {

	@Override
	public void run()
	{
		for (int i= 0;i<=5;i++) 
		{
			System.out.println("Thread One = "+i);
		}
		
	}
	 
 }
class threadSecond implements Runnable
{

	@Override
	public void run()
	{
		for (int i= 0;i<=5;i++) 
		{
			System.out.println("Thread Two = "+i);
		}
		System.out.println("my name is main thread");
		
	}
	 
}

public class ThreadInJavaRunnable 
{

	public static void main(String[] args) 
	{
		threadFirst t1 = new threadFirst();
		Thread t=new Thread(t1);
		t.start();
		
		//t1.run();
		threadSecond t2=new threadSecond();
		Thread tt1=new Thread(t2);
		//t2.run();
		tt1.start();
		
		
	}

}
