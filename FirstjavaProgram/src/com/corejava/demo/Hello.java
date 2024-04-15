package com.corejava.demo;
public class Hello
{
	public static void main(String[] args)
	{
		int a=10;
		int b=3;
		int c=5;
		
	//Arithmatic oprator
		System.out.println("a+b= " + (a+b));
		System.out.println("a-b= " + (a-b));
		System.out.println("a/b= " + (a/b));
		System.out.println("a*b= " + (a*b));
		System.out.println("a%b= " + (a%b));
		
		
		//Relational operator 
		System.out.println("a>b= " + (a>b));
		System.out.println("a<b= " + (a<b));
		System.out.println("a>=b= " + (a>=b));
		System.out.println("a<=b= " + (a<=b));
		System.out.println("a==b= " + (a==b));
		System.out.println("a!=b= " + (a!=b));
		
		//Btrwise operator 
		
		int m=60;
		int n=13;
		
		int result = m & n;
		System.out.println("m & n= " + (m&n));
		System.out.println("m | n= " + (m|n));
		System.out.println("m ^ n= " + (m^n));
		
		// 
		System.out.println("m+=n = " + (m+=n));
		System.out.println("m -= n= " + (m-=n));
		
		
		//increment operator 
		int x=5;
		System.out.println("x++= " + (x++));
		System.out.println(x);
		
		
		
		
		
		
		
	}
}



/*public class Hello //identifier (
{
//int xyz //identifier 
	public static void main(String[] args) 
	{
		byte a=-127;
		System.out.println(a);
		short b=32767;
		System.out.println(b);
		
		// TODO Auto-generated method stub
		System.out.println("Hello");

	}

	
}*/
