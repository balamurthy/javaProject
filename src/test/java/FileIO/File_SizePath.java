package FileIO;

import java.io.File;
public class File_SizePath
{
	public static void main(String args[])
	{
		final String fileName = "file.txt";
		try
		{
			File objFile = new File(fileName);
			System.out.println("File Path : " + objFile.getAbsolutePath());
			System.out.println("File Size : " + objFile.length() + " bytes");
		}
		catch (Exception e)
		{
			System.out.println("Exception : " + e.toString());
		}
	}
}