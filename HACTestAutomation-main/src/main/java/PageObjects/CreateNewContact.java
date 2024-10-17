//this class is unused
package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class CreateNewContact extends CommonFunctions{


	public CreateNewContact() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}
	@FindBy(xpath = "//ul[@class='slds-global-actions']//a[.//span[text()='Global Actions']]")
	WebElement globalactions;

	@FindBy(xpath = "//ul[@class='slds-global-actions']//a[@title='New Contact']")
	WebElement newtaskclick;

	@FindBy(xpath = "//label//span[text()='First Name']/../..//input")
	WebElement ipt_firstName;

	@FindBy(xpath = "//label//span[text()='Last Name']/../..//input")
	WebElement ipt_lastName;

	@FindBy(xpath = "//label//span[text()='Email']/../..//input")
	WebElement ipt_email;

	@FindBy(xpath = "(//span[text()='Save'])[last()]")
	WebElement btn_save;

	@FindBy(xpath = "//span[contains(@class,'toastMessage')]//a//div")
	WebElement msg_toastMsg;

	public void createNewContact(String contactfirstname, String contactlastname, String email)
			throws InterruptedException {
		expWaitToBeClickable(globalactions);
		globalactions.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		newtaskclick.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		ipt_firstName.sendKeys(contactfirstname);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		ipt_lastName.sendKeys(contactlastname);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		ipt_email.sendKeys(email);
		expWaitToBeClickable(btn_save);
		btn_save.click();
		expWaitToBeClickable(msg_toastMsg);
		msg_toastMsg.click();
	}
}
