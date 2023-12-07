package runner;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/features"},
                 glue = {"stepDefinition", "hooks"})

public class TestRunner extends AbstractTestNGCucumberTests {
	   
     	@DataProvider(parallel = false)
     	public Object[][] scenarios() {
	     return super.scenarios();
	     }

}
