package FileIO;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class File_Attributes
{
	public static void main(String[] args) throws Exception
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the File Path : ");
		String f = in.next();
		Path file_path = FileSystems.getDefault().getPath(f);
 
		// function is used to view file attribute
		BasicFileAttributeView view = Files.getFileAttributeView(file_path, BasicFileAttributeView.class);
		BasicFileAttributes attr = view.readAttributes();
 
		// attributes of the file
		System.out.println("Creation Time : " + attr.creationTime());
		System.out.println("Last Accessed Time : " + attr.lastAccessTime());
		System.out.println("Last Modified Time : " + attr.lastModifiedTime());
		System.out.println("File Key : " + attr.fileKey());
		System.out.println("Directory : " + attr.isDirectory());
		System.out.println("Other Type of File : " + attr.isOther());
		System.out.println("Regular File : " + attr.isRegularFile());
		System.out.println("Symbolic File : " + attr.isSymbolicLink());
		System.out.println("Size : " + attr.size());
	}
}