package FileIO;

import java.io.File;
public class Delete_File
{
	public static void main(String args[])
	{
		final String fileName = "file.txt";
		File obj = new File(fileName);
 
		//check file is exist or not, if exist delete it
		if (obj.exists() == true)
		{
			if (obj.delete()) //deleting the file
			{
				System.out.println("File Deleted Successfully...");
			}
			else
			{
				System.out.println("File deletion failed...");
			}
		}
		else
		{
			System.out.println("File does Not Exist...");
		}
	}
}