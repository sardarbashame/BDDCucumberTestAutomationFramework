package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class CaseRelatedListQuickLinks extends CommonFunctions {

	By waitforelementtodisappear;
	By waitforelementtoappear;
	String actualmessage;
	JavascriptExecutor js;

	public CaseRelatedListQuickLinks() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	@FindBy(xpath = "//button[text() = 'Create Work Order']")
	WebElement btnworkorder;
	
	@FindBy(xpath = "//slot[contains(text(), 'Case Team')]/..")
	WebElement relatedlistlnk_caseteam;
	
	@FindBy(xpath = "//*[text()='Add Team']/..")
	WebElement btn_addteam;
	
	@FindBy(xpath = "//button[@name='save']")
	WebElement modalbtn_save;
	
	@FindBy(xpath = "//a[contains(text(), 'Show All')]")
	WebElement link_showall;
	
	@FindBy(xpath = "//slot[contains(text(), 'Quotes / Estimates')]/..")
	WebElement relatedlistquouteestimate;
	

	public void ScrollPageToTop() throws InterruptedException {
		Thread.sleep(4000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(5000);
	}

	public void ClickShowAllLink() throws InterruptedException {
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(6000);
		expWaitToBeClickable(link_showall);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", link_showall);
		Thread.sleep(5000);
	}
	
	public void clickWorkOrderLink() throws InterruptedException {
		Thread.sleep(4000);
		expWaitToBeClickable(btnworkorder);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btnworkorder);
		Thread.sleep(5000);
	}
	
	public void ClickCaseTeamRelatedListLink() throws InterruptedException {
		Thread.sleep(4000);
		expWaitToBeClickable(relatedlistlnk_caseteam);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", relatedlistlnk_caseteam);
		Thread.sleep(5000);
	}
	
	public void ClickQuoteEstimateRelatedListLink() throws InterruptedException {
		Thread.sleep(4000);
		expWaitToBeClickable(relatedlistquouteestimate);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", relatedlistquouteestimate);
		Thread.sleep(5000);
	}
	
	public void AddCaseTeam() throws InterruptedException {
		Thread.sleep(4000);
		expWaitToBeClickable(btn_addteam);
		btn_addteam.click();
		modalbtn_save.click();
		Thread.sleep(5000);
	}
}
