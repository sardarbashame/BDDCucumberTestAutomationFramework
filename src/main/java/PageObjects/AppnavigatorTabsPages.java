package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	public WebElement clk_ServiceResourcestab;
	
	@FindBy(xpath = "(//table[@aria-label= 'Recently Viewed'])[last()]//th//a[@title]")
	List<WebElement> lst_recentServiceResource;
	
	@FindBy(xpath = "(//span[text() = 'Service Territories']//following-sibling::span//parent::a)")
	public WebElement txt_serviceTerritoriesListView;
	
	@FindBy(xpath = "//span[text() = 'Field Service']//parent::a")
	public WebElement clk_FieldServicetab;

	@FindBy(xpath = "(//div[@class= 'SingleTask DraggableSingleTask']//div[@title= 'None'])[1]")
	public WebElement DraggableSingleTask;
	
	@FindBy(xpath = "(//div[@class= 'SingleTask DraggableSingleTask']//input)[1]")
	public WebElement clk_DraggableSingleTask;
	
	@FindBy(xpath = "(//div[@class= 'dhx_marked_timespan gray_section'])[3]")
	public WebElement dropGantt;
	
	@FindBy(xpath = "//a[text() = 'Timesheet & Expenses']")
	public WebElement clk_timeSheetAndExpenses;

	@FindBy(xpath = "//span[text() = 'Timesheet Entries']//parent::button")
	public WebElement txt_timeSheetEntriesView;	
	
	@FindBy(xpath = "//span[text() = 'Status']//parent::div//parent::dt//parent::div[contains(@class, 'edit')]//following-sibling::dd//lightning-formatted-text")
	public WebElement txt_timeSheetEntriesStatus;
	
	@FindBy(xpath = "//span[text() = 'Status']//parent::div//parent::dt//parent::div[contains(@class, 'edit')]//following-sibling::dd//button")
	public WebElement edit_StatusTimesheet;
	
	@FindBy(xpath = "//label[text() = 'Status']//parent::div//following-sibling::div//button")
	public WebElement clk_timesheetStatusDropDown;
	
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
	
	
	By quoteTabAppear = By.xpath("//span[text() = 'Quotes']//parent::a");
	By workOrderstabAppear = By.xpath("//span[text() = 'Work Orders']//parent::a");
	By serviceAppoinmenttabAppear = By.xpath("//span[text() = 'Service Appointments']//parent::a");
	By inquiriesTabAppear = By.xpath("//span[text() = 'Recently Viewed | Inquiries']//parent::a");
	By TLINoTabAppear = By.xpath("(//span[text() = 'TLI Number'])[last()]");
	By serviceResourcestabAppear = By.xpath("//span[text() = 'Service Resources']//parent::a");
	By fieldServiceTabAppear = By.xpath("//span[text() = 'Field Service']//parent::a");
	By wait_disapperLoading = By.xpath("//div[@id = 'activeRequests' and @class = 'ng-hide']");
	By wait_apperselectedPolicy = By.xpath("//select[@ng-model= 'selectedPolicy']");




	
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
		JavascriptExecutor jse = (JavascriptExecutor)driver;
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
		Thread.sleep(4000);
		 WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Field Service']"));
		
         //Switch to the frame
         driver.switchTo().frame(iframe);
         //drawHighlight(iframe);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("document.body.style.zoom = '0.75'");
		javascriptClick(clk_DraggableSingleTask);
		draganddrop(DraggableSingleTask, dropGantt);
		waitForElementToDisAppear(wait_disapperLoading, 30);
		Thread.sleep(4000);
	}
	public void clickOnTimesheetAndExpenseSubTab() throws Exception {
		waitForElementToAppear(serviceAppoinmenttabAppear, 30);
		javascriptClick(clk_timeSheetAndExpenses);
		Thread.sleep(4000);		
		boolean flag = txt_timeSheetEntriesView.getAttribute("aria-expanded").equals(true);
		if(!flag)
		{
			txt_timeSheetEntriesView.click();
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
		String str = txt_timeSheetEntriesStatus.getAttribute("text");
		if (!(str == "Travel - Customer Location")) {
			edit_StatusTimesheet.click();
			expWaitToBeClickable(clk_timesheetStatusDropDown);
			clk_timesheetStatusDropDown.click();
			driver.findElement(By.xpath("//span[text()='Travel - Customer Location']")).click();
			expWaitToBeClickable(btn_save);
			btn_save.click();
		}		
	}
}
