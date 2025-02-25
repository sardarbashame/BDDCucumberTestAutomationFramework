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

public class HAC1367CreateCaseAssetsbyGuidedFlow extends CommonFunctions {
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

	@Given("^HAC1367 user enters (.*) and (.*)$")
	public void HAC145_user_enters_username_and_password(String userName, String password) throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(userName, password);
	}

	@When("HAC1367 select the applicaton")
	public void HAC145_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC1367 close all the open tabs")
	public void HAC145_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC1367 close the bottom bar")
	public void HAC387_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}

	@When("HAC1367 click on cases tab")
	public void HAC1367_click_on_cases_tab() throws InterruptedException {
		homePage = new HomePage();
		homePage.clickCasesTab();
	}

	@When("HAC1367 create new case")
	public void HAC1367_create_new_case() throws Exception  {
		homePage = new HomePage();
		homePage.createNewCase(
				getObjDetails().getProperty("CASECONTACT"),
				getObjDetails().getProperty("CASEFIRSTNAME")
				);
	}
	
	@When("HAC1367 click on add asset quick action")
	public void HAC1367_click_on_add_asset_quick_action() throws InterruptedException, IOException  {
		casedetailstab = new CaseDetailsTab();
		casedetailstab.ClickAddAssetQuickAction();
		
	}
	
	@Then("HAC1367 add single asset")
	public void HAC1367_add_single_asset() throws InterruptedException, IOException  {
		casedetailstab = new CaseDetailsTab();
		casedetailstab.AddSingleAsset();
		
	}
}
