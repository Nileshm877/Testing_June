package June_utiliy;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig_Credentials 

{
	public static Properties prop3;
	public static FileInputStream fis;
	public static File path;
	
	public static Properties ReadCredentials()
	{
		path=new File("C:\\Users\\Admin\\eclipse-workspace\\June_2025\\config_properties\\credentials.properties");
		
		try
		{
			fis=new FileInputStream(path);
			prop3=new Properties();
			prop3.load(fis);
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return prop3;
	}
		
		
}
