package com.javademo;
// Encapsulation class Program
class Employee   // Encapusaltion
{
	private int id;
	private String name;
	private String design;
	private String sal;
	private String dob;
	private String empName;
	private String password;
	
	public Employee(int id, String name, String design, String sal, String dob) 
	{
		super();
		this.id = id;
		this.name = name;
		this.design = design;
		this.sal = sal;
		this.dob = dob;
	}
	
	public Employee() {
		super();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", design=" + design + ", sal=" + sal + ", dob=" + dob
				+ ", empName=" + empName + ", password=" + password + "]";
	}
	
	
	
}
public class EmpMain {

	public static void main(String[] args)
	{
		Employee emp =new Employee();
		System.out.println(emp);
		

	}

}
