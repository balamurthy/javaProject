package FileIO;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class  ReadPropertyFile {
	
	public static void main(String[] args) throws IOException
	{
		// to access property file
		File src= new File("d:\\blaptop\\ascendion\\config.properties");
	
		FileInputStream fis = new FileInputStream(src);
		//to read the property file create an object of properties class
		Properties pro= new Properties();
		//to load property file
		pro.load(fis);
		// to fetch the key value from property file
		String str= pro.getProperty("browser");
		
		System.out.println(str);
		
		str = pro.getProperty("url");
		System.out.println(str);
			
	}

}
