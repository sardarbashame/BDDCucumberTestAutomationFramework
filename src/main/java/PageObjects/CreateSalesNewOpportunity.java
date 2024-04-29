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

public class CreateSalesNewOpportunity extends ReusableUtility{
	
	WebDriver driver;
	
	public CreateSalesNewOpportunity(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//ul[@class='slds-global-actions']//a[.//span[text()='Global Actions']]")
	WebElement globalactions;
	
	@FindBy(xpath="//ul[@class='slds-global-actions']//a[@title='New Opportunity']")
	WebElement newoppclick;
	
	
public void createNewOpp(String oppname, String stage) throws InterruptedException
	{
		Thread.sleep(0,1000);
		globalactions.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    newoppclick.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("(//*[text()='Opportunity Name']/../..//input)")).sendKeys(oppname);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    driver.findElement(By.xpath("(//*[text()='Stage']/../..//a)")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//li//a[text()='"+stage+"']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[@title='Sales Console']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//span[text()='Save'])[3]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]//a//div")).click();
	   Thread.sleep(4000);
	   By opportunitydetailstab = By.xpath("//a[text()='Details']");
	   waitForElementToAppear(opportunitydetailstab);
	   Thread.sleep(1000);
	}

}

