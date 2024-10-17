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
import PageObjects.CaseDetailsTab;
import PageObjects.GlobalSearch;
import PageObjects.Login;
import PageObjects.SelectApplication;
import commonutilities.BaseTest;
import commonutilities.CommonFunctions;

public class HAC411AbilitytoReopenCase extends CommonFunctions {
	CaseDetailsTab caseDetailsTab;
	GlobalSearch globalSearch;
	String industryname;
	String actualmessage;
	String editcasestatus;
	Login loginPO;
	SelectApplication selectApplication;

	@Given("^HAC411 user enters (.*) and (.*)$")
	public void HAC411_user_enters_username_and_password(String userName, String password) throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(userName, password);
	}

	@When("HAC411 select the applicaton")
	public void HAC411_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC411 close all the open tabs")
	public void HAC411_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC411 close the bottom bar")
	public void HAC411_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}

	@When("HAC411 user is on case details")
	public void HAC411_user_is_on_case_details() throws InterruptedException, IOException {
		globalSearch = new GlobalSearch();
		globalSearch.selectcasefromglobalsearch("PROCAutoCase1");
	}

	@When("HAC411 edit the case status")
	public void HAC411_edit_the_case_status() throws InterruptedException, IOException {
		caseDetailsTab = new CaseDetailsTab();
		caseDetailsTab.editCaseStatus();
	}

	@When("HAC411 update case status to new")
	public void HAC411_update_case_status_to_new() throws InterruptedException, IOException {
		caseDetailsTab = new CaseDetailsTab();
		caseDetailsTab.updateCaseStatusNew();
	}

	@When("HAC411 click save")
	public void HAC411_click_save() throws InterruptedException, IOException {
		caseDetailsTab = new CaseDetailsTab();
		caseDetailsTab.clickSaveButton();
	}

	// validate validation message
	@Then("HAC411 verify validation message")
	public void HAC411_verify_validation_message() throws InterruptedException, IOException {
		caseDetailsTab = new CaseDetailsTab();
		actualmessage = caseDetailsTab.getValidationMessage();
		Assert.assertEquals(actualmessage,
				"This case has been closed for more than 14 days. Please open a new case and link the two if desired");

	}

}
