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

public class HAC148VerifyContactPageLayoutFields extends CommonFunctions {
	AccountDetailsTab accountDetailsTab;
	GlobalSearch globalSearch;
	String tradename;
	Login loginPO;
	SelectApplication selectApplication;
	HomePage homepage;
	ContactDetailsTab contactDetailsTab;
	boolean name;

	@Given("^HAC148 user enters (.*) and (.*)$")
	public void HAC622_user_enters_username_and_password(String userName, String password) throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(userName, password);
	}

	@When("HAC148 select the applicaton")
	public void HAC622_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC148 close all the open tabs")
	public void HAC148_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC148 close the bottom bar")
	public void HAC148_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}
	
	@When("HAC148 select contacts tab")
	public void HAC148_select_contacts_tab() throws InterruptedException {
		homepage = new HomePage();
		homepage.ClickContactsTab();
	}
	
	@When("HAC148 create new customer contact")
	public void hac148_create_new_customer_contact()  throws InterruptedException, IOException {
		homepage = new HomePage();
		homepage.CreateNewContact(
				getObjDetails().getProperty("CONTACT_FIRSTNAME"), 
				getObjDetails().getProperty("CONTACT_MIDDLENAME"), 
				getObjDetails().getProperty("CONTACT_LASTNAME"), 
				getObjDetails().getProperty("CONTACT_ACCOUNTNAME"), 
				Math.random()+getObjDetails().getProperty("CONTACT_EMAIL"), 
				getObjDetails().getProperty("CONTACT_PHONE"));
	}

	// validate name field label on contact details
	@Then("HAC148 verify name field label")
	public void HAC148_verify_name_field_label() throws InterruptedException, IOException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isNamePresent();
		Assert.assertTrue(name);

	}

	
	@Then("HAC148 verify account name field label")
	public void HAC148_verify_account_name_field_label() throws InterruptedException, IOException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isAccountNamePresent();
		Assert.assertTrue(name);

	}
	
	@Then("HAC148 verify title field label")
	public void HAC148_verify_title_field_label() throws InterruptedException, IOException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isTitlePresent();
		Assert.assertTrue(name);

	}
	
	@Then("HAC148 verify department field label")
	public void HAC148_verify_department_field_label() throws InterruptedException, IOException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isDepartmentPresent();
		Assert.assertTrue(name);

	}
	
	@Then("HAC148 verify email field label")
	public void HAC148_verify_email_field_label() throws InterruptedException, IOException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isEmailPresent();
		Assert.assertTrue(name);

	}
	
	@Then("HAC148 verify phone field label")
	public void HAC148_verify_phone_field_label() throws InterruptedException, IOException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isPhonePresent();
		Assert.assertTrue(name);

	}
	
	@Then("HAC148 verify reportsto field label")
	public void hac148_verify_reportsto_field_label() throws InterruptedException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isReportsToPresent();
		Assert.assertTrue(name);
	 
	}

	@Then("HAC148 verify contactcurrency field label")
	public void hac148_verify_contactcurrency_field_label() throws InterruptedException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isContactCurrencyPresent();
		Assert.assertTrue(name);
	}

	@Then("HAC148 verify contactowner field label")
	public void hac148_verify_contactowner_field_label() throws InterruptedException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isContactOWnerPresent();
		Assert.assertTrue(name);
	}

	@Then("HAC148 verify preferredlanguage field label")
	public void hac148_verify_preferredlanguage_field_label() throws InterruptedException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isPreferredLanaguagePresent();
		Assert.assertTrue(name);
	}

	@Then("HAC148 verify mailingaddress field label")
	public void hac148_verify_mailingaddress_field_label() throws InterruptedException {
		contactDetailsTab = new ContactDetailsTab();
		name = contactDetailsTab.isMailingAddressPresent();
		Assert.assertTrue(name);
	}
	@Then("HAC148 verify contact related list quick links")
	public void hac148_verify_contact_related_list_quick_links() throws InterruptedException {
		contactDetailsTab = new ContactDetailsTab();
		contactDetailsTab.VerifyContactRelatedListQuickLinks();
	}
}
