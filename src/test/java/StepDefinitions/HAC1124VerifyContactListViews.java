package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;
import org.testng.Assert;
import PageObjects.AccountDetailsTab;
import PageObjects.ContactListViews;
import PageObjects.GlobalSearch;
import PageObjects.Login;
import PageObjects.SelectApplication;
import commonutilities.CommonFunctions;

public class HAC1124VerifyContactListViews extends CommonFunctions {
	AccountDetailsTab accountDetailsTab;
	ContactListViews contactlistviews;
	GlobalSearch globalSearch;
	String industryname;
	Login loginPO;
	SelectApplication selectApplication;

	@Given("Login as service user")
	public void hac1124_login_as_service_user() {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		String Uname = ppty.getProperty("SERVICE_USER");
		String pwd = ppty.getProperty("SERVICE_PASSWORD");
		loginPO.LoginApp(Uname, pwd);
	}

	@When("HAC1124 select the applicaton")
	public void HAC1124_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC1124 close all the open tabs")
	public void HAC1124_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC1124 close the bottom bar")
	public void HAC387_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}

	// click on contacts tab
	@When("HAC1124 user is on contact home page")
	public void HAC1124_user_is_on_contact_home_page() throws InterruptedException, IOException {
		contactlistviews = new ContactListViews();
		contactlistviews.clickcontactdetailsTab();
	}

	// click on contacts list view button
	@When("HAC1124 click on contact list view button")
	public void HAC1124_click_on_contact_list_view_button() throws InterruptedException, IOException {
		contactlistviews = new ContactListViews();
		contactlistviews.clickContactLisViewButton();
	}

	// verify the customer contacts list views
	@Then("HAC1124 verify the customer contact list view")
	public void HAC1124_verify_the_customer_contact_list_view() throws InterruptedException, IOException {
		contactlistviews = new ContactListViews();
		waitForElementToAppear(contactlistviews.wait_customerContacts, 30);
		Assert.assertTrue(contactlistviews.txt_customerContacts.isDisplayed());
	}

	// verify the heat and control billing contacts list views
	@Then("HAC1124 verify the heat and control billing contacts list view")
	public void HAC1124_verify_the_heat_and_control_billing_contacts_list_view()
			throws InterruptedException, IOException {
		contactlistviews = new ContactListViews();
		Assert.assertTrue(contactlistviews.txt_heatAndCntrlBilling.isDisplayed());
	}

	// verify the heat and control sales contacts list views
	@Then("HAC1124 verify the heat and control sales contacts list view")
	public void HAC1124_verify_the_heat_and_control_sales_contacts_list_view()
			throws InterruptedException, IOException {
		contactlistviews = new ContactListViews();
		Assert.assertTrue(contactlistviews.txt_heatAndCntrlSales.isDisplayed());
	}

	// verify the vendor contacts list views
	@Then("HAC1124 verify the vendor contacts list view")
	public void HAC1124_verify_the_vendor_contacts_list_view() throws InterruptedException, IOException {
		contactlistviews = new ContactListViews();
		Assert.assertTrue(contactlistviews.txt_vendorContacts.isDisplayed());
	}

	// select the customer contacts list view
	@Then("HAC1124 select the customer contacts list view")
	public void HAC1124_select_the_customer_contacts_list_view() throws InterruptedException, IOException {
		contactlistviews = new ContactListViews();
		contactlistviews.clickCustomerContactsListView();
	}

	// verify the name column in customer contacts list views
	@Then("HAC1124 verify the name column in customer contact list view")
	public void HAC1124_verify_the_name_column_in_customer_contact_list_view()
			throws InterruptedException, IOException {
		contactlistviews = new ContactListViews();
		Assert.assertTrue(contactlistviews.txt_name.isDisplayed());
	}

	// verify the title column in customer contacts list views
	@Then("HAC1124 verify the title column in customer contact list view")
	public void HAC1124_verify_the_title_column_in_customer_contact_list_view()
			throws InterruptedException, IOException {
		contactlistviews = new ContactListViews();
		Assert.assertTrue(contactlistviews.txt_title.isDisplayed());
	}

	// verify the account name column in customer contacts list views
	@Then("HAC1124 verify the account name column in customer contact list view")
	public void HAC1124_verify_the_account_name_column_in_customer_contact_list_view()
			throws InterruptedException, IOException {
		contactlistviews = new ContactListViews();
		Assert.assertTrue(contactlistviews.txt_accountName.isDisplayed());
	}

	// verify the phone column in customer contacts list views
	@Then("HAC1124 verify the phone column in customer contact list view")
	public void HAC1124_verify_the_phone_column_in_customer_contact_list_view()
			throws InterruptedException, IOException {
		contactlistviews = new ContactListViews();
		Assert.assertTrue(contactlistviews.txt_phone.isDisplayed());
	}

	// verify the mobile column in customer contacts list views
	@Then("HAC1124 verify the mobile column in customer contact list view")
	public void HAC1124_verify_the_mobile_column_in_customer_contact_list_view()
			throws InterruptedException, IOException {
		contactlistviews = new ContactListViews();
		Assert.assertTrue(contactlistviews.txt_mobile.isDisplayed());
	}

	// verify the preferred phone column in customer contacts list views
	@Then("HAC1124 verify the preferred phone column in customer contact list view")
	public void HAC1124_verify_the_preferred_phone_column_in_customer_contact_list_view()
			throws InterruptedException, IOException {
		contactlistviews = new ContactListViews();
		Assert.assertTrue(contactlistviews.txt_preferredPhone.isDisplayed());
	}

	// verify the email column in customer contacts list views
	@Then("HAC1124 verify the email column in customer contact list view")
	public void HAC1124_verify_the_email_column_in_customer_contact_list_view()
			throws InterruptedException, IOException {
		contactlistviews = new ContactListViews();
		Assert.assertTrue(contactlistviews.txt_email.isDisplayed());
	}

	// verify the mailing city column in customer contacts list views
	@Then("HAC1124 verify the mailing city column in customer contact list view")
	public void HAC1124_verify_the_mailing_city_column_in_customer_contact_list_view()
			throws InterruptedException, IOException {
		contactlistviews = new ContactListViews();
		Assert.assertTrue(contactlistviews.txt_mailingCity.isDisplayed());
	}

	// verify the shift column in customer contacts list views
	@Then("HAC1124 verify the shift column in customer contact list view")
	public void HAC1124_verify_the_shift_column_in_customer_contact_list_view()
			throws InterruptedException, IOException {
		contactlistviews = new ContactListViews();
		Assert.assertTrue(contactlistviews.txt_shift.isDisplayed());
	}

	// verify the location column in customer contacts list views
	@Then("HAC1124 verify the location column in customer contact list view")
	public void HAC1124_verify_the_location_column_in_customer_contact_list_view()
			throws InterruptedException, IOException {
		contactlistviews = new ContactListViews();
		Assert.assertTrue(contactlistviews.txt_location.isDisplayed());
	}

}
