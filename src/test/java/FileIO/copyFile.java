package FileIO;

import java.io.*;
public class copyFile
{
	public static void main(String args[])
	{
		try
		{			
			FileInputStream source_file = new FileInputStream("d:\\blaptop\\ascendion\\Source.txt"); //input file			
			FileOutputStream new_file = new FileOutputStream("d:\\blaptop\\ascendion\\Destination.txt");//output file			
			int byte_val;
 
			//read from first file and write to second file
			while ((byte_val = source_file.read()) != -1)
			{				
				new_file.write(byte_val);
			}
 
			source_file.close();
			new_file.close();
 
			System.out.println("File Copied successfully");
		}
		catch (IOException e)
		{
			System.out.println("Exception : " + e.toString());
		}
	}
}