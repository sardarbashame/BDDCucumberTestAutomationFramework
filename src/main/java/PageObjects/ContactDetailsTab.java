package PageObjects;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import commonutilities.CommonFunctions;

public class ContactDetailsTab extends CommonFunctions {

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
	boolean namepresent;
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
	EstimateCreationFlowStep1 estimateCreationFlowStep1;

	public ContactDetailsTab() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	@FindBy(xpath = "//ul//li//a[text()='Details']")
	WebElement clk_details;

	@FindBy(xpath = "(//span[text()='Name'])[last()]")
	WebElement label_name;

	@FindBy(xpath = "(//span[text()='Account Name'])[last()]")
	WebElement label_accountname;

	@FindBy(xpath = "(//span[text()='Title'])[last()]")
	WebElement label_title;

	@FindBy(xpath = "(//span[text()='Department'])[last()]")
	WebElement label_department;

	@FindBy(xpath = "(//span[text()='Type'])[last()]")
	WebElement label_type;

	@FindBy(xpath = "(//span[text()='Email'])[last()]")
	WebElement label_email;

	@FindBy(xpath = "(//span[text()='Phone'])[last()]")
	WebElement label_phone;

	@FindBy(xpath = "(//span[text()='Reports To'])[last()]")
	WebElement label_reportsto;

	@FindBy(xpath = "(//span[text()='Contact Currency'])[last()]")
	WebElement label_contactcurrency;

	@FindBy(xpath = "(//span[text()='Contact Owner'])[last()]")
	WebElement label_contactowner;

	@FindBy(xpath = "(//span[text()='Preferred Language'])[last()]")
	WebElement label_preferredlanguage;

	@FindBy(xpath = "(//span[text()='Mailing Address'])[last()]")
	WebElement label_mailingaddress;

	@FindBy(xpath = "(//span[text()='Location'])[last()]")
	WebElement label_location;

	@FindBy(xpath = "(//span[text()='Asst. Phone'])[last()]")
	WebElement label_asstphone;

	@FindBy(xpath = "(//span[text()='Preferred Technician'])[last()]")
	WebElement label_preferredtechnician;

	@FindBy(xpath = "(//span[text()='Other Phone'])[last()]")
	WebElement label_otherphone;

	@FindBy(xpath = "(//span[text()='Mobile'])[last()]")
	WebElement label_mobile;

	@FindBy(xpath = "(//span[text()='Shift'])[last()]")
	WebElement label_shift;

	@FindBy(xpath = "(//span[text()='Do Not Call'])[last()]")
	WebElement label_donotcall;

	@FindBy(xpath = "(//span[text()='Email Opt Out'])[last()]")
	WebElement label_emailoptout;

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

	@FindBy(xpath = "(//lst-related-list-quick-links-grid//a)[last()]")
	WebElement lnk_showall;

	@FindBy(xpath = "(//h2[text()='Related List Quick Links']/../..//slot[contains(text(), 'Related Accounts')])")
	WebElement lnk_relatedaccounts;

	@FindBy(xpath = "(//h2[text()='Related List Quick Links']/../..//slot[contains(text(), 'Cases')])")
	WebElement lnk_cases;

	@FindBy(xpath = "(//h2[text()='Related List Quick Links']/../..//slot[contains(text(), 'Voice Calls')])")
	WebElement lnk_voicecalls;

	@FindBy(xpath = "(//h2[text()='Related List Quick Links']/../..//slot[contains(text(), 'Chat Transcripts')])")
	WebElement lnk_chattranscripts;

	@FindBy(xpath = "(//h2[text()='Related List Quick Links']/../..//slot[contains(text(), 'Messaging Sessions')])")
	WebElement lnk_messagingsessions;

	@FindBy(xpath = "(//h2[text()='Related List Quick Links']/../..//slot[contains(text(), 'Files')])")
	WebElement lnk_files;

	@FindBy(xpath = "(//h2[text()='Related List Quick Links']/../..//slot[contains(text(), 'Notes')])")
	WebElement lnk_notes;

	By Wait_toastMessage = By.xpath("//span[contains(@class,'toastMessage')]//a//div");

	public boolean isNamePresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		namepresent = label_name.isDisplayed();
		Thread.sleep(1000);
		return namepresent;
	}

	public boolean isAccountNamePresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		namepresent = label_accountname.isDisplayed();
		Thread.sleep(1000);
		return namepresent;
	}

	public boolean isTitlePresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		namepresent = label_title.isDisplayed();
		Thread.sleep(1000);
		return namepresent;
	}

	public boolean isDepartmentPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		namepresent = label_department.isDisplayed();
		Thread.sleep(1000);
		return namepresent;
	}

	public boolean isTypePresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		namepresent = label_type.isDisplayed();
		Thread.sleep(1000);
		return namepresent;
	}

	public boolean isEmailPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		namepresent = label_email.isDisplayed();
		Thread.sleep(1000);
		return namepresent;
	}

	public boolean isPhonePresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		namepresent = label_phone.isDisplayed();
		Thread.sleep(1000);
		return namepresent;
	}

	public boolean isReportsToPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		namepresent = label_reportsto.isDisplayed();
		Thread.sleep(1000);
		return namepresent;
	}

	public boolean isContactCurrencyPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		namepresent = label_contactcurrency.isDisplayed();
		Thread.sleep(1000);
		return namepresent;
	}

	public boolean isContactOWnerPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		namepresent = label_contactowner.isDisplayed();
		Thread.sleep(1000);
		return namepresent;
	}

	public boolean isPreferredLanaguagePresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		namepresent = label_preferredlanguage.isDisplayed();
		Thread.sleep(1000);
		return namepresent;
	}

	public boolean isMailingAddressPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		namepresent = label_mailingaddress.isDisplayed();
		Thread.sleep(1000);
		return namepresent;
	}

	public boolean isLocationPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		namepresent = label_location.isDisplayed();
		Thread.sleep(1000);
		return namepresent;
	}

	public boolean isAsstPhonePresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		namepresent = label_asstphone.isDisplayed();
		Thread.sleep(1000);
		return namepresent;
	}

	public boolean isPreferredTechnicianPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		namepresent = label_preferredtechnician.isDisplayed();
		Thread.sleep(1000);
		return namepresent;
	}

	public boolean isOtherPhonePresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		namepresent = label_otherphone.isDisplayed();
		Thread.sleep(1000);
		return namepresent;
	}

	public boolean isMobilePresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		namepresent = label_mobile.isDisplayed();
		Thread.sleep(1000);
		return namepresent;
	}

	public boolean isShiftPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		namepresent = label_shift.isDisplayed();
		Thread.sleep(1000);
		return namepresent;
	}

	public boolean isDoNotCallPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		namepresent = label_donotcall.isDisplayed();
		Thread.sleep(1000);
		return namepresent;
	}

	public boolean isEmailOptOutPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		namepresent = label_emailoptout.isDisplayed();
		Thread.sleep(1000);
		return namepresent;
	}

	@FindBy(xpath="//*[text()='Account Name']/../..//a//span//slot//slot")
	WebElement value_contactaccountname;
	String contactaccouuntnamevalue;
	
	public String getContactAccountName() throws InterruptedException {
		Thread.sleep(2000);
		contactaccouuntnamevalue = value_contactaccountname.getText();
		Thread.sleep(2000);
		return contactaccouuntnamevalue;
	}
	
	@FindBy(xpath="//*[text()='Name']/../../..//lightning-formatted-name")
	WebElement value_contactname;
	String contactnamevalue;
	
	@FindBy(xpath="(//*[text()='Title']/../../..//lightning-formatted-text)[2]")
	WebElement value_contacttitle;
	String contacttitlevalue;
			
	public String getContactName() throws InterruptedException {
		Thread.sleep(2000);
		contactnamevalue = value_contactname.getText();
		Thread.sleep(2000);
		return contactnamevalue;
	}
	
	public String getContactTitle() throws InterruptedException {
		Thread.sleep(2000);
		contacttitlevalue = value_contacttitle.getText();
		Thread.sleep(2000);
		return contacttitlevalue;
	}
	@FindBy(xpath="//*[text()='Department']/../../..//lightning-formatted-text")
	WebElement value_contactdepartment;
	String contactdepartmentvalue;
	
	public String getDepartment() throws InterruptedException {
		Thread.sleep(2000);
		contactdepartmentvalue = value_contactdepartment.getText();
		Thread.sleep(2000);
		return contactdepartmentvalue;
	}
	
	@FindBy(xpath="//*[text()='Type']/../../..//lightning-formatted-text")
	WebElement value_contacttype;
	String contacttypevalue;
	
	public String getType() throws InterruptedException {
		Thread.sleep(2000);
		contacttypevalue = value_contacttype.getText();
		Thread.sleep(2000);
		return contacttypevalue;
	}
	
	public void VerifyContactRelatedListQuickLinks() throws InterruptedException {
		Thread.sleep(2000);
		if(lnk_showall.isDisplayed()) {
			estimateCreationFlowStep1 = new EstimateCreationFlowStep1();
			estimateCreationFlowStep1.clickShowAllQuickLink();
		}
		
		Thread.sleep(3000);
		lnk_relatedaccounts.isDisplayed();
		lnk_cases.isDisplayed();
		lnk_voicecalls.isDisplayed();
		lnk_chattranscripts.isDisplayed();
		lnk_messagingsessions.isDisplayed();
		lnk_files.isDisplayed();
		lnk_notes.isDisplayed();
		Thread.sleep(1000);
		
	}

}
