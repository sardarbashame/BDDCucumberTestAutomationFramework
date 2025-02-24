package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class GlobalSearch extends CommonFunctions {

	String actualcontactemail;
	String actualcontactname;
	By waitforelementtodisappear;

	public GlobalSearch() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	@FindBy(xpath = "//button[text()='Search...']")
	WebElement btn_search;

	@FindBy(xpath = "//input[@type='search' and @placeholder='Search...']")
	WebElement sel_searchAccountAndSelect;


	By wait_details = By.xpath("//li//a[text()='Details']");

	public void selectaccountfromglobalsearch() throws InterruptedException {
		expWaitToBeClickable(btn_search);
		btn_search.click();
		Thread.sleep(3000);
		String value2 =getPropertyValue("ExistingBillingAccount");
		sel_searchAccountAndSelect.sendKeys(value2);
		WebElement ipt_testCustomerAcc = driver.findElement(By.xpath("(//span[@title='"+value2+"'])"));
		expWaitToBeClickable(ipt_testCustomerAcc);
		ipt_testCustomerAcc.click();
		Thread.sleep(5000);
	}

	public void SelectFromGlobalSearch(String tstcase) throws InterruptedException {
		expWaitToBeClickable(btn_search);
		btn_search.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Search by object type']/..//input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title='Accounts']")).click();
		Thread.sleep(2000);
		Thread.sleep(3000);
		System.out.println(tstcase);
		sel_searchAccountAndSelect.sendKeys(tstcase);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@title='" + tstcase + "']")).click();
		Thread.sleep(2000);
		waitForElementToAppear(wait_details, 30);
		Thread.sleep(2000);
	}

}
