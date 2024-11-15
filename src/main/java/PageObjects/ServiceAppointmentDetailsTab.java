package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;
import junit.framework.Assert;

public class ServiceAppointmentDetailsTab extends CommonFunctions {
	public static String ServiceAppmentName;

	@FindBy(xpath = "(//slot[contains(text(),'SA')])[1]")
	WebElement lnk_SA;

	@FindBy(xpath = "(//a[contains(text(),'SA')])[1]")
	WebElement lnk_SA1;

	@FindBy(xpath = "(//a[text()='Details'])")
	WebElement tab_details;

	@FindBy(xpath = "//a[text()='Related']")
	WebElement tab_related;

	@FindBy(xpath = "(//span[text() = 'Appointment Number']//ancestor::dt//following-sibling::dd//lightning-formatted-text)[last()]")
	WebElement txt_ServiceAppmentName;

	@FindBy(xpath = "//span[text()='Edit Scheduled Start']")
	WebElement clk_editschedulestartdate;

	@FindBy(xpath = "//label[text() = 'Date']//following-sibling::div//input[@name='SchedStartTime']")
	WebElement clk_schedulestartdate;

	@FindBy(xpath = "//td[@data-value='2024-11-15']")
	WebElement select_schedulestartdate;

	@FindBy(xpath = "//label[text() = 'Date']//following-sibling::div//input[@name='SchedEndTime']")
	WebElement clk_editscheduleenddate;

	@FindBy(xpath = "//input[@name='SchedEndTime']")
	WebElement clk_scheduleenddate;

	@FindBy(xpath = "//td[@data-value='2024-11-16']")
	WebElement select_scheduleenddate;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement btn_save;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement btn_cancel;

	@FindBy(xpath = "//label[text()='Status']//..//button")
	WebElement clk_sastatus;

	@FindBy(xpath = "//span[@title='Dispatched']")
	WebElement select_dispatchedoption;

	@FindBy(xpath = "//button[text() = 'Today']")
	WebElement clk_today;

	@FindBy(xpath = "(//table[@aria-label= 'Recently Viewed'])[last()]//th//a[@title]")
	List<WebElement> lst_recentServiceAppointment;

	@FindBy(xpath = "//a[text() = 'Daily Notes']")
	WebElement clk_dailyNotes;

	@FindBy(xpath = "//button[text() = 'New Daily Note']")
	WebElement clk_NewdailyNotes;

	@FindBy(xpath = "//span[text() = 'Create Punch List']//parent::label//span[@part = 'indicator']")
	WebElement chk_indicatorEnable;

	@FindBy(xpath = "//input[@name = 'Subject__c']")
	WebElement ipt_subject;

	@FindBy(xpath = "//textarea[@name = 'Todays_Activities__c']")
	WebElement ipt_Todays_Activities;

	@FindBy(xpath = "//textarea[@name = 'Planned_Activities_For_Tomorrow__c']")
	WebElement ipt_Planned_Activities;

	@FindBy(xpath = "//button[@name = 'next']")
	WebElement btn_next;

	@FindBy(xpath = "//label[text() = 'Title']")
	WebElement label_title;

	@FindBy(xpath = "//label[text() = 'Status']")
	WebElement label_status;

	@FindBy(xpath = "//label[text() = 'Assigned To']")
	WebElement label_AssignedTO;

	@FindBy(xpath = "//label[text() = 'Work Plan']")
	WebElement label_workPlan;

	@FindBy(xpath = "//label[text() = 'Work Order Line']")
	WebElement label_workOrderLine;

	@FindBy(xpath = "//label[text() = 'Priority']")
	WebElement label_priority;

	@FindBy(xpath = "//label[text() = 'Description']")
	WebElement label_description;

	@FindBy(xpath = "//label[text() = 'Proposed Solution/Comments']")
	WebElement label_proposedSoln;

	@FindBy(xpath = "//label[text() = 'Line']")
	WebElement label_line;

	@FindBy(xpath = "//label[text() = 'Plant Area']")
	WebElement label_plantArea;

	@FindBy(xpath = "//label[text() = 'LW']")
	WebElement label_LW;

	@FindBy(xpath = "//input[@name = 'Name']")
	WebElement ipt_name;

	@FindBy(xpath = "( //c-daily-notes-c-m-p//table)")
	List<WebElement> lst_dailyNotesGrid;

	@FindBy(xpath = "//button[@title='Select a List View: Service Appointments']")
	WebElement btn_serviceappointmentlistview;

	@FindBy(xpath = "(//a[contains(@title,'SA-')])[1]")
	public WebElement link_serviceappointment;

	@FindBy(xpath = "//li//span[text()='All Service Appointments']")
	WebElement listviewoption_allserviceappointments;

	@FindBy(xpath = "//span[@title='Cannot Complete']")
	WebElement select_cannotcompleteoption;

	@FindBy(xpath = "//span[@title='Completed']")
	WebElement select_completedoption;

	@FindBy(xpath = "//span[@title='Canceled']")
	WebElement select_canceleddoption;

	@FindBy(xpath = "//span[@title='None']")
	WebElement select_noneoption;

	@FindBy(xpath = "//span[@title='Scheduled']")
	WebElement select_scheduledoption;

	@FindBy(xpath = "//span[@title='In Progress']")
	WebElement select_inprogressoption;

	@FindBy(xpath = "//span[@title='Travel - Customer Location']")
	WebElement select_travelcustomerlocationdoption;

	@FindBy(xpath = "//span[@title='Travel - Base Location']")
	WebElement select_travelbaselocationdoption;

	@FindBy(xpath = "//span[@title='Hotel']")
	WebElement select_hoteldoption;

	@FindBy(xpath = "//span[@title='On Hold - Waiting for Parts']")
	WebElement select_onholdwaitingforpartsdoption;

	@FindBy(xpath = "//span[@title='On Hold - Different Service appointment']")
	WebElement select_onholddifferentserviceappointmentdoption;

	@FindBy(xpath = "//ul//li//span[@title='Service Appointments']")
	WebElement lnk_serviceAppointment;
	
	@FindBy(xpath = "//label[text() = 'Service Territory']//parent::lightning-grouped-combobox//following::input[@placeholder = 'Search Service Territories...']")
	WebElement sel_serviceTerritory;

	By serviceAppoinmenttabAppear = By.xpath("//span[text() = 'Service Appointments']//parent::a");

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
		mouseHover(clk_today);
		javascriptClick(clk_today);
		Thread.sleep(2000);
	}

	public void UpdateSAScheduleEndDate() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(clk_scheduleenddate);
		Thread.sleep(2000);
		javascriptClick(clk_scheduleenddate);
		Thread.sleep(2000);
		scrollIntoView(clk_today);
		javascriptClick(clk_today);
		Thread.sleep(2000);
	}

	public void ClickSaveButton() throws InterruptedException {
		Thread.sleep(4000);
		expWaitToBeClickable(btn_save);
		javascriptClick(btn_save);
		Thread.sleep(4000);
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(3000);
		expWaitToBeClickable(tab_details);
	}

	public void UpdateserviceTerritory() throws Exception {
		expWaitToBeClickable(sel_serviceTerritory);
		Thread.sleep(4000);
		sel_serviceTerritory.click();
		clickDrpDownAndSelValue(sel_serviceTerritory, "US - Processing Pencil In");
		Thread.sleep(3000);
		btn_save.click();
		Thread.sleep(4000);
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
		// expWaitToBeClickable(clk_sastatus);
		Thread.sleep(2000);
		js.executeScript(
				"var result = document.evaluate(\"(//button[@title='Edit Status'])[last()]\", document.body, null, XPathResult.ANY_TYPE, null);     var input = result.iterateNext();input.scrollIntoView(); input.click();");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
		javascriptClick(clk_sastatus);
		Thread.sleep(2000);
		zoomIN(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title='" + newstatus + "']")).click();
		Thread.sleep(3000);
		btn_save.click();
		Thread.sleep(4000);
	}

	public void VerifyServiceAppointmentStatusus() throws InterruptedException {
		Thread.sleep(2000);
		// expWaitToBeClickable(clk_sastatus);
		Thread.sleep(2000);
		js.executeScript(
				"var result = document.evaluate(\"(//button[@title='Edit Status'])[last()]\", document.body, null, XPathResult.ANY_TYPE, null);     var input = result.iterateNext();input.scrollIntoView(); input.click();");
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
		js.executeScript(
				"var result = document.evaluate(\"//span[@title='Completed']\", document.body, null, XPathResult.ANY_TYPE, null);     var input = result.iterateNext();input.scrollIntoView();");
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
		ServiceAppmentName = txt_ServiceAppmentName.getText();
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

	public void clkRecentServiceAppointment() throws Exception {
		waitForElementToAppear(serviceAppoinmenttabAppear, 30);
		javascriptClick(lst_recentServiceAppointment.get(0));
		Thread.sleep(4000);
	}

	public void createNewDailyNotesAndSaveit() throws Exception {
		waitForElementToAppear(serviceAppoinmenttabAppear, 30);
		expWaitToBeClickable(clk_dailyNotes);
		javascriptClick(clk_dailyNotes);
		expWaitToBeClickable(clk_NewdailyNotes);
		clk_NewdailyNotes.click();
		expWaitToBeClickable(chk_indicatorEnable);
		chk_indicatorEnable.click();
		Thread.sleep(4000);
		ipt_subject.sendKeys("Test Automation Notes");
		ipt_Todays_Activities.sendKeys("Test Automation Activities");
		ipt_Planned_Activities.sendKeys("Test Automation Planned_Activities");
		btn_next.click();
		Thread.sleep(4000);
		expWaitToBeClickable(btn_next);
		btn_next.click();
		Assert.assertTrue(label_title.isDisplayed());
		Assert.assertTrue(label_status.isDisplayed());
		Assert.assertTrue(label_AssignedTO.isDisplayed());
		Assert.assertTrue(label_workPlan.isDisplayed());
		Assert.assertTrue(label_workOrderLine.isDisplayed());
		Assert.assertTrue(label_priority.isDisplayed());
		Assert.assertTrue(label_description.isDisplayed());
		Assert.assertTrue(label_proposedSoln.isDisplayed());
		Assert.assertTrue(label_line.isDisplayed());
		Assert.assertTrue(label_plantArea.isDisplayed());
		Assert.assertTrue(label_LW.isDisplayed());
		ipt_name.sendKeys("Mr");
		btn_next.click();
		Thread.sleep(4000);

	}

	public void verifyNotesAndPunchList() throws Exception {
		// Notes
		drawHighlight(lst_dailyNotesGrid.get(0));
		Assert.assertTrue(lst_dailyNotesGrid.get(0).isDisplayed());
		// Punch list
		drawHighlight(lst_dailyNotesGrid.get(1));
		Assert.assertTrue(lst_dailyNotesGrid.get(1).isDisplayed());
	}

}
