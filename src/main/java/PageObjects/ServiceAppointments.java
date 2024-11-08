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
	
	@FindBy(xpath="//span[text()='Edit Scheduled Start']")
	WebElement clk_editschedulestartdate;
	
	@FindBy(xpath="//input[@name='SchedStartTime']")
	WebElement clk_schedulestartdate;
	
	@FindBy(xpath="//td[@data-value='2024-11-15']")
	WebElement select_schedulestartdate;
	
	public void UpdateSAScheduleStartDate() throws InterruptedException {
		js.executeScript("window.scrollTo(0,750)");
		Thread.sleep(3000);
	//	clk_editschedulestartdate.click();
		js.executeScript("var result = document.evaluate(\"//button[@title='Edit Scheduled Start']\", document.body, null, XPathResult.ANY_TYPE, null);     var input = result.iterateNext();input.scrollIntoView(); input.click();");
		Thread.sleep(2000);
		expWaitToBeClickable(clk_schedulestartdate);
		Thread.sleep(2000);
		clk_schedulestartdate.click();
		Thread.sleep(2000);
		select_schedulestartdate.click();
		Thread.sleep(2000);
	//	expWaitToBeClickable(tab_details);
		}
	@FindBy(xpath="//span[text()='Edit Scheduled End']")
	WebElement clk_editscheduleenddate;
	
	@FindBy(xpath="//input[@name='SchedEndTime']")
	WebElement clk_scheduleenddate;
	
	@FindBy(xpath="//td[@data-value='2024-11-16']")
	WebElement select_scheduleenddate;
	
	public void UpdateSAScheduleEndDate() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(clk_scheduleenddate);
		Thread.sleep(2000);
		clk_scheduleenddate.click();
		Thread.sleep(2000);
		select_scheduleenddate.click();
		}
	
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement btn_save;
	
	public void ClickSaveButton() throws InterruptedException {
		Thread.sleep(2000);
		btn_save.click();
		Thread.sleep(4000);
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(3000);
		expWaitToBeClickable(tab_details);
		}
	
	public void ClickDetailsTab() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(tab_details);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", tab_details);
		Thread.sleep(3000);
		}
	
	@FindBy(xpath="//label[text()='Status']//..//button")
	WebElement clk_sastatus;
	@FindBy(xpath="//span[@title='Dispatched']")
	WebElement select_dispatchedoption;
	
	public void UpdateSAStatus() throws InterruptedException {
		Thread.sleep(2000);
	//	expWaitToBeClickable(clk_sastatus);
		Thread.sleep(2000);
		js.executeScript("var result = document.evaluate(\"(//button[@title='Edit Status'])[last()]\", document.body, null, XPathResult.ANY_TYPE, null);     var input = result.iterateNext();input.scrollIntoView(); input.click();");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
		clk_sastatus.click();
		Thread.sleep(2000);
		select_dispatchedoption.click();
		Thread.sleep(2000);
		}
	
	public void ClickRelatedTab() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(tab_related);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", tab_related);
		Thread.sleep(3000);
		}
		
	@FindBy(xpath = "//button[@title='Select a List View: Service Appointments']")
	public WebElement btn_serviceappointmentlistview;
	
	public void clickServiceAppointmentListViewButton() throws InterruptedException {
		expWaitToBeClickable(btn_serviceappointmentlistview);
		btn_serviceappointmentlistview.click();
		Thread.sleep(4000);
	}

	@FindBy(xpath = "//li//span[text()='All Service Appointments']")
	public WebElement listviewoption_allserviceappointments;
	public void clickAllServiceAppointmentsListView() throws InterruptedException {
		expWaitToBeClickable(listviewoption_allserviceappointments);
		listviewoption_allserviceappointments.click();
		Thread.sleep(4000);
	}
	
	@FindBy(xpath = "(//a[contains(@title,'SA-')])[1]")
	public WebElement link_serviceappointment;
	
	public void SelectDispatchedServiceAppointment() throws InterruptedException {
		expWaitToBeClickable(link_serviceappointment);
		link_serviceappointment.click();
		Thread.sleep(4000);
	}
}
