package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class ServiceAppointmentFieldServiceReportTab extends CommonFunctions {
	
	@FindBy(xpath = "(//a[text()='Details'])")
	WebElement tab_details;
	
	@FindBy(xpath = "//a[text()='Related']")
	WebElement tab_related;
	
	@FindBy(xpath="//span[text()='Edit Scheduled Start']")
	WebElement clk_editschedulestartdate;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement btn_save;
	
	@FindBy(xpath="//button[text()='Cancel']")
	WebElement btn_cancel;
	
	@FindBy(xpath="//span[@title='Customer Information']")
	WebElement label_customerinformation;
	
	
	@FindBy(xpath="//span[text()='Company Name']")
	WebElement label_companyname;
	
	@FindBy(xpath="//lightning-layout-item//span[text()='Address'][last()]")
	WebElement label_address;
	
	@FindBy(xpath="//lightning-layout-item//span[text()='Contact'][last()]")
	WebElement label_contact;
	
	@FindBy(xpath="//lightning-layout-item//span[text()='Title'][last()]")
	WebElement label_title;
	@FindBy(xpath="//span[@title='Order Details']")
	WebElement label_orderdetails;
	
	
	@FindBy(xpath="//span[text()='Order Number']")
	WebElement label_ordernumber;
	
	@FindBy(xpath="//lightning-layout-item//span[text()='Inquiry Number'][last()]")
	WebElement label_inquirynumber;
	
	@FindBy(xpath="//lightning-layout-item//span[text()='PO Number'][last()]")
	WebElement label_ponumber;
	
	@FindBy(xpath="//lightning-layout-item//span[text()='Purpose Of Visit'][last()]")
	WebElement label_purposeofvisit;
	
	@FindBy(xpath="//span[@title='Equipment Information']")
	WebElement label_equipmentinformation;
	
	@FindBy(xpath="//span[@title='Summary Of Visit']")
	WebElement label_summaryofvisit;
	

	@FindBy(xpath="//span[@title='Daily Notes']")
	WebElement label_dailynotes;
	
	@FindBy(xpath="(//*[@title='Date'])[1]")
	WebElement label_dndatecolumn;
	
	@FindBy(xpath="(//*[@title='Subject'])[last()]")
	WebElement label_dnsubjectcolumn;
	
	@FindBy(xpath="(//*[@title=\"Today's Activities\"])[last()]")
	WebElement label_dntodaysactivitiescolumn;
	
	@FindBy(xpath="(//*[@title='Planned Activities'])[1]")
	WebElement label_dnplannedactivitiescolumn;
	
	@FindBy(xpath="(//*[@title='Images'])[1]")
	WebElement label_dnimagescolumn;
	
	@FindBy(xpath="(//*[@title='Service Time'])[1]")
	WebElement label_servicetime;
	
	@FindBy(xpath="(//*[text()='Date/Day'])[1]")
	WebElement label_stdatedaycolumn;
	
	@FindBy(xpath="(//*[text()='End Time'])[1]")
	WebElement label_stendtimecolumn;
	
	@FindBy(xpath="(//*[text()='Straight Time'])[1]")
	WebElement label_ststraighttimecolumn;
	
	@FindBy(xpath="(//*[text()='Over Time'])[1]")
	WebElement label_stovertimecolumn;
	
	@FindBy(xpath="(//*[@title='Travel Time'])[1]")
	WebElement label_traveltime;
	
	@FindBy(xpath="(//*[@title='Date'])[2]")
	WebElement column_ttdate;
	
	@FindBy(xpath="(//*[@title='Start Time'])[1]")
	WebElement column_ttstartime;
	
	@FindBy(xpath="(//*[@title='End Time'])[1]")
	WebElement column_ttendtime;
	
	@FindBy(xpath="(//*[@title='Total Hrs'])[1]")
	WebElement column_tttotalhrs;
	
	@FindBy(xpath="(//*[@title='Service Charge'])[1]")
	WebElement label_servicecharge;
	
	@FindBy(xpath="//*[text()='Standard Hours @180.00/Hr']")
	WebElement standardhoursrate;
	
	@FindBy(xpath="//*[text()='Overtime Hours @250.00/Hr']")
	WebElement overtimerate;
	
	@FindBy(xpath="//*[text()='Weekend @275.00/Hr']")
	WebElement weekendrate;
	
	@FindBy(xpath="//*[text()='Holiday Hours @335.00/Hr']")
	WebElement holidayhrsrate;
	
	@FindBy(xpath="//*[text()='Travel Hours @110.00/Hr']")
	WebElement travelhrsrate;
	
	@FindBy(xpath="(//*[@title='Expenses'])[last()]")
	WebElement label_expenses;
	
	@FindBy(xpath="//*[text()='Per Diem for the Tech @250.00/Day']")
	WebElement perdiemfortech;
	
	@FindBy(xpath="//*[text()='Mileage Number of Miles @0.66/mile']")
	WebElement mileagenumberofmiles;
	
	@FindBy(xpath="//*[text()='Auto Rental/Taxi/Toll']")
	WebElement autorentaltaxitoll;
	
	@FindBy(xpath="//*[text()='Air Transportation Cost']")
	WebElement airtransportationcost;
	
	@FindBy(xpath="//*[text()='Total Expenses']")
	WebElement totalexpenses;
		
	public ServiceAppointmentFieldServiceReportTab() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	public void VerifyCustomerInformation() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(label_customerinformation);
		label_companyname.isDisplayed();
		label_address.isDisplayed();
		label_contact.isDisplayed();
		label_title.isDisplayed();
		Thread.sleep(3000);
		}
	
	public void VerifyOrderDetails() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(label_orderdetails);
		label_ordernumber.isDisplayed();
		label_inquirynumber.isDisplayed();
		label_ponumber.isDisplayed();
		label_purposeofvisit.isDisplayed();
		Thread.sleep(3000);
		}
	
	public void VerifyEquipmentInformation() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(label_equipmentinformation);
		Thread.sleep(3000);
		}
	
	public void VerifySummaryOfVisit() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(label_summaryofvisit);
		Thread.sleep(3000);
		}
	
	public void VerifyDailyNotes() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(2000);
		expWaitToBeClickable(label_dailynotes);
		label_dndatecolumn.isDisplayed();
		label_dnsubjectcolumn.isDisplayed();
		label_dntodaysactivitiescolumn.isDisplayed();
		label_dnplannedactivitiescolumn.isDisplayed();
		label_dnimagescolumn.isDisplayed();
		Thread.sleep(3000);
		}
	
	public void VerifyServiceTime() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,700)");
		Thread.sleep(2000);
		expWaitToBeClickable(label_servicetime);
		label_stdatedaycolumn.isDisplayed();
		label_stendtimecolumn.isDisplayed();
		label_ststraighttimecolumn.isDisplayed();
		label_stovertimecolumn.isDisplayed();
		Thread.sleep(3000);
		}
	
	public void VerifyTravelTime() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,700)");
		Thread.sleep(2000);
		expWaitToBeClickable(label_traveltime);
		column_ttdate.isDisplayed();
		column_ttstartime.isDisplayed();
		column_ttendtime.isDisplayed();
		column_tttotalhrs.isDisplayed();		
		Thread.sleep(3000);
		}
	
	public void VerifyServiceCharge() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,800)");
		Thread.sleep(2000);
		expWaitToBeClickable(label_servicecharge);
		standardhoursrate.isDisplayed();
		overtimerate.isDisplayed();
		weekendrate.isDisplayed();
		holidayhrsrate.isDisplayed();
		travelhrsrate.isDisplayed();
		Thread.sleep(3000);
		}
	
	public void VerifyExpenses() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,800)");
		Thread.sleep(2000);
		expWaitToBeClickable(label_expenses);
		perdiemfortech.isDisplayed();
		mileagenumberofmiles.isDisplayed();
		autorentaltaxitoll.isDisplayed();
		airtransportationcost.isDisplayed();
		totalexpenses.isDisplayed();
		Thread.sleep(3000);
		}

	@FindBy(xpath = "//button[@title='Download PDF']")
	WebElement button_pdfdownload;
	
	public void ClickPDFIcon() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
		expWaitToBeClickable(button_pdfdownload);
		button_pdfdownload.click();
		Thread.sleep(3000);

		}
	
	@FindBy(xpath = "//h2//slot[text()='FSR PDF Generated.']")
	WebElement successmsg_PDFGenerated;
	
	@FindBy(xpath = "//slot[text()='Please check the files section for generated FSR in PDF format.']")
	WebElement successmsg_checkfilessection;
	
	By pdfdownloadsuccessmessagetoappear = By.xpath("//h2//slot[text()='FSR PDF Generated.']");
	
	public void VerifyPDFDownloadSuccessMessage() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
		expWaitToBeClickable(button_pdfdownload);
		button_pdfdownload.click();
		waitForElementToAppear(pdfdownloadsuccessmessagetoappear, 30);
		successmsg_PDFGenerated.isDisplayed();
		successmsg_checkfilessection.isDisplayed();
	

		}

}
