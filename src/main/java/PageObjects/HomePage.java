package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import commonutilities.ReusableUtility;

public class HomePage extends ReusableUtility {

	WebDriver driver;
	By waitforelementtodisappear;
	By waitforelementtoappear;
	String actualmessage;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement webele;
	WebElement caseorigin;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickAccountsTab() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(0, 4000);
		waitForElementToAppear(By.xpath("//a[@title='Accounts']"));
		Thread.sleep(0, 3000);
		webele = driver.findElement(By.xpath("//a[@title='Accounts']"));
		js.executeScript("arguments[0].click();", webele);
		Thread.sleep(0, 3000);
	}
	
	public void clickCasesTab() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(0, 4000);
		waitForElementToAppear(By.xpath("//a[@title='Cases']"));
		Thread.sleep(0, 3000);
		webele = driver.findElement(By.xpath("//a[@title='Cases']"));
		js.executeScript("arguments[0].click();", webele);
		Thread.sleep(0, 3000);
	}

	public void createNewCase(String contname, String firstname, String sub) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(0, 4000);
		waitForElementToAppear(By.xpath("//a//div[text()='New']"));
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//a//div[text()='New']")).click();
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//*[@field-label='Contact Name']//input")).click();
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//*[@field-label='Contact Name']//input")).sendKeys(contname);
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//ul//li//*[text()='" + firstname + "']")).click();
		Thread.sleep(0, 3000);
		// scroll to Type field
		js.executeScript(
				"var result = document.evaluate(\"//label[text()='Sales Order']\", document.body, null, XPathResult.ANY_TYPE, null);var input = result.iterateNext();input.scrollIntoView();");
		Thread.sleep(0, 5000);

		driver.findElement(By.xpath("//*[@field-label='Type']//button[@aria-label='Type']")).click();
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//span[@title='Billing']")).click();
		Thread.sleep(0, 3000);

		driver.findElement(By.xpath("//span[@title='Billing Dispute']")).click();
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//button[@title='Move to Chosen']")).click();
		Thread.sleep(0, 3000);

		caseorigin = driver.findElement(By.xpath("(//button[@aria-label='Case Origin'])"));
		js.executeScript("arguments[0].click();", caseorigin);
		
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//span[@title='Email']")).click();
		Thread.sleep(0, 4000);

		// scroll to Subject field
		js.executeScript(
				"var result = document.evaluate(\"//label[text()='Case Origin']\", document.body, null, XPathResult.ANY_TYPE, null);var input = result.iterateNext();input.scrollIntoView();");
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//label[text()='Subject']/../..//input")).click();
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//label[text()='Subject']/../..//input")).sendKeys(sub);

		driver.findElement(By.xpath("//label[text()='Description']")).click();
		Thread.sleep(0, 3000);

		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(0, 5000);
		waitForElementToAppear(By.xpath("//a[text()='Details']"));
		Thread.sleep(0, 2000);
	}

}
