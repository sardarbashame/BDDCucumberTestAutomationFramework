package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

<<<<<<< HEAD
@CucumberOptions(
	features = { "Regression/Feature"}, 
	tags = "@regtest",
	dryRun = false, 
	glue = { "StepDefinitions", "Hooks" }, 
	plugin = {
		"pretty", "json:target/jsonreport.json", 
		"html:target/htmlreport.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" 
		})
=======
@CucumberOptions(features = { "Regression/Feature" }, dryRun = false, glue = { "StepDefinitions",
		"Hooks" }, plugin = { "pretty", "json:target/jsonreport.json", "html:target/htmlreport.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
>>>>>>> 352c16cecdf7f0686b19e40c98bf4358f8575c47

public class MyRunner extends AbstractTestNGCucumberTests {

	/*
	 * @Override
	 * 
	 * @DataProvider(parallel=true) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */

}