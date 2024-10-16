package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import commonutilities.ReusableUtility;

public class EstimateCreationFlowStep2 extends ReusableUtility {

	WebDriver driver;
	By waitforelementtodisappear;
	By waitforelementtoappear;
	boolean numberoftechpresent;
	boolean numberofdayspresent;
	boolean numberofhourspresent;
	String actualmessage;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement webele;

	public EstimateCreationFlowStep2(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectFromDate() throws InterruptedException {
		waitforelementtoappear = waitForElementToAppear(By.xpath("(//button[text()='View Confirmation'])[1]"));
		driver.findElement(By.xpath("//*[text()='From Date']/..//input")).click();
		driver.findElement(By.xpath("//tr/td[@data-value='2024-10-01']")).click();
		}

	public void selectToDate() throws InterruptedException {
		waitforelementtoappear = waitForElementToAppear(By.xpath("(//button[text()='View Confirmation'])[1]"));
		driver.findElement(By.xpath("//*[text()='To Date']/..//input")).click();
		driver.findElement(By.xpath("//tr/td[@data-value='2024-10-30']")).click();
	}

	public boolean isNumberOfTechPresent() throws InterruptedException {
		numberoftechpresent = driver.findElement(By.xpath("(//label[text()='Number Of Tech'])")).isDisplayed();
		return numberoftechpresent;
	}

	public boolean isNumberOfDaysPresent() throws InterruptedException {
		numberofdayspresent = driver.findElement(By.xpath("(//label[text()='Number Of Days'])")).isDisplayed();
		return numberofdayspresent;
	}

	public boolean isNumberOfHrsPresent() throws InterruptedException {
		numberofhourspresent = driver.findElement(By.xpath("(//label[text()='Number of Hrs/day'])")).isDisplayed();
		return numberofhourspresent;
	}

}
