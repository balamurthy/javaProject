package FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readLineStoreVariable {

public static void main(String a[])
{
	String line = "";
	String data = "";
	try 
	{
		BufferedReader buf = new BufferedReader(new FileReader("d:\\blaptop\\ascendion\\file.txt"));
		while (line != null)
		{
			if (line == null)
			{
				break;
			}
			data += line;
			line = buf.readLine();                
		}
		System.out.println(data);
		buf.close();
	}
	catch (FileNotFoundException e)
	{
		System.err.println("File Not Found");
	}
	catch (IOException io)
	{
		System.err.println("Unable to Read the File");
	}
}
}