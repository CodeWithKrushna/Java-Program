package com.junite.demo;
// POJO -Plain Old Java Object
public class Calculator 
{
	public int add( int a, int b) 
	{
		int result = a+b;
		return result;
	}
	
	public int sub( int x, int y)
	{
		int z= x-y;
		return z;
		
	}
	
	public int div( int p, int q)
	{
		int r= p/q;
		return r;
		
	}
	
	public int multi( int m, int n)
	{
		int o= m*n;
		return o;
		
	}
}
