package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;
import junit.framework.Assert;

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
	
	@FindBy(xpath = "//span[@title='Assessment']")
	WebElement casesubtypeAssessment;
	
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
	
	@FindBy(xpath = "//input[@placeholder = 'Search Orders...']")
	WebElement ipt_salesorder;
	
	@FindBy(xpath = "//button[text()='Save']")
	WebElement casesavebtn;
	
	@FindBy(xpath = "//a[@title='Cases']")
	WebElement clk_cases;
	
	@FindBy(xpath = "//a[@title='Assets']")
	WebElement clk_assets;

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
	
	By detailstab = By.xpath("//a[text()='Details']");

	@FindBy(xpath = "//*[@field-label='Type']//button[@aria-label='Type']")
	WebElement ipt_type;

	@FindBy(xpath = "//a[@title='Accounts']")
	WebElement accountstab;
	
	@FindBy(xpath = "//a[@title='Cases']")
	WebElement casestab;

	@FindBy(xpath = "//a[@title='Contacts']")
	public WebElement clk_contacts;
	
	@FindBy(xpath = "//a[@title='Field Service']")
	public WebElement clk_fieldservicetab;
	
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
	
	@FindBy(xpath="//a[text()='Log Out']")
	WebElement logoutlink;
	
	@FindBy(xpath="//*[text()='Shipping Address']/..//input[@placeholder='Search Address']")
	WebElement ipt_ShippingAddress;
	
	@FindBy(xpath="//span[@title='Brooklyn, NY, USA']")
	WebElement clk_ShippingAddress;
	
	@FindBy(xpath="(//span[text() = 'TLI Number']//ancestor::dt//following-sibling::dd//a)[last()]")
	WebElement txt_TLINumberValue;
	
	@FindBy(xpath="//div[text()= 'Add Work Order Lines']")
	WebElement lnk_newWorkOrderLines;
	
	@FindBy(xpath="((//table)[last()]//td//lightning-primitive-cell-checkbox)[1]")
	WebElement chk_selectLineItem;
	
	@FindBy(xpath="//button[text() = 'Add Work Order Lines']")
	WebElement btn_AddWorkOrderLines;
	
	@FindBy(xpath="//span[text() = 'Work Order Line Items']")
	WebElement lnk_workOrderLineItemsQuickLink;
	
	@FindBy(xpath="((//table)[last()]//a[contains(@title, '00')])[last()]")
	WebElement lnk_selectCreatedWorkLineItems;

	@FindBy(xpath = "//button[text()='Gantt']")
	WebElement ganttbtn;
	
	@FindBy(xpath = "//div[text()='New Customer']")
	WebElement btn_newcustomer;
	
	@FindBy(xpath="//button[@aria-label='Product Family']")
	WebElement clkproductfamily;
	
	@FindBy(xpath="//span[text()='PROC']")
	WebElement clkprocoption;
	
	By wait_conatacts = By.xpath("//a[@title='Contacts']");
	By wait_ganttbtn = By.xpath("//button[text()='Gantt']");
	
	@FindBy(xpath = "//span[text()='Request Type']")
	WebElement label_requesttype;
	
	@FindBy(xpath = "//span[text()='Group Type']")
	WebElement label_grouptype;
	
	@FindBy(xpath = "//span[text()='Quote']")
	WebElement label_quote;
	
	@FindBy(xpath = "//span[text()='Sales']")
	WebElement label_sales;
	
	@FindBy(xpath = "//span[text()='Full Partner']")
	WebElement label_fullpartner;
	
	@FindBy(xpath = "//span[text()='Bill To/Payer']")
	WebElement label_billtopayer;
	
	@FindBy(xpath = "//span[text()='Ship To/End User']")
	WebElement label_shiptoenduser;
	
	@FindBy(xpath = "//span[text()='Full Legal Name']")
	WebElement label_fulllegalname;
	
	@FindBy(xpath = "//span[text()='PO Box']")
	WebElement label_pobox;
	
	@FindBy(xpath = "//label[text()='Phone']")
	WebElement label_phone;
	
	@FindBy(xpath = "//label[text()='Search Address...']")
	WebElement label_searchaddress;
	
	@FindBy(xpath = "//label[text()='Email']")
	WebElement label_email;
	
	@FindBy(xpath = "//label[text()='Country']")
	WebElement label_country;
	
	@FindBy(xpath = "//span[text()='Tax Number']")
	WebElement label_taxnumber;
	
	@FindBy(xpath = "//label[text()='Street']")
	WebElement label_street;
	
	@FindBy(xpath = "//input[@name='Full_Legal_Name']")
	WebElement ipt_fulllegalname;
	
	@FindBy(xpath = "//input[@name='PO Box']")
	WebElement ipt_pobox;
	
	@FindBy(xpath = "//label[text()='Phone']/../..//input")
	WebElement ipt_phone;
	
	@FindBy(xpath = "//button[text()='Save']")
	WebElement btn_savenewrequest;
	
	@FindBy(xpath = "//button[text()='Finish']")
	WebElement btn_finish;
	
	@FindBy(xpath = "//span[text()='The new account has been created/updated.']")
	WebElement message_success;

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
	
	public void clickAssetsTab() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		waitForElementToAppear(By.xpath("//a[@title='Assets']"), 30);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", clk_assets);
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
		
	public void createNewCustomerAccount(String accountname, String phone, String email, String industryname)
			throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(4000);
		waitForElementToAppear(By.xpath("//a//div[text()='New']"), 30);
		newaccountbtn.click();
		nextbtn.click();
		accountnametxtbox.click();
		accountnametxtbox.sendKeys(accountname);
	//	txtbox_accountsite.click();
	//	txtbox_accountsite.sendKeys(accountsite);
		txtbox_phone.click();
		txtbox_phone.sendKeys(phone);
	//	txtbox_fax.click();
	//	txtbox_fax.sendKeys(fax);
		txtbox_email.click();
		txtbox_email.sendKeys(email);
	//	txtbox_website.click();
	//	txtbox_website.sendKeys(website);
	//	tradenametxtbox.click();
//		tradenametxtbox.sendKeys(tradename);
		Thread.sleep(2000);
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

	public void CreateNewCustomerAccountRequest() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(4000);
		waitForElementToAppear(By.xpath("//a//div[text()='New Customer']"), 30);
		btn_newcustomer.click();
		waitForElementToAppear(By.xpath("//span[text()='Request Type']"), 30);
		label_requesttype.isDisplayed();
		label_grouptype.isDisplayed();
		label_quote.isDisplayed();
		label_sales.isDisplayed();
		label_fullpartner.isDisplayed();
		label_billtopayer.isDisplayed();
		label_shiptoenduser.isDisplayed();
		label_fulllegalname.isDisplayed();
		label_pobox.isDisplayed();
		label_phone.isDisplayed();
		label_searchaddress.isDisplayed();
		label_email.isDisplayed();
		label_country.isDisplayed();
		label_taxnumber.isDisplayed();
		label_street.isDisplayed();
		Thread.sleep(2000);
		label_quote.click();
		Thread.sleep(2000);
		label_fullpartner.click();
		Thread.sleep(2000);
		ipt_fulllegalname.sendKeys("Test Full Legal Name");
		Thread.sleep(2000);
		ipt_phone.sendKeys("1235554444");
		Thread.sleep(2000);
		btn_savenewrequest.click();
		Thread.sleep(4000);
		message_success.isDisplayed();
		btn_finish.click();
		waitForElementToAppear(detailstab, 20);
	}
	
	// click on the Contacts tab
	public void ClickContactsTab() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(0, 4000);
		waitForElementToAppear(wait_conatacts, 30);
		expWaitToBeClickable(clk_contacts);
		javascriptClick(clk_contacts);
		Thread.sleep(0, 3000);
	}	
	
	// click on the Field Service tab
		public void ClickFieldServiceTab() throws InterruptedException {
			Thread.sleep(4000);
			expWaitToBeClickable(clk_fieldservicetab);
			javascriptClick(clk_fieldservicetab);
			Thread.sleep(6000);
			//WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='GanttReactMapIframe']"));
			WebElement frame1 = driver.findElement(By.xpath("//iframe[@title='Field Service']"));
			driver.switchTo().frame(frame1);
			expWaitToBeClickable(ganttbtn);
		//	driver.switchTo().defaultContent();
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
		ipt_lastname.sendKeys(ConcatCurrentDateTime(LastName));
		js.executeScript(
				"var result = document.evaluate(\"//input[@name='lastName']\", document.body, null, XPathResult.ANY_TYPE, null);     var input = result.iterateNext();input.scrollIntoView();");
		ipt_accountname.click();
		ipt_accountname.sendKeys(AccountName);
		Thread.sleep(3000);
		select_accountname.click();
		ipt_contacttitle.sendKeys(title);
		ipt_contactemail.sendKeys(Email);
		Thread.sleep(2000);
		ipt_contactphone.sendKeys(Phone);
		Thread.sleep(2000);
		ipt_contactotherphone.sendKeys(otherphone);
		ipt_contactdepartment.sendKeys(dept);
		contactsavebtn.click();
		Thread.sleep(4000);
		//contactsavebtn.click();
		Thread.sleep(2000);
		// waitForElementToDisAppear(Wait_toastMessage, 30);
	}

	public void createNewCaseWithRequiredData(String caseContact, String CaseType,String SalesOrder) throws Exception {
		js = (JavascriptExecutor) driver;
		waitForElementToAppear(By.xpath("//a//div[text()='New']"), 30);
		expWaitToBeClickable(newcasebtn);
		newcasebtn.click();
		contactnametxtbox.click();
		clickDrpDownAndSelValue(contactnametxtbox, caseContact);	
		scrollIntoView(ipt_salesorder);
		javascriptClick(ipt_salesorder);
		clickDrpDownAndSelValue(ipt_salesorder, SalesOrder);
		// scroll to Type field
		js.executeScript(
				"var result = document.evaluate(\"//label[text()='Sales Order']\", document.body, null, XPathResult.ANY_TYPE, null);var input = result.iterateNext();input.scrollIntoView();");
		expWaitToBeClickable(casetype);
		scrollIntoView(casetype);
		javascriptClick(casetype);
		Thread.sleep(2000);
		scrollIntoView(driver.findElement(By.xpath("//span[@title='"+CaseType+"']")));
		javascriptClick(driver.findElement(By.xpath("//span[@title='"+CaseType+"']")));
		Thread.sleep(1000);
		expWaitToBeClickable(casesubtypeAssessment);
		javascriptClick(casesubtypeAssessment);
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
		casesubject.sendKeys("Test Automation");
		expWaitToBeClickable(casedescription);
		casedescription.click();
		casesavebtn.click();
		waitForElementToAppear(By.xpath("//a[text()='Details']"), 30);
		Thread.sleep(0, 4000);
	}
	
	public void verifyTLINumberInCase() throws Exception
	{
		Thread.sleep(0, 4000);
		expWaitToBeClickable(txt_TLINumberValue);
		drawHighlight(txt_TLINumberValue);
		Assert.assertTrue(txt_TLINumberValue.isDisplayed());
	}

	public void AddNewWorkOrderLineItem() throws Exception {
		Thread.sleep(0, 4000);
		expWaitToBeClickable(lnk_newWorkOrderLines);
		lnk_newWorkOrderLines.click();
		Thread.sleep(0, 4000);
		expWaitToBeClickable(chk_selectLineItem);
		drawHighlight(chk_selectLineItem);
		chk_selectLineItem.click();
		Thread.sleep(2000);
		btn_AddWorkOrderLines.click();
		Thread.sleep(4000);
		drawHighlight(lnk_workOrderLineItemsQuickLink);
		mouseHover(lnk_workOrderLineItemsQuickLink);
		Thread.sleep(4000);
		moveToEle(lnk_workOrderLineItemsQuickLink);
		expWaitToBeClickable(lnk_selectCreatedWorkLineItems);
		lnk_selectCreatedWorkLineItems.click();
		Thread.sleep(0, 4000);
	}
	
	public void createNewCase(String contname, String firstname, String sub) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		waitForElementToAppear(By.xpath("//a//div[text()='New']"), 30);
		expWaitToBeClickable(newcasebtn);
		newcasebtn.click();
		contactnametxtbox.click();
		contactnametxtbox.sendKeys(contname);
		driver.findElement(By.xpath("//ul//li//*[text()='" + firstname + "']")).click();
		Thread.sleep(1000);
		clkproductfamily.click();
		clkprocoption.click();
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
	
	public void Logout() throws InterruptedException{
		js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("var result = document.evaluate(\"//span[text()='View profile']/..//span[@class='uiImage']\", document.body, null, XPathResult.ANY_TYPE, null);     var input = result.iterateNext();input.scrollIntoView(); input.click();");
		Thread.sleep(2000);
		javascriptClick(logoutlink);
		Thread.sleep(4000);
	}
	
	
}
