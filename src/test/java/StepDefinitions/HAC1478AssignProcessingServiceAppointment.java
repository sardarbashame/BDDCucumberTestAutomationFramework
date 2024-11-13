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
import PageObjects.ServiceAppointmentDetailsTab;
import PageObjects.WorkOrder;
import PageObjects.WorkOrderRelatedListQuickLinks;
import commonutilities.BaseTest;
import commonutilities.CommonFunctions;

public class HAC1478AssignProcessingServiceAppointment extends CommonFunctions {
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
	WorkOrder workOrder;
	HomePage homePage;
	boolean numberoftechpresent;
	boolean numberofdayspresent;
	boolean numberofhourspresent;
	boolean pboption1;


	@Given("^HAC1478 user enters (.*) and (.*)$")
	public void HAC1478_user_enters_username_and_password(String userName, String password) throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(userName, password);
	}

	@When("HAC1478 select the applicaton")
	public void HAC1478_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC1478 close all the open tabs")
	public void HAC1478_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC1478 close the bottom bar")
	public void HAC1478_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}

	@When("HAC1478 click on cases tab")
	public void HAC1478_click_on_cases_tab() throws InterruptedException {
		homePage = new HomePage();
		homePage.clickCasesTab();
	}

	@When("HAC1478 create new case")
	public void HAC1478_create_new_case() throws InterruptedException, IOException  {
		homePage = new HomePage();
		homePage.createNewCase(
				ppty.getProperty("CASECONTACT"),
				ppty.getProperty("CASEFIRSTNAME"),
				ppty.getProperty("CASESUB")
				);

	}
	@When("HAC1478 user is on estimate tab")
	public void HAC1478_user_is_on_estimate_tab() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.clickEstimatesTab();
	}

	@When("HAC1478 select values on estimate flow step1")
	public void HAC1478_select_values_on_estimate_flow_step1() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.estimateFlowStep1("USA Domestic Market Rate", "BASIC Dual Spiral Ovens", "IO/Commissioning");
	}

	@When("HAC1478 verify the field label number of tech")
	public void HAC1478_verify_the_field_label_number_of_tech() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		numberoftechpresent = estimateCreationFlowStep2.isNumberOfTechPresent();
		Assert.assertTrue(numberoftechpresent);
	}

	@When("HAC1478 verify the field label number of days")
	public void HAC1478_verify_the_field_label_number_of_days() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		numberofdayspresent = estimateCreationFlowStep2.isNumberOfDaysPresent();
		Assert.assertTrue(numberofdayspresent);
	}

	@When("HAC1478 verify the field label number of hours")
	public void HAC1478_verify_the_field_label_number_of_hours() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		numberofhourspresent = estimateCreationFlowStep2.isNumberOfHrsPresent();
		Assert.assertTrue(numberofhourspresent);
	}

	@When("HAC1478 select from date")
	public void HAC1478_seelct_from_date() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		estimateCreationFlowStep2.selectFromDate();
	}

	@When("HAC1478 select to date")
	public void HAC1478_seelct_to_date() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		estimateCreationFlowStep2.selectToDate();
	}

	@When("HAC1478 select view confirmation")
	public void HAC1478_seelct_view_confirmation() throws InterruptedException, IOException {
		estimateCreationFlowStep3 = new EstimateCreationFlowStep3();
		estimateCreationFlowStep3.clickViewConfirmation();
	}

	@Then("HAC1478 save estimate")
	public void HAC1478_save_estimate() throws InterruptedException, IOException {
		estimateCreationFlowStep3 = new EstimateCreationFlowStep3();
		estimateCreationFlowStep3.clickSaveButton();
	}
	
	@Then("HAC1478 click on work order link")
	public void HAC1478_click_on_work_order_link() throws InterruptedException, IOException {
		caseRelatedListQuickLinks = new CaseRelatedListQuickLinks();
		caseRelatedListQuickLinks.ScrollPageToTop();
		caseRelatedListQuickLinks.clickWorkOrderLink();
	}
	
	@Then("HAC1478 create work order")
	public void HAC1478_create_work_order() throws Exception {
		workOrder = new WorkOrder();
		workOrder.CreateWorkOrder();
	}

	@Then("HAC1478 create service appointments")
	public void HAC1478_create_service_appointments() throws InterruptedException, IOException {
		workOrder = new WorkOrder();
		workOrder.CreateServiceAppointments();
		driver.navigate().refresh();
		Thread.sleep(8000);
	}
	
	@Then("HAC1478 click service appointment link")
	public void HAC1478_click_service_appointment_link() throws InterruptedException, IOException {
		// workOrderrelatedlist = new WorkOrderRelatedListQuickLinks();
		// workOrderrelatedlist.clickServiceAppointmentsLink();
		Thread.sleep(8000);
		serviceappointments = new ServiceAppointmentDetailsTab();
		serviceappointments.lnkserviceAppointment();
		Thread.sleep(6000);
	}

	@Then("HAC1478 select a service appointment")
	public void HAC1478_select_a_service_appointment() throws InterruptedException, IOException {
		serviceappointments = new ServiceAppointmentDetailsTab();
		serviceappointments.SelectServiceAppointment();
	}
	
	@Then("HAC1478 select a schedule start date")
	public void HAC1478_select_a_schedule_start_date() throws InterruptedException, IOException {
		serviceappointments = new ServiceAppointmentDetailsTab();
		serviceappointments.UpdateSAScheduleStartDate();
	}
	
	@Then("HAC1478 select a schedule end date")
	public void HAC1478_select_a_schedule_end_date() throws InterruptedException, IOException {
		serviceappointments = new ServiceAppointmentDetailsTab();
		serviceappointments.UpdateSAScheduleEndDate();
		serviceappointments.ClickSaveButton();
	}
	
	@Then("HAC1478 click related tab")
	public void HAC1478_click_related_tab() throws InterruptedException, IOException {
		serviceappointments = new ServiceAppointmentDetailsTab();
		serviceappointments.ClickRelatedTab();
		Thread.sleep(5000);
	}
	
	@Then("HAC1478 assign service resource")
	public void HAC1478_assign_service_resource() throws Exception {
		serviceappointmentrelatedtab = new ServiceAppointmentRelatedTab();
		serviceappointmentrelatedtab.AssignResource();
	}
	
	@Then("HAC1478 update sa status to dispatched")
	public void HAC1478_update_sa_satus_to_dispatched() throws InterruptedException, IOException {
		serviceappointments = new ServiceAppointmentDetailsTab();
		serviceappointments.ClickDetailsTab();
		serviceappointments.UpdateSAStatus("Dispatched");
	//	serviceappointments.ClickSaveButton();
	}
	
	@Then("HAC1478 logout as service scheduler")
	public void HAC1478_logout_as_service_scheduler() throws InterruptedException, IOException {
		homePage = new HomePage();
		homePage.Logout();
	}
	
	@Then("HAC1478 login as service technician")
	public void HAC1478_login_as_service_technician() throws InterruptedException, IOException {
		loginPO = new Login();
		loginPO.LoginApp("jausterman@heatandcontrol.com.qa", "H@ctest1");
	}
	
	@Then("HAC1478 select the field service applicaton")
	public void HAC1478_select_the_field_service_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp("Field Service");
	}
	
	@Then("HAC1478 select the service appointments tab")
	public void HAC1478_select_the_service_appointments_tab() throws InterruptedException, IOException {
		homePage = new HomePage();
		homePage.clickServiceAppointmentsTab();
		
	}
	
	@Then("HAC1478 select all service appointments listview")
	public void HAC1478_select_all_service_appointments_listview() throws InterruptedException, IOException {
		serviceappointments = new ServiceAppointmentDetailsTab();
		serviceappointments.clickServiceAppointmentListViewButton();
		serviceappointments.clickAllServiceAppointmentsListView();
		
		
	}
	
	@Then("HAC1478 select dispatched service appointment")
	public void HAC1478_select_dispatched_service_appointment() throws InterruptedException, IOException {
		serviceappointments = new ServiceAppointmentDetailsTab();
		serviceappointments.SelectDispatchedServiceAppointment();;
		
		
	}
}
