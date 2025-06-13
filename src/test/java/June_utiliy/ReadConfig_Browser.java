package June_utiliy;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig_Browser
{
	public static Properties prop1;
	public static FileInputStream fis;
	public static File path;
	
	
		public static Properties ReadBrowser()
		{
		path=new File("C:\\Users\\Admin\\eclipse-workspace\\June_2025\\config_properties\\browser.properties");
		
		try
		{
			fis=new FileInputStream(path);
			prop1=new Properties();
			prop1.load(fis);
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		return prop1;
	}
			
}


