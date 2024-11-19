package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import commonutilities.CommonFunctions;
import junit.framework.Assert;

public class FieldServiceConsole extends CommonFunctions {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	Select select;
	
	@FindBy(xpath="//div[contains(text() ,'Policy:')]//select")
	WebElement dropdwnclick_policy;
	
	@FindBy(xpath="//a[contains(text(),'Related Records')]")
	WebElement SA_RelatedTab;
	
	@FindBy(xpath="//a[contains(text(),'Related Records')]")
	WebElement Assets_RelatedTab;
	
	@FindBy(xpath="//service-list-column[text()='SA-0732']")
	WebElement click_serviceappointment;
	
	@FindBy(xpath="//ul[@class='QuickActions']//li//span[text()='Edit']")
	WebElement click_SAEditbtn;
	
	@FindBy(xpath="//select[@id='PredefinedFilterSelector']")
	WebElement dropdwn_predefinedfilter;
	
	@FindBy(xpath="//span[text() = 'Punch List Items']//ancestor::header//following-sibling::div//a//div[text() = 'New']")
	WebElement btn_createPunchList;
	
	@FindBy(xpath="//span[text() = 'Next']")
	WebElement btn_next;
	
	@FindBy(xpath="(//span[text() = 'Title']//parent::label//following::input)[1]")
	WebElement ipt_title;
	
	@FindBy(xpath="(//span[text() = 'Work Plan']//parent::label//following::input)[1]")
	WebElement ipt_workPlan;
	
	@FindBy(xpath="(//span[text() = 'Save'])[last()]")
	WebElement btn_save;
	
	@FindBy(xpath="//span[text() = 'Punch List Items']//ancestor::article//table//tbody//th")
	List<WebElement> lst_punchListItemsRecords;
	
	By Wait_stageChange = By
			.xpath("//span[contains(@class, 'toastMessage slds-text-heading--small forceActionsText')]");
	
	public FieldServiceConsole() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}
	
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
	
	public void ClickSARelatedTab() throws InterruptedException {
		Thread.sleep(4000);
		expWaitToBeClickable(SA_RelatedTab);
		Thread.sleep(4000);
		SA_RelatedTab.click();
		Thread.sleep(3000);
	}	
	public void ClickAssetsRelatedTab() throws InterruptedException {
		Thread.sleep(4000);
		expWaitToBeClickable(Assets_RelatedTab);
		Thread.sleep(4000);
		Assets_RelatedTab.click();
		Thread.sleep(2000);
	}
	
	public void createNewPunchListItems() throws Exception {
		Thread.sleep(2000);
		expWaitToBeClickable(Assets_RelatedTab);
		Thread.sleep(4000);
		btn_createPunchList.click();
		Thread.sleep(3000);
		btn_next.click();
		ipt_title.sendKeys(ConcatCurrentDateTime("Auto"));
		clickDrpDownAndSelValue(ipt_workPlan, "Punchlist");
		btn_save.click();
		Thread.sleep(2000);
		elementToBePresent(Wait_stageChange, 30);			
	}
	public void verifyPunchListCreated() throws Exception {
		Thread.sleep(4000);
		expWaitToBeClickable(Assets_RelatedTab);
		int cnt = lst_punchListItemsRecords.size();
		Assert.assertTrue(cnt>0);				
	}
}
