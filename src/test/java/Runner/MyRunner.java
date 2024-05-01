package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
		(
		tags="@smoketest", 
		features = "src/test/java/Features",
		glue = {"StepDefinitions","Hooks"},
		plugin = {"pretty",	"json:target/jsonreport.json"}
		)
//	"html:target/htmlreport.html",

public class MyRunner extends AbstractTestNGCucumberTests {

	/*
	 * @Override
	 * 
	 * @DataProvider(parallel=true) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */

}