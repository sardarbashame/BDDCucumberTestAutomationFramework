package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import commonutilities.ReusableUtility;

public class EstimateCreationFlowStep3 extends ReusableUtility {

	WebDriver driver;
	By waitforelementtodisappear;
	By waitforelementtoappear;
	String actualmessage;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement webele;

	public EstimateCreationFlowStep3(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickViewConfirmation() throws InterruptedException {
		driver.findElement(By.xpath("(//button[text()='View Confirmation'])[2]")).click();
		waitforelementtoappear = waitForElementToAppear(By.xpath("(//button[text()='Create PDF'])[1]"));
	}

	public void clickCreatePDF() throws InterruptedException {
		driver.findElement(By.xpath("(//button[text()='Create PDF'])[2]")).click();
		}

		public void clickSaveButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(2000);
	}

	

}
