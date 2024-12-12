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

public class HAC1205FieldServiceReportDownload extends CommonFunctions {
	ServiceAppointmentFieldServiceReportTab  serviceappointmentfieldservicereportab;

	@Then("HAC1205 verify fsr pdf download")
	public void HAC1205_verify_fsr_pdf_download() throws Exception {
		serviceappointmentfieldservicereportab = new ServiceAppointmentFieldServiceReportTab();
		serviceappointmentfieldservicereportab.ClickPDFIcon();
		serviceappointmentfieldservicereportab.VerifyPDFDownloadSuccessMessage();
	}
	
	


}
