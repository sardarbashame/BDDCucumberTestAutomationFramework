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

public class AccountDetailsTab extends ReusableUtility{
	
	WebDriver driver;
	String actualcontactemail;
	String actualtradename;
	String actualindustry;
	By waitforelementtodisappear;
	String actualaccountname;
	String actualparentaccount;
	String actualtype;
	String actualdescription;
	String actualaccountcurrency;
	String actualphone;
	boolean tradenamepresent;
	boolean activepresent;
	boolean customerportalaccountpresent;
	boolean websitepresent;
	boolean languagepresent;
	boolean operatinghourspresent;
	boolean employeespresent;
	boolean regionalsettingspresent;
	boolean superregionpresent;
	boolean saleschannelpresent;
	
	public AccountDetailsTab(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

public boolean isTradeNamePresent() throws InterruptedException
{
	tradenamepresent = driver.findElement(By.xpath("//span[text()='Trade Name']")).isDisplayed();
   return tradenamepresent;
}

public boolean isActivePresent() throws InterruptedException
{
	activepresent = driver.findElement(By.xpath("(//span[text()='Active'])[1]")).isDisplayed();
   return activepresent;
}

public boolean isCustomerPortalAccountPresent() throws InterruptedException
{
	customerportalaccountpresent = driver.findElement(By.xpath("(//span[text()='Customer Portal Account'])[1]")).isDisplayed();
	return customerportalaccountpresent;
}

public boolean isWebsitePresent() throws InterruptedException
{
	websitepresent = driver.findElement(By.xpath("//span[text()='Website']")).isDisplayed();
	return websitepresent;
}

public boolean islanguagePresent() throws InterruptedException
{
	languagepresent = driver.findElement(By.xpath("(//span[text()='Language'])")).isDisplayed();
   return languagepresent;
}

public boolean isOperatingHoursPresent() throws InterruptedException
{
	operatinghourspresent = driver.findElement(By.xpath("//span[text()='Operating Hours']")).isDisplayed();
	return operatinghourspresent;
}


public boolean isEmployeesPresent() throws InterruptedException
{
	employeespresent = driver.findElement(By.xpath("//span[text()='Employees']")).isDisplayed();
   return employeespresent;
}

public boolean isRegionalSettingsPresent() throws InterruptedException
{
	regionalsettingspresent = driver.findElement(By.xpath("(//span[text()='Regional Settings'])[2]")).isDisplayed();
   return regionalsettingspresent;
}

public boolean isSuperRegionPresent() throws InterruptedException
{
	superregionpresent = driver.findElement(By.xpath("//span[text()='Super Region']")).isDisplayed();
   return superregionpresent;
}

public boolean isSalesChannelPresent() throws InterruptedException
{
	saleschannelpresent = driver.findElement(By.xpath("//span[text()='Sales Channel']")).isDisplayed();
   return saleschannelpresent;
}

public String getTradeName() throws InterruptedException
{
	actualtradename= driver.findElement(By.xpath("//span[text()='Trade Name']/../../..//lightning-formatted-text")).getText();
   return actualtradename;
}

public String getIndustry() throws InterruptedException
{
	actualindustry= driver.findElement(By.xpath("//span[text()='Industry']/../../..//lightning-formatted-text")).getText();
   return actualindustry;
}

public String getAccountName() throws InterruptedException
{
	actualaccountname= driver.findElement(By.xpath("//span[text()='Account Name']/../../..//lightning-formatted-text")).getText();
   return actualaccountname;
}

public String getParentAccount() throws InterruptedException
{
	actualparentaccount= driver.findElement(By.xpath("(//span[text()='Parent Account']/../../..//a//slot)[2]")).getText();
   return actualparentaccount;
}



public String getType() throws InterruptedException
{
	actualtype= driver.findElement(By.xpath("//span[text()='Type']/../../..//lightning-formatted-text")).getText();
   return actualtype;
}

public String getDescription() throws InterruptedException
{
	actualdescription= driver.findElement(By.xpath("//span[text()='Description']/../../..//lightning-formatted-text")).getText();
   return actualdescription;
}

public String getAccountCurrency() throws InterruptedException
{
	actualaccountcurrency= driver.findElement(By.xpath("//span[text()='Account Currency']/../../..//lightning-formatted-text")).getText();
   return actualaccountcurrency;
}


public String getPhone() throws InterruptedException
{
	actualphone= driver.findElement(By.xpath("//span[text()='Phone']/../../..//lightning-formatted-text")).getText();
   return actualphone;
}

public String getactualcontactemail() throws InterruptedException
{
	actualcontactemail= driver.findElement(By.xpath("//span[text()='Email']/../../..//emailui-formatted-email-wrapper//a")).getText();
   return actualcontactemail;
}


}

