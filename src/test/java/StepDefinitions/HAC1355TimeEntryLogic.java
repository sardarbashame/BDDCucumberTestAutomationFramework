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

public class HAC1355TimeEntryLogic extends CommonFunctions {
	GlobalSearch globalSearch;
	Login loginPO;
	CaseDetailsTab caseDetailsTab;
	SelectApplication selectApplication;
	EstimateCreationFlowStep1 estimateCreationFlowStep1;
	EstimateCreationFlowStep2 estimateCreationFlowStep2;
	EstimateCreationFlowStep3 estimateCreationFlowStep3;
	CaseRelatedListQuickLinks caseRelatedListQuickLinks;
	WorkOrderRelatedListQuickLinks workOrderrelatedlist;
	ServiceAppointmentDetailsTab serviceappointments;
	ServiceAppointmentRelatedTab serviceappointmentrelatedtab;
	ServiceAppointmentTimesheetExpensesTab  serviceappointmentstimesheet;
	WorkOrder workOrder;
	HomePage homePage;
	boolean numberoftechpresent;
	boolean numberofdayspresent;
	boolean numberofhourspresent;
	boolean pboption1;

	@Given("HAC1355 login as service technician")
	public void HAC1355_login_as_service_technician() throws InterruptedException, IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp("jausterman@heatandcontrol.com.qa", "H@ctest1");
	}
	
	@When("HAC1355 select the field service applicaton")
	public void HAC1355_select_the_field_service_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp("Field Service");
	}
	
	@When("HAC1355 close all the open tabs")
	public void HAC1355_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@Then("HAC1355 select the service appointments tab")
	public void HAC1355_select_the_service_appointments_tab() throws InterruptedException, IOException {
		homePage = new HomePage();
		homePage.clickServiceAppointmentsTab();
	}
	
	@Then("HAC1355 select all service appointments listview")
	public void HAC1355_select_all_service_appointments_listview() throws InterruptedException, IOException {
		serviceappointments = new ServiceAppointmentDetailsTab();
		serviceappointments.clickServiceAppointmentListViewButton();
		serviceappointments.clickAllServiceAppointmentsListView();
	}
	
	@Then("HAC1355 select a service appointment")
	public void HAC1355_select_a_service_appointment() throws InterruptedException, IOException {
		serviceappointments = new ServiceAppointmentDetailsTab();
		serviceappointments.SelectServiceAppointmentFromListView();
	}
	
	@Then("HAC1355 update the service appointment status to In Progress")
	public void HAC1355_update_the_service_appointment_status_in_progress() throws InterruptedException, IOException {
		serviceappointments = new ServiceAppointmentDetailsTab();
		serviceappointments.UpdateSAStatus("In Progress");
	}
	
	@Then("HAC1355 update the service appointment status to completed")
	public void HAC1355_update_the_service_appointment_status_completed() throws InterruptedException, IOException {
		serviceappointments = new ServiceAppointmentDetailsTab();
		serviceappointments.UpdateSAStatus("Completed");
	}
	
	@Then("HAC1355 click on timesheet and expenses tab")
	public void HAC1355_click_on_timesheet_and_expenses_tab() throws InterruptedException, IOException {
		serviceappointmentstimesheet = new ServiceAppointmentTimesheetExpensesTab();
		serviceappointmentstimesheet.ClickTimesheetandExpensesTab();
	}
	
	@Then("HAC1355 verify the timesheet entry for labor time")
	public void HAC1355_verify_the_timesheet_entry_for_labor_time() throws InterruptedException, IOException {
		serviceappointmentstimesheet = new ServiceAppointmentTimesheetExpensesTab();
		serviceappointmentstimesheet.VerifyLaborTimeEntry();
	}
	
//	@Then("HAC1355 select dispatched service appointment")
//	public void HAC1355_select_dispatched_service_appointment() throws InterruptedException, IOException {
//		serviceappointments = new ServiceAppointmentDetailsTab();
//		serviceappointments.SelectDispatchedServiceAppointment();;
//	}
}
