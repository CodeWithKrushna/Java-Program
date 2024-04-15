package com.corejava.demo;

public class ArrayInJava 
{

	public static void main(String[] args) 
	{
	
		/*int[] a= {12,21,0,5,7};// Declaring and initialing an array
		int[] b=a;
		
		for(int i=0;i<b.length;i++) 
		{
			System.out.println(b[i]);
		}
		a[2]=52;// Changing the valunof 3rd element of array	
        System.out.println("==========");
        System.out.println(b[2]);
        
        b[4]=100;//Changing Valu of 5 element of array 'b'
        System.out.println(a[4]);
		*/
		int [] a= {12,21,0,5,7};
		int [] b=new int[a.length];
		
		for (int i=0;i<a.length;i++) // copying a
		{
			b[i]=a[i];  //another way int[]b=Arrays.copyOf(a,a.length);
			System.out.println(b[i]);
			
		}
		b[2]=56;
		System.out.println(b[2]);
		
		b[4]=100;
		System.out.println(b[4]);
	}

}
//Attending all the lectures day one But Attendance is Showing only 78%,otherwise no issue