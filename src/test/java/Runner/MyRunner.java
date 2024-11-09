package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "Regression/Feature"}, tags = "@Test",dryRun = false, glue = { "StepDefinitions", "Hooks" }, plugin = {
		"pretty", "json:target/jsonreport.json", "html:target/htmlreport.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class MyRunner extends AbstractTestNGCucumberTests {

	/*
	 * @Override
	 * 
	 * @DataProvider(parallel=true) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */

}