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
		homePage.CreateNewCustomerAccountRequest();
	}
		
	@When("HAC1561 select an account from global search")
	public void hac1561_select_an_account_from_global_search() throws InterruptedException, IOException {
		globalSearch = new GlobalSearch();
		globalSearch.SelectFromGlobalSearch(getTestData("ACCOUNT_NAME"));
	}
	
	@When("HAC1561 submit name change request")
	public void hac1561_submit_name_change_request() throws Exception {
		accountDetailsTab = new AccountDetailsTab();
		accountDetailsTab.AccountNameChangeRequest();
	}
	
	@When("HAC1561 submit name and tax id change request")
	public void hac1561_submit_name_and_tax_id_change_request() throws Exception {
		accountDetailsTab = new AccountDetailsTab();
		accountDetailsTab.AccountNameAndTaxIDChangeRequest();
	}
	
	@When("HAC1561 submit account address change request")
	public void hac1561_submit_account_address_change_request() throws Exception {
		accountDetailsTab = new AccountDetailsTab();
		accountDetailsTab.AccountAddressChangeRequest();
	}
	

}
