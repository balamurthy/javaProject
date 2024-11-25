package FileIO;

import java.io.*;
import java.util.Date;
public class File_LastModify
{
	public static void main(String[] args)
	{
		File f = new File("d:\\blaptop\\ascendion\\file.txt");
		// lastModified is the predefined function.
		long last_modify = f.lastModified();
 
		System.out.println("File was Last Modified at : " + new Date(last_modify));
	}
}