package com.iodemo;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo
{

	public static void main(String[] args) throws IOException
	{
		File f1=new File("Input.txt");
		File f2=new File("output.txt");
		
		FileReader fr =new FileReader(f1);
		FileWriter fr1=new FileWriter(f2);
		
		int ch;
		while((ch=fr.read()) !=-1) 
		{

			fr1.write(ch);
		}
		fr.close();
		fr1.close();
		
	}

}
