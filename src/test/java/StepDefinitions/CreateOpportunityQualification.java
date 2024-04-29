package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import testcomponents.BaseTest;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.CreateSalesNewOpportunity;
import PageObjects.OpportunityDetailsTab;

public class CreateOpportunityQualification extends BaseTest{
CreateSalesNewOpportunity createNewOpportunity;
OpportunityDetailsTab oppDetails;
String stagename;
String probability;

@Given ("create new opportunity with stage qualification")
public void create_new_opportunity_with_stage_prospecting() throws InterruptedException, IOException {		
createNewOpportunity = new CreateSalesNewOpportunity(driver);
createNewOpportunity.createNewOpp(
		getParameters().getProperty("OPP_NAME"), 
		getParameters().getProperty("OPP_STAGE_QUALIFICATION")
		);
}
	
//validate the stage and probability on opportunity details tab
@Then ("verify opportunity details for stage qualification")
public void verify_opportunity_details_for_stage_qualification() throws InterruptedException, IOException 
{		
	oppDetails =  new  OpportunityDetailsTab(driver);
	oppDetails.clickopportunitydetailsTab();
	stagename = oppDetails.getactualstage();
	probability = oppDetails.getprobability();
	Assert.assertEquals(stagename, getParameters().getProperty("OPP_STAGE_QUALIFICATION"));
	Assert.assertEquals(probability, getParameters().getProperty("OPP_PROBABILITY_QUALIFICATION"));
	
}

}
