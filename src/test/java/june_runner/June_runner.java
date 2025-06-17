package june_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		
		//path of feature file
		   features = {"src/test/resources/June_feature/"},
		   
		   //path of step definition file
		   
		   glue = {"june_stepDefination","June_utiliy"},
		   plugin = { "pretty", "json:target/cucumber.json"}
		           
)
public class June_runner 
{

}
