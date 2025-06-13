package june_stepDefination;

import June_page.LoginPage_june;
import June_utiliy.BaseClass_June_2025;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefination_june extends BaseClass_June_2025
{

@Given("open application {string}")
public void open_application(String url)
{
	LoginPage_june lp=new LoginPage_june(driver);
	lp.setUrl(url);
	
	
    
}

@When("Enter username label {string} as {string}")
public void enter_username_as_label(String locatorname, String locatorvalue) 
{
	LoginPage_june lp=new LoginPage_june(driver);
	lp.setUsername(locatorname,locatorvalue);
}

@When("Enter password label {string} as {string}")
public void enter_password_as_label(String locatorname, String locatorvalue) 
{
	LoginPage_june lp=new LoginPage_june(driver);
	lp.setUsername(locatorname,locatorvalue);
}

@Then("Click on button {string}")
public void click_on_button(String button) 
{
	LoginPage_june lp=new LoginPage_june(driver);
	lp.clickButton(button);
}


}
