package FileIO;


	import java.io.*;
	public class File_ReadNot
	{
		public static void main(String[] args)
		{
			String filePath = "file.txt";
			File f = new File(filePath);
			if (f.canRead())
			{
				System.out.println("File " + f.getPath() + " can be Read");
			}
			else
			{
				System.out.println("File " + f.getPath() + " can Not be Read");
			}
		}
	}
