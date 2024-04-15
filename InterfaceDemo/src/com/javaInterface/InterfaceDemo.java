package com.javaInterface;
//interfaces, another way of implementing abstraction in java
// all the interface in java are by default abstract
//by default all the method in the interface are abstract
// interface should have all abstract method 
//all the methods inside the your abstract method  no concrete method
// after 1.5 you can add concrete method in interface but they must be define
// all the abstract in the interface cannot be private
//by default the filed in interface are public satic and final
//you cannot create object of the interface 
//cannot create a object of a interface 
// we cannot 
interface InterfaceSample
{
	/*static 
	
	{
		
	}*/
	int i =0;
	 void display();
	  void show(); 	
}
interface sample
{
	void xyz();
	
}
class Abc implements InterfaceSample,sample
{
	@Override
	public void display() 
	{
//		System.out.println(i++);
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xyz() {
		// TODO Auto-generated method stub
		
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		

	}

}
