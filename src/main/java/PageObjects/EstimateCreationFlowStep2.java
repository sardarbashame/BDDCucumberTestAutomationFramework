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
	
	@FindBy(xpath = "(//label[text()='Number Of Tech'])[last()]")
	WebElement raw_label_noOfTech;
	
	@FindBy(xpath = "(//label[text()='Number Of Days'])[last()]")
	WebElement raw_label_noOfDays;
	
	@FindBy(xpath = "(//label[text()='Number of Hrs/day'])[last()]")
	WebElement raw_label_noOfHrsDay;
	
	@FindBy(xpath = "(//*[text()='From Date']/..//input)[last()]")
	WebElement raw_ipt_fromDate;
	
	@FindBy(xpath = "//tr/td[@data-value='2024-11-01']")
	WebElement raw_ipt_dateValueFrom;
	@FindBy(xpath = "(//*[text()='To Date']/..//input)[last()]")
	WebElement raw_ipt_toDate;
	
	@FindBy(xpath = "//tr/td[@data-value='2024-11-05']")
	WebElement raw_ipt_dateValueTO;
	
	@FindBy(xpath = "//label[text()='Number Of Tech']/..//input")
	WebElement value_noOfTech;
	
	@FindBy(xpath = "(//*[text()='From Date']/..//input)[last()]")
	WebElement ipt_fromDate;

	@FindBy(xpath = "//tr/td[@data-value='2024-12-15']")
    WebElement ipt_dateValueFrom;

	@FindBy(xpath = "(//*[text()='To Date']/..//input)[last()]")
	WebElement ipt_toDate;

	@FindBy(xpath = "//tr/td[@data-value='2024-12-20'][last()]")
	WebElement ipt_dateValueTO;

	@FindBy(xpath = "(//div[contains(@class, 'active ')]//label[text()='Number Of Tech'])[last()]")
	WebElement lab_noOfTech;

	@FindBy(xpath = "(//label[text()='Number Of Days'])[last()]")
	WebElement lab_noOfDays;

	@FindBy(xpath = "(//label[text()='Number of Hrs/day'])[last()]")
	WebElement lab_noOfHrsDay;
	
	String numberoftech;

	public EstimateCreationFlowStep2() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}


	public void selectFromDate() throws InterruptedException {
		Thread.sleep(0, 2000);
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
		Thread.sleep(0, 2000);
		waitForElementToAppear(By.xpath("(//button[text()='View Confirmation'])[1]"), 30);
		expWaitToBeClickable(ipt_fromDate);
		ipt_fromDate.click();
		expWaitToBeClickable(ipt_dateValueFrom);
		ipt_dateValueFrom.click();
		Thread.sleep(2000);
	}
	
	public void selectToDateINSP() throws InterruptedException {
		Thread.sleep(0, 2000);
		waitForElementToAppear(By.xpath("(//button[text()='View Confirmation'])[1]"), 30);
		expWaitToBeClickable(ipt_toDate);
		ipt_toDate.click();
		expWaitToBeClickable(ipt_dateValueTO);
		ipt_dateValueTO.click();
		Thread.sleep(3000);
	}
	
	public void ClickRAWTab() throws InterruptedException {
		Thread.sleep(3000);
		expWaitToBeClickable(Tab_RAW);
		Tab_RAW.click();
		Thread.sleep(3000);
	}

	public void selectFromDateRAWTab() throws InterruptedException {
		Thread.sleep(0, 2000);
		waitForElementToAppear(By.xpath("(//button[text()='View Confirmation'])[1]"), 30);
		expWaitToBeClickable(raw_ipt_fromDate);
		raw_ipt_fromDate.click();
		expWaitToBeClickable(raw_ipt_dateValueFrom);
		raw_ipt_dateValueFrom.click();
		Thread.sleep(2000);
	}

	public void selectToDateRAWTab() throws InterruptedException {
		Thread.sleep(0, 2000);
		waitForElementToAppear(By.xpath("(//button[text()='View Confirmation'])[1]"), 30);
		expWaitToBeClickable(raw_ipt_toDate);
		raw_ipt_toDate.click();
		expWaitToBeClickable(raw_ipt_dateValueTO);
		raw_ipt_dateValueTO.click();
		Thread.sleep(3000);
	}

	public boolean isNumberOfTechPresent() throws InterruptedException {
		Thread.sleep(4000);
		numberoftechpresent = lab_noOfTech.isDisplayed();
		return numberoftechpresent;
	}
	
	public String NumberOfTech() throws InterruptedException {
		Thread.sleep(4000);
		numberoftech = value_noOfTech.getText();
		System.out.println(numberoftech);
		return numberoftech;
	}

	public boolean isNumberOfDaysPresent() throws InterruptedException {
		Thread.sleep(4000);
		numberofdayspresent = lab_noOfDays.isDisplayed();
		return numberofdayspresent;
	}

	public boolean isNumberOfHrsPresent() throws InterruptedException {
		Thread.sleep(4000);
		numberofhourspresent = lab_noOfHrsDay.isDisplayed();
		return numberofhourspresent;
	}

}
