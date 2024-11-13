package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class HomePage extends CommonFunctions {

	By waitforelementtodisappear;
	By waitforelementtoappear;
	String actualmessage;
	
	WebElement webele;
	By Wait_toastMessage = By.xpath("//span[contains(@class,'toastMessage')]//a//div");
	JavascriptExecutor js;
	
	@FindBy(xpath = "//a//div[text()='New']")
	WebElement newaccountbtn;
	
	@FindBy(xpath = "//button//span[text()='Next']")
	WebElement nextbtn;
	
	@FindBy(xpath = "//*[text()='Account Name']/..//input")
	WebElement accountnametxtbox;
	
	@FindBy(xpath = "//*[text()='Trade Name']/..//input")
	WebElement tradenametxtbox;
	
	@FindBy(xpath = "//*[text()='Account Site']/..//input")
	WebElement txtbox_accountsite;
	
	@FindBy(xpath = "//*[text()='Phone']/..//input")
	WebElement txtbox_phone;
	
	@FindBy(xpath = "//*[text()='Fax']/..//input")
	WebElement txtbox_fax;
	
	@FindBy(xpath = "//*[text()='Email']/..//input")
	WebElement txtbox_email;
	
	@FindBy(xpath = "//*[text()='Website']/..//input")
	WebElement txtbox_website;
	
	@FindBy(xpath = "//button[text()='Save']")
	WebElement accountsavebtn;
	
	@FindBy(xpath = "//a[@title='Cases']")
	WebElement casetab;
	
	@FindBy(xpath = "//a[@title='Accounts']")
	WebElement accounttab;
	
	@FindBy(xpath = "//a[@title='Service Appointments']")
	WebElement serviceappointmentstab;
	
	@FindBy(xpath = "//a//div[text()='New']")
	WebElement newcasebtn;
	
	@FindBy(xpath = "//*[text()='Contact Name']/./..//input")
	WebElement contactnametxtbox;
	
	@FindBy(xpath = "//button[@aria-label='Type']")
	WebElement casetype;
	
	@FindBy(xpath = "//span[@title='Billing']")
	WebElement casetypebilling;
	
	@FindBy(xpath = "//span[@title='Billing Dispute']")
	WebElement casesubtypebillingdispute;
	
	@FindBy(xpath = "//button[@title='Move to Chosen']")
	WebElement movetochosenbtn;
	
	@FindBy(xpath = "(//button[@aria-label='Case Origin'])")
	WebElement caseorigin;
	
	@FindBy(xpath = "//span[@title='Email']")
	WebElement email;
	
	@FindBy(xpath = "//label[text()='Subject']/../..//input")
	WebElement casesubject;
	
	@FindBy(xpath = "//label[text()='Description']")
	WebElement casedescription;
	
	@FindBy(xpath = "//button[text()='Save']")
	WebElement casesavebtn;
	
	@FindBy(xpath = "//a[@title='Cases']")
	WebElement clk_cases;

	@FindBy(xpath = "//a//div[text()='New']")
	WebElement clk_casesNew;

	@FindBy(xpath = "//*[@field-label='Contact Name']//input")
	WebElement ipt_contactName;

	@FindBy(xpath = "//span[@title='Billing']")
	WebElement clk_billing;

	@FindBy(xpath = "//span[@title='Billing Dispute']")
	WebElement clk_billingDispute;

	@FindBy(xpath = "//button[@title='Move to Chosen']")
	WebElement clk_movenTOChosen;

	@FindBy(xpath = "(//button[@aria-label='Case Origin'])")
	WebElement clk_caseOrigin;

	@FindBy(xpath = "//span[@title='Email']")
	WebElement ipt_email;

	@FindBy(xpath = "//label[text()='Subject']/../..//input")
	WebElement clk_subjects;

	@FindBy(xpath = "//label[text()='Description']")
	WebElement clk_description;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement btn_save;

	@FindBy(xpath = "//a[text()='Details']")
	WebElement clk_details;

	@FindBy(xpath = "//*[@field-label='Type']//button[@aria-label='Type']")
	WebElement ipt_type;

	@FindBy(xpath = "//a[@title='Accounts']")
	WebElement accountstab;

	@FindBy(xpath = "//a[@title='Cases']")
	WebElement casestab;

	@FindBy(xpath = "//a[@title='Contacts']")
	public WebElement clk_contacts;
	
	@FindBy(xpath = "//a//div[text()='New']")
	WebElement newcontactbtn;

	@FindBy(xpath = "//*[text()='Name']/..//button")
	WebElement ipt_name;

	@FindBy(xpath = "//span[text()='Dr.']")
	WebElement option_dr;

	@FindBy(xpath = "//input[@name='firstName']")
	WebElement ipt_firstname;

	@FindBy(xpath = "//input[@name='middleName']")
	WebElement ipt_middlename;

	@FindBy(xpath = "//input[@name='lastName']")
	WebElement ipt_lastname;

	@FindBy(xpath = "//label[text()='Account Name']/..//input")
	WebElement ipt_accountname;

	@FindBy(xpath = "(//*[@title='Test Customer Account10'])[last()]")
	WebElement select_accountname;
	
	@FindBy(xpath = "//label[text()='Email']/..//input")
	WebElement ipt_contactemail;

	@FindBy(xpath = "//label[text()='Title']/..//input")
	WebElement ipt_contacttitle;

	@FindBy(xpath = "//label[text()='Phone']/..//input")
	WebElement ipt_contactphone;
	
	@FindBy(xpath = "//label[text()='Department']/..//input")
	WebElement ipt_contactdepartment;
	
	@FindBy(xpath = "//label[text()='Other Phone']/..//input")
	WebElement ipt_contactotherphone;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement contactsavebtn;

	By wait_conatacts = By.xpath("//a[@title='Contacts']");

	public HomePage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	public void clickCasesTab() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(0, 2000);
		waitForElementToAppear(By.xpath("//a[@title='Cases']"), 30);
		Thread.sleep(0, 3000);
		js.executeScript("arguments[0].click();", clk_cases);
		Thread.sleep(4000);
	}

	public void clickAccountsTab() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		waitForElementToAppear(By.xpath("//a[@title='Accounts']"), 30);
		js.executeScript("arguments[0].click();", accountstab);
	}

	public void clickServiceAppointmentsTab() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		waitForElementToAppear(By.xpath("//a[@title='Service Appointments']"), 30);
		js.executeScript("arguments[0].click();", serviceappointmentstab);
		Thread.sleep(4000);
	}
	
	@FindBy(xpath="//*[text()='Shipping Address']/..//input[@placeholder='Search Address']")
	WebElement ipt_ShippingAddress;
	
	@FindBy(xpath="//span[@title='Brooklyn, NY, USA']")
	WebElement clk_ShippingAddress;
	
	public void createNewCustomerAccount(String accountname, String accountsite, String phone, String fax, String email, String website, String industryname, String tradename)
			throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(4000);
		waitForElementToAppear(By.xpath("//a//div[text()='New']"), 30);
		newaccountbtn.click();
		nextbtn.click();
		accountnametxtbox.click();
		accountnametxtbox.sendKeys(accountname);
		txtbox_accountsite.click();
		txtbox_accountsite.sendKeys(accountsite);
		txtbox_phone.click();
		txtbox_phone.sendKeys(phone);
		txtbox_fax.click();
		txtbox_fax.sendKeys(fax);
		txtbox_email.click();
		txtbox_email.sendKeys(email);
		txtbox_website.click();
		txtbox_website.sendKeys(website);
		tradenametxtbox.click();
		tradenametxtbox.sendKeys(tradename);
		// scroll to Language field
		js.executeScript(
				"var result = document.evaluate(\"//label[text()='Language']\", document.body, null, XPathResult.ANY_TYPE, null);var input = result.iterateNext();input.scrollIntoView();");
		driver.findElement(By.xpath("//ul/li//span[text()='" + industryname + "']")).click();
		js.executeScript(
				"var result = document.evaluate(\"(//span[text()='Move to Chosen'])[1]\", document.body, null, XPathResult.ANY_TYPE, null);     var input = result.iterateNext();input.scrollIntoView(); input.click();");
		
		
	//	ipt_ShippingAddress.sendKeys("100 1st street NY, USA");
		Thread.sleep(3000);
	//	clk_ShippingAddress.click();
		Thread.sleep(3000);
		accountsavebtn.click();
		waitForElementToAppear(By.xpath("//a[text()='Details']"), 30);
	}

	// click on the Contacts tab
	public void ClickContactsTab() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(0, 4000);
		waitForElementToAppear(wait_conatacts, 30);
		expWaitToBeClickable(clk_contacts);
		js.executeScript("arguments[0].click();", clk_contacts);
		Thread.sleep(0, 3000);
	}	

	// create a new contact
	public void CreateNewContact(String FirstName, String MiddleName, String LastName, String AccountName, String Email,
			String Phone, String title, String otherphone, String dept) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(4000);
		newcontactbtn.click();
		ipt_name.click();
		option_dr.click();
		expWaitToBeClickable(ipt_firstname);
		ipt_firstname.click();
		ipt_firstname.sendKeys(FirstName);
		expWaitToBeClickable(ipt_middlename);
		ipt_middlename.click();
		ipt_middlename.sendKeys(MiddleName);
		expWaitToBeClickable(ipt_lastname);
		ipt_lastname.click();
		ipt_lastname.sendKeys(LastName);
		js.executeScript(
				"var result = document.evaluate(\"//input[@name='lastName']\", document.body, null, XPathResult.ANY_TYPE, null);     var input = result.iterateNext();input.scrollIntoView();");
		ipt_accountname.click();
		ipt_accountname.sendKeys(AccountName);
		Thread.sleep(3000);
		select_accountname.click();
		ipt_contacttitle.sendKeys(title);
		ipt_contactemail.sendKeys(Email);
		ipt_contactphone.sendKeys(Phone);
		ipt_contactotherphone.sendKeys(otherphone);
		ipt_contactdepartment.sendKeys(dept);
		contactsavebtn.click();
		Thread.sleep(4000);
		// waitForElementToDisAppear(Wait_toastMessage, 30);
	}

	public void createNewCase(String contname, String firstname, String sub) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		waitForElementToAppear(By.xpath("//a//div[text()='New']"), 30);
		expWaitToBeClickable(newcasebtn);
		newcasebtn.click();
		contactnametxtbox.click();
		contactnametxtbox.sendKeys(contname);
		driver.findElement(By.xpath("//ul//li//*[text()='" + firstname + "']")).click();
		// scroll to Type field
		js.executeScript(
				"var result = document.evaluate(\"//label[text()='Sales Order']\", document.body, null, XPathResult.ANY_TYPE, null);var input = result.iterateNext();input.scrollIntoView();");
		expWaitToBeClickable(casetype);
		casetype.click();
		Thread.sleep(1000);
		casetypebilling.click();
		Thread.sleep(1000);
		expWaitToBeClickable(casesubtypebillingdispute);
		javascriptClick(casesubtypebillingdispute);
		javascriptClick(movetochosenbtn);
		js.executeScript("arguments[0].click();", caseorigin);
		Thread.sleep(2000);
		expWaitToBeClickable(email);
		email.click();
		// scroll to Subject field
		js.executeScript(
				"var result = document.evaluate(\"//label[text()='Case Origin']\", document.body, null, XPathResult.ANY_TYPE, null);var input = result.iterateNext();input.scrollIntoView();");
		casesubject.click();
		Thread.sleep(0, 3000);
		casesubject.sendKeys(sub);
		expWaitToBeClickable(casedescription);
		casedescription.click();
		casesavebtn.click();
		waitForElementToAppear(By.xpath("//a[text()='Details']"), 30);
		Thread.sleep(0, 4000);
	}

	@FindBy(xpath="//a[text()='Log Out']")
	WebElement logoutlink;
	public void Logout() throws InterruptedException{
		js = (JavascriptExecutor) driver;
		Thread.sleep(0, 4000);
		js.executeScript("var result = document.evaluate(\"//span[text()='View profile']/..//span[@class='uiImage']\", document.body, null, XPathResult.ANY_TYPE, null);     var input = result.iterateNext();input.scrollIntoView(); input.click();");
		Thread.sleep(0, 2000);
		javascriptClick(logoutlink);
		Thread.sleep(0, 4000);
	}
	
	
}
