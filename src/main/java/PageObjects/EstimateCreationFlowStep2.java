package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class EstimateCreationFlowStep2 extends CommonFunctions {

	By waitforelementtodisappear;
	By waitforelementtoappear;
	boolean numberoftechpresent;
	boolean numberofdayspresent;
	boolean numberofhourspresent;
	String actualmessage;
	
	@FindBy(xpath = "//li//a[text()='RAW']")
	WebElement Tab_RAW;		
	
	@FindBy(xpath = "//li//a[text()='INSP']")
	WebElement Tab_INSP;
	
	@FindBy(xpath = "(//div[text()='#Days'])[1]")
	WebElement proc_label_noOfDays;

	@FindBy(xpath = "(//div[text()='#hrs/Day'])[1]")
	WebElement proc_label_noOfHrsDay;
	
	@FindBy(xpath = "(//div[text()='#Tech'])[1]")
	WebElement proc_label_noOfTech;
	
	@FindBy(xpath = "(//div[text()='#Days'])[4]")
	WebElement raw_label_noOfDays;

	@FindBy(xpath = "(//div[text()='#hrs/Day'])[4]")
	WebElement raw_label_noOfHrsDay;
	
	@FindBy(xpath = "(//div[text()='#Tech'])[4]")
	WebElement raw_label_noOfTech;
	
	@FindBy(xpath = "(//div[text()='#Days'])[2]")
	WebElement pkg_label_noOfDays;

	@FindBy(xpath = "(//div[text()='#hrs/Day'])[2]")
	WebElement pkg_label_noOfHrsDay;
	
	@FindBy(xpath = "(//div[text()='#Tech'])[2]")
	WebElement pkg_label_noOfTech;
	
	@FindBy(xpath = "(//div[text()='#Days'])[3]")
	WebElement insp_label_noOfDays;

	@FindBy(xpath = "(//div[text()='#hrs/Day'])[3]")
	WebElement insp_label_noOfHrsDay;
	
	@FindBy(xpath = "(//div[text()='#Tech'])[3]")
	WebElement insp_label_noOfTech;

	
	@FindBy(xpath = "(//label[text()='From']/..//input)[@name='RAW']")
	WebElement raw_ipt_fromDate;
	
	@FindBy(xpath = "//tr/td[@data-value='2025-02-18']")
	WebElement raw_ipt_dateValueFrom;
	
	@FindBy(xpath = "(//label[text()='To']/..//input)[@name='RAW']")
	WebElement raw_ipt_toDate;
	
	@FindBy(xpath = "//tr/td[@data-value='2025-02-21']")
	WebElement raw_ipt_dateValueTO;
	
	@FindBy(xpath = "(//label[text()='From']/..//input)[@name='INSP']")
	WebElement insp_ipt_fromDate;
	
	@FindBy(xpath = "//tr/td[@data-value='2025-02-18']")
	WebElement insp_ipt_dateValueFrom;
	
	@FindBy(xpath = "(//label[text()='To']/..//input)[@name='INSP']")
	WebElement insp_ipt_toDate;
	
	@FindBy(xpath = "//tr/td[@data-value='2025-02-21']")
	WebElement insp_ipt_dateValueTO;
	
	
	@FindBy(xpath = "(//label[text()='From']/..//input)[@name='PKG]")
	WebElement pkg_ipt_fromDate;
	
	@FindBy(xpath = "//tr/td[@data-value='2025-02-18']")
	WebElement pkg_ipt_dateValueFrom;
	
	@FindBy(xpath = "(//label[text()='To']/..//input)[@name='PKG']")
	WebElement pkg_ipt_toDate;
	
	@FindBy(xpath = "//tr/td[@data-value='2025-02-21']")
	WebElement pkg_ipt_dateValueTO;
	
	
	@FindBy(xpath = "//label[text()='Number Of Tech']/..//input")
	WebElement value_noOfTech;
	
	@FindBy(xpath = "(//label[text()='From']/..//input)[@name='PROC']")
	WebElement ipt_fromDate;

	@FindBy(xpath = "//tr/td[@data-value='2025-02-18']")
    WebElement ipt_dateValueFrom;

	@FindBy(xpath = "(//label[text()='To']/..//input)[@name='PROC']")
	WebElement ipt_toDate;

	@FindBy(xpath = "//tr/td[@data-value='2025-02-20']")
	WebElement ipt_dateValueTO;

	@FindBy(xpath = "(//div[contains(@class, 'active ')]//label[text()='Number Of Tech'])[last()]")
	WebElement lab_noOfTech;

	String numberoftech;

	public EstimateCreationFlowStep2() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}


	public void selectFromDate() throws InterruptedException {
		Thread.sleep(2000);
		waitForElementToAppear(By.xpath("(//button[text()='View Confirmation'])[1]"), 30);
		expWaitToBeClickable(ipt_fromDate);
		ipt_fromDate.click();
		expWaitToBeClickable(ipt_dateValueFrom);
		ipt_dateValueFrom.click();
		Thread.sleep(2000);
	}

	public void selectToDate() throws InterruptedException {
		Thread.sleep(2000);
		waitForElementToAppear(By.xpath("(//button[text()='View Confirmation'])[1]"), 30);
		expWaitToBeClickable(ipt_toDate);
		ipt_toDate.click();
		expWaitToBeClickable(ipt_dateValueTO);
		ipt_dateValueTO.click();
		Thread.sleep(3000);
	}
	
	public void selectFromDateINSP() throws InterruptedException {
		Thread.sleep(2000);
		waitForElementToAppear(By.xpath("(//button[text()='View Confirmation'])[1]"), 30);
		expWaitToBeClickable(insp_ipt_fromDate);
		insp_ipt_fromDate.click();
		expWaitToBeClickable(ipt_dateValueFrom);
		ipt_dateValueFrom.click();
		Thread.sleep(2000);
	}
	
	public void selectToDateINSP() throws InterruptedException {
		Thread.sleep(2000);
		waitForElementToAppear(By.xpath("(//button[text()='View Confirmation'])[1]"), 30);
		expWaitToBeClickable(insp_ipt_toDate);
		insp_ipt_toDate.click();
		expWaitToBeClickable(insp_ipt_dateValueTO);
		insp_ipt_dateValueTO.click();
		Thread.sleep(3000);
	}
	
	
	public void selectFromDatePKG() throws InterruptedException {
		Thread.sleep(2000);
		waitForElementToAppear(By.xpath("(//button[text()='View Confirmation'])[1]"), 30);
		expWaitToBeClickable(pkg_ipt_fromDate);
		pkg_ipt_fromDate.click();
		expWaitToBeClickable(pkg_ipt_dateValueFrom);
		pkg_ipt_dateValueFrom.click();
		Thread.sleep(2000);
	}
	
	public void selectToDatePKG() throws InterruptedException {
		Thread.sleep(2000);
		waitForElementToAppear(By.xpath("(//button[text()='View Confirmation'])[1]"), 30);
		expWaitToBeClickable(pkg_ipt_toDate);
		pkg_ipt_toDate.click();
		expWaitToBeClickable(pkg_ipt_dateValueTO);
		pkg_ipt_dateValueTO.click();
		Thread.sleep(3000);
	}
	
	public void ClickRAWTab() throws InterruptedException {
		Thread.sleep(3000);
		expWaitToBeClickable(Tab_RAW);
		Tab_RAW.click();
		Thread.sleep(4000);
	}

	public void selectFromDateRAWTab() throws InterruptedException {
		Thread.sleep(2000);
		waitForElementToAppear(By.xpath("(//button[text()='View Confirmation'])[1]"), 30);
		expWaitToBeClickable(raw_ipt_fromDate);
		raw_ipt_fromDate.click();
		expWaitToBeClickable(raw_ipt_dateValueFrom);
		raw_ipt_dateValueFrom.click();
		Thread.sleep(2000);
	}

	public void selectToDateRAWTab() throws InterruptedException {
		Thread.sleep(2000);
		waitForElementToAppear(By.xpath("(//button[text()='View Confirmation'])[1]"), 30);
		expWaitToBeClickable(raw_ipt_toDate);
		raw_ipt_toDate.click();
		expWaitToBeClickable(raw_ipt_dateValueTO);
		raw_ipt_dateValueTO.click();
		Thread.sleep(3000);
	}
	
	public boolean PROCNumberOfDays() throws InterruptedException {
		Thread.sleep(4000);
		return proc_label_noOfDays.isDisplayed();
	}
	
	
	public boolean PROCNumberOfHrs() throws InterruptedException {
		Thread.sleep(4000);
		return proc_label_noOfHrsDay.isDisplayed();
	}
	
	public boolean PROCNumberOfTech() throws InterruptedException {
		Thread.sleep(4000);
		return proc_label_noOfTech.isDisplayed();
	}
	
	public boolean RAWNumberOfDays() throws InterruptedException {
		Thread.sleep(4000);
		return raw_label_noOfDays.isDisplayed();
	}

	public boolean RAWNumberOfHrs() throws InterruptedException {
		Thread.sleep(4000);
		return raw_label_noOfHrsDay.isDisplayed();
	}
	
	public boolean RAWNumberOfTech() throws InterruptedException {
		Thread.sleep(4000);
		 return raw_label_noOfTech.isDisplayed();
	}
	
	
	public boolean PKGNumberOfDays() throws InterruptedException {
		Thread.sleep(4000);
		return pkg_label_noOfDays.isDisplayed();
	}

	public boolean PKGNumberOfHrs() throws InterruptedException {
		Thread.sleep(4000);
		return pkg_label_noOfHrsDay.isDisplayed();
	}
	
	public boolean PKGNumberOfTech() throws InterruptedException {
		Thread.sleep(4000);
		return pkg_label_noOfTech.isDisplayed();
	}

	
	public boolean INSPNumberOfDays() throws InterruptedException {
		Thread.sleep(4000);
		return insp_label_noOfDays.isDisplayed();
	}

	public boolean INSPNumberOfHrs() throws InterruptedException {
		Thread.sleep(4000);
		return insp_label_noOfHrsDay.isDisplayed();
	}
	
	public boolean INSPNumberOfTech() throws InterruptedException {
		Thread.sleep(4000);
		return insp_label_noOfTech.isDisplayed();
	}
	
	public String NumberOfTech() throws InterruptedException {
		Thread.sleep(4000);
		numberoftech = value_noOfTech.getText();
		System.out.println(numberoftech);
		return numberoftech;
	}




}
