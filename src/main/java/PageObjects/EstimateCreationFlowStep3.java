package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class EstimateCreationFlowStep3 extends CommonFunctions {

	By waitforelementtodisappear;
	By waitforelementtoappear;
	String actualmessage;

	public EstimateCreationFlowStep3() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	@FindBy(xpath = "(//button[text()='View Confirmation'])[2]")
	WebElement btn_viewConfirmation;

	@FindBy(xpath = "(//button[text()='Create PDF'])[2]")
	WebElement btn_createPDF;

	@FindBy(xpath = "(//button[text()='Save'])[2]")
	WebElement btn_save;

	
	
	public void clickViewConfirmation() throws InterruptedException {
		Thread.sleep(0, 2000);
		expWaitToBeClickable(btn_viewConfirmation);
		btn_viewConfirmation.click();
		Thread.sleep(2000);
		waitforelementtoappear = waitForElementToAppear(By.xpath("(//button[text()='Create PDF'])[1]"), 30);
	}

	public void clickCreatePDF() throws InterruptedException {
		expWaitToBeClickable(btn_createPDF);
		btn_createPDF.click();
		Thread.sleep(4000);
	}

	public void clickSaveButton() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(btn_save);
		btn_save.click();
		Thread.sleep(5000);
	}
	

}
