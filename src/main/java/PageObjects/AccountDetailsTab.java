package PageObjects;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import commonutilities.CommonFunctions;
import org.testng.Assert;

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
	JavascriptExecutor js = (JavascriptExecutor) driver;
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
	
	@FindBy(xpath = "//span[text()='Language']/../../..//lightning-formatted-text")
	public WebElement get_language;
	
	@FindBy(xpath = "(//lightning-formatted-url//a)")
	public WebElement get_website;

	@FindBy(xpath = "(//a//div[text()='New'])[last()]")
	WebElement newaccountbtn;

	@FindBy(xpath = "//button//span[text()='Next']")
	WebElement nextbtn;

	@FindBy(xpath = "//*[text()='Account Name']/..//input")
	WebElement accountnametxtbox;

	@FindBy(xpath = "//*[text()='Trade Name']/..//input")
	WebElement tradenametxtbox;

	@FindBy(xpath = "(//button[text()='Save'])[last()]")
	WebElement accountsavebtn;

	@FindBy(xpath = "//div[@role = 'dialog']//span[text() = 'Customer']")
	WebElement chk_customerAccount;

	@FindBy(xpath = "//div[@role = 'dialog']//span[text() = 'Supplier']")
	WebElement chk_supplierAccount;

	@FindBy(xpath = "//div[contains(@class, 'active ')]//label[text() = 'Type']//parent::div//descendant::div[@class = 'slds-combobox_container']//button")
	WebElement clk_drpdownAccType;

	@FindBy(xpath = "//div[contains(@class, 'active ')]//label[text() = 'Type']//parent::div//descendant::lightning-base-combobox-item//span[not(contains(@title,'--None--')) and @class = 'slds-truncate']")
	List<WebElement> lst_accTypes;

	@FindBy(xpath = "//div[contains(@class, 'active ')]//span[text() = 'Type']//ancestor::dt//following-sibling::dd//lightning-formatted-text")
	WebElement txt_accTypeName;

	@FindBy(xpath = "//div[contains(@class, 'active ')]//span[text() = 'Type']//ancestor::dt//following-sibling::dd//button")
	WebElement chk_editAccType;

	@FindBy(xpath = "//div[contains(@class, 'active ')]//*[text() = 'Type']//parent::div//lightning-base-combobox//button")
	WebElement sel_dropdownAccType;

	@FindBy(xpath = "//div[contains(@class, 'active ')]//label[text() = 'Type']//parent::div//descendant::lightning-base-combobox-item//span[not(contains(@title,'--None--')) and @class = 'slds-truncate']")
	List<WebElement> sel_dropdownAccTypeCnt;
	
	@FindBy(xpath = "//div[contains(@class, 'active ')]//label[text() = 'Preference Type']//parent::div//descendant::lightning-base-combobox-item//span[not(contains(@title,'--None--')) and @class = 'slds-truncate']")
	List<WebElement> sel_dropdownPreferenceTypeCnt;

	@FindBy(xpath = "//div[contains(@class, 'active ')]//span[text() = 'Log a Call']//parent::button")
	WebElement clk_logACall;

	@FindBy(xpath = "//div[contains(@class, 'active ')]//span[text() = 'New Task']//parent::button")
	WebElement clk_newTask;

	@FindBy(xpath = "//div[contains(@class, 'active ')]//span[text() = 'New Event']//parent::button")
	WebElement clk_newEvent;

	@FindBy(xpath = "//textarea[@role = 'textbox']")
	WebElement ipt_commentsTextBox;

	@FindBy(xpath = "//label[text() = 'Subject']//following-sibling::div//input")
	WebElement ipt_subjectTask;

	@FindBy(xpath = "//label[text() = 'Subject']//following-sibling::div//span[@title= 'Call']")
	WebElement opt_subjectCall;

	@FindBy(xpath = "//span[text() = 'Save']//parent::button//ancestor::div[contains(@class, 'slds-grid bottomBar')]//button")
	WebElement btn_saveTask;

	@FindBy(xpath = "//slot[contains(text(), 'Resource Preferences')]//parent::span")
	WebElement lnk_resourceRefernece;
	
	@FindBy(xpath = "//label[text() = 'Service Resource']//following-sibling::div//input")
	WebElement ipt_serviceResource;
	
	@FindBy(xpath = "//div[contains(@class, 'active ')]//label[text() = 'Preference Type']//following-sibling::div//button")
	WebElement clk_preferenceType;
	
	@FindBy(xpath = "//div[contains(@class, 'active ')]//label[text() = 'Preference Type']//parent::div//descendant::lightning-base-combobox-item//span[not(contains(@title,'--None--')) and @class = 'slds-truncate']")
	List<WebElement> lst_PreferenceTypes;
	
	@FindBy(xpath="(//a//div[text()='100 1st Street'])[2]")
	WebElement value_shippingaddress;
	String strvalue;
	
	@FindBy(xpath="//span[text()='Shipping Address']")
	WebElement label_shippingaddress;
	
	@FindBy(xpath="//button[contains(@class, 'toastClose')]")
	WebElement clk_closeToasterMsg;
	
	boolean boolvalue;

	public AccountDetailsTab() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	
	
	By Wait_toastMessage = By.xpath("//span[contains(@class,'toastMessage')]//a//div");
	By Wait_stageChange = By
			.xpath("//span[contains(@class, 'toastMessage slds-text-heading--small forceActionsText')]");

	public void clickcontactdetailsTab() throws InterruptedException {
		Thread.sleep(0, 2000);
		waitForElementToDisAppear(Wait_toastMessage, 30);
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


	public boolean isShippingAddressPresent() throws InterruptedException {
		Thread.sleep(1000);
		boolvalue = label_shippingaddress.isDisplayed();
		Thread.sleep(1000);
		return boolvalue;
	}
	

	public String getShippingAddress() throws InterruptedException {
		Thread.sleep(2000);
		strvalue = value_shippingaddress.getText();
		Thread.sleep(1000);
		return strvalue;
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
	
	public String getLanguage() throws InterruptedException {
		Thread.sleep(0, 1000);
		actualtradename = get_language.getText();
		Thread.sleep(1000);
		return actualtradename;
	}
	
	public String getWebbSite() throws InterruptedException {
		Thread.sleep(0, 1000);
		actualtradename = get_website.getText();
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

	public void createNewAccount(String accType, String accountname, String tradename, String industryname,
			String values) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(0, 4000);
		waitForElementToAppear(By.xpath("//a//div[text()='New']"), 30);
		newaccountbtn.click();

		if (accType.equals("Customer")) {
			chk_customerAccount.click();
		} else {
			chk_supplierAccount.click();
		}
		nextbtn.click();
		accountnametxtbox.click();
		accountnametxtbox.sendKeys(ConcatCurrentDateTime(accountname));
		tradenametxtbox.click();
		tradenametxtbox.sendKeys(ConcatCurrentDateTime(tradename));

		javascriptClick(clk_drpdownAccType);
		Thread.sleep(5000);
		int cnt = lst_accTypes.size();
		List<String> lst1 = new ArrayList<String>();
		List<String> lst2 = new ArrayList<String>();

		for (String str : values.split(",")) {
			str = str.trim();
			lst1.add(str);
		}

		for (int i = 0; i < cnt; i++) {
			lst2.add(lst_accTypes.get(i).getText());
		}

		boolean flag = lst1.equals(lst2);
		System.out.print(flag);
		Assert.assertTrue(flag);

		js.executeScript(
				"var result = document.evaluate(\"//label[text()='Language']\", document.body, null, XPathResult.ANY_TYPE, null);var input = result.iterateNext();input.scrollIntoView();");
		driver.findElement(By.xpath("//ul/li//span[text()='" + industryname + "']")).click();
		js.executeScript(
				"var result = document.evaluate(\"(//span[text()='Move to Chosen'])[1]\", document.body, null, XPathResult.ANY_TYPE, null);     var input = result.iterateNext();input.scrollIntoView(); input.click();");
		accountsavebtn.click();
        Thread.sleep(1000);
		drawHighlight(clk_closeToasterMsg);
		//elementToBePresent(Wait_toastMessage, 30);
		clk_closeToasterMsg.click();	
		
	}

	public void validateNewAccountCreatedInDetailsAndAccType(String accType, String accCnt)
			throws InterruptedException {
		Thread.sleep(5000);
		String str = txt_accTypeName.getText();
		Assert.assertEquals(accType, str);
		chk_editAccType.click();
		sel_dropdownAccType.click();
		int cnt = sel_dropdownAccTypeCnt.size();
		Assert.assertEquals(String.valueOf(cnt), accCnt.toString());
	}

	public String getBillingAddress() throws InterruptedException {
		Thread.sleep(0, 1000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,600)");
		Thread.sleep(1000);
		String billingaddress = driver.findElement(By.xpath("//span[text()='Billing Address']/../../..//a")).getText();
		Thread.sleep(1000);
		return billingaddress;
	}

	public void createdLogACall() throws InterruptedException {
		expWaitToBeClickable(clk_logACall);
		javascriptClick(clk_logACall);
		ipt_commentsTextBox.sendKeys("Test Comments for Test Automation Log Call");
		btn_saveTask.click();
		Thread.sleep(1000);
		drawHighlight(clk_closeToasterMsg);
		elementToBePresent(Wait_toastMessage, 30);
		clk_closeToasterMsg.click();
		Thread.sleep(1000);
	}

	public void createdNewTask() throws Exception {
		expWaitToBeClickable(clk_newTask);
		javascriptClick(clk_newTask);
		clickDrpDownAndSelValue(ipt_subjectTask, "Call");
		btn_saveTask.click();
		Thread.sleep(1000);
		drawHighlight(clk_closeToasterMsg);
		elementToBePresent(Wait_toastMessage, 30);
		clk_closeToasterMsg.click();
		Thread.sleep(2000);
	}

	public void createdNewEvent() throws Exception {
		expWaitToBeClickable(clk_newEvent);
		javascriptClick(clk_newEvent);
		clickDrpDownAndSelValue(ipt_subjectTask, "Call");
		ipt_commentsTextBox.sendKeys("Test Comments for Test Automation Event");
		btn_saveTask.click();
		Thread.sleep(1000);
		drawHighlight(clk_closeToasterMsg);
		elementToBePresent(Wait_toastMessage, 30);
		clk_closeToasterMsg.click();
		Thread.sleep(2000);
	}
	
	public void clickOnResourceReference(String serviceResource, String values, String prefCnt) throws Exception {
		expWaitToBeClickable(lnk_resourceRefernece);
		javascriptClick(lnk_resourceRefernece);
		expWaitToBeClickable(newaccountbtn);
		newaccountbtn.click();
		expWaitToBeClickable(ipt_serviceResource);
		clickDrpDownAndSelValue(ipt_serviceResource, serviceResource);
		javascriptClick(clk_preferenceType);
		int cnt2 = sel_dropdownPreferenceTypeCnt.size();
		Assert.assertEquals(String.valueOf(cnt2), prefCnt.toString());

		Thread.sleep(5000);
		int cnt = lst_PreferenceTypes.size();
		List<String> lst1 = new ArrayList<String>();
		List<String> lst2 = new ArrayList<String>();

		for (String str : values.split(",")) {
			str = str.trim();
			lst1.add(str);
		}

		for (int i = 0; i < cnt; i++) {
			lst2.add(lst_PreferenceTypes.get(i).getText());
		}

		boolean flag = lst1.equals(lst2);
		System.out.print(flag);
		Assert.assertTrue(flag);
		lst_PreferenceTypes.get(0).click();

		Thread.sleep(1000);
		accountsavebtn.click();
		elementToBePresent(Wait_stageChange, 30);
	}

}
