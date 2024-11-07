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
import PageObjects.ContactDetailsTab;
import PageObjects.GlobalSearch;
import PageObjects.HomePage;
import PageObjects.Login;
import PageObjects.SelectApplication;
import commonutilities.BaseTest;
import commonutilities.CommonFunctions;

public class HAC322VerifyCasePageLayout extends CommonFunctions {
	Login loginPO;
	SelectApplication selectApplication;
	HomePage homepage;
	CaseDetailsTab caseDetailsTab;
	boolean name;

	@Given("^HAC322 user enters (.*) and (.*)$")
	public void HAC622_user_enters_username_and_password(String userName, String password) throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(userName, password);
	}

	@When("HAC322 select the applicaton")
	public void HAC322_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC322 close all the open tabs")
	public void HAC322_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC322 close the bottom bar")
	public void HAC322_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}
	
	@When("HAC322 select cases tab")
	public void HAC322_select_cases_tab() throws InterruptedException  {
		homepage = new HomePage();
		homepage.clickCasesTab();
	}

	@When("HAC322 create new case")
	public void HAC322_create_new_case() throws InterruptedException, IOException  {
		homepage = new HomePage();
		homepage.createNewCase(
				ppty.getProperty("CASECONTACT"),
				ppty.getProperty("CASEFIRSTNAME"),
				ppty.getProperty("CASESUB")
				);
	}

	// validate account name field label on case details
	@Then("HAC322 verify account name field label")
	public void HAC322_verify_account_name_field_label() throws InterruptedException, IOException {
		caseDetailsTab = new CaseDetailsTab();
		name = caseDetailsTab.isAccountNamePresent();
		Assert.assertTrue(name);

	}
	
	// validate contact name field label on case details
	@Then("HAC322 verify contact name field label")
	public void HAC322_verify_contact_name_field_label() throws InterruptedException, IOException {
		caseDetailsTab = new CaseDetailsTab();
		name = caseDetailsTab.isContactNamePresent();
		Assert.assertTrue(name);

	}
	
	// validate case related list quick links
	@Then("HAC322 verify case related list quick links")
	public void HAC322_verify_case_related_list_quick_links() throws InterruptedException, IOException {
		caseDetailsTab = new CaseDetailsTab();
		caseDetailsTab.VerifyCaseRelatedListQuickLinks();


	}

	
	
}
