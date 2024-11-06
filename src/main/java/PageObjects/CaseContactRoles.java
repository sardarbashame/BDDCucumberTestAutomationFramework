package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class CaseContactRoles extends CommonFunctions {

	public CaseContactRoles() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	@FindBy(xpath = "//a//span//slot[contains(text(),'Contact Roles')]/..")
	WebElement contactroleslink;
	
	@FindBy(xpath = "(//ul/li//a//div[@title='New'])[2]")
	WebElement newcontactrolebth;
	
	@FindBy(xpath = "//label[text()='Role']/..//button//span")
	WebElement contactrolespicklist;
	
	@FindBy(xpath = "//span[text()='CEO / President / COO']")
	WebElement ceopresidentcoooption;
	
	@FindBy(xpath = "//span[text()='Engineer']")
	WebElement engineeroption;
	
	@FindBy(xpath = "//span[text()='Engineering Manager']")
	WebElement engineeringmanageroption;
	
	@FindBy(xpath = "//span[text()='Maintenance']")
	WebElement maintenanceroption;
	
	@FindBy(xpath = "//span[text()='Partner']")
	WebElement partneroption;
	
	@FindBy(xpath = "//span[text()='Plant Manager']")
	WebElement plantmanageroption;
	
	@FindBy(xpath = "//span[text()='Project Manager']")
	WebElement projectmanageroption;
	
	@FindBy(xpath = "//span[text()='Quality Assurance']")
	WebElement qualityassuranceoption;
	@FindBy(xpath = "//span[text()='R&D']")
	WebElement rdoption;
	
	@FindBy(xpath = "//span[text()='Other']")
	WebElement otheroption;
	
	@FindBy(xpath = "//*[@field-label='Contact']//input")
	WebElement contacttxtbox;
	
	@FindBy(xpath = "//button[text()='Save']")
	WebElement casesavebtn;

	public void addContactRole(String contactname, String contactrole) throws InterruptedException {
		Thread.sleep(0, 2000);
		contactroleslink.click();
		newcontactrolebth.click();
		contacttxtbox.click();
		contacttxtbox.sendKeys(contactname);
		driver.findElement(By.xpath("//*[@title='" + contactname + "']")).click();
		contactrolespicklist.click();
		driver.findElement(By.xpath("//span[text()='" + contactrole + "']")).click();
		casesavebtn.click();
	}

	public void verifyContactRoles() throws InterruptedException {
		Thread.sleep(0, 2000);
		contactroleslink.click();
		newcontactrolebth.click();
		contactrolespicklist.click();
		ceopresidentcoooption.isDisplayed();
		engineeroption.isDisplayed();
		engineeringmanageroption.isDisplayed();
		maintenanceroption.isDisplayed();
		partneroption.isDisplayed();
		plantmanageroption.isDisplayed();
		projectmanageroption.isDisplayed();
		qualityassuranceoption.isDisplayed();
		rdoption.isDisplayed();
		otheroption.isDisplayed();
	}

}
