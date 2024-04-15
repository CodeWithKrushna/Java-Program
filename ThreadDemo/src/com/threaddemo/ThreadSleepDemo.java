package com.threaddemo;

class Sleepdemo extends Thread
{

	@Override
	public void run() 
	{
		for(int i =1; i<=5; i++) 
		{
			System.out.println(i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
public class ThreadSleepDemo
{

	public static void main(String[] args)
	{
		Sleepdemo sl = new Sleepdemo();
		sl.start();
	}

}
