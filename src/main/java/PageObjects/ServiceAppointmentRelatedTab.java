package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import commonutilities.CommonFunctions;

public class ServiceAppointmentRelatedTab extends CommonFunctions {

public ServiceAppointmentRelatedTab() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	@FindBy(xpath = "(//a[@title='New'])[last()]")
	WebElement btn_new;
	
	@FindBy(xpath = "//h2[text()='New Assigned Resource']")
	WebElement heading_newresource;
		
	@FindBy(xpath = "//label[text()='Service Resource']")
	WebElement txt_serviceresource;
	
	@FindBy(xpath = "//label[text()='Service Resource']/../..//input")
	WebElement txt_serviceresourceinput;
	
	@FindBy(xpath = "//*[@title='Test Service Resource1']")
	WebElement res_serviceresource;
	
	@FindBy(xpath = "(//button[@name='SaveEdit'])")
	WebElement btn_save;
	
	
	public void AssignResource() throws InterruptedException {
		expWaitToBeClickable(btn_new);
		btn_new.click();
		heading_newresource.click();
		txt_serviceresource.click();
		txt_serviceresourceinput.sendKeys("Test Service Resource1");
		Thread.sleep(3000);
		res_serviceresource.click();
		Thread.sleep(3000);
		btn_save.click();
	}
	
	public void c() throws InterruptedException {
		expWaitToBeClickable(btn_new);
		btn_new.click();
		heading_newresource.click();
		txt_serviceresource.click();
		txt_serviceresourceinput.sendKeys("Test Service Resource1");
		Thread.sleep(3000);
		res_serviceresource.click();
		Thread.sleep(3000);
		btn_save.click();
	}
	

}
