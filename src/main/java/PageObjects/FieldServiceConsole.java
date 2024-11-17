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
	
	public FieldServiceConsole() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	Select select;
	public void SelectPolicy() throws InterruptedException {
		Thread.sleep(4000);
//		WebElement frame1 = driver.findElement(By.xpath("//iframe[@title='Field Service']"));
//		driver.switchTo().frame(frame1);
//		expWaitToBeClickable(dropdwnclick_policy);
		Thread.sleep(4000);
		select = new Select(dropdwnclick_policy);
		Thread.sleep(4000);
		select.selectByVisibleText("USA - Packaging");
		Thread.sleep(3000);
	}
	
	
	@FindBy(xpath="//select[@id='PredefinedFilterSelector']")
	WebElement dropdwn_predefinedfilter;
	public void SelectJeopardySA() throws InterruptedException {
		Thread.sleep(4000);
//		WebElement frame1 = driver.findElement(By.xpath("//iframe[@title='Field Service']"));
//		driver.switchTo().frame(frame1);
		expWaitToBeClickable(dropdwn_predefinedfilter);
		Thread.sleep(4000);
		select = new Select(dropdwn_predefinedfilter);
		Thread.sleep(4000);
		select.selectByVisibleText("In Jeopardy");
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="//service-list-column[text()='SA-0732']")
	WebElement click_serviceappointment;
	
	@FindBy(xpath="//ul[@class='QuickActions']//li//span[text()='Edit']")
	WebElement click_SAEditbtn;
	
	public void SelectSAFromFieldServiceConsole() throws InterruptedException {
		Thread.sleep(4000);
//		WebElement frame1 = driver.findElement(By.xpath("//iframe[@title='Field Service']"));
//		driver.switchTo().frame(frame1);
		expWaitToBeClickable(click_serviceappointment);
		Thread.sleep(4000);
		click_serviceappointment.click();
		Thread.sleep(3000);
	}
	
	
	public void EditSAFromFieldServiceConsole() throws InterruptedException {
		Thread.sleep(4000);
//		WebElement frame1 = driver.findElement(By.xpath("//iframe[@title='Field Service']"));
//		driver.switchTo().frame(frame1);
		expWaitToBeClickable(click_SAEditbtn);
		Thread.sleep(4000);
		click_SAEditbtn.click();
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="//button[contains(text(),'Related')]")
	WebElement SA_RelatedTab;
	public void ClickSARelatedTab() throws InterruptedException {
		Thread.sleep(4000);
//		WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='GanttReactMapIframe']"));
//		driver.switchTo().frame(frame1);
		expWaitToBeClickable(SA_RelatedTab);
		Thread.sleep(4000);
		SA_RelatedTab.click();
		Thread.sleep(3000);
	}

}
