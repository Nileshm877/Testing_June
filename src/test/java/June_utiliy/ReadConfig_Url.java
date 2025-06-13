package June_utiliy;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig_Url 
{
	public static Properties prop2;
	public static FileInputStream fis;
	public static File path;
	
	public static Properties ReadUrl()
	{
		File path=new File("C:\\Users\\Admin\\eclipse-workspace\\June_2025\\config_properties\\url.properties");
		
		try
		{
			fis=new FileInputStream(path);
			prop2=new Properties();
			prop2.load(fis);
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return prop2;
	}
		
		
		
}


