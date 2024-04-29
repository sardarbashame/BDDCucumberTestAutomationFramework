package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonutilities.ReusableUtility;

public class ContactDetailsTab extends ReusableUtility{
	
	WebDriver driver;
	String actualcontactemail;
	String actualcontactname;
	By waitforelementtodisappear;
	
	public ContactDetailsTab(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	
	
public void clickcontactdetailsTab() throws InterruptedException
	{
		Thread.sleep(0,2000);
		waitforelementtodisappear = waitForElementToDisAppear(By.xpath("//span[contains(@class,'toastMessage')]//a//div"));
		Thread.sleep(0,2000);
		driver.findElement(By.xpath("//ul//li//a[text()='Details']")).click();
		Thread.sleep(1000);
	}

public String getactualcontactname() throws InterruptedException
{
	Thread.sleep(0,1000);
	actualcontactname= driver.findElement(By.xpath("//span[text()='Name']/../../..//lightning-formatted-name")).getText();
	Thread.sleep(1000);
   return actualcontactname;
}



public String getactualcontactemail() throws InterruptedException
{
	Thread.sleep(0,1000);
	actualcontactemail= driver.findElement(By.xpath("//span[text()='Email']/../../..//emailui-formatted-email-wrapper//a")).getText();
	Thread.sleep(1000);
   return actualcontactemail;
}


}

