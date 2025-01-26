package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class Inquiries extends CommonFunctions {

	By waitforelementtodisappear;
	By waitforelementtoappear;
	String actualmessage;

	public Inquiries() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	@FindBy(xpath = "//a[@title='Inquiries']")
	WebElement clk_inquiries;
	
	@FindBy(xpath = "(//div[@title='New'])[last()]")
	WebElement btn_New;
	
	@FindBy(xpath="(//th//span//a)[1]")
	WebElement lnk_inquiry;
	
	@FindBy(xpath="//button[@title='Edit Industry']")
	WebElement edit_idustry;

	@FindBy(xpath="//button[@aria-label='Sales Office']")
	WebElement edit_salesoffice;
	
	@FindBy(xpath="//span[text()='Lelystad Netherland']")
	WebElement option_lelystadnetherland;
	
	
	
	public void clickInquriesTab() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		waitForElementToAppear(By.xpath("//a[@title='Inquiries']"), 30);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", clk_inquiries);
		Thread.sleep(4000);
	}
	
	public void SelectInquiry() throws Exception {
		Thread.sleep(4000);
		expWaitToBeClickable(lnk_inquiry);
		lnk_inquiry.click();
		Thread.sleep(4000);
		
	}
	
	public void EditInquiry() throws Exception {
		Thread.sleep(4000);
		edit_idustry.click();
		Thread.sleep(3000);
	}
	
	public void VerifyLelystadNetherlandsOption() throws Exception {
		Thread.sleep(4000);
		edit_salesoffice.click();
		option_lelystadnetherland.isDisplayed();
		Thread.sleep(4000);
	}
	
	

}
