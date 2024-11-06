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
	@FindBy(xpath="//a//div[text()='New']")
	WebElement newaccountbtn;
	@FindBy(xpath="//button//span[text()='Next']")
	WebElement nextbtn;
	@FindBy(xpath="//*[text()='Account Name']/..//input")
	WebElement accountnametxtbox;
	@FindBy(xpath="//*[text()='Trade Name']/..//input")
	WebElement tradenametxtbox;
	@FindBy(xpath="//button[text()='Save']")
	WebElement accountsavebtn;
	@FindBy(xpath="//a[@title='Cases']")
	WebElement casetab;
	@FindBy(xpath="//a[@title='Accounts']")
	WebElement accounttab;
	@FindBy(xpath="//a//div[text()='New']")
	WebElement newcasebtn;
	@FindBy(xpath="//*[text()='Contact Name']/./..//input")
	WebElement contactnametxtbox;
	@FindBy(xpath="//button[@aria-label='Type']")
	WebElement casetype;
	@FindBy(xpath="//span[@title='Billing']")
	WebElement casetypebilling;
	@FindBy(xpath="//span[@title='Billing Dispute']")
	WebElement casesubtypebillingdispute;
	@FindBy(xpath="//button[@title='Move to Chosen']")
	WebElement movetochosenbtn;
	@FindBy(xpath="(//button[@aria-label='Case Origin'])")
	WebElement caseorigin;
	@FindBy(xpath="//span[@title='Email']")
	WebElement email;
	@FindBy(xpath="//label[text()='Subject']/../..//input")
	WebElement casesubject;
	@FindBy(xpath="//label[text()='Description']")
	WebElement casedescription;
	@FindBy(xpath="//button[text()='Save']")
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
	
	By wait_conatacts = By.xpath("//a[@title='Contacts']");

	public HomePage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	public void clickCasesTab() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(0, 4000);
		waitForElementToAppear(By.xpath("//a[@title='Cases']"), 30);
		Thread.sleep(0, 3000);
		js.executeScript("arguments[0].click();", clk_cases);
		Thread.sleep(4000);
	}

	public void clickAccountsTab() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		waitForElementToAppear(By.xpath("//a[@title='Accounts']"),30);
		js.executeScript("arguments[0].click();", accountstab);
	}
	
	
	
	public void createNewCustomerAccount(String accountname, String industryname, String tradename)
			throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(4000);
		waitForElementToAppear(By.xpath("//a//div[text()='New']"), 30);
		newaccountbtn.click();
		nextbtn.click();
		accountnametxtbox.click();
		accountnametxtbox.sendKeys(accountname);
		tradenametxtbox.click();
		tradenametxtbox.sendKeys(tradename);
		// scroll to Language field
		js.executeScript(
				"var result = document.evaluate(\"//label[text()='Language']\", document.body, null, XPathResult.ANY_TYPE, null);var input = result.iterateNext();input.scrollIntoView();");
		driver.findElement(By.xpath("//ul/li//span[text()='" + industryname + "']")).click();
		js.executeScript(
				"var result = document.evaluate(\"(//span[text()='Move to Chosen'])[1]\", document.body, null, XPathResult.ANY_TYPE, null);     var input = result.iterateNext();input.scrollIntoView(); input.click();");
		accountsavebtn.click();
		waitForElementToAppear(By.xpath("//a[text()='Details']"), 30);
	}
	
	//click on the Contacts tab
	public void ClickContactsTab() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(0, 4000);
		waitForElementToAppear(wait_conatacts, 30);
		expWaitToBeClickable(clk_contacts);
		js.executeScript("arguments[0].click();", clk_contacts);
		Thread.sleep(0, 3000);
		}
	
	@FindBy(xpath="//a//div[text()='New']")
	WebElement newcontactbtn;
	
	@FindBy(xpath="//*[text()='Name']/..//button")
	WebElement ipt_name;
	
	@FindBy(xpath="//span[text()='Dr.']")
	WebElement option_dr;
	
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement ipt_firstname;
	
	@FindBy(xpath="//input[@name='middleName']")
	WebElement ipt_middlename;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement ipt_lastname;
		
	@FindBy(xpath="//label[text()='Account Name']/..//input")
	WebElement ipt_accountname;
	
	@FindBy(xpath="(//*[@title='Test Customer Account10'])[last()]")
	WebElement select_accountname;
	
	@FindBy(xpath="//label[text()='Email']/..//input")
	WebElement ipt_contactemail;
	
	@FindBy(xpath="//label[text()='Phone']/..//input")
	WebElement ipt_contactphone;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement contactsavebtn;
	
	//create a new contact
	public void CreateNewContact(String FirstName, String MiddleName, String LastName, String AccountName, String Email, String Phone) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(4000);
		newcontactbtn.click();
		ipt_name.click();
		option_dr.click();
		ipt_firstname.click();
		ipt_firstname.sendKeys(FirstName);
		ipt_middlename.click();
		ipt_middlename.sendKeys(MiddleName);
		ipt_lastname.click();
		ipt_lastname.sendKeys(LastName);
		js.executeScript("var result = document.evaluate(\"//input[@name='lastName']\", document.body, null, XPathResult.ANY_TYPE, null);     var input = result.iterateNext();input.scrollIntoView();");
		ipt_accountname.click();
		ipt_accountname.sendKeys(AccountName);
		Thread.sleep(3000);
		select_accountname.click();
		ipt_contactemail.sendKeys(Email);
		ipt_contactphone.sendKeys(Phone);
		contactsavebtn.click();
		Thread.sleep(4000);
	//	waitForElementToDisAppear(Wait_toastMessage, 30);
	}


	public void createNewCase(String contname, String firstname, String sub) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		waitForElementToAppear(By.xpath("//a//div[text()='New']"), 30);
		newcasebtn.click();
		contactnametxtbox.click();
		contactnametxtbox.sendKeys(contname);
		driver.findElement(By.xpath("//ul//li//*[text()='" + firstname + "']")).click();
		// scroll to Type field
		js.executeScript(
				"var result = document.evaluate(\"//label[text()='Sales Order']\", document.body, null, XPathResult.ANY_TYPE, null);var input = result.iterateNext();input.scrollIntoView();");
		casetype.click();
		casetypebilling.click();
		casesubtypebillingdispute.click();
		movetochosenbtn.click();
		js.executeScript("arguments[0].click();", caseorigin);
		email.click();
		// scroll to Subject field
		js.executeScript(
				"var result = document.evaluate(\"//label[text()='Case Origin']\", document.body, null, XPathResult.ANY_TYPE, null);var input = result.iterateNext();input.scrollIntoView();");
		casesubject.click();
		Thread.sleep(0, 3000);
		casesubject.sendKeys(sub);
		casedescription.click();
		casesavebtn.click();
		waitForElementToAppear(By.xpath("//a[text()='Details']"), 30);
		Thread.sleep(0, 4000);
	}

}
