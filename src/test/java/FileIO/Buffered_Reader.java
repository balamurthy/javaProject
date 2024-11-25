package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Buffered_Reader {
	
	public static void main(String args[])
	{
		final String file_name = "d:\\blaptop\\ascendion\\Newfile.txt";
		try
		{
			File obj = new File(file_name);
			if (obj.exists() == false)
			{
				System.out.println("File does Not Exist..");
				System.exit(0);
			}
			String text;
			FileReader file_read = new FileReader(obj.getAbsoluteFile());
			BufferedReader buf_read = new BufferedReader(file_read);
 
			//read text from file
			System.out.println("Content of the file is : ");
			while ((text = buf_read.readLine()) != null)
			{
				System.out.println(text);
			}
 
			buf_read.close();
		}
		catch (Exception e)
		{
			System.out.println("Exception : " + e.toString());
		}
	}

}
