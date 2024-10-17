package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import commonutilities.ReusableUtility;

public class HomePage extends ReusableUtility {

	WebDriver driver;
	By waitforelementtodisappear;
	By waitforelementtoappear;
	String actualmessage;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	@FindBy(xpath="//a//div[text()='New']")
	WebElement newaccountbtn;
	@FindBy(xpath="//button//span[text()='Next']")
	WebElement nextbtn;
	@FindBy(xpath="//*[text()='Account Name']/..//input")
	WebElement accountnametxtbox;
	@FindBy(xpath="//*[text()='Trade Name']/..//input")
	WebElement tradenametxtbox;
	@FindBy(xpath="	//button[text()='Save']")
	WebElement accountsavebtn;
	@FindBy(xpath="//a[@title='Cases']")
	WebElement casestab;
	@FindBy(xpath="//a[@title='Accounts']")
	WebElement accountstab;
	@FindBy(xpath="//a//div[text()='New']")
	WebElement newcasebtn;
	@FindBy(xpath="//*[@field-label='Contact Name']//input")
	WebElement contactnametxtbox;
	@FindBy(xpath="//*[@field-label='Type']//button[@aria-label='Type']")
	WebElement contacttype;
	@FindBy(xpath="//span[@title='Billing']")
	WebElement contacttypebilling;
	@FindBy(xpath="//span[@title='Billing Dispute']")
	WebElement contactsubtypebillingdispute;
	@FindBy(xpath="//button[@title='Move to Chosen']")
	WebElement movetochosenbtn;
	@FindBy(xpath="(//button[@aria-label='Case Origin'])")
	WebElement caseorigin;
	@FindBy(xpath="//span[@title='Email']")
	WebElement email;
	@FindBy(xpath="//label[text()='Subject']/../..//input")
	WebElement casesubject;
	@FindBy(xpath="//label[text()='Description']")
	WebElement casedescription;
	@FindBy(xpath="//button[text()='Save']")
	WebElement casesavebtn;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickAccountsTab() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		waitForElementToAppear(By.xpath("//a[@title='Accounts']"));
		js.executeScript("arguments[0].click();", accountstab);
	}
	
	public void clickCasesTab() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		waitForElementToAppear(By.xpath("//a[@title='Cases']"));
		js.executeScript("arguments[0].click();", casestab);
	}
	
	public void createNewCustomerAccount(String accountname, String industryname, String tradename) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(0, 4000);
		waitForElementToAppear(By.xpath("//a//div[text()='New']"));
		newaccountbtn.click();
		nextbtn.click();
		accountnametxtbox.click();
		accountnametxtbox.sendKeys(accountname);
		tradenametxtbox.click();
		tradenametxtbox.sendKeys(tradename);
		// scroll to Language field
		js.executeScript(
				"var result = document.evaluate(\"//label[text()='Language']\", document.body, null, XPathResult.ANY_TYPE, null);var input = result.iterateNext();input.scrollIntoView();");
		driver.findElement(By.xpath("//ul/li//span[text()='"+industryname+"']")).click();
		js.executeScript("var result = document.evaluate(\"(//span[text()='Move to Chosen'])[1]\", document.body, null, XPathResult.ANY_TYPE, null);     var input = result.iterateNext();input.scrollIntoView(); input.click();");
		accountsavebtn.click();
		waitForElementToAppear(By.xpath("//a[text()='Details']"));
		}

	public void createNewCase(String contname, String firstname, String sub) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		waitForElementToAppear(By.xpath("//a//div[text()='New']"));
		newcasebtn.click();
		contactnametxtbox.click();
		contactnametxtbox.sendKeys(contname);
		driver.findElement(By.xpath("//ul//li//*[text()='" + firstname + "']")).click();
		// scroll to Type field
		js.executeScript(
				"var result = document.evaluate(\"//label[text()='Sales Order']\", document.body, null, XPathResult.ANY_TYPE, null);var input = result.iterateNext();input.scrollIntoView();");
		contacttype.click();
		contacttypebilling.click();
		contactsubtypebillingdispute.click();
		movetochosenbtn.click();
		js.executeScript("arguments[0].click();", caseorigin);
		email.click();
		// scroll to Subject field
		js.executeScript(
				"var result = document.evaluate(\"//label[text()='Case Origin']\", document.body, null, XPathResult.ANY_TYPE, null);var input = result.iterateNext();input.scrollIntoView();");
		casesubject.click();
		Thread.sleep(0, 3000);
		casesubject.sendKeys(sub);
		casedescription.click();
		casesavebtn.click();
		waitForElementToAppear(By.xpath("//a[text()='Details']"));
		Thread.sleep(0, 2000);
	}

}
