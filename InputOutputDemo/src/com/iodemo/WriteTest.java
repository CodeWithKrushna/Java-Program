package com.iodemo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteTest {

	public static void main(String[] args) throws IOException
	{
		File f =new File("Input.txt");
		String str="Cpoy this String to File";
		FileWriter wr = new FileWriter(f);	
		wr.write(str);
		wr.close();
		
		
	}

}
