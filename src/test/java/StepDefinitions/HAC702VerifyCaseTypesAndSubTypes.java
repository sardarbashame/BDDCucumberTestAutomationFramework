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
import PageObjects.CaseDetailsTab;
import PageObjects.ContactDetailsTab;
import PageObjects.GlobalSearch;
import PageObjects.HomePage;
import PageObjects.Login;
import PageObjects.SelectApplication;
import commonutilities.BaseTest;
import commonutilities.CommonFunctions;

public class HAC702VerifyCaseTypesAndSubTypes extends CommonFunctions {
	Login loginPO;
	SelectApplication selectApplication;
	HomePage homepage;
	CaseDetailsTab caseDetailsTab;
	boolean name;

	@Given("HAC702 login as a service manager")
	public void HAC702_login_as_a_service_manager() throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(getObjDetails().getProperty("SERVICE_MANAGER_USER_NAME"),
				getObjDetails().getProperty("SERVICE_MANAGER_PASSWORD"));
	}

	@When("HAC702 select the applicaton")
	public void HAC702_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC702 close all the open tabs")
	public void HAC702_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC702 close the bottom bar")
	public void HAC702_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}

	@When("HAC702 select cases tab")
	public void HAC702_select_cases_tab() throws InterruptedException {
		homepage = new HomePage();
		homepage.clickCasesTab();
	}

	// verify the case subtypes for billing case type
	@Then("HAC702 verify case subtypes for billing type")
	public void HAC702_click_case_close_quick_action() throws InterruptedException, IOException {
		caseDetailsTab = new CaseDetailsTab();
		caseDetailsTab.VerifyCaseSubTypesForBillingType();

	}

	// verify the case subtypes for emergency case type
	@Then("HAC702 verify case subtypes for emergency type")
	public void HAC702_verify_case_subtypes_for_emergency_type() throws InterruptedException, IOException {
		caseDetailsTab = new CaseDetailsTab();
		caseDetailsTab.VerifyCaseSubTypesForEmergencyType();

	}

	// verify the case subtypes for equipment case type
	@Then("HAC702 verify case subtypes for equipment type")
	public void HAC702_verify_case_subtypes_for_equipment_type() throws InterruptedException, IOException {
		caseDetailsTab = new CaseDetailsTab();
		caseDetailsTab.VerifyCaseSubTypesForEquipementType();

	}

	// verify the case subtypes for feedback case type
	@Then("HAC702 verify case subtypes for feedback type")
	public void HAC702_verify_case_subtypes_for_feedback_type() throws InterruptedException, IOException {
		caseDetailsTab = new CaseDetailsTab();
		caseDetailsTab.VerifyCaseSubTypesForFeedbackType();

	}

	// verify the case subtypes for feedback case type
	@Then("HAC702 verify case subtypes for general type")
	public void HAC702_verify_case_subtypes_for_general_type() throws InterruptedException, IOException {
		caseDetailsTab = new CaseDetailsTab();
		caseDetailsTab.VerifyCaseSubTypesForGeneralType();

	}

	// verify the case subtypes for junkspam case type
	@Then("HAC702 verify case subtypes for junkspam type")
	public void HAC702_verify_case_subtypes_for_junkspam_type() throws InterruptedException, IOException {
		caseDetailsTab = new CaseDetailsTab();
		caseDetailsTab.VerifyCaseSubTypesForJunkSpamType();

	}

	// verify the case subtypes for newprojectscheduling case type
	@Then("HAC702 verify case subtypes for newprojectscheduling type")
	public void HAC702_verify_case_subtypes_for_newprojectscheduling_type() throws InterruptedException, IOException {
		caseDetailsTab = new CaseDetailsTab();
		caseDetailsTab.VerifyCaseSubTypesForNewProjectSchedulingType();

	}

	// verify the case subtypes for parts case type
	@Then("HAC702 verify case subtypes for parts type")
	public void HAC702_verify_case_subtypes_for_parts_type() throws InterruptedException, IOException {
		caseDetailsTab = new CaseDetailsTab();
		caseDetailsTab.VerifyCaseSubTypesForPartsType();

	}

	// verify the case subtypes for sales case type
	@Then("HAC702 verify case subtypes for sales type")
	public void HAC702_verify_case_subtypes_for_sales_type() throws InterruptedException, IOException {
		caseDetailsTab = new CaseDetailsTab();
		caseDetailsTab.VerifyCaseSubTypesForSalesType();

	}

	// verify the case subtypes for scheduling case type
	@Then("HAC702 verify case subtypes for scheduling type")
	public void HAC702_verify_case_subtypes_for_scheduling_type() throws InterruptedException, IOException {
		caseDetailsTab = new CaseDetailsTab();
		caseDetailsTab.VerifyCaseSubTypesForSchedulingType();

	}

}
