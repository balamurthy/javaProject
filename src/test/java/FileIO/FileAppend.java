package FileIO;

import java.io.*;
public class FileAppend
{
	public static void main(String[] args)
	{
		String str_file = "d:\\blaptop\\ascendion\\file.txt";
		try
		{
			//file output stream to open and write data
			FileOutputStream f = new FileOutputStream(str_file, true);
 
			String strContent = "Welcome Java";//appended string
 
			f.write(strContent.getBytes());//appending string
			f.close();
			System.out.println("String Appended Successfully ...");
		}
		catch (FileNotFoundException f)
		{
			System.out.println("FileNotFoundException : " + f.toString());
		}
		catch (IOException i)
		{
			System.out.println("IOException : " + i.toString());
		}
		catch (Exception e)
		{
			System.out.println("Exception: " + e.toString());
		}
	}
}