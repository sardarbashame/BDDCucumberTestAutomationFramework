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

	public EstimateCreationFlowStep2() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	@FindBy(xpath = "//*[text()='From Date']/..//input")
	WebElement ipt_fromDate;

	@FindBy(xpath = "//tr/td[@data-value='2024-09-01']")
	WebElement ipt_dateValueFrom;

	@FindBy(xpath = "//*[text()='To Date']/..//input")
	WebElement ipt_toDate;

	@FindBy(xpath = "//tr/td[@data-value='2024-09-30']")
	WebElement ipt_dateValueTO;

	@FindBy(xpath = "(//label[text()='Number Of Tech'])")
	WebElement lab_noOfTech;

	@FindBy(xpath = "(//label[text()='Number Of Days'])")
	WebElement lab_noOfDays;

	@FindBy(xpath = "(//label[text()='Number of Hrs/day'])")
	WebElement lab_noOfHrsDay;

	public void selectFromDate() throws InterruptedException {
		Thread.sleep(0, 2000);
		waitforelementtoappear = waitForElementToAppear(By.xpath("(//button[text()='View Confirmation'])[1]"), 30);
		expWaitToBeClickable(ipt_fromDate);
		ipt_fromDate.click();
		expWaitToBeClickable(ipt_dateValueFrom);
		ipt_dateValueFrom.click();
		Thread.sleep(2000);
	}

	public void selectToDate() throws InterruptedException {
		Thread.sleep(0, 2000);
		waitforelementtoappear = waitForElementToAppear(By.xpath("(//button[text()='View Confirmation'])[1]"), 30);
		expWaitToBeClickable(ipt_toDate);
		ipt_toDate.click();
		expWaitToBeClickable(ipt_dateValueTO);
		ipt_dateValueTO.click();
		Thread.sleep(3000);
	}

	public boolean isNumberOfTechPresent() throws InterruptedException {
		Thread.sleep(0, 3000);
		numberoftechpresent = lab_noOfTech.isDisplayed();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='From Date']/..//input")).click();
		driver.findElement(By.xpath("//tr/td[@data-value='2024-10-01']")).click();
		return numberofdayspresent;
	}

	public boolean isNumberOfDaysPresent() throws InterruptedException {
		Thread.sleep(0, 3000);
		numberofdayspresent = lab_noOfDays.isDisplayed();
		Thread.sleep(1000);
		numberofdayspresent = driver.findElement(By.xpath("(//label[text()='Number Of Days'])")).isDisplayed();
		return numberofdayspresent;
	}

	public boolean isNumberOfHrsPresent() throws InterruptedException {
		Thread.sleep(0, 3000);
		numberofhourspresent = lab_noOfHrsDay.isDisplayed();
		Thread.sleep(1000);
		numberofhourspresent = driver.findElement(By.xpath("(//label[text()='Number of Hrs/day'])")).isDisplayed();
		return numberofhourspresent;
	}

}
