package StepDefinitions;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import PageObjects.AccountDetailsTab;
import PageObjects.GlobalSearch;
import PageObjects.Login;
import PageObjects.SelectApplication;
import commonutilities.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HAC627VerifyBillingAddress extends CommonFunctions {

	Login loginPO;
	SelectApplication selectApplication;
	GlobalSearch globalSearch;

	@Given("HAC627 user enters {string} and {string}")
	public void HAC1124_user_enters_username_and_password(String userName, String password) throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(userName, password);
	}

	@When("HAC627 select the applicaton")
	public void HAC627_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC627 close all the open tabs")
	public void HAC627_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC627 close the bottom bar")
	public void HAC627_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();

	}

	@When("HAC627 user is on exsiting account details")
	public void HAC627_user_is_on_account_details() throws InterruptedException {
		globalSearch = new GlobalSearch();
		globalSearch.selectaccountfromglobalsearch();

	}

	@Then("HAC627 verify the billing Address on exsiting account record")
	public void HAC627_verify_the_billing_address_on_contact_list_view_button() throws InterruptedException {

		AccountDetailsTab AccountDetailsTab = new AccountDetailsTab();
		String billingaddress = AccountDetailsTab.getBillingAddress();
		System.out.println(billingaddress);
		String formattedbillingaddress = billingaddress.replace("\n", "");
		System.out.println(formattedbillingaddress);
		String value2 =getPropertyValue("billingaddress");

		if (formattedbillingaddress.contains(value2)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}

	}

}
