package FileIO;

import java.io.File;
public class createFile
{
	public static void main(String args[])
	{
		final String file_name = "d://blaptop//ascendion//file.txt";
 
		try{
			File obj = new File(file_name);
			if (obj.createNewFile())
			{
				System.out.println("File Created Successfully.....");
			}
			else
			{
				System.out.println("File Creation Failed....");
			}
		}
		catch (Exception Ex) {
			System.out.println("Exception : " + Ex.toString());
		}
	}
}