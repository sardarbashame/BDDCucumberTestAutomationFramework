package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class SelectApplication extends CommonFunctions {

	@FindBy(xpath = "//span[text()='App Launcher']/..")
	WebElement clk_AppLauncher;

	@FindBy(xpath = "//input[@placeholder='Search apps and items...' or @placeholder='Search apps or items...']")
	WebElement ipt_SearchAppsAndItems;

	public SelectApplication() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	public void selectApp(String appname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		clk_AppLauncher.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		ipt_SearchAppsAndItems.sendKeys(appname);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//p[.//*[text()='" + appname + "']]")).click();
		Thread.sleep(12000);
		zoomOut(2);
	}
}
