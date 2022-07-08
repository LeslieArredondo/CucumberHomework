package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= "src/test/resources/featuresFiles",
		glue = "stepDefinitions",
				tags = "@normalUser or @PremiunUser or @nonRegisteredUser")


public class LogInRunner extends AbstractTestNGCucumberTests{
	

	
}



