package com.haibernet.demo1;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student
{
	@Id
	private int studentId;
	private String name;
	private String add;
	private int phono;
	private int marks;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String name, String add, int phono, int marks) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.add = add;
		this.phono = phono;
		this.marks = marks;
	}

	public int getstudentId() {
		return studentId;
	}

	public void setstudentId(int id) {
		this.studentId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public int getPhono() {
		return phono;
	}

	public void setPhono(int phono) {
		this.phono = phono;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [getstudentId()=" + getstudentId() + ", getName()=" + getName() + ", getAdd()=" + getAdd() + ", getPhono()="
				+ getPhono() + ", getMarks()=" + getMarks() + "]";
	}
	
	
	
	
	
	

}
