package com.corejava.demo;

public class ArrayInJava6 
{

	public static void main(String[] args) 
	{
	/*//TWO Dimantion Array
		double[][] matrix={ // instiation and intilization of doublr array
				{1.2,2.4,4.0},
				{4.0,1.1}
		};
		
		double[][] matrix1; // declaration of 2D Array
		
		double[][]a=new double[3][2];
		*/
		int [][] a= {
				{1,2,3},
				{4,5,6,9}
			};
		System.out.println("Length of Row 1 "+a[0].length);//3
		System.out.println("Length of Row 2 "+a[1].length);//4
		System.out.println("Length of Row 3 "+a[1].length);//1
		System.out.println(a[1][2]);//6
		//print all the matrix
	}
}
