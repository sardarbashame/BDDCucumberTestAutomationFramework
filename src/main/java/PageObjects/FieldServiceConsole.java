package PageObjects;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import commonutilities.CommonFunctions;
import org.testng.Assert;

public class FieldServiceConsole extends CommonFunctions {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@FindBy(xpath="//div[contains(text() ,'Policy:')]//select")
	WebElement dropdwnclick_policy;
	
	Select select;
	
	@FindBy(xpath="//select[@id='PredefinedFilterSelector']")
	WebElement dropdwn_predefinedfilter;
	
	@FindBy(xpath="//service-list-column[text()='SA-0732']")
	WebElement click_serviceappointment;
	
	@FindBy(xpath="//ul[@class='QuickActions']//li//span[text()='Edit']")
	WebElement click_SAEditbtn;
	
	@FindBy(xpath="//button[contains(text(),'Related')]")
	WebElement SA_RelatedTab;
	
	@FindBy(xpath="//h3[text()='Work Order Line Items']//ancestor::div//a[text()='Car']")
	WebElement verifyasset;
	
	@FindBy(xpath="//iframe[contains(@ng-show, \"selectedTab == 'relatedList'\")]")
	WebElement iframe1;
	
	
	public FieldServiceConsole() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	public void SelectPolicy(String policy) throws InterruptedException {
		Thread.sleep(2000);
		select = new Select(dropdwnclick_policy);
		Thread.sleep(2000);
		select.selectByVisibleText(policy);
		Thread.sleep(2000);
	}
	
	public void SelectSAFilter(String filtername) throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(dropdwn_predefinedfilter);
		Thread.sleep(2000);
		select = new Select(dropdwn_predefinedfilter);
		Thread.sleep(2000);
		select.selectByVisibleText(filtername);
		Thread.sleep(2000);
	}
	
	public void SelectSAFromFieldServiceConsole() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(click_serviceappointment);
		Thread.sleep(2000);
		click_serviceappointment.click();
		Thread.sleep(3000);
	}
		
	public void EditSAFromFieldServiceConsole() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(click_SAEditbtn);
		Thread.sleep(2000);
		click_SAEditbtn.click();
		Thread.sleep(2000);
	}
	
	public void ClickSARelatedTab() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(SA_RelatedTab);
		Thread.sleep(2000);
		SA_RelatedTab.click();
		Thread.sleep(3000);
	}
	
	public void VerifyAssetOnSARelatedTab() throws InterruptedException {
		Thread.sleep(4000);
		driver.switchTo().frame(iframe1);
		Thread.sleep(2000);
		expWaitToBeClickable(verifyasset);
		Thread.sleep(2000);
		verifyasset.isDisplayed();
		Thread.sleep(3000);
	}

}
