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
import PageObjects.CaseRelatedListQuickLinks;
import PageObjects.EstimateCreationFlowStep1;
import PageObjects.EstimateCreationFlowStep2;
import PageObjects.EstimateCreationFlowStep3;
import PageObjects.GlobalSearch;
import PageObjects.HomePage;
import PageObjects.Login;
import PageObjects.SelectApplication;
import commonutilities.BaseTest;
import commonutilities.CommonFunctions;

public class HAC1368DisplaySalesOrderonCaseAssets extends CommonFunctions {
	GlobalSearch globalSearch;
	Login loginPO;
	CaseDetailsTab caseDetailsTab;
	SelectApplication selectApplication;
	EstimateCreationFlowStep1 estimateCreationFlowStep1;
	EstimateCreationFlowStep2 estimateCreationFlowStep2;
	EstimateCreationFlowStep3 estimateCreationFlowStep3;
	HomePage homePage;
	CaseRelatedListQuickLinks caserelatedlistquicklinks;
	CaseDetailsTab casedetailstab;
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

	@Given("^HAC1368 user enters (.*) and (.*)$")
	public void HAC1368_user_enters_username_and_password(String userName, String password) throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(userName, password);
	}

	@When("HAC1368 select the applicaton")
	public void HAC1368_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC1368 close all the open tabs")
	public void HAC1368_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC1368 close the bottom bar")
	public void HAC1368_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}

	@When("HAC1368 click on cases tab")
	public void HAC1368_click_on_cases_tab() throws InterruptedException {
		homePage = new HomePage();
		homePage.clickCasesTab();
	}

	@When("HAC1368 create new case")
	public void HAC1368_create_new_case() throws InterruptedException, IOException  {
		homePage = new HomePage();
		homePage.createNewCase(
				getObjDetails().getProperty("CASECONTACT"),
				getObjDetails().getProperty("CASEFIRSTNAME"),
				getObjDetails().getProperty("CASESUB")
				);
	}
	
	@When("HAC1368 click on add asset quick action")
	public void HAC1368_click_on_add_asset_quick_action() throws InterruptedException, IOException  {
		casedetailstab = new CaseDetailsTab();
		casedetailstab.ClickAddAssetQuickAction();
		
	}
	
	@Then("HAC1368 add single asset")
	public void HAC1368_add_single_asset() throws InterruptedException, IOException  {
		casedetailstab = new CaseDetailsTab();
		casedetailstab.AddSingleAsset();
		
	}
}
