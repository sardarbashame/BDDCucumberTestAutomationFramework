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
import PageObjects.ServiceAppointments;
import PageObjects.WorkOrder;
import PageObjects.WorkOrderRelatedListQuickLinks;
import commonutilities.BaseTest;
import commonutilities.CommonFunctions;

public class HAC1478AssignPackageServiceAppointment extends CommonFunctions {
	GlobalSearch globalSearch;
	Login loginPO;
	CaseDetailsTab caseDetailsTab;
	SelectApplication selectApplication;
	EstimateCreationFlowStep1 estimateCreationFlowStep1;
	EstimateCreationFlowStep2 estimateCreationFlowStep2;
	EstimateCreationFlowStep3 estimateCreationFlowStep3;
	CaseRelatedListQuickLinks caseRelatedListQuickLinks;
	WorkOrderRelatedListQuickLinks workOrderrelatedlist;
	ServiceAppointments serviceappointments;
	ServiceAppointmentRelatedTab serviceappointmentrelatedtab;
	WorkOrder workOrder;
	HomePage homePage;
	boolean numberoftechpresent;
	boolean numberofdayspresent;
	boolean numberofhourspresent;
	boolean pboption1;


	@Given("^HAC1478pkg user enters (.*) and (.*)$")
	public void HAC1478pkg_user_enters_username_and_password(String userName, String password) throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(userName, password);
	}

	@When("HAC1478pkg select the applicaton")
	public void HAC1478pkg_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC1478pkg close all the open tabs")
	public void HAC1478pkg_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC1478pkg close the bottom bar")
	public void HAC1478pkg_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}

	@When("HAC1478pkg click on cases tab")
	public void HAC1478pkg_click_on_cases_tab() throws InterruptedException {
		homePage = new HomePage();
		homePage.clickCasesTab();
	}

	@When("HAC1478pkg create new case")
	public void HAC1478pkg_create_new_case() throws InterruptedException, IOException  {
		homePage = new HomePage();
		homePage.createNewCase(
				ppty.getProperty("CASECONTACT"),
				ppty.getProperty("CASEFIRSTNAME"),
				ppty.getProperty("CASESUB")
				);

	}
	@When("HAC1478pkg user is on estimate tab")
	public void HAC1478pkg_user_is_on_estimate_tab() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.clickEstimatesTab();
	}

	@When("HAC1478pkg select values on estimate flow step1")
	public void HAC1478pkg_select_values_on_estimate_flow_step1() throws InterruptedException, IOException {
		estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
		estimateCreationFlowStep1.estimateFlowStep1("USA Domestic Market Rate", "CCW", "IO/Commissioning");
	}
	
	@When("HAC1478pkg select pkg tab")
	public void HAC1478pkg_select_pkg_tab() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//a[@data-tab-value='PKG']")).click();
		Thread.sleep(2000);
	}

	@When("HAC1478pkg verify the field label number of tech")
	public void HAC1478pkg_verify_the_field_label_number_of_tech() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		numberoftechpresent = estimateCreationFlowStep2.isNumberOfTechPresent();
		Assert.assertTrue(numberoftechpresent);
	}

	@When("HAC1478pkg verify the field label number of days")
	public void HAC1478pkg_verify_the_field_label_number_of_days() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		numberofdayspresent = estimateCreationFlowStep2.isNumberOfDaysPresent();
		Assert.assertTrue(numberofdayspresent);
	}

	@When("HAC1478pkg verify the field label number of hours")
	public void HAC1478pkg_verify_the_field_label_number_of_hours() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		numberofhourspresent = estimateCreationFlowStep2.isNumberOfHrsPresent();
		Assert.assertTrue(numberofhourspresent);
	}

	@When("HAC1478pkg select from date")
	public void HAC1478pkg_seelct_from_date() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		estimateCreationFlowStep2.selectFromDate();
	}

	@When("HAC1478pkg select to date")
	public void HAC1478pkg_seelct_to_date() throws InterruptedException, IOException {
		estimateCreationFlowStep2 = new EstimateCreationFlowStep2();
		estimateCreationFlowStep2.selectToDate();
	}

	@When("HAC1478pkg select view confirmation")
	public void HAC1478pkg_seelct_view_confirmation() throws InterruptedException, IOException {
		estimateCreationFlowStep3 = new EstimateCreationFlowStep3();
		estimateCreationFlowStep3.clickViewConfirmation();
	}

	@Then("HAC1478pkg save estimate")
	public void HAC1478pkg_save_estimate() throws InterruptedException, IOException {
		estimateCreationFlowStep3 = new EstimateCreationFlowStep3();
		estimateCreationFlowStep3.clickSaveButton();
	}
	
	@Then("HAC1478pkg click on work order link")
	public void HAC1478pkg_click_on_work_order_link() throws InterruptedException, IOException {
		caseRelatedListQuickLinks = new CaseRelatedListQuickLinks();
		caseRelatedListQuickLinks.ScrollPageToTop();
		caseRelatedListQuickLinks.clickWorkOrderLink();
	}
	
	@Then("HAC1478pkg create work order")
	public void HAC1478pkg_create_work_order() throws InterruptedException, IOException {
		workOrder = new WorkOrder();
		workOrder.CreateWorkOrder();
	}

	@Then("HAC1478pkg create service appointments")
	public void HAC1478pkg_create_service_appointments() throws InterruptedException, IOException {
		workOrder = new WorkOrder();
		workOrder.CreateServiceAppointments();
		driver.navigate().refresh();
		Thread.sleep(8000);
	}
	
	@Then("HAC1478pkg click service appointment link")
	public void HAC1478pkg_click_service_appointment_link() throws InterruptedException, IOException {
//		workOrderrelatedlist = new WorkOrderRelatedListQuickLinks();
//		workOrderrelatedlist.clickServiceAppointmentsLink();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//ul//li//span[@title='Service Appointments']")).click();
		Thread.sleep(6000);
	}
	
	@Then("HAC1478pkg select a service appointment")
	public void HAC1478pkg_select_a_service_appointment() throws InterruptedException, IOException {
		serviceappointments = new ServiceAppointments();
		serviceappointments.SelectServiceAppointment();
	}
	
	@Then("HAC1478pkg click related tab")
	public void HAC1478pkg_click_related_tab() throws InterruptedException, IOException {
		serviceappointments = new ServiceAppointments();
		serviceappointments.ClickRelatedTab();
		Thread.sleep(5000);
	}
	
	@Then("HAC1478pkg assign service resource")
	public void HAC1478pkg_assign_service_resource() throws InterruptedException, IOException {
		serviceappointmentrelatedtab = new ServiceAppointmentRelatedTab();
		serviceappointmentrelatedtab.AssignResource();
	}
}
