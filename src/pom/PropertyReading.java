package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReading {

	public static void main(String[] args) throws IOException
	{
		
		Properties prop= new Properties();
		FileInputStream myFile= new FileInputStream("D:\\Yogendra\\RevisionSelenium\\myProperty.properties");
		prop.load(myFile);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("mobNum"));
		System.out.println(prop.getProperty("pwd"));
		System.out.println(prop.getProperty("un"));
		
		
		
		

	}

}
