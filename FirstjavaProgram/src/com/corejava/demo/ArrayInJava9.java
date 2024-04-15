package com.corejava.demo;
class A
{

	int i;
}
public class ArrayInJava9
{
	static void methodOne(A[] a) 
	
	{
			a[2].i=25;
			a[5].i=45;
			
	}


	
	public static void main(String[] args) {
		A[] a=new A[8];
		a[2]=new A();
		a[5]=new A();
		
		a[2].i=10;
		a[5].i=20;
		
		methodOne(a); //calling method     
		
		System.out.println(a[2].i);
		System.out.println(a[5].i);

	}

}
