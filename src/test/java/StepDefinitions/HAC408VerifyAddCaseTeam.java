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
import PageObjects.CaseRelatedListQuickLinks;
import PageObjects.ContactDetailsTab;
import PageObjects.GlobalSearch;
import PageObjects.HomePage;
import PageObjects.Login;
import PageObjects.SelectApplication;
import commonutilities.BaseTest;
import commonutilities.CommonFunctions;

public class HAC408VerifyAddCaseTeam extends CommonFunctions {
	Login loginPO;
	SelectApplication selectApplication;
	HomePage homepage;
	CaseDetailsTab caseDetailsTab;
	CaseRelatedListQuickLinks caserelatedlistquicklinks;
	boolean name;

	@Given("^HAC408 user enters (.*) and (.*)$")
	public void HAC622_user_enters_username_and_password(String userName, String password) throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(userName, password);
	}

	@When("HAC408 select the applicaton")
	public void HAC408_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC408 close all the open tabs")
	public void HAC408_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC408 close the bottom bar")
	public void HAC408_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}
	
	@When("HAC408 select cases tab")
	public void HAC408_select_cases_tab() throws InterruptedException  {
		homepage = new HomePage();
		homepage.clickCasesTab();
	}

	@When("HAC408 create new case")
	public void HAC408_create_new_case() throws InterruptedException, IOException  {
		homepage = new HomePage();
		homepage.createNewCase(
				ppty.getProperty("CASECONTACT"),
				ppty.getProperty("CASEFIRSTNAME")
				);
	}
	
	@Then("HAC408 click case team")
	public void HAC408_click_case_team() throws InterruptedException, IOException  {
		caserelatedlistquicklinks = new CaseRelatedListQuickLinks();
		caserelatedlistquicklinks.ClickCaseTeamRelatedListLink();
	}

	@Then("HAC408 add case team")
	public void HAC408_add_case_team() throws InterruptedException, IOException  {
		caserelatedlistquicklinks = new CaseRelatedListQuickLinks();
		caserelatedlistquicklinks.AddCaseTeam();
	}
}
