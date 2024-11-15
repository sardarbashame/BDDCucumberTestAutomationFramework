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

public class WorkOrder extends CommonFunctions {

	By waitforelementtodisappear;
	By waitforelementtoappear;
	String actualmessage;

	public WorkOrder() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	@FindBy(xpath = "(//div[@title='New'])[last()]")
	WebElement btn_New;
	
	@FindBy(xpath = "//span[text()='Work Type']/../..//input")
	WebElement txt_worktype;
	
	@FindBy(xpath = "//div[@title='Break Fix']//span")
	WebElement res_worktype;
	
	@FindBy(xpath = "(//button//span[text()='Save'])[last()]")
	WebElement btn_save;
	
	@FindBy(xpath = "(//span[text() = 'Account'])[last()]//parent::label//following-sibling::div//a//span[@class = 'deleteIcon']")
	List<WebElement> icon_deleteAccount;
	
	@FindBy(xpath = "(//span[text() = 'Account'])[last()]//parent::label//following-sibling::div//input")
	WebElement ipt_AccountName;
	
	@FindBy(xpath = "//label//span[text()='Title']/../..//input")
	WebElement ipt_WorkStepTitle;
	
	@FindBy(xpath = "//div//span[contains(@class, 'toastMessage')]//a")
	List<WebElement> toast_message;
	
	@FindBy(xpath = "//div[@title='Create Service Appoinments']")
	WebElement btn_createserviceappointments;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement btn_Next;
	
	@FindBy(xpath = "//span[text()='Next']")
	WebElement btn_workstepNext;
	
	@FindBy(xpath = "//span[text()='Work Order']/..")
	WebElement radiobtn_WorkOrder;
	
	@FindBy(xpath = "(//span[text()='Yes']/..)[1]")
	WebElement radiobtn_address_yes;
	
	@FindBy(xpath = "(//span[text()='Yes']/..)[2]")
	WebElement radiobtn_date_yes;
	
	@FindBy(xpath = "//*[text()='Would You Like To Use This Address?']")
	WebElement txt_address_msg;
	
	public void CreateWorkOrder() throws Exception {
		Thread.sleep(2000);
		expWaitToBeClickable(btn_New);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btn_New);
		Thread.sleep(5000);
		txt_worktype.click();
		Thread.sleep(2000);
		clickDrpDownAndSelValue(txt_worktype, "Break Fix");
		Thread.sleep(4000);
		Thread.sleep(4000);
		scrollIntoView(ipt_AccountName);
		if(icon_deleteAccount.size()>0)
		{
			icon_deleteAccount.get(0).click();
		}
		ipt_AccountName.click();
		clickDrpDownAndSelValue(ipt_AccountName, "United Batter and Breading");
		btn_save.click();
		Thread.sleep(4000);
		if (toast_message.size() > 0) {
			toast_message.get(0).click();
		}
		Thread.sleep(4000);
	}
	
	@FindBy(xpath="//label//span[text()='Work Plan']/../..//input")
	WebElement ipt_workplan;
	
	@FindBy(xpath="//div[@title='Test']")
	WebElement select_workplan;
	
	@FindBy(xpath="(//button//span[text()='Save'])[last()]")
	WebElement btn_workstepsave;
	
	public void CreateNewWorkStep() throws Exception {
		Thread.sleep(2000);
		expWaitToBeClickable(btn_New);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btn_New);
		Thread.sleep(3000);
		btn_workstepNext.click();
		Thread.sleep(2000);
		ipt_WorkStepTitle.sendKeys("TestWorkStepTitle");
		ipt_workplan.click();
		ipt_workplan.sendKeys("Test");
		Thread.sleep(2000);
		select_workplan.click();
		Thread.sleep(2000);
		btn_workstepsave.click();
		
//		txt_worktype.click();
//		Thread.sleep(2000);
//		clickDrpDownAndSelValue(txt_worktype, "Break Fix");
//		Thread.sleep(4000);
//		Thread.sleep(4000);
//		scrollIntoView(ipt_AccountName);
//		if(icon_deleteAccount.size()>0)
//		{
//			icon_deleteAccount.get(0).click();
//		}
//		ipt_AccountName.click();
//		clickDrpDownAndSelValue(ipt_AccountName, "United Batter and Breading");
//		btn_save.click();
//		Thread.sleep(4000);
//		if (toast_message.size() > 0) {
//			toast_message.get(0).click();
//		}
//		Thread.sleep(4000);
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
