package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class ServiceAppointmentDetailsTab extends CommonFunctions {
	@FindBy(xpath = "(//slot[contains(text(),'SA')])[1]")
	WebElement lnk_SA;
	
	@FindBy(xpath = "(//a[contains(text(),'SA')])[1]")
	WebElement lnk_SA1;
	
	@FindBy(xpath = "(//a[text()='Details'])")
	WebElement tab_details;
	
	@FindBy(xpath = "//a[text()='Related']")
	WebElement tab_related;
	
	@FindBy(xpath="//span[text()='Edit Scheduled Start']")
	WebElement clk_editschedulestartdate;
	

	@FindBy(xpath="//label[text() = 'Date']//following-sibling::div//input[@name='SchedStartTime']")
	WebElement clk_schedulestartdate;
	
	@FindBy(xpath="//td[@data-value='2024-11-15']")
	WebElement select_schedulestartdate;
	

	@FindBy(xpath="//ul//li//span[@title='Service Appointments']")
	WebElement lnk_serviceAppointment;
		
	@FindBy(xpath="//label[text() = 'Date']//following-sibling::div//input[@name='SchedEndTime']")
	WebElement clk_editscheduleenddate;
	
	@FindBy(xpath="//input[@name='SchedEndTime']")

	WebElement clk_scheduleenddate;
	
	@FindBy(xpath="//td[@data-value='2024-11-16']")
	WebElement select_scheduleenddate;

	@FindBy(xpath="//button[text()='Save']")
	WebElement btn_save;
	
	@FindBy(xpath="//button[text()='Cancel']")
	WebElement btn_cancel;
		

	@FindBy(xpath="//label[text()='Status']//..//button")
	WebElement clk_sastatus;
	
	@FindBy(xpath="//span[@title='Dispatched']")
	WebElement select_dispatchedoption;
	

	@FindBy(xpath = "//button[text() = 'Today']")
	WebElement clk_today;
	

	@FindBy(xpath = "//button[@title='Select a List View: Service Appointments']")
	WebElement btn_serviceappointmentlistview;
	
	@FindBy(xpath = "(//a[contains(@title,'SA-')])[1]")
	public WebElement link_serviceappointment;
	
	@FindBy(xpath = "//li//span[text()='All Service Appointments']")
	WebElement listviewoption_allserviceappointments;
	
	@FindBy(xpath="//span[@title='Cannot Complete']")
	WebElement select_cannotcompleteoption;
	
	@FindBy(xpath="//span[@title='Completed']")
	WebElement select_completedoption;
	
	@FindBy(xpath="//span[@title='Canceled']")
	WebElement select_canceleddoption;
	
	@FindBy(xpath="//span[@title='None']")
	WebElement select_noneoption;
	
	@FindBy(xpath="//span[@title='Scheduled']")
	WebElement select_scheduledoption;
	
	@FindBy(xpath="//span[@title='In Progress']")
	WebElement select_inprogressoption;
	
	@FindBy(xpath="//span[@title='Travel - Customer Location']")
	WebElement select_travelcustomerlocationdoption;
	
	@FindBy(xpath="//span[@title='Travel - Base Location']")
	WebElement select_travelbaselocationdoption;
	
	@FindBy(xpath="//span[@title='Hotel']")
	WebElement select_hoteldoption;
	
	@FindBy(xpath="//span[@title='On Hold - Waiting for Parts']")
	WebElement select_onholdwaitingforpartsdoption;
	
	@FindBy(xpath="//span[@title='On Hold - Different Service appointment']")
	WebElement select_onholddifferentserviceappointmentdoption;

	public ServiceAppointmentDetailsTab() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}


	public void SelectServiceAppointment() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(lnk_SA);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", lnk_SA);
		Thread.sleep(5000);
		expWaitToBeClickable(tab_details);
		}
	

	public void lnkserviceAppointment() throws InterruptedException {
		expWaitToBeClickable(lnk_serviceAppointment);
		javascriptClick(lnk_serviceAppointment);
	}

	public void SelectServiceAppointmentFromListView() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(lnk_SA1);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", lnk_SA1);
		Thread.sleep(5000);
		expWaitToBeClickable(tab_details);
		}

	public void UpdateSAScheduleStartDate() throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("document.body.style.zoom = '0.75'");
		executor.executeScript("window.scrollTo(0,750)");
		Thread.sleep(3000);
		executor.executeScript(
				"var result = document.evaluate(\"//button[@title='Edit Scheduled Start']\", document.body, null, XPathResult.ANY_TYPE, null);     var input = result.iterateNext();input.scrollIntoView(); input.click();");
		Thread.sleep(2000);
		expWaitToBeClickable(clk_schedulestartdate);
		Thread.sleep(2000);
		expWaitToBeClickable(clk_schedulestartdate);
		javascriptClick(clk_schedulestartdate);
		Thread.sleep(2000);
		scrollIntoView(clk_today);
		javascriptClick(clk_today);
		Thread.sleep(2000);
	}

	public void UpdateSAScheduleEndDate() throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("document.body.style.zoom = '0.75'");
		Thread.sleep(2000);
		expWaitToBeClickable(clk_scheduleenddate);
		Thread.sleep(2000);
		javascriptClick(clk_scheduleenddate);
		Thread.sleep(2000);
		executor.executeScript("document.body.style.zoom = '0.85'");
		scrollIntoView(clk_today);
		javascriptClick(clk_today);
		Thread.sleep(2000);
	}

	public void ClickSaveButton() throws InterruptedException {
		Thread.sleep(4000);
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

	public void UpdateSAStatus(String newstatus) throws InterruptedException {
		Thread.sleep(2000);
	//	expWaitToBeClickable(clk_sastatus);
		Thread.sleep(2000);
		js.executeScript("var result = document.evaluate(\"(//button[@title='Edit Status'])[last()]\", document.body, null, XPathResult.ANY_TYPE, null);     var input = result.iterateNext();input.scrollIntoView(); input.click();");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
		clk_sastatus.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title='"+newstatus+"']")).click();
		Thread.sleep(3000);
		btn_save.click();
		Thread.sleep(4000);
		}


	public void VerifyServiceAppointmentStatusus() throws InterruptedException {
		Thread.sleep(2000);
	//	expWaitToBeClickable(clk_sastatus);
		Thread.sleep(2000);
		js.executeScript("var result = document.evaluate(\"(//button[@title='Edit Status'])[last()]\", document.body, null, XPathResult.ANY_TYPE, null);     var input = result.iterateNext();input.scrollIntoView(); input.click();");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
		clk_sastatus.click();
		Thread.sleep(2000);
		select_noneoption.isDisplayed();
		select_dispatchedoption.isDisplayed();
		select_scheduledoption.isDisplayed();
		select_inprogressoption.isDisplayed();
		select_canceleddoption.isDisplayed();
		select_completedoption.isDisplayed();
		select_cannotcompleteoption.isDisplayed();
		Thread.sleep(2000);
		js.executeScript("var result = document.evaluate(\"//span[@title='Completed']\", document.body, null, XPathResult.ANY_TYPE, null);     var input = result.iterateNext();input.scrollIntoView();");
		Thread.sleep(2000);
		select_travelcustomerlocationdoption.isDisplayed();
		select_travelbaselocationdoption.isDisplayed();
		select_hoteldoption.isDisplayed();
		select_onholdwaitingforpartsdoption.isDisplayed();
		select_onholddifferentserviceappointmentdoption.isDisplayed();
		Thread.sleep(2000);
		btn_cancel.click();
		Thread.sleep(2000);
		}

	public void ClickRelatedTab() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(tab_related);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", tab_related);
		Thread.sleep(3000);
		}
	
	public void clickServiceAppointmentListViewButton() throws InterruptedException {
		expWaitToBeClickable(btn_serviceappointmentlistview);
		btn_serviceappointmentlistview.click();
		Thread.sleep(4000);
	}

	public void clickAllServiceAppointmentsListView() throws InterruptedException {
		expWaitToBeClickable(listviewoption_allserviceappointments);
		listviewoption_allserviceappointments.click();
		Thread.sleep(4000);
	}
	public void SelectDispatchedServiceAppointment() throws InterruptedException {
		expWaitToBeClickable(link_serviceappointment);
		link_serviceappointment.click();
		Thread.sleep(4000);
	}
}
