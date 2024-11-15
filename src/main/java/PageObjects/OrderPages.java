package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import commonutilities.CommonFunctions;

public class OrderPages extends CommonFunctions {
	@FindBy(xpath = "//span[text() = 'Orders']//parent::a")
	public WebElement clk_ordertab;

	@FindBy(xpath = "//table[@aria-label= 'Recently Viewed']//a[contains(@title, '0')]")
	List<WebElement> lst_recentOrder;
	
	@FindBy(xpath = "(//span[text() = 'TLI Number'])[last()]")
    WebElement txt_TLINoLabel;
	
	@FindBy(xpath = "(//table[@aria-label= 'Recently Viewed'])[last()]//th//a[@title]")
	List<WebElement> lst_recentInQuiries;
	
	@FindBy(xpath = "//div[contains(@class, 'active ')]//a[text() = 'Related']")
    WebElement tab_related;
	
	@FindBy(xpath = "((//div[contains(@class, 'active ')]//span[text() = 'Order Products'])//ancestor::lst-list-view-manager-header//following-sibling::div)[last()]//table//th//span//div//a[@title]")
	List<WebElement> lst_orderProduct;
	
	By orderTabAppear = By.xpath("//span[text() = 'Orders']//parent::a");
	By inquiriesTabAppear = By.xpath("//span[text() = 'Recently Viewed | Inquiries']//parent::a");
	
	public OrderPages() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	public void clkordersTab() throws InterruptedException {
		waitForElementToAppear(orderTabAppear, 30);
		javascriptClick(clk_ordertab);
		Thread.sleep(4000);
	}
	
	public void clkRecentOrder() throws InterruptedException {
		waitForElementToAppear(orderTabAppear, 30);
		javascriptClick(lst_recentOrder.get(0));
		Thread.sleep(4000);
		scrollIntoView(txt_TLINoLabel);
		drawHighlight(txt_TLINoLabel);
		Assert.assertTrue(txt_TLINoLabel.isDisplayed(), "TLI Number is not displayed under Order Details tab");		
	}
	public void clkrelatedTab() throws InterruptedException {
		expWaitToBeClickable(tab_related);
		javascriptClick(tab_related);
		Thread.sleep(4000);
	}
	public void clkOrderProduct() throws InterruptedException {
		waitForElementToAppear(orderTabAppear, 30);
		javascriptClick(lst_orderProduct.get(0));
		Thread.sleep(4000);
		scrollIntoView(txt_TLINoLabel);
		drawHighlight(txt_TLINoLabel);
		Assert.assertTrue(txt_TLINoLabel.isDisplayed(), "TLI Number is not displayed under Order Product Details tab");
	}
	
}
