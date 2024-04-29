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

public class OpportunityDetailsTab extends ReusableUtility{
	
	WebDriver driver;
	String actualstagename;
	String actualprobability;
	
	public OpportunityDetailsTab(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	
	
public void clickopportunitydetailsTab() throws InterruptedException
	{
		Thread.sleep(0,1000);
		driver.findElement(By.xpath("//a[text()='Details']")).click();
		Thread.sleep(1000);
	}

public String getactualstage() throws InterruptedException
{
	Thread.sleep(0,1000);
	//actualstagename= driver.findElement(By.xpath("(//*[text()='Stage']/../../..//*[text()='Prospecting'])[3]")).getText();
	actualstagename= driver.findElement(By.xpath("(//*[text()='Stage']/../../..//lightning-formatted-text)")).getText();
	Thread.sleep(1000);
   return actualstagename;
}

public String getprobability() throws InterruptedException
{
	Thread.sleep(0,1000);
	//actualprobability= driver.findElement(By.xpath("(//*[text()='Probability (%)']/../../..//*[text()='10%'])")).getText();
	actualprobability= driver.findElement(By.xpath("(//*[text()='Probability (%)']/../../..//lightning-formatted-number)")).getText();
   Thread.sleep(1000);
   return actualprobability;
}

}

