package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import testcomponents.BaseTest;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.CreateNewTask;
import PageObjects.CreateSalesNewOpportunity;
import PageObjects.OpportunityDetailsTab;
import PageObjects.TaskDetailsTab;

public class CreateTask extends BaseTest{
CreateNewTask createNewTask;
TaskDetailsTab taskDetailsTab;
String statusname;
String contactname;


@Given ("create new task with stage not started")
public void create_new_task_with_stage_not_started() throws InterruptedException, IOException {		
	createNewTask = new CreateNewTask(driver);
	createNewTask.createNewTask(
		getParameters().getProperty("TASK_NAME"), 
		getParameters().getProperty("TASK_CONTACT_NAME")
		);
}
//validate task details tab
@Then ("verify task details for status not started")
public void verify_task_details_for_status_not_started() throws InterruptedException, IOException 
{		
	taskDetailsTab =  new TaskDetailsTab(driver);
	taskDetailsTab.clicktaskdetailsTab();
	statusname = taskDetailsTab.getactualstatusname();
	contactname = taskDetailsTab.getactualcontactname();
	Assert.assertEquals(statusname, getParameters().getProperty("TASK_STATUS_NOT_STARTED"));
	Assert.assertEquals(contactname, getParameters().getProperty("TASK_CONTACT_NAME"));
}

}
