package com.threaddemo;
class Customer 
{
	int amount=10000;
	synchronized void withdraw (int amount) 
	{
		System.out.println("Going to Withdeaw.......");
		if(this.amount<amount);
		{
			System.out.println("Less Balance; Waiting for Deposit");
			
		}
		this.amount=this.amount-amount;
		System.out.println(Thread.currentThread().getName()+" "+ this.amount);
		System.out.println("Withdraw completed.");
	}
	synchronized void deposit(int amount) 
	{
		System.out.println("Going to  Deposit.....");
		this.amount=this.amount+amount;
		System.out.println(Thread.currentThread().getName()+" "+ this.amount);
		System.out.println("Deposit Completed");
	}
}
public class WaitNotifyDemo
{

	public static void main(String[] args) 
	{
		final Customer cus =new Customer();
		new Thread() 
		{
			public void run() 
			{
				cus.withdraw(15000);
			}
			
		}.start();
		
		new Thread() 
		{
			public void run() 
			{
				cus.deposit(2000);
			}
			
		}.start();
	}

}
