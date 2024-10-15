package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class HomePage extends CommonFunctions {

	By waitforelementtodisappear;
	By waitforelementtoappear;
	String actualmessage;
	WebElement webele;
	WebElement caseorigin;

	public HomePage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}


	@FindBy(xpath = "//a[@title='Cases']")
	WebElement clk_cases;

	@FindBy(xpath = "//a//div[text()='New']")
	WebElement clk_casesNew;

	@FindBy(xpath = "//*[@field-label='Contact Name']//input")
	WebElement ipt_contactName;

	@FindBy(xpath = "//span[@title='Billing']")
	WebElement clk_billing;

	@FindBy(xpath = "//span[@title='Billing Dispute']")
	WebElement clk_billingDispute;

	@FindBy(xpath = "//button[@title='Move to Chosen']")
	WebElement clk_movenTOChosen;

	@FindBy(xpath = "(//button[@aria-label='Case Origin'])")
	WebElement clk_caseOrigin;

	@FindBy(xpath = "//span[@title='Email']")
	WebElement ipt_email;

	@FindBy(xpath = "//label[text()='Subject']/../..//input")
	WebElement clk_subjects;

	@FindBy(xpath = "//label[text()='Description']")
	WebElement clk_description;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement btn_save;

	@FindBy(xpath = "//a[text()='Details']")
	WebElement clk_details;

	@FindBy(xpath = "//*[@field-label='Type']//button[@aria-label='Type']")
	WebElement ipt_type;

	public void clickCasesTab() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(0, 4000);
		waitForElementToAppear(By.xpath("//a[@title='Cases']"),30);
		Thread.sleep(0, 3000);
		js.executeScript("arguments[0].click();", clk_cases);
		Thread.sleep(0, 3000);
	}

	public void createNewCase(String contname, String firstname, String sub) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(0, 4000);
		waitForElementToAppear(By.xpath("//a//div[text()='New']"),30);
		expWaitToBeClickable(clk_casesNew);
		clk_casesNew.click();
		expWaitToBeClickable(ipt_contactName);
		ipt_contactName.click();
		expWaitToBeClickable(ipt_contactName);
		ipt_contactName.sendKeys(contname);
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//ul//li//*[text()='" + firstname + "']")).click();
		Thread.sleep(0, 3000);
		// scroll to Type field
		js.executeScript(
				"var result = document.evaluate(\"//label[text()='Sales Order']\", document.body, null, XPathResult.ANY_TYPE, null);var input = result.iterateNext();input.scrollIntoView();");
		expWaitToBeClickable(ipt_type);

		ipt_type.click();
		Thread.sleep(0, 3000);
		clk_billing.click();
		expWaitToBeClickable(clk_billingDispute);

		clk_billingDispute.click();
		expWaitToBeClickable(clk_movenTOChosen);
		clk_movenTOChosen.click();
		Thread.sleep(0, 3000);

		js.executeScript("arguments[0].click();", clk_caseOrigin);

		expWaitToBeClickable(ipt_email);
		ipt_email.click();
		Thread.sleep(0, 4000);

		// scroll to Subject field
		js.executeScript(
				"var result = document.evaluate(\"//label[text()='Case Origin']\", document.body, null, XPathResult.ANY_TYPE, null);var input = result.iterateNext();input.scrollIntoView();");
		expWaitToBeClickable(clk_subjects);
		clk_subjects.click();
		Thread.sleep(0, 3000);
		clk_subjects.sendKeys(sub);

		clk_description.click();
		expWaitToBeClickable(btn_save);

		btn_save.click();
		Thread.sleep(0, 5000);
		waitForElementToAppear(By.xpath("//a[text()='Details']"),30);
		Thread.sleep(0, 2000);
	}

}
