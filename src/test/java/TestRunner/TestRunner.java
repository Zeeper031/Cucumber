package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\LV00913261\\eclipse-workspace\\Cucumber\\src\\test\\java\\Features",
		glue={"StepDefinitions"},
		publish = true
		)

public class TestRunner {
	
	

}
