package com.javademo;
abstract class Employeee
{
	abstract void calculateSalary();
	abstract void displayInfo();
}

class Manager extends Employeee
{

	@Override
	void calculateSalary() 
	{
		System.out.println("Manager Salary is :- 15,000");
		
	}

	@Override
	void displayInfo() 
	{
		System.out.println("Manager Information");
		System.out.println("Manager_Name:- Nitesh Shaha");
		System.out.println(
				);
		
	}
	
}
class Programmer extends Employeee
{

	@Override
	void calculateSalary() 
	{
		System.out.println("Programmer Salary is :- 10,000");
		
	}

	@Override
	void displayInfo()
	{
		System.out.println("Programmer Information ");
		System.out.println("Programmer_Name :-Nikita Kale");
		
	}
	
}
public class Employee1 
{

	public static void main(String[] args) 
	{
		Manager MA =new Manager();
		Programmer PO = new Programmer();
		
		MA.calculateSalary();
		MA.displayInfo();
		
		PO.calculateSalary();
		PO.displayInfo();
	}

}
