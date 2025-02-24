package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import javax.annotation.processing.Completions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AccountDetailsTab;
import PageObjects.CaseDetailsTab;
import PageObjects.EstimateCreationFlowStep1;
import PageObjects.EstimateCreationFlowStep2;
import PageObjects.EstimateCreationFlowStep3;
import PageObjects.GlobalSearch;
import PageObjects.HomePage;
import PageObjects.Login;
import PageObjects.SelectApplication;
import commonutilities.BaseTest;
import commonutilities.CommonFunctions;

public class HAC1165CreatePKGEstimatewithIOCommissioning extends CommonFunctions {
	GlobalSearch globalSearch;
	Login loginPO;
	CaseDetailsTab caseDetailsTab;
	SelectApplication selectApplication;
	EstimateCreationFlowStep1 estimateCreationFlowStep1;
	EstimateCreationFlowStep2 estimateCreationFlowStep2;
	EstimateCreationFlowStep3 estimateCreationFlowStep3;
	HomePage homePage;
	boolean numberoftechpresent;
	boolean numberofdayspresent;
	boolean numberofhourspresent;
	String numberoftech;

	@Given("^HAC1165PKGC user enters (.*) and (.*)$")
	public void HAC145_user_enters_username_and_password(String userName, String password) throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(userName, password);
	}

	@When("HAC1165PKGC select the applicaton")
	public void HAC1165PKGC_select_the_application() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC1165PKGC close all the open tabs")
	public void HAC145_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC1165PKGC close the bottom bar")
	public void HAC387_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}

	@When("HAC1165PKGC click on cases tab")
	public void HAC1165PKGC_click_on_cases_tab() throws InterruptedException {
		homePage = new HomePage();
		homePage.clickCasesTab();
	}

	@When("HAC1165PKGC create new case")
	public void HAC1165PKGC_create_new_case() throws InterruptedException, Exception {
		homePage = new HomePage();
		homePage.createNewCase(ppty.getProperty("CASECONTACT"), ppty.getProperty("CASEFIRSTNAME"));

	}
	
	@When("HAC1165PKGC user is on estimate tab")
	public void HAC1165PKGC_user_is_on_estimate_tab() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.clickEstimatesTab();
	}
	
	@When("HAC1165PKGC verify the pricebook options")
	public void HAC1165PKGC_verify_the_pricebook_options() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.VerifyPriceBookOptions();

	}
	
	@When("HAC1165PKGC select values on estimate flow step1")
	public void HAC1165PKGC_select_values_on_estimate_flow_step1() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.PKGEstimateFlowStep1("CANADA Domestic Market Rate","PKG",
				"CCW/H&C Shuttle/ DAFF", "IO/Commissioning");
	}
		
	@When("HAC1165PKGC select PKG tab")
	public void UserclickonINSPTab() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.clickPKGTab();
	}

	@When("HAC1165PKGC verify the field label number of tech")
	public void HAC1165PKGC_verify_the_field_label_number_of_tech() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		numberoftechpresent = estimateCreationFlowStep2.NumberOfTech();
		Assert.assertTrue(numberoftechpresent);
	}

	@When("HAC1165PKGC verify the field value number of tech")
	public void HAC1165PKGC_verify_the_field_value_number_of_tech() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		numberoftech = estimateCreationFlowStep2.NumberOfTechValue();
		Assert.assertEquals(numberoftech,"2");
	}
	@When("HAC1165PKGC verify the field label number of days")
	public void HAC1165PKGC_verify_the_field_label_number_of_days() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		numberofdayspresent = estimateCreationFlowStep2.PROCNumberOfDays();
		Assert.assertTrue(numberofdayspresent);
	}

	@When("HAC1165PKGC verify the field label number of hours")
	public void HAC1165PKGC_verify_the_field_label_number_of_hours() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		numberofhourspresent = estimateCreationFlowStep2.PROCNumberOfHrs();
		Assert.assertTrue(numberofhourspresent);
	}

	@When("HAC1165PKGC select from date")
	public void HAC1165PKGC_seelct_from_date() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		estimateCreationFlowStep2.selectFromDatePKG();
	}

	@When("HAC1165PKGC select to date")
	public void HAC1165PKGC_seelct_to_date() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		estimateCreationFlowStep2.selectToDatePKG();
	}

	@When("HAC1165PKGC select view confirmation")
	public void HAC1165PKGC_seelct_view_confirmation() throws InterruptedException, IOException {
		estimateCreationFlowStep3 = new EstimateCreationFlowStep3();
		estimateCreationFlowStep3.clickViewConfirmation();
	}

	@Then("HAC1165PKGC generate estimate pdf")
	public void HAC1165PKGC_generate_estimate_pdf() throws InterruptedException, IOException {
		estimateCreationFlowStep3 = new EstimateCreationFlowStep3();
		estimateCreationFlowStep3.clickCreatePDF();
	}
	
}
