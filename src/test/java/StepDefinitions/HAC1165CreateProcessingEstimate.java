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

public class HAC1165CreateProcessingEstimate extends CommonFunctions {
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
	boolean pboption1;
	boolean pboption2;
	boolean pboption3;
	boolean pboption4;
	boolean pboption5;
	boolean pboption6;
	boolean pboption7;

	@Given("^HAC1165 user enters (.*) and (.*)$")
	public void HAC145_user_enters_username_and_password(String userName, String password) throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(userName, password);
	}

	@When("HAC1165 select the applicaton")
	public void HAC145_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC1165 close all the open tabs")
	public void HAC145_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC1165 close the bottom bar")
	public void HAC387_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}

	@When("HAC1165 click on cases tab")
	public void HAC1165_click_on_cases_tab() throws InterruptedException {
		homePage = new HomePage();
		homePage.clickCasesTab();
	}

	@When("HAC1165 create new case")
	public void HAC1165_create_new_case() throws InterruptedException, IOException  {
		homePage = new HomePage();
		homePage.createNewCase(
				getObjDetails().getProperty("CASECONTACT"),
				getObjDetails().getProperty("CASEFIRSTNAME"),
				getObjDetails().getProperty("CASESUB")
				);

	}
	@When("HAC1165 user is on estimate tab")
	public void HAC1165_user_is_on_estimate_tab() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.clickEstimatesTab();
	}

	@When("HAC1165 verify the pricebook options")
	public void HAC1165_verify_the_pricebook_options() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		pboption1 = estimateCreationFlowStep1.verifyPriceBookOption1();
		Assert.assertTrue(pboption1);
		pboption2 = estimateCreationFlowStep1.verifyPriceBookOption2();
		Assert.assertTrue(pboption2);
		pboption3 = estimateCreationFlowStep1.verifyPriceBookOption3();
		Assert.assertTrue(pboption3);
		pboption4 = estimateCreationFlowStep1.verifyPriceBookOption4();
		Assert.assertTrue(pboption4);
		pboption5 = estimateCreationFlowStep1.verifyPriceBookOption5();
		Assert.assertTrue(pboption5);
		pboption6 = estimateCreationFlowStep1.verifyPriceBookOption6();
		Assert.assertTrue(pboption6);
		pboption7 = estimateCreationFlowStep1.verifyPriceBookOption7();
		Assert.assertTrue(pboption7);
		
	}

	@When("HAC1165 select values on estimate flow step1")
	public void HAC1165_select_values_on_estimate_flow_step1() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.estimateFlowStep1("USA Domestic Market Rate", "Processing Estimate Matrix",
				"BASIC Dual Spiral Ovens", "IO/Commissioning");
	}

	@When("HAC1165 verify the field label number of tech")
	public void HAC1165_verify_the_field_label_number_of_tech() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		numberoftechpresent = estimateCreationFlowStep2.isNumberOfTechPresent();
		Assert.assertTrue(numberoftechpresent);
	}

	@When("HAC1165 verify the field label number of days")
	public void HAC1165_verify_the_field_label_number_of_days() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		numberofdayspresent = estimateCreationFlowStep2.isNumberOfDaysPresent();
		Assert.assertTrue(numberofdayspresent);
	}

	@When("HAC1165 verify the field label number of hours")
	public void HAC1165_verify_the_field_label_number_of_hours() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		numberofhourspresent = estimateCreationFlowStep2.isNumberOfHrsPresent();
		Assert.assertTrue(numberofhourspresent);
	}

	@When("HAC1165 select from date")
	public void HAC1165_seelct_from_date() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		estimateCreationFlowStep2.selectFromDate();
	}

	@When("HAC1165 select to date")
	public void HAC1165_seelct_to_date() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		estimateCreationFlowStep2.selectToDate();
	}

	@When("HAC1165 select view confirmation")
	public void HAC1165_seelct_view_confirmation() throws InterruptedException, IOException {
		estimateCreationFlowStep3 = new EstimateCreationFlowStep3();
		estimateCreationFlowStep3.clickViewConfirmation();
	}

	@Then("HAC1165 generate estimate pdf")
	public void HAC1165_generate_estimate_pdf() throws InterruptedException, IOException {
		estimateCreationFlowStep3 = new EstimateCreationFlowStep3();
		estimateCreationFlowStep3.clickCreatePDF();
	}

}
