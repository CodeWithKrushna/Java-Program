package com.javademo;
abstract class Vhicale_1
{
	abstract void startEngine();
	abstract void stopEngine();
}
class Car extends Vhicale_1
{
	@Override
	public void startEngine()
	{
		System.out.println("start Engine With Car Class ");
	}

	@Override
	public void stopEngine()
	{
		System.out.println("stop Engine with car class");
	}	
}
class Motorcycle extends Vhicale_1
{

	@Override
	public void startEngine() 
	{
		System.out.println("start Engine With  Motor Cycle class");
	}
	@Override
	public void stopEngine() 
	{
		System.out.println("Stop Engine with Motor Cycle class");
	}
}
public class Vhicale 
{
	public static void main(String[] args) 
	{
		Car c1=new Car();
		Motorcycle MV =new Motorcycle();
		
		c1.startEngine();
		c1.stopEngine();
		
		MV.startEngine();
		MV.stopEngine();
	}

}
