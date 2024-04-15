package com.javademo;
// Abstraction 
abstract class Empolyee1
{
	abstract void salary();	
}
class PermanantEmployee extends Empolyee1
{
	void salary()
	{
		System.out.println("Basic+Bouns+leave+HRA");
		
	}
	
}
class TempEmployee extends Empolyee1
{
	void salary()
	{
		System.out.println("Basic+leave+HRA");
	}

}
public class EmployeeMain 
{

	public static void main(String[] args) 
	{
		

	}

}
