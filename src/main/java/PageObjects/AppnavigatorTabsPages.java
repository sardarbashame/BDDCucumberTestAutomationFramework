package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import commonutilities.CommonFunctions;

public class AppnavigatorTabsPages extends CommonFunctions {

	public AppnavigatorTabsPages() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	@FindBy(xpath = "//span[text() = 'Quotes']//parent::a")
	public WebElement clk_quotetab;

	@FindBy(xpath = "//table[@aria-label= 'Recently Viewed']//a[contains(@title, '0')]")
	List<WebElement> lst_recentQuote;

	@FindBy(xpath = "(//span[text() = 'TLI Number'])[last()]")
	WebElement txt_TLINoLabel;

	@FindBy(xpath = "(//table[@aria-label= 'Recently Viewed'])[last()]//th//a[@title]")
	List<WebElement> lst_recentInQuiries;

	@FindBy(xpath = "//span[text() = 'Work Orders']//parent::a")
	public WebElement clk_WorkOrderstab;

	@FindBy(xpath = "(//table[@aria-label= 'Recently Viewed'])[last()]//th//a[@title]")
	List<WebElement> lst_recentWorkOrder;

	@FindBy(xpath = "//span[text() = 'Service Appointments']//parent::a")
	public WebElement clk_serviceAppoinmenttab;

	@FindBy(xpath = "(//table[@aria-label= 'Recently Viewed'])[last()]//th//a[@title]")
	List<WebElement> lst_recentServiceAppointment;

	@FindBy(xpath = "//span[text() = 'Service Resources']//parent::a")
	WebElement clk_ServiceResourcestab;

	@FindBy(xpath = "(//table[@aria-label= 'Recently Viewed'])[last()]//th//a[@title]")
	List<WebElement> lst_recentServiceResource;

	@FindBy(xpath = "(//span[text() = 'Service Territories']//following-sibling::span//parent::a)")
	WebElement txt_serviceTerritoriesListView;

	@FindBy(xpath = "//span[text() = 'Field Service']//parent::a")
	WebElement clk_FieldServicetab;

	@FindBy(xpath = "(//div[@class= 'SingleTask DraggableSingleTask']//div[@title= 'None'])[1]")
	WebElement DraggableSingleTask;

	@FindBy(xpath = "//input[@id = 'TaskSearchFilterInput']")
	WebElement ipt_searchServiceApment;
	
	@FindBy(xpath = "(//div[@class= 'SingleTask DraggableSingleTask']//input)[1]")
	WebElement clk_DraggableSingleTask;

	@FindBy(xpath = "(//div[@class= 'dhx_marked_timespan gray_section'])[3]")
	WebElement dropGantt;
	
	@FindBy(xpath = "//a[text() = 'Timesheet & Expenses']")
	WebElement clk_timeSheetAndExpenses;

	@FindBy(xpath = "(//table)[last()]//th//a[contains(text(), 'TSE')]")
	WebElement clk_TSEEntries;

	@FindBy(xpath = "//span[text() = 'Timesheet Entries']//parent::button")
	WebElement txt_timeSheetEntriesView;

	@FindBy(xpath = "//span[text() = 'Status']//parent::div//parent::dt//parent::div[contains(@class, 'edit')]//following-sibling::dd//lightning-formatted-text")
	WebElement txt_timeSheetEntriesStatus;

	@FindBy(xpath = "//span[text() = 'Status']//parent::div//parent::dt//parent::div[contains(@class, 'edit')]//following-sibling::dd//button")
	WebElement edit_StatusTimesheet;

	@FindBy(xpath = "//label[text() = 'Status']//parent::div//following-sibling::div//button")
	WebElement clk_timesheetStatusDropDown;

	@FindBy(xpath = "(//button[text()='Save'])[last()]")
	WebElement btn_save;

	@FindBy(xpath = "(//table)[last()]//th//span[text() = 'Name']")
	public WebElement txt_timeSheetEntriesName;

	@FindBy(xpath = "(//table)[last()]//th//span[text() = 'Start Time']")
	public WebElement txt_timeSheetEntriesStartTime;

	@FindBy(xpath = "(//table)[last()]//th//span[text() = 'Rounded Start Time']")
	public WebElement txt_timeSheetEntriesRoundedStartTime;

	@FindBy(xpath = "(//table)[last()]//th//span[text() = 'End Time']")
	public WebElement txt_timeSheetEntriesEndTime;

	@FindBy(xpath = "(//table)[last()]//th//span[text() = 'Rounded End Time']")
	public WebElement txt_timeSheetEntriesRoundedEndTime;

	@FindBy(xpath = "(//table)[last()]//th//span[text() = 'Day']")
	public WebElement txt_timeSheetEntriesDay;

	@FindBy(xpath = "(//table)[last()]//th//span[text() = 'Work Type']")
	public WebElement txt_timeSheetEntriesWorkType;

	@FindBy(xpath = "(//table)[last()]//th//span[text() = 'Duration (In Days)']")
	public WebElement txt_timeSheetEntriesDurationDays;

	@FindBy(xpath = "//span[text() = 'Time Sheet']")
	public WebElement txt_timeSheet;

	@FindBy(xpath = "//records-record-layout-section//span[text() = 'Start Time']")
	public WebElement txt_StartTime;

	@FindBy(xpath = "//records-record-layout-section//span[text() = 'End Time']")
	public WebElement txt_EndTime;

	@FindBy(xpath = "//flexipage-tab2[contains(@class, 'show')]//span[text() = 'Description']")
	public WebElement txt_description;

	@FindBy(xpath = "//flexipage-tab2[contains(@class, 'show')]//span[text() = 'Duration (In Minutes)']")
	public WebElement txt_durationInMins;

	@FindBy(xpath = "(//flexipage-tab2[contains(@class, 'show')]//span[text() = 'Work Type'])[last()]")
	public WebElement txt_workType;

	@FindBy(xpath = "//flexipage-tab2[contains(@class, 'show')]//span[text() = 'Service Appointment']")
	public WebElement txt_serviceAppointment;

	@FindBy(xpath = "(//flexipage-tab2[contains(@class, 'show')]//span[text() = 'Show In FSR'])[last()]")
	public WebElement txt_showInFSR;

	@FindBy(xpath = "//flexipage-tab2[contains(@class, 'show')]//span[text() = 'DurationInHours']")
	public WebElement txt_durationInHrs;

	@FindBy(xpath = "//flexipage-tab2[contains(@class, 'show')]//span[text() = 'Resource']")
	public WebElement txt_resources;

	@FindBy(xpath = "//flexipage-tab2[contains(@class, 'show')]//span[text() = 'Type']")
	public WebElement txt_types;

	@FindBy(xpath = "//flexipage-tab2[contains(@class, 'show')]//span[text() = 'Status']")
	public WebElement txt_status;

	@FindBy(xpath = "//flexipage-tab2[contains(@class, 'show')]//span[text() = 'Work Order']")
	public WebElement txt_workOrder;

	@FindBy(xpath = "//flexipage-tab2[contains(@class, 'show')]//span[text() = 'Work Order Line Item']")
	WebElement txt_workOrderItems;

	@FindBy(xpath = "//button[@title = 'Select a List View: Quotes']")
	WebElement clk_listViewQuotes;

	@FindBy(xpath = "//span[text() = 'All Quotes / Estimates']//parent::a")
	WebElement clk_listViewQuotesOption;

	@FindBy(xpath = "//span[text() = 'TLI Number']//parent::a")
	WebElement clk_listViewQuotesColumn;

	@FindBy(xpath = "//span[text() = 'Expenses']//parent::button")
	WebElement txt_expansesView;

	@FindBy(xpath = "//button[text() = 'New Expense']")
	WebElement btn_createExpanses;

	@FindBy(xpath = "//button[@name = 'Expenses_type__c']")
	WebElement drpDown_expansesType;

	@FindBy(xpath = "//span[text() = 'Airfare/Baggage']//parent::span//parent::lightning-base-combobox-item")
	WebElement drpDown_expansesTypeOption;

	@FindBy(xpath = "//input[@name = 'TransactionDate']")
	WebElement ipt_TransactionDate;

	@FindBy(xpath = "//button[@name = 'today']")
	WebElement sel_todayDate;

	@FindBy(xpath = "//input[@name = 'Amount']")
	WebElement ipt_amountValue;

	@FindBy(xpath = "//button[@name = 'next']")
	WebElement btn_next;

	@FindBy(xpath = "//slot[text() = 'Expense created successfully']")
	WebElement msg_expenseCreated;

	@FindBy(xpath = "(//span[text() = 'Expenses']//ancestor::article//a[contains(text(), 'EXP-')])[1]")
	WebElement clk_expenseListView;

	@FindBy(xpath = "//span[text() = 'Work Order']")
	WebElement txt_workOrderLabel;

	@FindBy(xpath = "//div[@class= 'slds-grid']//a//slot[contains(text(), '0000')]")
	WebElement txt_workOrderValue;

	By quoteTabAppear = By.xpath("//span[text() = 'Quotes']//parent::a");
	By workOrderstabAppear = By.xpath("//span[text() = 'Work Orders']//parent::a");
	By serviceAppoinmenttabAppear = By.xpath("//span[text() = 'Service Appointments']//parent::a");
	By inquiriesTabAppear = By.xpath("//span[text() = 'Recently Viewed | Inquiries']//parent::a");
	By TLINoTabAppear = By.xpath("(//span[text() = 'TLI Number'])[last()]");
	By serviceResourcestabAppear = By.xpath("//span[text() = 'Service Resources']//parent::a");
	By fieldServiceTabAppear = By.xpath("//span[text() = 'Field Service']//parent::a");
	By wait_disapperLoading = By.xpath("//div[@id = 'activeRequests' and @class = 'ng-hide']");
	By wait_apperselectedPolicy = By.xpath("//select[@ng-model= 'selectedPolicy']");
	By waitExpenseCreatedmsg = By.xpath("//slot[text() = 'Expense created successfully']");

	public void clkQuoteTab() throws Exception {
		waitForElementToAppear(quoteTabAppear, 30);
		javascriptClick(clk_quotetab);
		Thread.sleep(4000);
	}

	public void clkRecentQuote() throws Exception {
		waitForElementToAppear(quoteTabAppear, 30);
		javascriptClick(lst_recentQuote.get(0));
		Thread.sleep(4000);
		scrollIntoView(txt_TLINoLabel);
		drawHighlight(txt_TLINoLabel);
		Assert.assertTrue(txt_TLINoLabel.isDisplayed(), "TLI Number is not displayed under Quote Details tab");
	}

	public void clkInQuiries() throws Exception {
		waitForElementToAppear(inquiriesTabAppear, 30);
		javascriptClick(lst_recentInQuiries.get(0));
		Thread.sleep(4000);
		scrollIntoView(txt_TLINoLabel);
		drawHighlight(txt_TLINoLabel);
		Assert.assertTrue(txt_TLINoLabel.isDisplayed(), "TLI Number is not displayed under Quote Details tab");
	}

	public void clkWorkOrderTab() throws Exception {
		waitForElementToAppear(workOrderstabAppear, 30);
		javascriptClick(clk_WorkOrderstab);
		Thread.sleep(4000);
	}

	public void clkRecentWorkOrder() throws Exception {
		waitForElementToAppear(workOrderstabAppear, 30);
		javascriptClick(lst_recentWorkOrder.get(0));
		Thread.sleep(4000);
		scrollIntoView(txt_TLINoLabel);
		drawHighlight(txt_TLINoLabel);
		Assert.assertTrue(txt_TLINoLabel.isDisplayed(), "TLI Number is not displayed under Quote Details tab");
	}

	public void clkserviceAppoinmentTab() throws Exception {
		waitForElementToAppear(serviceAppoinmenttabAppear, 30);
		javascriptClick(clk_serviceAppoinmenttab);
		Thread.sleep(4000);
	}

	public void clkRecentServiceAppointment() throws Exception {
		waitForElementToAppear(serviceAppoinmenttabAppear, 30);
		javascriptClick(lst_recentServiceAppointment.get(0));
		Thread.sleep(4000);
		scrollIntoView(txt_TLINoLabel);
		drawHighlight(txt_TLINoLabel);
		waitForElementToAppear(TLINoTabAppear, 30);
		Assert.assertTrue(txt_TLINoLabel.isDisplayed(), "TLI Number is not displayed under Quote Details tab");
	}

	public void clkServiceResourceTab() throws Exception {
		waitForElementToAppear(serviceResourcestabAppear, 30);
		javascriptClick(clk_ServiceResourcestab);
		Thread.sleep(4000);
	}

	public void clkRecentServiceResource() throws Exception {
		waitForElementToAppear(serviceResourcestabAppear, 30);
		javascriptClick(lst_recentServiceResource.get(0));
		Thread.sleep(4000);
	}

	public void verifyServiceTerritoriesListView() throws Exception {
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,450)");
		scrollIntoView(txt_serviceTerritoriesListView);
		Thread.sleep(4000);
		expWaitToBeClickable(txt_serviceTerritoriesListView);
		drawHighlight(txt_serviceTerritoriesListView);
		Assert.assertTrue(txt_serviceTerritoriesListView.isDisplayed(),
				"Service Territories is not displayed under Quote Details tab");
	}

	public void clkFieldServiceTab() throws Exception {
		waitForElementToAppear(fieldServiceTabAppear, 30);
		javascriptClick(clk_FieldServicetab);
		Thread.sleep(4000);
	}

	public void selectAppointmentAndDragAndDrop() throws Exception {
		waitForElementToAppear(fieldServiceTabAppear, 30);
		Thread.sleep(5000);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Field Service']"));
		driver.switchTo().frame(iframe);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("document.body.style.zoom = '0.55'");
		drawHighlight(ipt_searchServiceApment);	
		javascriptClick(ipt_searchServiceApment);
		ipt_searchServiceApment.sendKeys(ServiceAppointmentRelatedTab.ServiceAppmentName);
		ipt_searchServiceApment.sendKeys(Keys.ENTER);
		draganddropJscript(DraggableSingleTask, dropGantt);
		waitForElementToDisAppear(wait_disapperLoading, 30);
		Thread.sleep(4000);
	}

	public void clickOnTimesheetAndExpenseSubTab() throws Exception {
		waitForElementToAppear(serviceAppoinmenttabAppear, 30);
		javascriptClick(clk_timeSheetAndExpenses);
		Thread.sleep(5000);
		boolean flag = txt_timeSheetEntriesView.getAttribute("aria-expanded").equals(true);
		if (!flag) {
			expWaitToBeClickable(txt_timeSheetEntriesView);
			mouseHover(txt_timeSheetEntriesView);
			drawHighlight(txt_timeSheetEntriesView);
			javascriptClick(txt_timeSheetEntriesView);
		}
		Assert.assertTrue(txt_timeSheetEntriesName.isDisplayed());
		Assert.assertTrue(txt_timeSheetEntriesStartTime.isDisplayed());
		Assert.assertTrue(txt_timeSheetEntriesRoundedStartTime.isDisplayed());
		Assert.assertTrue(txt_timeSheetEntriesEndTime.isDisplayed());
		Assert.assertTrue(txt_timeSheetEntriesRoundedEndTime.isDisplayed());
		Assert.assertTrue(txt_timeSheetEntriesDay.isDisplayed());
		Assert.assertTrue(txt_timeSheetEntriesWorkType.isDisplayed());
		Assert.assertTrue(txt_timeSheetEntriesDurationDays.isDisplayed());

	}

	public void changeStatusToTravelCustomerLocation() throws Exception {
		waitForElementToAppear(fieldServiceTabAppear, 30);
		Thread.sleep(4000);
		String str = txt_timeSheetEntriesStatus.getText();
		if (!(str.equals("Travel - Customer Location"))) {
			javascriptClick(edit_StatusTimesheet);
			expWaitToBeClickable(clk_timesheetStatusDropDown);
			clk_timesheetStatusDropDown.click();
			driver.findElement(By.xpath("//span[text()='Travel - Customer Location']")).click();
			expWaitToBeClickable(btn_save);
			btn_save.click();
			Thread.sleep(4000);
		}
	}

	public void clickOnTimesheetEntriesAndVerifyLables() throws Exception {
		waitForElementToAppear(serviceAppoinmenttabAppear, 30);
		javascriptClick(clk_TSEEntries);
		Thread.sleep(5000);
		mouseHover(txt_timeSheet);
		Assert.assertTrue(txt_timeSheet.isDisplayed());
		Assert.assertTrue(txt_StartTime.isDisplayed());
		Assert.assertTrue(txt_EndTime.isDisplayed());
		Assert.assertTrue(txt_description.isDisplayed());
		Assert.assertTrue(txt_durationInMins.isDisplayed());
		scrollIntoView(txt_workType);
		mouseHover(txt_workType);
		Assert.assertTrue(txt_workType.isDisplayed());
		Assert.assertTrue(txt_serviceAppointment.isDisplayed());
		Assert.assertTrue(txt_showInFSR.isDisplayed());
		Assert.assertTrue(txt_durationInHrs.isDisplayed());
		Assert.assertTrue(txt_resources.isDisplayed());
		Assert.assertTrue(txt_types.isDisplayed());
		Assert.assertTrue(txt_status.isDisplayed());
		Assert.assertTrue(txt_workOrder.isDisplayed());
		Assert.assertTrue(txt_workOrderItems.isDisplayed());
	}

	public void verifyTLIColumniSDisplayed() throws Exception {
		waitForElementToAppear(quoteTabAppear, 30);
		Thread.sleep(4000);
		expWaitToBeClickable(clk_listViewQuotes);
		javascriptClick(clk_listViewQuotes);
		expWaitToBeClickable(clk_listViewQuotesOption);
		javascriptClick(clk_listViewQuotesOption);
		expWaitToBeClickable(clk_listViewQuotesColumn);
		Assert.assertTrue(clk_listViewQuotesColumn.isDisplayed());
	}

	public void createNewExpansesAndSaveIt() throws Exception {
		Thread.sleep(5000);
		boolean flag = txt_expansesView.getAttribute("aria-expanded").equals(true);
		if (!flag) {
			expWaitToBeClickable(txt_expansesView);
			mouseHover(txt_expansesView);
			drawHighlight(txt_expansesView);
			javascriptClick(txt_expansesView);
		}
		btn_createExpanses.click();
		expWaitToBeClickable(drpDown_expansesType);
		drpDown_expansesType.click();
		drpDown_expansesTypeOption.click();
		ipt_TransactionDate.click();
		javascriptClick(sel_todayDate);
		ipt_amountValue.sendKeys("200");
		btn_next.click();
		Thread.sleep(2000);
		btn_save.click();
		waitForElementToAppear(waitExpenseCreatedmsg, 30);
		Assert.assertTrue(msg_expenseCreated.isDisplayed());
		Thread.sleep(2000);		
	}

	public void verifyWorkOrderNumber() throws Exception {
		waitForElementToAppear(serviceAppoinmenttabAppear, 30);
		Thread.sleep(4000);
		expWaitToBeClickable(clk_expenseListView);
		javascriptClick(clk_expenseListView);
		switchToWindow();
		expWaitToBeClickable(txt_workOrderLabel);
		drawHighlight(txt_workOrderValue);
		String str = txt_workOrderValue.getText();
		Assert.assertTrue(str.contains("000"));
		Assert.assertTrue(txt_workOrderValue.isDisplayed());

	}
}
