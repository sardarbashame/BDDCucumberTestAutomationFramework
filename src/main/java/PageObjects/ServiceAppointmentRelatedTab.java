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
	
	
	@FindBy(xpath = "//label[text() = 'Parent Record']//following-sibling::div//input")
	WebElement ipt_preferredRecord;
	
	@FindBy(xpath = "//label[text() = 'Status']//following-sibling::div//button")
	WebElement btn_Status;
	
	@FindBy(xpath = "//label[text() = 'Date']//following-sibling::div//input[@name = 'EarliestStartTime']")
	WebElement ipt_esitmateDate;
	
	@FindBy(xpath = "//label[text() = 'Date']//following-sibling::div//input[@name = 'DueDate']")
	WebElement ipt_dueDate;
	
	@FindBy(xpath = "(//button[text() = 'Save'])[last()]")
	WebElement btn_saveSA;	
	
	@FindBy(xpath = "//button[text() = 'Today']")
	WebElement clk_today;
	
	@FindBy(xpath = "//label[text() = 'Service Territory']//parent::lightning-grouped-combobox//following::input[@placeholder = 'Search Service Territories...']")
	WebElement sel_serviceTerritory;
	
	@FindBy(xpath = "(//span[text() = 'Appointment Number']//ancestor::dt//following-sibling::dd//lightning-formatted-text)[last()]")
	WebElement txt_ServiceAppmentName;
	
	By waitspinerDisAppear = By.xpath("(//div[@class = 'forceDotsSpinner'])[last()]");

	public static String  ServiceAppmentName;
	
	public void AssignResource() throws Exception {
		expWaitToBeClickable(btn_new);
		btn_new.click();
		heading_newresource.click();
		txt_serviceresource.click();
		clickDrpDownAndSelValue(txt_serviceresourceinput, "Test Service Resource1");
		//expWaitToBeClickable(res_serviceresource);
		//res_serviceresource.click();
		expWaitToBeClickable(btn_save);
		btn_save.click();
		Thread.sleep(5000);
	}
	
	public void createNewServiceAppointment(String AccountID, String Status,String serviceTerritory) throws Exception {
		Thread.sleep(3000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		expWaitToBeClickable(btn_new);
		btn_new.click();
		expWaitToBeClickable(ipt_preferredRecord);
		clickDrpDownAndSelValue(ipt_preferredRecord, AccountID);
		sel_serviceTerritory.click();
		clickDrpDownAndSelValue(sel_serviceTerritory, serviceTerritory);
		expWaitToBeClickable(btn_Status);
		javascriptClick(btn_Status);
		Thread.sleep(2000);
		scrollIntoView(driver.findElement(By.xpath("(//records-lwc-detail-panel//span[text() = '"+Status+"'])[last()]//parent::span[@class = 'slds-media__body']")));
		javascriptClick(driver.findElement(By.xpath("(//records-lwc-detail-panel//span[text() = '"+Status+"'])[last()]//parent::span[@class = 'slds-media__body']")));
		scrollIntoView(ipt_esitmateDate);
		expWaitToBeClickable(ipt_esitmateDate);
		ipt_esitmateDate.click();
		expWaitToBeClickable(clk_today);
		clk_today.click();
		ipt_dueDate.click();
		executor.executeScript("document.body.style.zoom = '0.85'");
		//expWaitToBeClickable(clk_today);
		//mouseHover(clk_today);
		moveToEle(clk_today);
		expWaitToBeClickable(btn_saveSA);
		javascriptClick(btn_saveSA);
		waitForElementToDisAppear(waitspinerDisAppear, 30);
		Thread.sleep(4000);
		ServiceAppmentName = txt_ServiceAppmentName.getText();
	}
	

}
