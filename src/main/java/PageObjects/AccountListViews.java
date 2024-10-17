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

public class AccountListViews extends ReusableUtility {

	WebDriver driver;
	WebElement webele;
	String actualcontactemail;
	String actualtradename;
	String actualindustry;
	By waitforelementtoappear;
	boolean allaccountslistviewpresent;
	boolean myaccountslistviewpresent;
	boolean customeraccountslistviewpresent;
	boolean prospectaccountslistviewpresent;
	boolean intercompanyaccountslistviewpresent;
	boolean oemaccountslistviewpresent;
	boolean customercontaclsviewtpresent;
	boolean boolvalue;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public AccountListViews(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickAccountLisViewButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[@title='Select a List View: Accounts']")).click();
		}

	public void clickAllAccountsListView() throws InterruptedException {
		driver.findElement(By.xpath("(//li//span[text()='All Accounts'])[1]")).click();
	}
	
	public void clickMyAccountsListView() throws InterruptedException {
		driver.findElement(By.xpath("(//li//span[text()='My Accounts'])[1]")).click();
		}
	
	public void clickCustomerAccountsListView() throws InterruptedException {
		driver.findElement(By.xpath("(//li//span[text()='Customer Accounts'])[1]")).click();
		}

	public void clickProspectAccountsListView() throws InterruptedException {
		driver.findElement(By.xpath("(//li//span[text()='Prospect Accounts'])[1]")).click();
		}
	
	public void clickInterCompanyAccountsListView() throws InterruptedException {
		driver.findElement(By.xpath("(//li//span[text()='Intercompany Accounts'])[1]")).click();
	}

	public boolean isAllAccountsListViewPresent() throws InterruptedException {
		allaccountslistviewpresent = driver.findElement(By.xpath("//li//span[text()='All Accounts']")).isDisplayed();
		return allaccountslistviewpresent;
	}

	public boolean isMyAccountsListViewPresent() throws InterruptedException {
		myaccountslistviewpresent = driver.findElement(By.xpath("//li//span[text()='My Accounts']")).isDisplayed();
		return myaccountslistviewpresent;
	}

	public boolean isCustomerAccountsListViewPresent() throws InterruptedException {
		customeraccountslistviewpresent = driver.findElement(By.xpath("//li//span[text()='Customer Accounts']"))
				.isDisplayed();
		return customeraccountslistviewpresent;
	}

	public boolean isProspectAccountsListViewPresent() throws InterruptedException {
		prospectaccountslistviewpresent = driver.findElement(By.xpath("//li//span[text()='Prospect Accounts']"))
				.isDisplayed();
		return prospectaccountslistviewpresent;
	}

	public boolean isIntercompanyAccountsListViewPresent() throws InterruptedException {
		intercompanyaccountslistviewpresent = driver.findElement(By.xpath("//li//span[text()='Intercompany Accounts']"))
				.isDisplayed();
		return intercompanyaccountslistviewpresent;
	}

	public boolean isOEMAccountsListViewPresent() throws InterruptedException {
		oemaccountslistviewpresent = driver.findElement(By.xpath("//li//span[text()='OEM Accounts']")).isDisplayed();
		return oemaccountslistviewpresent;
	}

	
	public boolean isAllAccountsListViewAccountNameColPresent() throws InterruptedException {
		Thread.sleep(0,2000);
		boolvalue = driver.findElement(By.xpath("//a//span[@title='Account Name']")).isDisplayed();
		Thread.sleep(4000);
		return boolvalue;
	}
	
	public boolean isAllAccountsListViewAccountSiteColPresent() throws InterruptedException {
		Thread.sleep(0,2000);
		boolvalue = driver.findElement(By.xpath("//a//span[@title='Account Site']")).isDisplayed();
		Thread.sleep(4000);
		return boolvalue;
	}
	
	public boolean isAllAccountsListViewPhoneColPresent() throws InterruptedException {
		Thread.sleep(0,2000);
		boolvalue = driver.findElement(By.xpath("//a//span[@title='Phone']")).isDisplayed();
		Thread.sleep(4000);
		return boolvalue;
	}
	
	public boolean isAllAccountsListViewTypeColPresent() throws InterruptedException {
		Thread.sleep(0,2000);
		boolvalue = driver.findElement(By.xpath("//a//span[@title='Type']")).isDisplayed();
		Thread.sleep(4000);
		return boolvalue;
	}
	
	public boolean isAllAccountsListViewShippingCityColPresent() throws InterruptedException {
		Thread.sleep(0,2000);
		boolvalue = driver.findElement(By.xpath("//a//span[@title='Shipping City']")).isDisplayed();
		Thread.sleep(4000);
		return boolvalue;
	}
	
	public boolean isAllAccountsListViewCorporateGroupColPresent() throws InterruptedException {
		Thread.sleep(0,2000);
		boolvalue = driver.findElement(By.xpath("//a//span[@title='Corporate Group']")).isDisplayed();
		Thread.sleep(4000);
		return boolvalue;
	}
	
	public boolean isAllAccountsListViewShippingStateProvinceColPresent() throws InterruptedException {
		Thread.sleep(0,2000);
		boolvalue = driver.findElement(By.xpath("//a//span[@title='Shipping State/Province']")).isDisplayed();
		Thread.sleep(4000);
		return boolvalue;
	}
	public boolean isAllAccountsListViewShippingCountryColPresent() throws InterruptedException {
		Thread.sleep(0,2000);
		boolvalue = driver.findElement(By.xpath("//a//span[@title='Shipping Country']")).isDisplayed();
		Thread.sleep(4000);
		return boolvalue;
	}
	
	public boolean isAllAccountsListViewSuperRegionColPresent() throws InterruptedException {
		Thread.sleep(0,2000);
		boolvalue = driver.findElement(By.xpath("//a//span[@title='Super Region']")).isDisplayed();
		Thread.sleep(4000);
		return boolvalue;
	}
	
	public boolean isAllAccountsListViewOperatingHoursColPresent() throws InterruptedException {
		Thread.sleep(0,2000);
		boolvalue = driver.findElement(By.xpath("//a//span[@title='Operating Hours']")).isDisplayed();
		Thread.sleep(4000);
		return boolvalue;
	}
	public boolean isAllAccountsListViewParentAccountColPresent() throws InterruptedException {
		Thread.sleep(0,2000);
		boolvalue = driver.findElement(By.xpath("//a//span[@title='Parent Account']")).isDisplayed();
		Thread.sleep(4000);
		return boolvalue;
	}
	
	public boolean isAllAccountsListViewAccountRecTypeColPresent() throws InterruptedException {
		Thread.sleep(0,2000);
		boolvalue = driver.findElement(By.xpath("//a//span[@title='Account Record Type']")).isDisplayed();
		Thread.sleep(4000);
		return boolvalue;
	}
	
	public boolean isAllAccountsListViewOwnerFirstNameColPresent() throws InterruptedException {
		Thread.sleep(0,2000);
		boolvalue = driver.findElement(By.xpath("//a//span[@title='Owner First Name']")).isDisplayed();
		Thread.sleep(4000);
		return boolvalue;
	}

}
