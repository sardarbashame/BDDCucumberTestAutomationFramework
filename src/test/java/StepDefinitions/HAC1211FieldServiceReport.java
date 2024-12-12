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
import PageObjects.ServiceAppointmentFieldServiceReportTab;
import PageObjects.WorkOrder;
import PageObjects.WorkOrderRelatedListQuickLinks;
import commonutilities.BaseTest;
import commonutilities.CommonFunctions;

public class HAC1211FieldServiceReport extends CommonFunctions {
	ServiceAppointmentDetailsTab serviceappointments;
	ServiceAppointmentFieldServiceReportTab  serviceappointmentfieldservicereportab;


	@Then("HAC1211 click field service report tab")
	public void HAC1211_click_field_service_report_tab() throws Exception {
		serviceappointments = new ServiceAppointmentDetailsTab();
		serviceappointments.clkFieldServiceReportTab();
	}
	
	@Then("HAC1211 verify customer information section")
	public void HAC1211_verify_customer_information_section() throws InterruptedException, IOException {
		serviceappointmentfieldservicereportab = new ServiceAppointmentFieldServiceReportTab();
		serviceappointmentfieldservicereportab.VerifyCustomerInformation();
	}
	
	@Then("HAC1211 verify order details section")
	public void HAC1211_verify_order_details_section() throws InterruptedException, IOException {
		serviceappointmentfieldservicereportab = new ServiceAppointmentFieldServiceReportTab();
		serviceappointmentfieldservicereportab.VerifyOrderDetails();
	}
	
	@Then("HAC1211 verify equipment information section")
	public void HAC1211_verify_equipment_information_section() throws InterruptedException, IOException {
		serviceappointmentfieldservicereportab = new ServiceAppointmentFieldServiceReportTab();
		serviceappointmentfieldservicereportab.VerifyEquipmentInformation();
	}
	
	@Then("HAC1211 verify summary of visit section")
	public void HAC1211_verify_summary_of_visit_section() throws InterruptedException, IOException {
		serviceappointmentfieldservicereportab = new ServiceAppointmentFieldServiceReportTab();
		serviceappointmentfieldservicereportab.VerifySummaryOfVisit();
	}
	
	@Then("HAC1211 verify daily notes section")
	public void HAC1211_verify_daily_notes_section() throws InterruptedException, IOException {
		serviceappointmentfieldservicereportab = new ServiceAppointmentFieldServiceReportTab();
		serviceappointmentfieldservicereportab.VerifyDailyNotes();
	}
	
	@Then("HAC1211 verify service time section")
	public void HAC1211_verify_service_time_section() throws InterruptedException, IOException {
		serviceappointmentfieldservicereportab = new ServiceAppointmentFieldServiceReportTab();
		serviceappointmentfieldservicereportab.VerifyServiceTime();
	}
	
	@Then("HAC1211 verify travel time section")
	public void HAC1211_verify_travel_time_section() throws InterruptedException, IOException {
		serviceappointmentfieldservicereportab = new ServiceAppointmentFieldServiceReportTab();
		serviceappointmentfieldservicereportab.VerifyTravelTime();
	}
	
	@Then("HAC1211 verify service charge section")
	public void HAC1211_verify_service_charge_section() throws InterruptedException, IOException {
		serviceappointmentfieldservicereportab = new ServiceAppointmentFieldServiceReportTab();
		serviceappointmentfieldservicereportab.VerifyServiceCharge();
	}
	
	@Then("HAC1211 verify expenses section")
	public void HAC1211_verify_expenses_section() throws InterruptedException, IOException {
		serviceappointmentfieldservicereportab = new ServiceAppointmentFieldServiceReportTab();
		serviceappointmentfieldservicereportab.VerifyExpenses();
	}


}
