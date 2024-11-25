package FileIO;
import java.io.File;
import java.io.IOException;
public class File_Rename
{
	public static void main(String[] args)
	{
		try
		{
			File old_file = new File("d:\\blaptop\\ascendion\\file.txt"); // Existing file named 
			File new_file = new File("d:\\blaptop\\ascendion\\Newfile.txt"); //object of the renamed file			
			old_file.renameTo(new_file); // Rename the file
			System.out.println("File Renamed Successfully...");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}