package com.collectionDemo.sort;

public class Employee 
{
	private int empId;
	private String name;
	private double sal;
	
	public Employee(int empId, String name, double sal) {
		super();
		this.empId = empId;
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public String toString()
	{
		return "Employee [emp=" + empId + ", name=" + name + ", sal=" + sal + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
	
	
	
	
	

	

}
