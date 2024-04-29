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

public class TaskDetailsTab extends ReusableUtility{
	
	WebDriver driver;
	String actualstatusname;
	String actualcontactname;

	
	public TaskDetailsTab(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	
	
public void clicktaskdetailsTab() throws InterruptedException
	{
		Thread.sleep(0,1000);
		driver.findElement(By.xpath("//a//span[text()='Details']")).click();
		Thread.sleep(4000);
	}

public String getactualstatusname() throws InterruptedException
{
	Thread.sleep(0,1000);
	actualstatusname= driver.findElement(By.xpath("(//*[text()='Status']/../..//span)[2]")).getText();
	Thread.sleep(1000);
   return actualstatusname;
}

public String getactualcontactname() throws InterruptedException
{
	Thread.sleep(0,3000);
	actualcontactname= driver.findElement(By.xpath("(//*[text()='Name']/../..//a)[3]")).getText();
	Thread.sleep(3000);
   return actualcontactname;
}



}

