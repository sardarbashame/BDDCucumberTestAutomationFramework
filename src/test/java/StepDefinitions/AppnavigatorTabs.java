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

	@Then("verify TLI number displayed under Quote details tab")
	public void verify_tli_number_displayed_under_quote_details_tab() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.clkRecentQuote();
	}

	@When("select the Inquiries application")
	public void selectInquiriesApplicationn() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("InquiriesAPPNAME"));
	}

	@Then("verify TLI number displayed under Inquiries details tab")
	public void verifyNumberDisplayedQuoteDetailsTab() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.clkInQuiries();
	}

	@When("select the Field Service application")
	public void selectFieldServicesApplicationn() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("FieldServiceAPPNAME"));
	}

	@When("click on Work Order tab")
	public void clickOnWorkOrdertab() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.clkWorkOrderTab();
	}

	@Then("verify TLI number displayed under Work Order details tab")
	public void verifyNumberDisplayedWorkOrderDetailsTab() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.clkRecentWorkOrder();
	}

	@When("click on Service Appointments tab")
	public void clickOnServiceAppointmentstab() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.clkserviceAppoinmentTab();
	}

	@Then("verify TLI number displayed under Service Appointments details tab")
	public void verifyNumberDisplayedServiceAppointmentsetailsTab() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.clkRecentServiceAppointment();
	}
	@When("click on Service Resources tab")
	public void clickOnServiceResourcesTab() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.clkServiceResourceTab();
	}
	@When("Click on recently created SA in the grid")
	public void clickOnRecentlyCreateSA() throws Exception {
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
	
	@When("Select any one of appointmentand Drag and Drop to gantt")
	public void selectAppointmentAndDragAndDrop() throws Exception {
		appNavigatorObj = new AppnavigatorTabsPages();
		appNavigatorObj.selectAppointmentAndDragAndDrop();
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

}
