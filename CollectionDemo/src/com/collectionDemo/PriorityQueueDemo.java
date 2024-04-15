package com.collectionDemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo 
{

	public static void main(String[] args) 
	{
		PriorityQueue queue = new PriorityQueue();
		
		try
		{
			//queue.add(null); // null value are not allowed
		} 
		catch(NullPointerException ex)
		{
			System.out.println("Null value are not allowed");
		}
		queue.add(112);
		queue.add(112);
		queue.add(10);
		queue.add(12);
		queue.add(50);
		queue.add(125);
		queue.add(6);		
		queue.offer(1111);
		
		//System.out.println(queue.poll());
		
		//System.out.println(queue.remove(50));
		
		
		//System.out.println(queue);
		
		System.out.println(queue.peek()); // smallest number return
		//System.out.println(queue.element());
		

	}

}
