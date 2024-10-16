package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import testcomponents.BaseTest;
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

import PageObjects.GlobalSearch;
import PageObjects.HomePage;
import PageObjects.Login;
import PageObjects.SelectApplication;

public class HAC387VerifyIndustry extends BaseTest {
	AccountDetailsTab accountDetailsTab;
	GlobalSearch globalSearch;
	String industryname;
	Login loginPO;
	SelectApplication selectApplication;
	HomePage homepage;

	@Given("^HAC387 user enters (.*) and (.*)$")
	public void HAC387_user_enters_username_and_password(String userName, String password) throws IOException {
		loginPO = new Login(driver);
		loginPO.goTo(getParameters().getProperty("HAC_URL"));
		loginPO.LoginApp(userName, password);
	}

	@When("HAC387 select the applicaton")
	public void HAC387_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication(driver);
		selectApplication.selectApp(getParameters().getProperty("APPNAME"));
	}

	@When("HAC387 close all the open tabs")
	public void HAC387_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC387 close the bottom bar")
	public void HAC387_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}
	
	@When("HAC387 select accounts tab")
	public void HAC387_select_accounts_tab() throws InterruptedException {
		homepage = new HomePage(driver);
		homepage.clickAccountsTab();
	}

	@When("HAC387 create new customer account")
	public void HAC387_create_new_customer_account() throws InterruptedException, IOException {
		homepage = new HomePage(driver);
		homepage.createNewCustomerAccount(getParameters().getProperty("ACCTNAME")+Math.random(), getParameters().getProperty("INDUSTRY"), getParameters().getProperty("TRADENAME"));
	}

//validate industry name on account details 
	@Then("HAC387 verify industry name")
	public void HAC387_verify_industry_name() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab(driver);
		industryname = accountDetailsTab.getIndustry();
		Assert.assertEquals(industryname, "Animal Food");

	}

}
