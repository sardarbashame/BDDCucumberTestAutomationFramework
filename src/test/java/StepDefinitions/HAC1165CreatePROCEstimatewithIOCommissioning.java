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

public class HAC1165CreatePROCEstimatewithIOCommissioning extends CommonFunctions {
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
	String numberoftech;

	@Given("^HAC1165 user enters (.*) and (.*)$")
	public void HAC145_user_enters_username_and_password(String userName, String password) throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(userName, password);
	}

	@When("HAC1165 select the applicaton")
	public void HAC1165_select_the_application() throws InterruptedException, IOException {
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
	public void HAC1165_create_new_case() throws InterruptedException, Exception {
		homePage = new HomePage();
		homePage.createNewCase(getTestData("CONTACT_NAME"), getTestData("CASE_SUB"));

	}

	@When("HAC1165 user is on estimate tab")
	public void HAC1165_user_is_on_estimate_tab() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.clickEstimatesTab();
	}

	@When("HAC1165 verify the pricebook options")
	public void HAC1165_verify_the_pricebook_options() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.VerifyPriceBookOptions();
		}

	@When("HAC1165 select values on estimate flow step1")
	public void HAC1165_select_values_on_estimate_flow_step1() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.estimateFlowStep1("USA Domestic Market Rate", "PROC",
				"BASIC Dual Spiral Ovens", "IO/Commissioning");
	}
	
	@When("HAC1165 select values on estimate flow step1 for proc")
	public void HAC1165_select_values_on_estimate_flow_step1_for_proc_and_spray() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.estimateFlowStep1("USA Domestic Market Rate", "PROC",
				"BASIC Dual Spiral Ovens", "IO/Commissioning");

	}
	
	@When("HAC1165 select values on estimate flow step1 for spray")
	public void HAC1165_select_values_on_estimate_flow_step1_for_spray() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.estimateFlowStep1("USA Domestic Market Rate", "SPRAY",
				"SINGLE RDR", "IO/Commissioning");
	}

	@When("HAC1165 verify the field label number of tech")
	public void HAC1165_verify_the_field_label_number_of_tech() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		numberoftechpresent = estimateCreationFlowStep2.NumberOfTech();
		Assert.assertTrue(numberoftechpresent);
	}

	@When("HAC1165 verify the field value number of tech")
	public void HAC1165_verify_the_field_value_number_of_tech() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		numberoftech = estimateCreationFlowStep2.NumberOfTechValue();
		Assert.assertEquals(numberoftech,"2");
	}
	@When("HAC1165 verify the field label number of days")
	public void HAC1165_verify_the_field_label_number_of_days() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		numberofdayspresent = estimateCreationFlowStep2.PROCNumberOfDays();
		Assert.assertTrue(numberofdayspresent);
	}

	@When("HAC1165 verify the field label number of hours")
	public void HAC1165_verify_the_field_label_number_of_hours() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		numberofhourspresent = estimateCreationFlowStep2.PROCNumberOfHrs();
		Assert.assertTrue(numberofhourspresent);
	}

	@When("HAC1165 select from date")
	public void HAC1165_seelct_from_date() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		estimateCreationFlowStep2.selectFromDatePROC();
	}

	@When("HAC1165 select from date for spray")
	public void HAC1165_seelct_from_dateSpray() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		estimateCreationFlowStep2.selectFromDateSpray();
	}

	@When("HAC1165 select to date for spray")
	public void HAC1165_seelct_To_dateSpray() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		estimateCreationFlowStep2.selectToDateSpray();
	}

	@When("HAC1165 select from date INSP")
	public void HAC1165_seelct_from_dateINSP() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		estimateCreationFlowStep2.selectFromDateINSP();
	}

	@When("HAC1165 select to date")
	public void HAC1165_select_to_date() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		estimateCreationFlowStep2.selectToDatePROC();
	}
	@When("HAC1165 select to date INSP")
	public void HAC1165_seelct_to_dateINSP() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		estimateCreationFlowStep2.selectToDateINSP();
	}
	
	@When("HAC1165 select from date SPRAY")
	public void HAC1165_select_from_date_SPRAY() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		estimateCreationFlowStep2.selectFromDateSPRAY();
	}
	
	@When("HAC1165 select to date SPRAY")
	public void HAC1165_seelct_to_date_SPRAY() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		estimateCreationFlowStep2.selectToDateSPRAY();
	}
	
	@When("HAC1165 select view confirmation")
	public void HAC1165_seelct_view_confirmation() throws InterruptedException, IOException {
		estimateCreationFlowStep3 = new EstimateCreationFlowStep3();
		estimateCreationFlowStep3.clickViewConfirmation();
	}
	
	@When("HAC1165 save the estimate")
	public void HAC1165_save_the_estimate() throws InterruptedException, IOException {
		estimateCreationFlowStep3 = new EstimateCreationFlowStep3();
		estimateCreationFlowStep3.clickSaveButton();
	}

	@Then("HAC1165 generate estimate pdf")
	public void HAC1165_generate_estimate_pdf() throws InterruptedException, IOException {
		estimateCreationFlowStep3 = new EstimateCreationFlowStep3();
		estimateCreationFlowStep3.clickCreatePDF();
	}

	@When("Create new case with help of {string}, {string}, {string}")
	public void createnewcase(String CaseContact, String CaseFirstName, String CaseSub) throws Exception {
		homePage = new HomePage();
		homePage.createNewCase(CaseContact, CaseSub);
	}

	@When("Create Estimations with INSP {string}, {string}, {string}, {string}")
	public void createEstimationsINSP(String Pricebook, String ProductFamily, String ProductCategory, String Purpose)
			throws Exception {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.createEstimationINSP(Pricebook, ProductFamily,ProductCategory, Purpose);
	}
	
	@When("Create Estimations with SPRAY {string}, {string}, {string}")
	public void createEstimationsSPRAY(String Pricebook, String sprayEstimateMatrix, String Estimateitem)
			throws Exception {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.createEstimationSPRAY(Pricebook, sprayEstimateMatrix, Estimateitem);
	}

	@Then("User click on INSP Tab")
	public void UserclickonINSPTab() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.clickOnINSPTab();
	}
	
	@Then("User click on SPRAY Tab")
	public void UserclickonSPRAYTab() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.clickSPRAYTab();
	}

	@Then("user click on Save Estimation")
	public void UserclickSaveBtn() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.clickSaveButton();
	}

	@When("User click on Show All quick link")
	public void UserclickShowAllquicklink() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.clickShowAllQuickLink();
	}

	@Then("Click on QuoteEstimates and verify quote is created in the details page")
	public void verifyQuoteisCreated() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.verifyQuoteIsCreatedInDetailsPage();
	}
}
