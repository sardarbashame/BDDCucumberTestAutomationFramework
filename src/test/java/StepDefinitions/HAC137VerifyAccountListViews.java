package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;
import org.testng.Assert;
import PageObjects.AccountListViews;
import PageObjects.HomePage;
import PageObjects.Login;
import PageObjects.SelectApplication;
import commonutilities.CommonFunctions;

public class HAC137VerifyAccountListViews extends CommonFunctions {
	AccountListViews accountlistviews;
	HomePage homepage;
	Login loginPO;
	SelectApplication selectApplication;

	@Given("^HAC137 user enters (.*) and (.*)$")
	public void HAC137_user_enters_username_and_password(String userName, String password) throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(userName, password);
	}

	@When("HAC137 select the applicaton")
	public void HAC137_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC137 close all the open tabs")
	public void HAC137_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC137 close the bottom bar")
	public void HAC137_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}

	// click on accounts tab
	@When("HAC137 user is on accounts home page")
	public void HAC137_user_is_on_account_home_page() throws InterruptedException, IOException {
		homepage = new HomePage();
		homepage.clickAccountsTab();
	}

	// click on accounts list view button
	@When("HAC137 click on accounts list view button")
	public void HAC137_click_on_accounts_list_view_button() throws InterruptedException, IOException {
		accountlistviews = new AccountListViews();
		accountlistviews.clickAccountLisViewButton();
	}

	// verify the all accounts list view
	@Then("HAC137 verify the all accounts list view")
	public void HAC137_verify_the_all_accounts_list_view() throws InterruptedException, IOException {
		Assert.assertTrue(accountlistviews.isAllAccountsListViewPresent());
	}

	// verify the my accounts list view
	@Then("HAC137 verify the my accounts list view")
	public void HAC137_verify_the_my_accounts_list_view() throws InterruptedException, IOException {
		accountlistviews = new AccountListViews();
		Assert.assertTrue(accountlistviews.isMyAccountsListViewPresent());
	}

	// verify the customer accounts list view
	@Then("HAC137 verify the customer accounts list view")
	public void HAC137_verify_the_customer_accounts_list_view() throws InterruptedException, IOException {
		accountlistviews = new AccountListViews();
		Assert.assertTrue(accountlistviews.isCustomerAccountsListViewPresent());
	}

	// verify the prospect accounts list view
	@Then("HAC137 verify the prospect accounts list view")
	public void HAC137_verify_the_prospect_accounts_list_view() throws InterruptedException, IOException {
		accountlistviews = new AccountListViews();
		Assert.assertTrue(accountlistviews.isProspectAccountsListViewPresent());
	}

	// verify the intercompany accounts list view
	@Then("HAC137 verify the intercompany accounts list view")
	public void HAC137_verify_the_intercompany_accounts_list_view() throws InterruptedException, IOException {
		accountlistviews = new AccountListViews();
		Assert.assertTrue(accountlistviews.isIntercompanyAccountsListViewPresent());
	}

	// verify the oem accounts list view
	@Then("HAC137 verify the oem accounts list view")
	public void HAC137_verify_the_oem_accounts_list_view() throws InterruptedException, IOException {
		accountlistviews = new AccountListViews();
		Assert.assertTrue(accountlistviews.isOEMAccountsListViewPresent());
	}

	// select the all accounts list view
	@Then("HAC137 select all accounts list view")
	public void HAC137_select_all_accounts_list_view() throws InterruptedException, IOException {
		accountlistviews = new AccountListViews();
		accountlistviews.clickAllAccountsListView();
	}

	// verify the headers in All Accounts list view
	@Then("HAC137 verify the account name header in all accounts list view")
	public void hac137_verify_the_account_name_header_in_all_accounts_list_view() throws InterruptedException {
		accountlistviews = new AccountListViews();
		Assert.assertTrue(accountlistviews.isAllAccountsListViewAccountNameColPresent());
	}

	@Then("HAC137 verify the account site header in all accounts list view")
	public void hac137_verify_the_account_site_header_in_all_accounts_list_view() throws InterruptedException {
		accountlistviews = new AccountListViews();
		Assert.assertTrue(accountlistviews.isAllAccountsListViewAccountSiteColPresent());
	}

	@Then("HAC137 verify the phone header in all accounts list view")
	public void hac137_verify_the_phone_header_in_all_accounts_list_view() throws InterruptedException {
		accountlistviews = new AccountListViews();
		Assert.assertTrue(accountlistviews.isAllAccountsListViewPhoneColPresent());
	}

	@Then("HAC137 verify the type header in all accounts list view")
	public void hac137_verify_the_type_header_in_all_accounts_list_view() throws InterruptedException {
		accountlistviews = new AccountListViews();
		Assert.assertTrue(accountlistviews.isAllAccountsListViewTypeColPresent());
	}

	@Then("HAC137 verify the shipping city header in all accounts list view")
	public void hac137_verify_the_shipping_city_header_in_all_accounts_list_view() throws InterruptedException {
		accountlistviews = new AccountListViews();
		Assert.assertTrue(accountlistviews.isAllAccountsListViewShippingCityColPresent());
	}

	@Then("HAC137 verify the corporate group header in all accounts list view")
	public void hac137_verify_the_corporate_group_header_in_all_accounts_list_view() throws InterruptedException {
		accountlistviews = new AccountListViews();
		Assert.assertTrue(accountlistviews.isAllAccountsListViewCorporateGroupColPresent());
	}

	@Then("HAC137 verify the shipping stateprovince name header in all accounts list view")
	public void hac137_verify_the_shipping_stateprovince_name_header_in_all_accounts_list_view()
			throws InterruptedException {
		accountlistviews = new AccountListViews();
		Assert.assertTrue(accountlistviews.isAllAccountsListViewShippingStateProvinceColPresent());
	}

	@Then("HAC137 verify the shipping country header in all accounts list view")
	public void hac137_verify_the_shipping_country_header_in_all_accounts_list_view() throws InterruptedException {
		accountlistviews = new AccountListViews();
		Assert.assertTrue(accountlistviews.isAllAccountsListViewShippingCountryColPresent());
	}

	@Then("HAC137 verify the super region header in all accounts list view")
	public void hac137_verify_the_super_region_header_in_all_accounts_list_view() throws InterruptedException {
		accountlistviews = new AccountListViews();
		Assert.assertTrue(accountlistviews.isAllAccountsListViewSuperRegionColPresent());
	}

	@Then("HAC137 verify the operating hours header in all accounts list view")
	public void hac137_verify_the_operating_hours_header_in_all_accounts_list_view() throws InterruptedException {
		accountlistviews = new AccountListViews();
		Assert.assertTrue(accountlistviews.isAllAccountsListViewOperatingHoursColPresent());
	}

	@Then("HAC137 verify the parent account header in all accounts list view")
	public void hac137_verify_the_parent_account_header_in_all_accounts_list_view() throws InterruptedException {
		accountlistviews = new AccountListViews();
		Assert.assertTrue(accountlistviews.isAllAccountsListViewParentAccountColPresent());
	}

	@Then("HAC137 verify the account record type header in all accounts list view")
	public void hac137_verify_the_account_record_type_header_in_all_accounts_list_view() throws InterruptedException {
		accountlistviews = new AccountListViews();
		Assert.assertTrue(accountlistviews.isAllAccountsListViewAccountRecTypeColPresent());
	}

	// select the My Accounts list view
	@Then("HAC137 select my accounts list view")
	public void HAC137_select_my_accounts_list_view() throws InterruptedException, IOException {
		accountlistviews = new AccountListViews();
		accountlistviews.clickMyAccountsListView();
	}

	// select the Customer Accounts list view
	@Then("HAC137 select customer accounts list view")
	public void HAC137_select_customer_accounts_list_view() throws InterruptedException, IOException {
		accountlistviews = new AccountListViews();
		accountlistviews.clickCustomerAccountsListView();
	}

	// select the Prospect Accounts list view
	@Then("HAC137 select prospect accounts list view")
	public void HAC137_select_prospect_accounts_list_view() throws InterruptedException, IOException {
		accountlistviews = new AccountListViews();
		accountlistviews.clickProspectAccountsListView();
	}

	// select the Intercompany Accounts list view
	@Then("HAC137 select intercompany accounts list view")
	public void HAC137_select_intercompany_accounts_list_view() throws InterruptedException, IOException {
		accountlistviews = new AccountListViews();
		accountlistviews.clickInterCompanyAccountsListView();
	}

}
