package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class ServiceAppointmentTimesheetExpensesTab extends CommonFunctions {
	@FindBy(xpath = "(//a[contains(text(),'SA')])[1]")
	WebElement lnk_SA;
	
	@FindBy(xpath = "(//a[text()='Timesheet & Expenses'])")
	WebElement tab_timesheetandexpenses;
	
	@FindBy(xpath = "(//a[text()='Details'])")
	WebElement tab_details;
	
	@FindBy(xpath = "//a[text()='Related']")
	WebElement tab_related;
	
	@FindBy(xpath="//span[text()='Edit Scheduled Start']")
	WebElement clk_editschedulestartdate;
	@FindBy(xpath="//button[text()='Save']")
	WebElement btn_save;
	
	@FindBy(xpath="//button[text()='Cancel']")
	WebElement btn_cancel;
	
	@FindBy(xpath="//a[contains(text(), 'TSE')]")
	WebElement timesheetentry_tse;
	@FindBy(xpath="//span[text()='Customer Site']")
	WebElement link_customersite;
		
	public ServiceAppointmentTimesheetExpensesTab() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	public void ClickTimesheetandExpensesTab() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(tab_timesheetandexpenses);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", tab_timesheetandexpenses);
		Thread.sleep(3000);
		}

	public void VerifyLaborTimeEntry() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(timesheetentry_tse);
		timesheetentry_tse.isDisplayed();
		link_customersite.isDisplayed();
		Thread.sleep(3000);
		}
	
	public void ClickRelatedTab() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(tab_related);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", tab_related);
		Thread.sleep(3000);
		}
	
}
