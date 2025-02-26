package PageObjects;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class WorkOrder extends CommonFunctions {

	By waitforelementtodisappear;
	By waitforelementtoappear;
	String actualmessage;

	public WorkOrder() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	@FindBy(xpath = "//button[text() = 'Next']")
	WebElement btn_New;

	@FindBy(xpath = "//input[@name = 'Subject']")
	WebElement Subject;

	@FindBy(xpath = "//h2[text()='Create Work Order']")
	WebElement heading_createworkorder;

	@FindBy(xpath = "(//input[@name='Start_Date'])[1]")
	WebElement ipt_fromDate;

	@FindBy(xpath = "(//label[text()='Date']/..//input)[@name='End_Date']")
	WebElement ipt_endDate;

	@FindBy(xpath = "(//label[text()='Date']/..//input)[@name='Start_Date']//parent::div//button[@name = 'today']")
	WebElement ipt_dateValueFromIsToday;

	@FindBy(xpath = "//label[text()='Work Type' ]/../..//input[@placeholder= 'Select Work Type...']")
	WebElement txt_worktype;

	@FindBy(xpath = "//div[@title='Break Fix']//span")
	WebElement res_worktype;

	@FindBy(xpath = "//button[text()='Select Assets']")
	WebElement btn_save;

	@FindBy(xpath = "(//span[text() = 'Account'])[last()]//ancestor::lightning-icon//following-sibling::div//span[text() = 'Clear Selection']")
	List<WebElement> icon_deleteAccount;

	@FindBy(xpath = "//input[@placeholder = 'Search Accounts...']")
	WebElement ipt_AccountName;

	@FindBy(xpath = "//div//span[contains(@class, 'toastMessage')]//a")
	List<WebElement> toast_message;

	@FindBy(xpath = "//div[@title='Create Service Appoinments']")
	WebElement btn_createserviceappointments;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement btn_Next;

	@FindBy(xpath = "//span[text()='Work Order']/..")
	WebElement radiobtn_WorkOrder;

	@FindBy(xpath = "(//span[text()='Yes']/..)[1]")
	WebElement radiobtn_address_yes;

	@FindBy(xpath = "(//span[text()='Yes']/..)[2]")
	WebElement radiobtn_date_yes;

	@FindBy(xpath = "//*[text()='Would You Like To Use This Address?']")
	WebElement txt_address_msg;

	@FindBy(xpath = "//span[text()='Next']")
	WebElement btn_next;

	@FindBy(xpath = "(//span[text()='Title']/../..//input)[last()]")
	WebElement ipt_worksteptitle;

	@FindBy(xpath = "(//span[text()='Work Plan']/../..//input)[last()]")
	WebElement ipt_workstepworkplan;

	@FindBy(xpath = "//div[@title='TestPunchlist']")
	WebElement result_workstepworkplan;

	@FindBy(xpath = "(//span[text()='Save'])[last()]")
	WebElement btn_workstepsave;

	@FindBy(xpath = "//span[text()='Customer Facing']/../..//*[@aria-checked='true']")
	WebElement chckbox_customerfacing;

	public void CreateWorkOrder() throws Exception {
		Thread.sleep(5000);
		zoomOut(5);
		Subject.sendKeys(ConcatCurrentDateTime("TestAuto"));
		txt_worktype.click();
		Thread.sleep(2000);
		clickDrpDownAndSelValue(txt_worktype, "Repair");
		Thread.sleep(4000);

		selectFromDate();
		selectToDateNext5days();

		if (icon_deleteAccount.size() > 0) {
			javascriptClick(icon_deleteAccount.get(0));
		}
		javascriptClick(ipt_AccountName);
		clickDrpDownAndSelValue(ipt_AccountName, "Walkers Snack Foods Ltd");
		expWaitToBeClickable(btn_New);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btn_New);
		btn_save.click();

		Thread.sleep(4000);
		if (toast_message.size() > 0) {
			javascriptClick(toast_message.get(0));
		}
		Thread.sleep(4000);
	}

	public void selectFromDate() throws InterruptedException {

		Thread.sleep(2000);
		scrollIntoView(ipt_fromDate);
		moveToEle(ipt_fromDate);
		Thread.sleep(4000);
		expWaitToBeClickable(ipt_fromDate);
		ipt_fromDate.click();
		Thread.sleep(2000);

		expWaitToBeClickable(ipt_dateValueFromIsToday);
		javascriptClick(ipt_dateValueFromIsToday);
		Thread.sleep(2000);
	}

	public void selectToDateNext5days() throws InterruptedException {
		Thread.sleep(2000);
		scrollIntoView(ipt_endDate);
		expWaitToBeClickable(ipt_endDate);
		javascriptClick(ipt_endDate);
		Thread.sleep(2000);
		// Calculate the date 5 days from now
		LocalDate targetDate = LocalDate.now().plusDays(5);
		String formattedDate = targetDate.format(DateTimeFormatter.ofPattern("d"));
		// Find and click the target date
		WebElement dateElement;// Locate the date element with single digit
								// (e.g., '1' instead of '01')
		if (formattedDate.length() == 1) {
			dateElement = driver.findElement(
					By.xpath("((//label[text()='Date']/..//input)[@name='End_Date']//parent::div//td//span[text()='"
							+ formattedDate + "'])[last()]"));
		} else {
			dateElement = driver.findElement(
					By.xpath("((//label[text()='Date']/..//input)[@name='End_Date']//parent::div//td//span[text()='"
							+ formattedDate + "'])[last()]"));
		}
		expWaitToBeClickable(dateElement);
		javascriptClick(dateElement);
		Thread.sleep(3000);
	}

	// Locate the date element with single digit (e.g., '
	public void CreateNewWorkStep(String title, String workplan) throws Exception {
		Thread.sleep(4000);
		expWaitToBeClickable(btn_New);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btn_New);
		Thread.sleep(5000);
		btn_next.click();
		Thread.sleep(2000);
		ipt_worksteptitle.sendKeys(title);
		Thread.sleep(2000);
		ipt_workstepworkplan.sendKeys(workplan);
		Thread.sleep(2000);
		result_workstepworkplan.click();
		Thread.sleep(4000);
		btn_workstepsave.click();
		Thread.sleep(4000);
		if (toast_message.size() > 0) {
			toast_message.get(0).click();
		}
	}

	public void VerifyCustomerFacingCheckboxOnWorkStep() throws Exception {
		Thread.sleep(4000);
		chckbox_customerfacing.isDisplayed();
	}

	public void CreateServiceAppointments() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(btn_createserviceappointments);
		btn_createserviceappointments.click();
		Thread.sleep(6000);
		btn_Next.click();
		Thread.sleep(6000);
		radiobtn_WorkOrder.click();
		Thread.sleep(6000);
		btn_Next.click();
		Thread.sleep(2000);
		waitForElementToAppear(By.xpath("//*[text()='Would You Like To Use This Address?']"), 30);
		txt_address_msg.click();
		radiobtn_address_yes.click();
		Thread.sleep(2000);
		scrollIntoView(radiobtn_date_yes);
		drawHighlight(radiobtn_date_yes);
		javascriptClick(radiobtn_date_yes);
		Thread.sleep(2000);
		btn_Next.click();
		Thread.sleep(6000);
	}

}
