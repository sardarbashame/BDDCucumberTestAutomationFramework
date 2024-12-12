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

public class HAC145VerifyAccountLayout extends CommonFunctions {
	AccountDetailsTab accountDetailsTab;
	GlobalSearch globalSearch;
	String industryname;
	Login loginPO;
	SelectApplication selectApplication;
	HomePage homepage;
	String accountcurrency;
	String accountname;
	String type;
	String description;
	String phone;
	boolean boolvalue;
	String strvalue;
	boolean tradenamelabel;
	boolean operatinghourslabel;
	boolean employeeslabel;
	boolean activelabel;
	boolean customerporatlaccountlabel;
	boolean superregionlabel;
	String tradename;
	String parentaccount;
	boolean saleschannellabel;
	boolean regionalsettingslabel;
	boolean languagelabel;
	boolean websitelabel;

	@Given("Login as service user")
	public void HAC145_user_enters_username_and_password() throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(getUserName("SERVICE_SCH_USER_NAME"), getPassword("SERVICE_SCH_PASSWORD"));
	}

	@When("HAC145 select the applicaton")
	public void HAC145_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC145 close all the open tabs")
	public void HAC145_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC145 close the bottom bar")
	public void HAC387_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}
	
	@When("close the bottom bar")
	public void closeTheBottombar() throws InterruptedException {
		closeBottomeBar();
	}

	@When("HAC145 user is on account details")
	public void HAC145_user_is_on_account_details() throws InterruptedException, IOException {
		globalSearch = new GlobalSearch();
		globalSearch.selectaccountfromglobalsearch();
	}

	// validate account name on account details
	@Then("HAC145 verify account name")
	public void HAC145_verify_account_name() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		accountname = accountDetailsTab.getAccountName();
		Assert.assertTrue(accountname.contains("HACTestAccount"));
	}

	@When("HAC145 select accounts tab")
	public void HAC145_select_accounts_tab() throws InterruptedException {
		homepage = new HomePage();
		homepage.clickAccountsTab();
	}

	@When("HAC145 create new customer account")
	public void HAC145_create_new_customer_account() throws InterruptedException, IOException {
		homepage = new HomePage();
		homepage.createNewCustomerAccount(
				getObjDetails().getProperty("ACCTNAME") + Math.random(), 
				getObjDetails().getProperty("ACCTPHONE"),
				getObjDetails().getProperty("ACCTEMAIL"),
				getObjDetails().getProperty("INDUSTRY")
				);
	}

	@Then("HAC145 verify type")
	public void HAC145_verify_type() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		type = accountDetailsTab.getType();
		Assert.assertEquals(type, "Customer");

	}

	// validate industry name on account details
	@Then("HAC145 verify industry")
	public void HAC145_verify_industry() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		industryname = accountDetailsTab.getIndustry();
		Assert.assertEquals(industryname, "Animal Food");

	}

	@Then("HAC145 verify parent account")
	public void HAC145_verify_parent_account() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		parentaccount = accountDetailsTab.getParentAccount();
		Assert.assertEquals(parentaccount, "Juicy Box (Sample)");
		}


	@Then("HAC145 verify account currency")
	public void HAC145_verify_accountcurrency() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		accountcurrency = accountDetailsTab.getAccountCurrency();
		Assert.assertEquals(accountcurrency, "USD - U.S. Dollar");

	}

	// validate trade name label on account details
	@Then("HAC145 verify trade name label")
	public void HAC145_verify_trade_name_label() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		tradenamelabel = accountDetailsTab.isTradeNamePresent();
		Assert.assertTrue(tradenamelabel);

	}

	// validate trade name value on account details
	@Then("HAC145 verify trade name value")
	public void HAC145_verify_trade_name_value() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		tradename = accountDetailsTab.getTradeName();
		Assert.assertTrue(tradename.contains("HACTradeName"));

	}
	
	// validate language value on account details
	@Then("HAC145 verify language value")
	public void HAC145_verify_language_value() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		tradename = accountDetailsTab.getLanguage();
		Assert.assertTrue(tradename.contains("English"));

	}
	// validate language value on account details
	@Then("HAC145 verify website value")
	public void HAC145_verify_website_value() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		tradename = accountDetailsTab.getWebbSite();
		Assert.assertTrue(tradename.contains("www.hactest.com"));

	}
	// validate active label on account details
	@Then("HAC145 verify active label")
	public void HAC145_verify_active_label() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		activelabel = accountDetailsTab.isActivePresent();
		Assert.assertTrue(activelabel);

	}

	// validate customer portal account label on account details
	@Then("HAC145 verify customer portal account label")
	public void HAC145_verify_customer_portal_account_label() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		customerporatlaccountlabel = accountDetailsTab.isCustomerPortalAccountPresent();
		Assert.assertTrue(customerporatlaccountlabel);

	}

	// validate Employees label on account details
	@Then("HAC145 verify employees label")
	public void HAC145_verify_employees_label() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		employeeslabel = accountDetailsTab.isEmployeesPresent();
		Assert.assertTrue(employeeslabel);

	}

	// validate Operating Hours label on account details
	@Then("HAC145 verify operating hours label")
	public void HAC145_verify_operating_hours_label() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		operatinghourslabel = accountDetailsTab.isOperatingHoursPresent();
		Assert.assertTrue(operatinghourslabel);

	}

	// validate Super Region label on account details
	@Then("HAC145 verify super region label")
	public void HAC145_verify_super_region_label() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		superregionlabel = accountDetailsTab.isSuperRegionPresent();
		Assert.assertTrue(superregionlabel);

	}

	// validate Sales Channel label on account details
	@Then("HAC145 verify sales channel label")
	public void HAC145_verify_sales_channel_label() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		saleschannellabel = accountDetailsTab.isSalesChannelPresent();
		Assert.assertTrue(saleschannellabel);

	}

	// validate Regional Settings label on account details
	@Then("HAC145 verify regional settings label")
	public void HAC145_verify_regional_settings_label() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		regionalsettingslabel = accountDetailsTab.isRegionalSettingsPresent();
		Assert.assertTrue(regionalsettingslabel);

	}

	// validate Language label on account details
	@Then("HAC145 verify language label")
	public void HAC145_verify_language_label() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		languagelabel = accountDetailsTab.islanguagePresent();
		Assert.assertTrue(languagelabel);

	}

	// validate Website label on account details
	@Then("HAC145 verify website label")
	public void HAC145_verify_website_label() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		websitelabel = accountDetailsTab.isWebsitePresent();
		Assert.assertTrue(websitelabel);

	}
	
	// validate shipping address label on account details
	@Then("HAC145 verify shippingaddress label")
	public void HAC145_verify_shippingaddress_label() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		boolvalue = accountDetailsTab.isShippingAddressPresent();
		Assert.assertTrue(boolvalue);

	}
	
	// validate trade name value on account details
	@Then("HAC145 verify shippingaddress value")
	public void HAC145_verify_shippingaddress_value() throws InterruptedException, IOException {
		accountDetailsTab = new AccountDetailsTab();
		strvalue = accountDetailsTab.getShippingAddress();
		Assert.assertTrue(strvalue.contains("100 1st Street"));

	}

}
