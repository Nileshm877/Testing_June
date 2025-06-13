package June_page;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import June_utiliy.ReadConfig_Browser;
import June_utiliy.ReadConfig_Credentials;
import June_utiliy.ReadConfig_Url;

public class LoginPage_june 
{
	public WebDriver driver;

	public LoginPage_june(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public By userxpath_method(String name)
	{
		By namexapth= By.xpath("//input[@id='"+name+"']");
				return namexapth;
		
	}
	
	
	public By buttonxpath_method(String name)
	{
		By namexpath=By.xpath("//button[@id='"+name+"']");
		return namexpath;
	}

	public void setUrl(String url)
	{
	    Properties prop=ReadConfig_Url.ReadUrl();
		String appurl=prop.getProperty(url);
	    
	    driver.get(appurl);
		
	}
	
	public void setUsername(String locatorname,String locatorvalue)
	{
		Properties prop=ReadConfig_Credentials.ReadCredentials();
		String username=prop.getProperty(locatorvalue);
		
		WebElement ele=driver.findElement(userxpath_method(locatorname));
		ele.sendKeys(username);
		
		
	}
	
	public void clickButton(String buttonname)
	{
		WebElement ele=driver.findElement(buttonxpath_method(buttonname));
		ele.click();
	}
}
