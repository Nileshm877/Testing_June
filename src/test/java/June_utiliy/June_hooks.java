package June_utiliy;

import java.net.MalformedURLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.protobuf.Api;

import io.cucumber.java.Before;

public class June_hooks extends BaseClass_June_2025
{
	
	  Properties prop=ReadConfig_Browser.ReadBrowser();
	  String browsername=prop.getProperty("browser");
	  
	
	
	@Before
	public void checkBrowser() throws MalformedURLException
	{
	if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\June_2025\\June_Browser\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origin=*");
			driver=new ChromeDriver(options);
			
		}
		
		else
		{
			System.out.print("Browser is not matching");
		}
	}
}
