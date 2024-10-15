package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class CaseDetailsTab extends CommonFunctions {

	String actualmessage;

	public CaseDetailsTab() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	@FindBy(xpath = "//span[text()='Edit Status']/..")
	public WebElement clk_editStatus;
	
	@FindBy(xpath = "//button[@aria-label='Status']")
	public WebElement btn_status;
	
	@FindBy(xpath = "//span[@title='Escalated']")
	public WebElement clk_escalated;
	
	@FindBy(xpath = "//button[@name='SaveEdit']")
	public WebElement clk_SaveEdit;
	
	@FindBy(xpath = "//*[text()='This case has been closed for more than 14 days.  Please open a new case and link the two if desired']")
	public WebElement get_caseClosedMsg;
	
	public void editCaseStatus() throws InterruptedException {
		Thread.sleep(0, 2000);
		Thread.sleep(0, 2000);
		clk_editStatus.click();
		Thread.sleep(2000);
	}

	public void updateCaseStatusNew() throws InterruptedException {
		Thread.sleep(0, 2000);
		Thread.sleep(0, 2000);
		btn_status.click();
		Thread.sleep(2000);
		clk_escalated.click();
		Thread.sleep(2000);
	}

	public void clickSaveButton() throws InterruptedException {
		Thread.sleep(0, 2000);
		Thread.sleep(0, 2000);
		clk_SaveEdit.click();
		Thread.sleep(2000);
	}

	public String getValidationMessage() throws InterruptedException {
		Thread.sleep(0, 1000);
		actualmessage = get_caseClosedMsg.getText();
		Thread.sleep(1000);
		return actualmessage;
	}

}
