package com.collectionDemo.sort;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployeeComparator {

	public static void main(String[] args)
	{
		Employee emp1 = new Employee(305,"Tejas",10000);
		Employee emp2 = new Employee(111,"Krushna",100000);
		Employee emp3 = new Employee(420,"Omkar",50000);
		Employee emp4 = new Employee(498,"Sukesh",150000);
		Employee emp5 = new Employee(201,"Prem",11000);
		
		ArrayList<Employee>emplist=new  ArrayList<Employee>();
		
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		
		EmployeeIdCompartor id = new EmployeeIdCompartor();
		EmployeeSalaryComprator sal = new EmployeeSalaryComprator();
		EmployeeName name = new EmployeeName();
		
		Collections.sort(emplist, id);
		System.out.println("Employee ID Wise Sorted:- "+"\n"+ emplist);
		
		Collections.sort(emplist , name);
		System.out.println("Employee Name wise Sorted:- "+ "\n"+emplist);
		
		
		Collections.sort(emplist , sal);
		System.out.println("Employee Salary wise Sorted:- "+"\n"+ emplist);
		
		//System.out.println(emplist);
		
	}

}
