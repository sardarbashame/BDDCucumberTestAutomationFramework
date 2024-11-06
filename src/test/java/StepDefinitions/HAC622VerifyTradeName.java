package StepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import PageObjects.AccountDetailsTab;
import PageObjects.GlobalSearch;
import PageObjects.HomePage;
import PageObjects.Login;
import PageObjects.SelectApplication;
import commonutilities.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HAC622VerifyTradeName extends CommonFunctions {
	AccountDetailsTab accountDetailsTab;
	GlobalSearch globalSearch;
	String tradename;
	Login loginPO;
	SelectApplication selectApplication;
	HomePage homepage;

	@Given("^HAC622 user enters (.*) and (.*)$")
	public void HAC622_user_enters_username_and_password(String userName, String password) throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(userName, password);
	}

	@When("HAC622 select the applicaton")
	public void HAC622_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC622 close all the open tabs")
	public void HAC622_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC622 close the bottom bar")
	public void HAC622_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}

	@When("HAC622 user is on account details")
	public void HAC622_user_is_on_account_details() throws InterruptedException, IOException {
		globalSearch = new GlobalSearch();
		globalSearch.selectaccountfromglobalsearch();
	}

	// validate trade name on account details
	@Then("HAC622 verify trade name")
	public void HAC622_verify_trade_name() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		tradename = accountDetailsTab.getTradeName();
		Assert.assertEquals(tradename, "Trade Name - Test Customer Account11");

	}

	@When("HAC622 select accounts tab")
	public void HAC622_select_accounts_tab() throws InterruptedException {
		homepage = new HomePage();
		homepage.clickAccountsTab();
	}

	@When("HAC622 create new customer account")
	public void HAC622_create_new_customer_account() throws InterruptedException, IOException {
		homepage = new HomePage();
		homepage.createNewCustomerAccount(ppty.getProperty("ACCTNAME") + Math.random(), ppty.getProperty("INDUSTRY"),
				ppty.getProperty("TRADENAME"));
	}

	// validate trade name on account details
	@Then("HAC622 verify trade name_1")
	public void HAC622_verify_trade_name_1() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		tradename = accountDetailsTab.getTradeName();
		Assert.assertEquals(tradename, "TestTradeName");

	}

}
