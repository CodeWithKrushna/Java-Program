package com.corejava.demo;
import java.util.Scanner;
public class Coffeemachin 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose Your Coffee Felaver");
		System.out.println("1. Espresso");
		System.out.println("2. Latte");
		System.out.println("3. Cappuccino");
		System.out.println("4. Americano");
		
		int chioce=sc.nextInt();
		switch(chioce)
		{
		case 1:
			System.out.println("You Choose the Espresso,Price is 250RS ");
			break;
		case 2:
			System.out.println("You Choose the Latte,Price is 200RS ");
			break;
			
		case 3:
			System.out.println("You Choose the Cappuccino,Price is 300RS ");
			break;
		case 4:
			System.out.println("You Choose the Americano,Price is 400RS ");
			break;
		default:
			System.out.println("Invalid Output");
		}
		
	 

	}

	
	
	
}
