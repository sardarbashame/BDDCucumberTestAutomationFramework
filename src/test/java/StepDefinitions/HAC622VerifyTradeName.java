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


public class HAC622VerifyTradeName extends BaseTest{
	AccountDetailsTab accountDetailsTab;
	GlobalSearch globalSearch;
	String tradename;
	Login loginPO;
	SelectApplication  selectApplication;
	HomePage homepage;

@Given("^HAC622 user enters (.*) and (.*)$")	
public void HAC622_user_enters_username_and_password(String userName, String password) throws  IOException { 
	loginPO = new Login(driver);
	loginPO.goTo(getParameters().getProperty("HAC_URL")); 
	loginPO.LoginApp (userName,password); 
	}

@When("HAC622 select the applicaton")
public void HAC622_select_the_applicaton() throws InterruptedException, IOException { 
	selectApplication = new SelectApplication(driver);
	  selectApplication.selectApp(getParameters().getProperty("APPNAME")); 
	  }

@When("HAC622 close all the open tabs")	  
public void HAC622_close_all_the_open_tabs() throws InterruptedException { 
	closeAllTabs(); 
	}

@When("HAC622 close the bottom bar")	  
public void HAC622_close_the_bottom_bar() throws InterruptedException { 
	closeBottomeBar(); 
	}
	 	
@When("HAC622 select accounts tab")
public void HAC622_select_accounts_tab() throws InterruptedException {
	homepage = new HomePage(driver);
	homepage.clickAccountsTab();
}

@When("HAC622 create new customer account")
public void HAC622_create_new_customer_account() throws InterruptedException, IOException {
	homepage = new HomePage(driver);
	homepage.createNewCustomerAccount(
			getParameters().getProperty("ACCTNAME")+Math.random(), 
			getParameters().getProperty("INDUSTRY"), 
			getParameters().getProperty("TRADENAME"));
}
//validate trade name on account details 
@Then ("HAC622 verify trade name")
public void HAC622_verify_trade_name() throws InterruptedException, IOException 
{		
	 accountDetailsTab = new AccountDetailsTab(driver);
	 tradename = accountDetailsTab.getTradeName();
	 Assert.assertEquals(tradename,"TestTradeName");
	
}

}
