package com.threaddemo;

class MyThread extends Thread
{
	@Override // (method Overriding)
	public void run() 
	{
		System.out.println("This is my Task !!!");
	}
	
}
public class ThreadNameDemo {

	public static void main(String[] args) 
	{
		MyThread th = new MyThread();
		th.start();
		th.setName("Krushna"); // change the name of thread 
		String name= th.getName();		
		th.setPriority(1);
		System.out.println(th.getId());
		System.out.println(th.getPriority());
		System.out.println(name);
		
		long a= th.getId(); // another way to get id 
		System.out.println(a);
		
		/*min   - 1
		 * max  - 10
		 * norm  - 5
		 * */
	}

}
