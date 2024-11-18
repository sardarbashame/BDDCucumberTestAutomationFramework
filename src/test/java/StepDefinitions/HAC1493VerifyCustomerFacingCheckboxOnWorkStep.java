package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileReader;
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
import PageObjects.AppnavigatorTabsPages;
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

public class HAC1493VerifyCustomerFacingCheckboxOnWorkStep extends CommonFunctions {
	GlobalSearch globalSearch;
	Login loginPO;
	CaseDetailsTab caseDetailsTab;
	SelectApplication selectApplication;
	WorkOrderRelatedListQuickLinks workOrderRelatedListQuickLinks;
	WorkOrder workOrder;

	@Then("HAC1493 create work step")
	public void HAC1493_create_work_step() throws Exception {
		workOrderRelatedListQuickLinks = new WorkOrderRelatedListQuickLinks();
		workOrderRelatedListQuickLinks.clickWorkStepsLink();
		workOrder = new WorkOrder();
		workOrder.CreateNewWorkStep();
		;
	}
	
	@Then("HAC1493 verify customer facing checkbox")
	public void HAC1493_verify_customer_facing_checkbox() throws Exception {
		workOrder = new WorkOrder();
		workOrder.VerifyCustomerFacingCheckboxOnWorkStep();
		
	}
}
