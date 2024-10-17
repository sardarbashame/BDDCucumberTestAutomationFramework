package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import commonutilities.ReusableUtility;

public class CaseDetailsTab extends ReusableUtility {

	WebDriver driver;
	By waitforelementtodisappear;
	By waitforelementtoappear;
	String actualmessage;
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
	
	public CaseDetailsTab(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void editCaseStatus() throws InterruptedException {
		editcasestatusbtn.click();
	}

	public void updateCaseStatus(String newcasestatus) throws InterruptedException {
		waitForElementToAppear(By.xpath("//ul/li/a[text()='Details']"));
		editstatusclk.click();
		statusclk.click();
		driver.findElement(By.xpath("//span[@title='"+newcasestatus+"']")).click();
	}


	public void transferCase(String newowner) throws InterruptedException {
		waitForElementToAppear(By.xpath("//ul/li/a[text()='Details']"));
		Thread.sleep(2000);
		showmoreactions.click();
		Thread.sleep(2000);
		changeowner.click();
		selectownertxtbox.click();
		selectownertxtbox.sendKeys(newowner);
		driver.findElement(By.xpath("//div[@title='"+newowner+"']")).click();
		submitbtn.click();
	}
	
	public void clickSaveButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

	public String getValidationMessage() throws InterruptedException {
		actualmessage = driver.findElement(By.xpath(
				"//*[text()='This case has been closed for more than 14 days.  Please open a new case and link the two if desired']"))
				.getText();
		Thread.sleep(1000);
		return actualmessage;
	}

}
