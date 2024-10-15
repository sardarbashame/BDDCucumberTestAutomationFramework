package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class AccountDetailsTab extends CommonFunctions {

	String actualcontactemail;
	String actualtradename;
	String actualindustry;
	By waitforelementtodisappear;
	String actualaccountname;
	String actualparentaccount;
	String actualtype;
	String actualdescription;
	String actualaccountcurrency;
	String actualphone;
	boolean tradenamepresent;
	boolean activepresent;
	boolean customerportalaccountpresent;
	boolean websitepresent;
	boolean languagepresent;
	boolean operatinghourspresent;
	boolean employeespresent;
	boolean regionalsettingspresent;
	boolean superregionpresent;
	boolean saleschannelpresent;

	
	public AccountDetailsTab() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	@FindBy(xpath = "//ul//li//a[text()='Details']")
	public WebElement clk_details;

	@FindBy(xpath = "//span[text()='Trade Name']")
	public WebElement txt_tradeName;

	@FindBy(xpath = "(//span[text()='Active'])[1]")
	public WebElement txt_active;

	@FindBy(xpath = "(//span[text()='Customer Portal Account'])[1]")
	public WebElement txt_customerPortalAcc;

	@FindBy(xpath = "//span[text()='Website']")
	public WebElement txt_website;

	@FindBy(xpath = "(//span[text()='Language'])")
	public WebElement txt_language;

	@FindBy(xpath = "//span[text()='Operating Hours']")
	public WebElement txt_operatingHrs;

	@FindBy(xpath = "//span[text()='Employees']")
	public WebElement txt_employess;

	@FindBy(xpath = "(//span[text()='Regional Settings'])[2]")
	public WebElement txt_regionalSettings;

	@FindBy(xpath = "//span[text()='Super Region']")
	public WebElement txt_superRegion;

	@FindBy(xpath = "//span[text()='Sales Channel']")
	public WebElement txt_salesChannel;

	@FindBy(xpath = "//span[text()='Trade Name']/../../..//lightning-formatted-text")
	public WebElement get_tradeName;

	@FindBy(xpath = "//span[text()='Industry']/../../..//lightning-formatted-text")
	public WebElement get_industry;

	@FindBy(xpath = "//span[text()='Account Name']/../../..//lightning-formatted-text")
	public WebElement get_accountName;

	@FindBy(xpath = "(//span[text()='Parent Account']/../../..//a//slot)[2]")
	public WebElement get_parentAcc;

	@FindBy(xpath = "//span[text()='Type']/../../..//lightning-formatted-text")
	public WebElement get_type;

	@FindBy(xpath = "//span[text()='Description']/../../..//lightning-formatted-text")
	public WebElement get_description;

	@FindBy(xpath = "//span[text()='Account Currency']/../../..//lightning-formatted-text")
	public WebElement get_accountCurrency;

	@FindBy(xpath = "//span[text()='Phone']/../../..//lightning-formatted-text")
	public WebElement get_phone;

	@FindBy(xpath = "//span[text()='Email']/../../..//emailui-formatted-email-wrapper//a")
	public WebElement get_email;

    By Wait_toastMessage = By.xpath("//span[contains(@class,'toastMessage')]//a//div");

    
	public void clickcontactdetailsTab() throws InterruptedException {
		Thread.sleep(0, 2000);
		waitForElementToDisAppear(Wait_toastMessage,30);
		Thread.sleep(0, 2000);
		clk_details.click();
		Thread.sleep(1000);
	}

	public boolean isTradeNamePresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		tradenamepresent = txt_tradeName.isDisplayed();
		Thread.sleep(1000);
		return tradenamepresent;
	}

	public boolean isActivePresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		activepresent = txt_active.isDisplayed();
		Thread.sleep(1000);
		return activepresent;
	}

	public boolean isCustomerPortalAccountPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		customerportalaccountpresent = txt_customerPortalAcc.isDisplayed();
		Thread.sleep(1000);
		return customerportalaccountpresent;
	}

	public boolean isWebsitePresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		websitepresent = txt_website.isDisplayed();
		Thread.sleep(1000);
		return websitepresent;
	}

	public boolean islanguagePresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		languagepresent = txt_language.isDisplayed();
		Thread.sleep(1000);
		return languagepresent;
	}

	public boolean isOperatingHoursPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		operatinghourspresent = txt_operatingHrs.isDisplayed();
		Thread.sleep(1000);
		return operatinghourspresent;
	}

	public boolean isEmployeesPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		employeespresent = txt_employess.isDisplayed();
		Thread.sleep(1000);
		return employeespresent;
	}

	public boolean isRegionalSettingsPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		regionalsettingspresent = txt_regionalSettings.isDisplayed();
		Thread.sleep(1000);
		return regionalsettingspresent;
	}

	public boolean isSuperRegionPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		superregionpresent = txt_superRegion.isDisplayed();
		Thread.sleep(1000);
		return superregionpresent;
	}

	public boolean isSalesChannelPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		saleschannelpresent = txt_salesChannel.isDisplayed();
		Thread.sleep(1000);
		return saleschannelpresent;
	}

	public String getTradeName() throws InterruptedException {
		Thread.sleep(0, 1000);
		actualtradename = get_tradeName.getText();
		Thread.sleep(1000);
		return actualtradename;
	}

	public String getIndustry() throws InterruptedException {
		Thread.sleep(0, 1000);
		actualindustry = get_industry.getText();
		Thread.sleep(1000);
		return actualindustry;
	}

	public String getAccountName() throws InterruptedException {
		Thread.sleep(0, 1000);
		actualaccountname = get_accountName.getText();
		Thread.sleep(1000);
		return actualaccountname;
	}

	public String getParentAccount() throws InterruptedException {
		Thread.sleep(0, 1000);
		actualparentaccount = get_parentAcc.getText();
		Thread.sleep(1000);
		return actualparentaccount;
	}

	public String getType() throws InterruptedException {
		Thread.sleep(0, 1000);
		actualtype = get_type.getText();
		Thread.sleep(1000);
		return actualtype;
	}

	public String getDescription() throws InterruptedException {
		Thread.sleep(0, 1000);
		actualdescription = get_description.getText();
		Thread.sleep(1000);
		return actualdescription;
	}

	public String getAccountCurrency() throws InterruptedException {
		Thread.sleep(0, 1000);
		actualaccountcurrency = get_accountCurrency.getText();
		Thread.sleep(1000);
		return actualaccountcurrency;
	}

	public String getPhone() throws InterruptedException {
		Thread.sleep(0, 1000);
		actualphone = get_phone.getText();
		Thread.sleep(1000);
		return actualphone;
	}

	public String getactualcontactemail() throws InterruptedException {
		Thread.sleep(0, 1000);
		actualcontactemail = get_email.getText();
		Thread.sleep(1000);
		return actualcontactemail;
	}
}
