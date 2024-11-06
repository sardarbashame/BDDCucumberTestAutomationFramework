package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class ServiceAppointments extends CommonFunctions {

	public ServiceAppointments() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	@FindBy(xpath = "(//slot[contains(text(),'SA')])[1]")
	WebElement lnk_SA;
	
	@FindBy(xpath = "(//a[text()='Details'])")
	WebElement tab_details;
	
	@FindBy(xpath = "//a[text()='Related']")
	WebElement tab_related;
	
	
	public void SelectServiceAppointment() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(lnk_SA);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", lnk_SA);
		Thread.sleep(5000);
		expWaitToBeClickable(tab_details);
		}
	
	public void ClickRelatedTab() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(tab_related);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", tab_related);
		Thread.sleep(3000);
		}
		
}
