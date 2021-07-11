package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/Features",
		glue={"StepsDefinations"},
		plugin = {"pretty","json:target/cucumber.json"},
		monochrome = true
		
		
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
	