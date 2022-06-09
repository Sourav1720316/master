package Feature;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//import org.junit.runner.RunWith; 
//import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@CucumberOptions(features = "src/test/java/Feature/Test.feature",
		glue= {"StepDefinitions"},
		plugin = { "pretty", "html:target/cucumber-reports"}) 
 
public class TestRunner { }