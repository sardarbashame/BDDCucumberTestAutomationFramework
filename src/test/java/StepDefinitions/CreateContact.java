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

import PageObjects.ContactDetailsTab;
import PageObjects.CreateNewContact;
import PageObjects.CreateNewTask;
import PageObjects.CreateSalesNewOpportunity;
import PageObjects.OpportunityDetailsTab;
import PageObjects.TaskDetailsTab;

public class CreateContact extends BaseTest{
CreateNewContact createNewContact;
ContactDetailsTab contactDetailsTab;
String contactname;
String contactemail;


@Given ("create new contact")
public void create_new_contact() throws InterruptedException, IOException {		
	createNewContact = new CreateNewContact(driver);
	createNewContact.createNewContact(
			Math.random()+getParameters().getProperty("CONTACT_FIRSTNAME"),
			Math.random()+getParameters().getProperty("CONTACT_LASTNAME"),
			Math.random()+getParameters().getProperty("CONTACT_EMAIL")
			);
}
//validate task details tab
@Then ("verify contact details")
public void verify_task_details_for_status_not_started() throws InterruptedException, IOException 
{		
	contactDetailsTab =  new ContactDetailsTab(driver);
	contactDetailsTab.clickcontactdetailsTab();
	contactname = contactDetailsTab.getactualcontactname();
	contactemail = contactDetailsTab.getactualcontactemail();
	Assert.assertTrue(contactname.contains(getParameters().getProperty("CONTACT_FIRSTNAME")));
	Assert.assertTrue(contactemail.contains(getParameters().getProperty("CONTACT_EMAIL")));
}

}
