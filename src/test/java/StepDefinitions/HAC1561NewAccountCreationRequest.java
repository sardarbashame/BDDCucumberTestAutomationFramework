package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import javax.annotation.processing.Completions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AccountDetailsTab;
import PageObjects.CaseDetailsTab;
import PageObjects.CaseRelatedListQuickLinks;
import PageObjects.EstimateCreationFlowStep1;
import PageObjects.EstimateCreationFlowStep2;
import PageObjects.EstimateCreationFlowStep3;
import PageObjects.GlobalSearch;
import PageObjects.HomePage;
import PageObjects.Login;
import PageObjects.SelectApplication;
import PageObjects.ServiceAppointmentRelatedTab;
import PageObjects.ServiceAppointmentTimesheetExpensesTab;
import PageObjects.ServiceAppointmentDetailsTab;
import PageObjects.WorkOrder;
import PageObjects.WorkOrderRelatedListQuickLinks;
import commonutilities.BaseTest;
import commonutilities.CommonFunctions;

public class HAC1561NewAccountCreationRequest extends CommonFunctions {
	HomePage homePage;
	GlobalSearch globalSearch;
	AccountDetailsTab accountDetailsTab;
	
	@When("HAC1561 create new account request")
	public void HAC1561_create_new_account_request() throws InterruptedException, IOException {
		homePage = new HomePage();

		homePage.CreateNewCustomerAccountRequest(
				ConcatCurrentDateTime(getTestData("NEW_CUST_NAME")), 
				Math.random()+getTestData("NEW_CUST_PHONE"),
				Math.random()+getTestData("NEW_CUST_PO"),
				Math.random()+getTestData("NEW_CUST_EMAIL"),
				Math.random()+getTestData("NEW_CUST_TAX_NUM"),
				getTestData("NEW_CUST_STREET"),
				getTestData("NEW_CUST_CITY"),
				getTestData("NEW_CUST_PC"),
				ConcatCurrentDateTime(getTestData("NEW_PART_NAME")),
				Math.random()+getTestData("NEW_PART_PHONE"),
				Math.random()+getTestData("NEW_PART_PO"),
				Math.random()+getTestData("NEW_PART_EMAIL"),
				Math.random()+getTestData("NEW_PART_TAX_NUM"),
				Math.random()+getTestData("NEW_PART_STREET"),
				getTestData("NEW_PART_CITY"),
				getTestData("NEW_PART_PC")	);
	}
		
	@When("HAC1561 select an account from global search")
	public void hac1561_select_an_account_from_global_search() throws InterruptedException, IOException {
		globalSearch = new GlobalSearch();
		globalSearch.SelectFromGlobalSearch(getTestData("ACCOUNT_NAME"));
	}
	
	@When("HAC1561 submit name change request")
	public void hac1561_submit_name_change_request() throws Exception {
		accountDetailsTab = new AccountDetailsTab();
		accountDetailsTab.AccountNameChangeRequest("New Name");
	}
	
	@When("HAC1561 submit name and tax id change request")
	public void hac1561_submit_name_and_tax_id_change_request() throws Exception {
		accountDetailsTab = new AccountDetailsTab();
		accountDetailsTab.AccountNameAndTaxIDChangeRequest("New Name","123456");
	}
	
	@When("HAC1561 submit account address change request")
	public void hac1561_submit_account_address_change_request() throws Exception {
		accountDetailsTab = new AccountDetailsTab();
		accountDetailsTab.AccountAddressChangeRequest();
	}
	

}
