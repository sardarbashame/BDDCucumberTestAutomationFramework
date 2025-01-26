package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

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

import PageObjects.AccountDetailsTab;
import PageObjects.ContactDetailsTab;
import PageObjects.GlobalSearch;
import PageObjects.HomePage;
import PageObjects.Inquiries;
import PageObjects.Login;
import PageObjects.SelectApplication;
import commonutilities.BaseTest;
import commonutilities.CommonFunctions;

public class HAC1614VerifyInquirySalesOfficePicklistvalues extends CommonFunctions {

	SelectApplication selectApplication;
	HomePage homepage;
	Inquiries inquiries;

	@When("HAC1614 select inquiries object")
	public void HAC_1614_select_inquiries_object() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp("Inquiries");
	}
	
	@When("HAC1614 select an inquiry")
	public void HAC_1614_select_an_inquiry() throws Exception {
		inquiries= new Inquiries();
		inquiries.clickInquriesTab();
		inquiries.SelectInquiry();
	}

	@When("HAC1614 verify the new picklist value in sales office")
	public void HAC_1614_verify_the_new_picklist_value_in_sales_office() throws Exception 	{	
		inquiries.EditInquiry();
		inquiries.VerifyLelystadNetherlandsOption();
	}


	
	
}
