package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import commonutilities.CommonFunctions;

public class WorkOrderRelatedListQuickLinks extends CommonFunctions {

	By waitforelementtodisappear;
	By waitforelementtoappear;
	String actualmessage;
	JavascriptExecutor js;
		
	public WorkOrderRelatedListQuickLinks() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	@FindBy(xpath = "//ul//li//span[@title='Service Appointments']")
	WebElement lnk_serviceappointments;
	
	@FindBy(xpath = "//ul//li//span[@title='Work Steps']")
	WebElement lnk_worksteps;

	public void ScrollPageToTop() throws InterruptedException {
		Thread.sleep(4000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(5000);
	}

	public void clickServiceAppointmentsLink() throws InterruptedException {
		Thread.sleep(6000);
	//	expWaitToBeClickable(lnk_serviceappointments);
//		js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", lnk_serviceappointments);
		lnk_serviceappointments.click();
		Thread.sleep(6000);
	}
	
	public void clickWorkStepsLink() throws InterruptedException {
		Thread.sleep(6000);
		lnk_worksteps.click();
		Thread.sleep(6000);
	}


}
