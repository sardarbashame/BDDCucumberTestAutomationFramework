package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class CaseDetailsTab extends CommonFunctions {

	By waitforelementtodisappear;
	By waitforelementtoappear;
	String actualmessage;
	boolean boolvalue;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	@FindBy(xpath="//span[text()='Edit Status']/..")
	WebElement editcasestatusbtn;
	@FindBy(xpath="//button[@title='Edit Status']")
	WebElement editstatusclk;
	@FindBy(xpath="//button[@aria-label ='Status']")
	WebElement statusclk;
	@FindBy(xpath="//span[text()='Show more actions']/..")
	WebElement showmoreactions;
	@FindBy(xpath="//span[text()='Change Owner']")
	WebElement changeowner;
	@FindBy(xpath="//span[text()='Select New Owner']/../..//input")
	WebElement selectownertxtbox;
	@FindBy(xpath="//button[@title='Submit']")
	WebElement submitbtn;
	
	@FindBy(xpath = "//span[text()='Edit Status']/..")
	public WebElement clk_editStatus;
	
	@FindBy(xpath = "//button[@aria-label='Status']")
	public WebElement btn_status;
	
	@FindBy(xpath = "//span[@title='Escalated']")
	public WebElement clk_escalated;
	
	@FindBy(xpath = "//button[@name='SaveEdit']")
	public WebElement clk_SaveEdit;
	
	@FindBy(xpath = "//*[text()='This case has been closed for more than 14 days.  Please open a new case and link the two if desired']")
	public WebElement get_caseClosedMsg;
	
	@FindBy(xpath = "(//span[text()='Account Name'])[1]")
	public WebElement label_accountname;
	
	@FindBy(xpath = "//span[text()='Contact Name']")
	public WebElement label_contactname;
	
	@FindBy(xpath = "(//h2[text()='Related List Quick Links']/../..//slot[contains(text(), 'Work Orders')])")
	WebElement relatedlistlnk_workorders;
	
	@FindBy(xpath = "//span[text()='Show more actions']")
	WebElement quickactions_showmoreactions;
	@FindBy(xpath = "//span[text()='Close the Case']")
	WebElement btn_closecase;
	
	@FindBy(xpath = "//span[text()='Case Reason']/../..//a")
	WebElement clk_caseclosereason;
	
	@FindBy(xpath = "//a[text()='Competitor']")
	WebElement clk_casereason_competitor;
	
	@FindBy(xpath = "//a[text()='Existing Problem']")
	WebElement clk_casereason_existingproblem;
	@FindBy(xpath = "//a[text()='Field Service Required']")
	WebElement clk_casereason_fieldservicerequired;
	
	@FindBy(xpath = "//a[text()='General Request']")
	WebElement clk_casereason_generalrequest;
	
	@FindBy(xpath = "//a[text()='Materials or Documents Needed']")
	WebElement clk_casereason_materialsordocneeded;
	
	@FindBy(xpath = "//a[text()='New Problem']")
	WebElement clk_casereason_newproblem;
	
	@FindBy(xpath = "//a[text()='Scheduling Required']")
	WebElement clk_casereason_schedulingreqd;
	
	@FindBy(xpath = "//a[text()='Training Needed']")
	WebElement clk_casereason_trainingneeded;

	
	@FindBy(xpath = "//span[text()='Case Resolution']/../..//textarea")
	WebElement ipt_caseresolution;
	
	@FindBy(xpath = "(//span[text()='Save'])[last()]")
	WebElement btn_caseclosesave;


	public CaseDetailsTab() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}


	public void editCaseStatus() throws InterruptedException {
		editcasestatusbtn.click();
	}

	public void updateCaseStatus(String newcasestatus) throws InterruptedException {
		waitForElementToAppear(By.xpath("//ul/li/a[text()='Details']"), 30);
		clk_editStatus.click();
		Thread.sleep(2000);
		btn_status.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title='"+newcasestatus+"']")).click();
		Thread.sleep(2000);
		clk_SaveEdit.click();	
		}

	public void updateCaseStatusNew() throws InterruptedException {
		Thread.sleep(0, 2000);
		Thread.sleep(0, 2000);
		btn_status.click();
		Thread.sleep(2000);
		clk_escalated.click();
		Thread.sleep(2000);
	}


	public void transferCase(String newowner) throws InterruptedException {
		waitForElementToAppear(By.xpath("//ul/li/a[text()='Details']"),30);
		Thread.sleep(5000);
		showmoreactions.click();
		Thread.sleep(2000);
		changeowner.click();
		selectownertxtbox.click();
		selectownertxtbox.sendKeys(newowner);
		driver.findElement(By.xpath("//div[@title='"+newowner+"']")).click();
		submitbtn.click();
	}
	
	public void clickSaveButton() throws InterruptedException {
		Thread.sleep(0, 2000);
		Thread.sleep(0, 2000);
		clk_SaveEdit.click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}
	
	
	public boolean isAccountNamePresent() throws InterruptedException {
		boolvalue = label_accountname.isDisplayed();
		return boolvalue;
	}
	
	public boolean isContactNamePresent() throws InterruptedException {
		boolvalue = label_contactname.isDisplayed();
		return boolvalue;
	}

	public String getValidationMessage() throws InterruptedException {
		actualmessage = driver.findElement(By.xpath(
				"//*[text()='This case has been closed for more than 14 days.  Please open a new case and link the two if desired']"))
				.getText();
		Thread.sleep(0, 1000);
		actualmessage = get_caseClosedMsg.getText();
		Thread.sleep(1000);
		return actualmessage;
	}
	
	public void VerifyCaseRelatedListQuickLinks() throws InterruptedException {
		Thread.sleep(2000);
		relatedlistlnk_workorders.isDisplayed();
		Thread.sleep(1000);
	
	}
	
	public void ClickCloseCaseQuickAction() throws InterruptedException {
		expWaitToBeClickable(quickactions_showmoreactions);
		Thread.sleep(2000);
		js.executeScript("var result = document.evaluate(\"//span[text()='Show more actions']\", document.body, null, XPathResult.ANY_TYPE, null);     var input = result.iterateNext();input.scrollIntoView(); input.click();");
		Thread.sleep(2000);
		btn_closecase.click();
		Thread.sleep(2000);
	
	}

	public void CloseCaseWithReason() throws InterruptedException {
		clk_caseclosereason.click();
		clk_casereason_competitor.click();
		ipt_caseresolution.click();
		ipt_caseresolution.sendKeys("Test Resolution");
		btn_caseclosesave.click();
	}
	
	public void VerifyCaseCloseReasons() throws InterruptedException {
		clk_caseclosereason.click();
		clk_casereason_competitor.isDisplayed();
		clk_casereason_existingproblem.isDisplayed();
		clk_casereason_fieldservicerequired.isDisplayed();
		clk_casereason_generalrequest.isDisplayed();
		clk_casereason_materialsordocneeded.isDisplayed();
		clk_casereason_newproblem.isDisplayed();
		clk_casereason_schedulingreqd.isDisplayed();
		clk_casereason_trainingneeded.isDisplayed();
	}
	
	@FindBy(xpath="//button[@aria-label='Type']")
	WebElement casetype;
	@FindBy(xpath="//span[@title='Billing']")
	WebElement casetypebilling;
	@FindBy(xpath="//span[@title='Billing Dispute']")
	WebElement casesubtypebillingdispute;
	@FindBy(xpath="//span[@title='Credit Application']")
	WebElement casesubtypecreditapplication;
	@FindBy(xpath="//span[@title='Request for Backup Support']")
	WebElement casesubtyperequestforbackupsupport;
	@FindBy(xpath="//span[@title='Request for Invoice']")
	WebElement casesubtyperequestforinvoice;
	@FindBy(xpath="//span[@title='Other']")
	WebElement casesubtypeother;
	@FindBy(xpath="//a//div[text()='New']")
	WebElement newcasebtn;
	
	public void VerifyCaseSubTypesForBillingType() throws InterruptedException {
		waitForElementToAppear(By.xpath("//a//div[text()='New']"), 30);
		newcasebtn.click();
		Thread.sleep(4000);
		// scroll to Sales Order field
				js.executeScript(
						"var result = document.evaluate(\"//label[text()='Sales Order']\", document.body, null, XPathResult.ANY_TYPE, null);var input = result.iterateNext();input.scrollIntoView();");
		Thread.sleep(2000);
		casetype.click();
		casetypebilling.click();
		casesubtypebillingdispute.isDisplayed();
		casesubtypecreditapplication.isDisplayed();
		casesubtyperequestforbackupsupport.isDisplayed();
		casesubtyperequestforinvoice.isDisplayed();
		casesubtypeother.isDisplayed();
	}
	@FindBy(xpath="//span[@title='Emergency']")
	WebElement casetypeemergency;
	
	@FindBy(xpath="//span[@title='Fire']")
	WebElement casesubtypefire;
	
	@FindBy(xpath="//span[@title='Injury']")
	WebElement casesubtypeinjury;
	
	@FindBy(xpath="//span[@title='Safety Issue']")
	WebElement casesubtypesafetyissue;
	
	public void VerifyCaseSubTypesForEmergencyType() throws InterruptedException {
		Thread.sleep(4000);
		casetype.click();
		Thread.sleep(2000);
		casetypeemergency.click();
		Thread.sleep(2000);
		casesubtypefire.isDisplayed();
		casesubtypeinjury.isDisplayed();
		casesubtypesafetyissue.isDisplayed();
	}
	
	
	@FindBy(xpath="//span[@title='Equipment']")
	WebElement casetypeequipment;
	
	@FindBy(xpath="//span[@title='Information']")
	WebElement casesubtypeinformation;
	
	@FindBy(xpath="//span[@title='Safety Issue']")
	WebElement casesubtypesafetyissue1;
	
	@FindBy(xpath="//span[@title='Troubleshooting']")
	WebElement casesubtypetroubleshooting;
	
	@FindBy(xpath="//span[@title='Other']")
	WebElement casesubtypeother1;
	
	public void VerifyCaseSubTypesForEquipementType() throws InterruptedException {
		Thread.sleep(2000);
		casetype.click();
		Thread.sleep(2000);
		casetypeequipment.click();
		Thread.sleep(2000);
		casesubtypeinformation.isDisplayed();
		casesubtypesafetyissue1.isDisplayed();
		casesubtypetroubleshooting.isDisplayed();
		casesubtypeother1.isDisplayed();
	}
	
	
	@FindBy(xpath="//span[@title='Feedback']")
	WebElement casetypefeedback;
	
	@FindBy(xpath="//span[@title='Customer Service']")
	WebElement casesubtypecustomerservice;
	
	@FindBy(xpath="//span[@title='Equipment']")
	WebElement casesubtypeequipment;
	
	@FindBy(xpath="//span[@title='Feature Requests']")
	WebElement casesubtypefeaturerequests;
	
	@FindBy(xpath="//span[@title='New Equipment']")
	WebElement casesubtypenewequipment;
	
	@FindBy(xpath="//span[@title='Other']")
	WebElement casesubtypeother2;
	
	public void VerifyCaseSubTypesForFeedbackType() throws InterruptedException {
		Thread.sleep(2000);
		casetype.click();
		Thread.sleep(2000);
		casetypefeedback.click();
		Thread.sleep(2000);
		casesubtypecustomerservice.isDisplayed();
		casesubtypeequipment.isDisplayed();
		casesubtypefeaturerequests.isDisplayed();
		casesubtypenewequipment.isDisplayed();
		casesubtypeother2.isDisplayed();
	}
	
	@FindBy(xpath="//span[@title='General']")
	WebElement casetypegeneral;
	

	public void VerifyCaseSubTypesForGeneralType() throws InterruptedException {
		Thread.sleep(2000);
		casetype.click();
		Thread.sleep(2000);
		casetypegeneral.click();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath="//span[@title='Junk/Spam']")
	WebElement casetypejunkspam;
	

	public void VerifyCaseSubTypesForJunkSpamType() throws InterruptedException {
		Thread.sleep(2000);
		casetype.click();
		Thread.sleep(2000);
		casetypejunkspam.click();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath="//span[@title='New Project Scheduling']")
	WebElement casetypenewprojscheduling;
	
	@FindBy(xpath="//span[@title='C&I']")
	WebElement casesubtypecandi;
	
	@FindBy(xpath="//span[@title='Commissioning']")
	WebElement casesubtypecommissioning;
	
	@FindBy(xpath="//span[@title='Controls']")
	WebElement casesubtypecontrols;
	
	@FindBy(xpath="//span[@title='Courtesy Visit']")
	WebElement casesubtypecourtesyvisit;
	
	@FindBy(xpath="//span[@title='Demo / Customer Testing']")
	WebElement casesubtypedemocustomertesting;
	
	@FindBy(xpath="//span[@title='FAT']")
	WebElement casesubtypefat;
	
	public void VerifyCaseSubTypesForNewProjectSchedulingType() throws InterruptedException {
		Thread.sleep(2000);
		casetype.click();
		Thread.sleep(2000);
		casetypenewprojscheduling.click();
		Thread.sleep(2000);
		casesubtypecandi.isDisplayed();
		casesubtypecommissioning.isDisplayed();
		casesubtypecontrols.isDisplayed();
		casesubtypecourtesyvisit.isDisplayed();
		casesubtypedemocustomertesting.isDisplayed();
		casesubtypefat.isDisplayed();
	}
	
	@FindBy(xpath="//span[@title='Parts']")
	WebElement casetypeparts;
	
	@FindBy(xpath="//span[@title='Order Status']")
	WebElement casesubtypeorderstatus;
	
	@FindBy(xpath="//span[@title='Parts Manual']")
	WebElement casesubtypepartsmanual;
	
	@FindBy(xpath="//span[@title='Quotes and Orders']")
	WebElement casesubtypequotesandorders;
	
	@FindBy(xpath="//span[@title='Recomended Parts List']")
	WebElement casesubtyperecomdedpartslist;
	
	@FindBy(xpath="//span[@title='Other']")
	WebElement casesubtypeother3;
	

	public void VerifyCaseSubTypesForPartsType() throws InterruptedException {
		Thread.sleep(2000);
		casetype.click();
		Thread.sleep(2000);

		casesubtypeorderstatus.isDisplayed();
		casesubtypepartsmanual.isDisplayed();
		casesubtypequotesandorders.isDisplayed();
		casesubtyperecomdedpartslist.isDisplayed();
		casesubtypeother3.isDisplayed();
	}
	@FindBy(xpath="//span[@title='Sales']")
	WebElement casetypesales;
	public void VerifyCaseSubTypesForSalesType() throws InterruptedException {
		Thread.sleep(2000);
		casetype.click();
		Thread.sleep(2000);
		casetypesales.click();
		Thread.sleep(2000);
	}
	
	
	@FindBy(xpath="//span[@title='Scheduling']")
	WebElement casetypescheduling;
	
	@FindBy(xpath="//span[@title='Assesment']")
	WebElement casesubtypeassesment;
	
	@FindBy(xpath="//span[@title='Calibration']")
	WebElement casesubtypecalibration;
	
	@FindBy(xpath="//span[@title='Courtesy Visit']")
	WebElement casesubtypecourtestyvisit;

	public void VerifyCaseSubTypesForSchedulingType() throws InterruptedException {
		Thread.sleep(2000);
		casetype.click();
		Thread.sleep(2000);
		casetypescheduling.click();
		Thread.sleep(2000);
		casesubtypeassesment.isDisplayed();
		casesubtypecalibration.isDisplayed();
		casesubtypecourtestyvisit.isDisplayed();
	}
}
