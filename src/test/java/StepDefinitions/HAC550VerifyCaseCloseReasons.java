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

public class HAC550VerifyCaseCloseReasons extends CommonFunctions {
	Login loginPO;
	SelectApplication selectApplication;
	HomePage homepage;
	CaseDetailsTab caseDetailsTab;
	boolean name;

	@Given("HAC550 login as a service manager")
	public void HAC550_login_as_a_service_manager() throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(getUserName("SERVICE_MANAGER_USER_NAME"),getPassword("SERVICE_MANAGER_PASSWORD"));
	}

	@When("HAC550 select the applicaton")
	public void HAC550_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC550 close all the open tabs")
	public void HAC550_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC550 close the bottom bar")
	public void HAC550_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}
	
	@When("HAC550 select cases tab")
	public void HAC550_select_cases_tab() throws InterruptedException  {
		homepage = new HomePage();
		homepage.clickCasesTab();
	}

	@When("HAC550 create new case")
	public void HAC550_create_new_case() throws  Exception  {
		homepage = new HomePage();
		homepage.createNewCase(
				ppty.getProperty("CASECONTACT"),
				ppty.getProperty("CASEFIRSTNAME")
				);
	}

	// click the case close button from quick actions
	@Then("HAC550 click case close quick action")
	public void HAC550_click_case_close_quick_action() throws InterruptedException, IOException {
		caseDetailsTab = new CaseDetailsTab();
		caseDetailsTab.ClickCloseCaseQuickAction();

	}
	
	@Then("HAC550 verify case close reasons")
	public void HAC550_verify_close_case_reasons()throws InterruptedException, IOException {
		caseDetailsTab = new CaseDetailsTab();
		caseDetailsTab.VerifyCaseCloseReasons();
	}

	
}
