package FileIO;

import java.io.*;
public class File_isHidden
{
	public static void main(String[] args)
	{
		File file = new File("D:\\BLAPTOP\\ASCENDION\\NEWfile.txt");
 
		boolean res = file.isHidden(); // check file is hidden or not
 
		// return result in true or false
		System.out.println("Is the file " + file.getPath() + " hidden ? : " + res);
	}
}