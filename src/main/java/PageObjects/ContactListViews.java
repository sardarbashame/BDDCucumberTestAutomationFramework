package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class ContactListViews extends CommonFunctions {

	String actualcontactemail;
	String actualtradename;
	String actualindustry;
	boolean customercontaclsviewtpresent;

	@FindBy(xpath = "//ul//li//a[text()='Details']")
	public WebElement clk_details;

	@FindBy(xpath = "//button[@title='Select a List View: Contacts']")
	public WebElement btn_contactsListView;

	@FindBy(xpath = "//li//span[text()='Customer Contacts']")
	public WebElement txt_customerContacts;

	@FindBy(xpath = "//a//span[@title='Name']")
	public WebElement txt_name;

	@FindBy(xpath = "//a//span[@title='Title']")
	public WebElement txt_title;

	@FindBy(xpath = "//a//span[@title='Account Name']")
	public WebElement txt_accountName;

	@FindBy(xpath = "//a//span[@title='Phone']")
	public WebElement txt_phone;

	@FindBy(xpath = "//a//span[@title='Mobile']")
	public WebElement txt_mobile;

	@FindBy(xpath = "//a//span[@title='Preferred Phone']")
	public WebElement txt_preferredPhone;

	@FindBy(xpath = "//a//span[@title='Email']")
	public WebElement txt_email;

	@FindBy(xpath = "//a//span[@title='Mailing City']")
	public WebElement txt_mailingCity;

	@FindBy(xpath = "//a//span[@title='Shift']")
	public WebElement txt_shift;

	@FindBy(xpath = "//a//span[@title='Location']")
	public WebElement txt_location;

	@FindBy(xpath = "//li//span[text()='Heat and Control Billing Contacts']")
	public WebElement txt_heatAndCntrlBilling;

	@FindBy(xpath = "//li//span[text()='Heat and Control Sales Contacts']")
	public WebElement txt_heatAndCntrlSales;

	@FindBy(xpath = "//li//span[text()='Vendor Contacts']")
	public WebElement txt_vendorContacts;

	By wait_toastMessage = By.xpath("//span[contains(@class,'toastMessage')]//a//div");
	public By wait_customerContacts = By.xpath("//li//span[text()='Customer Contacts']");
	By wait_conatacts = By.xpath("//a[@title='Contacts']");

	public ContactListViews() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	public void clickcontactdetailsTab() throws InterruptedException {
		Thread.sleep(0, 2000);
		waitForElementToAppear(wait_toastMessage, 30);
		expWaitToBeClickable(clk_details);
		clk_details.click();
		Thread.sleep(1000);
	}

public void clickContactLisViewButton() throws InterruptedException {
		expWaitToBeClickable(btn_contactsListView);
		btn_contactsListView.click();
		Thread.sleep(4000);
	}

	public void clickCustomerContactsListView() throws InterruptedException {
		expWaitToBeClickable(txt_customerContacts);
		txt_customerContacts.click();
		Thread.sleep(4000);
	}
	
	public void clickHACBillingContactsListView() throws InterruptedException {
		expWaitToBeClickable(txt_heatAndCntrlBilling);
		txt_heatAndCntrlBilling.click();
		Thread.sleep(4000);
	}
	
	public void clickHACSalesContactsListView() throws InterruptedException {
		expWaitToBeClickable(txt_heatAndCntrlSales);
		txt_heatAndCntrlSales.click();
		Thread.sleep(4000);
	}
	
	public void clickVendorContactsListView() throws InterruptedException {
		expWaitToBeClickable(txt_vendorContacts);
		txt_vendorContacts.click();
		Thread.sleep(4000);
	}

}
