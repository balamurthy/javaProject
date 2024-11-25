package FileIO;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Longest_Word
{
	public static void main(String[] args) throws FileNotFoundException {
		new Longest_Word().find_LongestWords();
	}
 
	public String find_LongestWords() throws FileNotFoundException {
		String long_word = "";
		String cur;
		Scanner input = new Scanner(new File("d:\\blaptop\\ascendion\\file.txt"));
 
		while (input.hasNext())
		{
			cur = input.next();
			if (cur.length() > long_word.length())
			{
				long_word = cur;
			}
		}
		System.out.println(long_word);
		return long_word;
	}
}