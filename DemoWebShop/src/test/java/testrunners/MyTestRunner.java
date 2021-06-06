package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	   features = { "/Users/krishna/eclipse-workspace/DemoWebShop/src/test/resources/features/" }, 
	   glue = {"stepdefinition", "AppHooks" }, 
       dryRun = false, 
       plugin = { "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/" }, 
       tags = "@DemoShop and not @ignore"

)

public class MyTestRunner {

}
