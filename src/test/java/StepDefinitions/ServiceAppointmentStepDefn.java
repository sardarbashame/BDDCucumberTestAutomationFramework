package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import PageObjects.AppnavigatorTabsPages;
import PageObjects.SelectApplication;
import PageObjects.ServiceAppointmentDetailsTab;
import commonutilities.CommonFunctions;

public class ServiceAppointmentStepDefn extends CommonFunctions {

	AppnavigatorTabsPages appNavigatorObj;
	SelectApplication selectApplication;
	ServiceAppointmentDetailsTab serviceAppointmentObj;

	@When("click on Service Appointments tab")
	public void clickOnServiceAppointmentstab() throws Exception {
		serviceAppointmentObj = new ServiceAppointmentDetailsTab();
		serviceAppointmentObj.clkserviceAppoinmentTab();
	}

	@Then("verify TLI number displayed under Service Appointments details tab")
	public void verifyNumberDisplayedServiceAppointmentsetailsTab() throws Exception {
		serviceAppointmentObj = new ServiceAppointmentDetailsTab();
		serviceAppointmentObj.clickRecentServiceAppointment();
	}

	@When("Select any one of appointmentand Drag and Drop to gantt")
	public void selectAppointmentAndDragAndDrop() throws Exception {
		serviceAppointmentObj = new ServiceAppointmentDetailsTab();
		serviceAppointmentObj.selectAppointmentAndDragAndDrop();
	}

	@When("Search SA number and Click Edit")
	public void SearchSAnumberandClickEdit() throws Exception {
		serviceAppointmentObj = new ServiceAppointmentDetailsTab();
		serviceAppointmentObj.searchSAAndClickEdit();
	}

	@When("Select any existing Service Appointment")
	public void clickToOpenAnyexistingServiceAppointment() throws Exception {
		serviceAppointmentObj = new ServiceAppointmentDetailsTab();
		serviceAppointmentObj.clickRecentServiceAppointment();
	}

	@Then("verify TLI number displayed under Quote details tab")
	public void verify_tli_number_displayed_under_quote_details_tab() throws Exception {
		serviceAppointmentObj = new ServiceAppointmentDetailsTab();
		serviceAppointmentObj.clkRecentQuote();
	}

	@Then("verify TLI number displayed under Inquiries details tab")
	public void verifyNumberDisplayedQuoteDetailsTab() throws Exception {
		serviceAppointmentObj = new ServiceAppointmentDetailsTab();
		serviceAppointmentObj.clkInQuiries();
	}

	@When("click on Work Order tab")
	public void clickOnWorkOrdertab() throws Exception {
		serviceAppointmentObj = new ServiceAppointmentDetailsTab();
		serviceAppointmentObj.clkWorkOrderTab();
	}

	@Then("verify TLI number displayed under Work Order details tab")
	public void verifyNumberDisplayedWorkOrderDetailsTab() throws Exception {
		serviceAppointmentObj = new ServiceAppointmentDetailsTab();
		serviceAppointmentObj.clkRecentWorkOrder();
	}
}
