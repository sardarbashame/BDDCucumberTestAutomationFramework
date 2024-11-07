package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;
import org.testng.Assert;
import PageObjects.AccountDetailsTab;
import PageObjects.GlobalSearch;
import PageObjects.HomePage;
import PageObjects.Login;
import PageObjects.SelectApplication;
import commonutilities.CommonFunctions;

public class HAC387VerifyIndustry extends CommonFunctions {
	AccountDetailsTab accountDetailsTab;
	GlobalSearch globalSearch;
	String industryname;
	Login loginPO;
	HomePage homepage;
	SelectApplication selectApplication;

	@Given("^HAC387 user enters (.*) and (.*)$")
	public void HAC387_user_enters_username_and_password(String userName, String password) throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(userName, password);
	}

	@When("HAC387 select the applicaton")
	public void HAC387_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC387 close all the open tabs")
	public void HAC387_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC387 close the bottom bar")
	public void HAC387_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}

	@When("HAC387 user is on account details")
	public void HAC387_user_is_on_account_details() throws InterruptedException, IOException {
		globalSearch = new GlobalSearch();
		globalSearch.selectaccountfromglobalsearch();
	}

	@When("HAC387 select accounts tab")
	public void HAC387_select_accounts_tab() throws InterruptedException {
		homepage = new HomePage();
		homepage.clickAccountsTab();
	}

	@When("HAC387 create new customer account")
	public void HAC387_create_new_customer_account() throws InterruptedException, IOException {
		homepage = new HomePage();
		homepage.createNewCustomerAccount(
				ppty.getProperty("ACCTNAME") + Math.random(), 
				ppty.getProperty("INDUSTRY"),
				ppty.getProperty("TRADENAME"));
	}

	// validate industry name on account details
	@Then("HAC387 verify industry name")
	public void HAC387_verify_industry_name() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		industryname = accountDetailsTab.getIndustry();
		Assert.assertEquals(industryname, "Animal Food");

	}

}
