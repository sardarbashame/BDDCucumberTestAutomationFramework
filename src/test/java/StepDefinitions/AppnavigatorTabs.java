package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import PageObjects.AppnavigatorTabsPages;
import PageObjects.SelectApplication;
import commonutilities.CommonFunctions;

public class AppnavigatorTabs extends CommonFunctions {

	AppnavigatorTabsPages appNavigatorObj;
	SelectApplication selectApplication;

	@When("click on Quote tab")
	public void click_on_quote_tab() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.clkQuoteTab();
	}	
	
	@When("close all the open tabs")
	public void close_all_the_open_tabs() throws Exception {
		closeAllTabs();
	}

	@When("select the Inquiries application")
	public void selectInquiriesApplicationn() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("InquiriesAPPNAME"));
	}	

	@When("select the Field Service application")
	public void selectFieldServicesApplicationn() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("FieldServiceAPPNAME"));
	}
	@When("select the Assets application")
	public void selectAssetsApplicationn() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("AssetsAPPNAME"));
	}
	
	@When("click on Service Resources tab")
	public void clickOnServiceResourcesTab() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.clkServiceResourceTab();
	}
	@When("Click on recently created SR in the grid")
	public void clickOnRecentlyCreateSR() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.clkRecentServiceResource();
	}
	@Then("Verify Service Territories list view is displayed")
	public void verifyServiceTerritoriesListView() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.verifyServiceTerritoriesListView();
	}
	@When("click on Field Service tab")
	public void clickOnFieldServiceTab() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.clkFieldServiceTab();
	}	
	
	@Then("Verify Resources Preference label and Count")
	public void verifyResourcesPreferenceLabel() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.clkRelatedTabAndValidatedResourcesPref();
	}
	@When("Click on Timesheet & Expenses sub tab")
	public void clickOnTimesheetAndExpenseSubTab() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.clickOnTimesheetAndExpenseSubTab();
	}
	
	@Then("Change status to Travel to Customer Location")
	public void changeStatusToTravelCustomerLocation() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.changeStatusToTravelCustomerLocation();
	}
	@Then("Click on TimeSheet Entries and verify all the lables under details tab")
	public void clickOnTimeSheetEntriesAndVerifyLabels() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.clickOnTimesheetEntriesAndVerifyLables();
	}
	@Then("Verify Work Order number under TimeSheet Details tab")
	public void verifyWorkOrderUnderTimesheet() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.verifyWorkOrderNumberUnderTimeSheet();
	}

	@Then("Verify TLI number column under All Quotes and Estimates filter")
	public void verifyTLINumberColumnAndAllQuotes() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.verifyTLIColumniSDisplayed();
	}	

	@When("Create New Expanses and save it")
	public void createNewExpansesAndSaveIt() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.createNewExpansesAndSaveIt();
	}

	@Then("Open Created Exanses and verify work order number is displayed")
	public void verifyWorkOrderNumber() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.verifyWorkOrderNumber();
	}

}
