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
import PageObjects.ContactDetailsTab;
import PageObjects.GlobalSearch;
import PageObjects.HomePage;
import PageObjects.Login;
import PageObjects.SelectApplication;
import commonutilities.BaseTest;
import commonutilities.CommonFunctions;

public class HAC1122CreateContact extends CommonFunctions {
	AccountDetailsTab accountDetailsTab;
	GlobalSearch globalSearch;
	String tradename;
	Login loginPO;
	SelectApplication selectApplication;
	HomePage homepage;
	ContactDetailsTab contactDetailsTab;
	boolean name;

	@Given("^HAC1122 user enters (.*) and (.*)$")
	public void HAC622_user_enters_username_and_password(String userName, String password) throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(userName, password);
	}

	@When("HAC1122 select the applicaton")
	public void HAC622_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC1122 close all the open tabs")
	public void HAC1122_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC1122 close the bottom bar")
	public void HAC1122_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}
	
	@When("HAC1122 select contacts tab")
	public void HAC1122_select_contacts_tab() throws InterruptedException {
		homepage = new HomePage();
		homepage.ClickContactsTab();
	}
	
	@When("HAC1122 create new customer contact")
	public void HAC1122_create_new_customer_contact()  throws InterruptedException, IOException {
		homepage = new HomePage();
		homepage.CreateNewContact(
				ppty.getProperty("CONTACT_FIRSTNAME"), 
				ppty.getProperty("CONTACT_MIDDLENAME"), 
				ppty.getProperty("CONTACT_LASTNAME"), 
				ppty.getProperty("CONTACT_ACCOUNTNAME"), 
				Math.random()+ppty.getProperty("CONTACT_EMAIL"), 
				ppty.getProperty("CONTACT_PHONE"));
	}

	// validate name field label on contact details
	@Then("HAC1122 verify name field label")
	public void HAC1122_verify_name_field_label() throws InterruptedException, IOException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isNamePresent();
		Assert.assertTrue(name);

	}

	
	@Then("HAC1122 verify account name field label")
	public void HAC1122_verify_account_name_field_label() throws InterruptedException, IOException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isAccountNamePresent();
		Assert.assertTrue(name);

	}
	
	@Then("HAC1122 verify title field label")
	public void HAC1122_verify_title_field_label() throws InterruptedException, IOException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isTitlePresent();
		Assert.assertTrue(name);

	}
	
	@Then("HAC1122 verify department field label")
	public void HAC1122_verify_department_field_label() throws InterruptedException, IOException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isDepartmentPresent();
		Assert.assertTrue(name);

	}
	
	@Then("HAC1122 verify email field label")
	public void HAC1122_verify_email_field_label() throws InterruptedException, IOException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isEmailPresent();
		Assert.assertTrue(name);

	}
	
	@Then("HAC1122 verify phone field label")
	public void HAC1122_verify_phone_field_label() throws InterruptedException, IOException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isPhonePresent();
		Assert.assertTrue(name);

	}
	
	@Then("HAC1122 verify reportsto field label")
	public void HAC1122_verify_reportsto_field_label() throws InterruptedException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isReportsToPresent();
		Assert.assertTrue(name);
	 
	}

	@Then("HAC1122 verify contactcurrency field label")
	public void HAC1122_verify_contactcurrency_field_label() throws InterruptedException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isContactCurrencyPresent();
		Assert.assertTrue(name);
	}

	@Then("HAC1122 verify contactowner field label")
	public void HAC1122_verify_contactowner_field_label() throws InterruptedException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isContactOWnerPresent();
		Assert.assertTrue(name);
	}

	@Then("HAC1122 verify preferredlanguage field label")
	public void HAC1122_verify_preferredlanguage_field_label() throws InterruptedException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isPreferredLanaguagePresent();
		Assert.assertTrue(name);
	}

	@Then("HAC1122 verify mailingaddress field label")
	public void HAC1122_verify_mailingaddress_field_label() throws InterruptedException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isMailingAddressPresent();
		Assert.assertTrue(name);
	}

	@Then("HAC1122 verify location field label")
	public void hac1122_verify_location_field_label()  throws InterruptedException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isLocationPresent();
		Assert.assertTrue(name);
	}

	@Then("HAC1122 verify asstphone field label")
	public void hac1122_verify_asstphone_field_label()  throws InterruptedException{
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isAsstPhonePresent();
		Assert.assertTrue(name);
	}

	@Then("HAC1122 verify preferredtechnician field label")
	public void hac1122_verify_preferredtechnician_field_label()  throws InterruptedException{
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isPreferredTechnicianPresent();
		Assert.assertTrue(name);
	}

	@Then("HAC1122 verify otherphone field label")
	public void hac1122_verify_otherphone_field_label()  throws InterruptedException{
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isOtherPhonePresent();
		Assert.assertTrue(name);
	}

	@Then("HAC1122 verify mobile field label")
	public void hac1122_verify_mobile_field_label()  throws InterruptedException{
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isMobilePresent();
		Assert.assertTrue(name);
	}

	@Then("HAC1122 verify shift field label")
	public void hac1122_verify_shift_field_label()  throws InterruptedException{
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isShiftPresent();
		Assert.assertTrue(name);
	}

	@Then("HAC1122 verify donotcall field label")
	public void hac1122_verify_donotcall_field_label() throws InterruptedException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isDoNotCallPresent();
		Assert.assertTrue(name);
	}

	@Then("HAC1122 verify emailoptout field label")
	public void hac1122_verify_emailoptout_field_label()  throws InterruptedException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isEmailOptOutPresent();
		Assert.assertTrue(name);
	}
	
}
