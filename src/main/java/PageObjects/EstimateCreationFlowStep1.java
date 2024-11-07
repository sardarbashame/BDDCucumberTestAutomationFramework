package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;


public class EstimateCreationFlowStep1 extends CommonFunctions {

	By waitforelementtodisappear;
	By waitforelementtoappear;
	String actualmessage;
	boolean pricebookoption1;
	boolean pricebookoption2;
	boolean pricebookoption3;
	boolean pricebookoption4;
	boolean pricebookoption5;
	boolean pricebookoption6;
	boolean pricebookoption7;

	public EstimateCreationFlowStep1() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	@FindBy(xpath = "//li//a[text()='Estimations']")
	WebElement clk_estimations;

	@FindBy(xpath = "//*[text()='Price Book']/../..//button")
	WebElement clk_priceBook;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement btn_next;

	@FindBy(xpath = "//*[text()='Estimate Items']/../..//button")
	WebElement clk_estimateItems;

	@FindBy(xpath = "//span[text()='CANADA Domestic Market Rate']")
	WebElement txt_candaMarketRate;

	@FindBy(xpath = "//span[text()='CANADA Domestic MPA-PEPSICO (FRITOLAY)']")
	WebElement txt_candaPepsico;

	@FindBy(xpath = "//span[text()='USA Domestic Market Rate']")
	WebElement txt_usMarketRate;

	@FindBy(xpath = "//span[text()='USA Domestic Market Rate PRE-PAY / COD']")
	WebElement txt_usMarketRatePrepay;

	@FindBy(xpath = "//span[text()='USA Domestic MPA-PEPSICO (FritoLay)']")
	WebElement txt_usMarketRatePepsico;

	@FindBy(xpath = "//span[text()='USA International Market Rate']")
	WebElement txt_usInterNationalMarketRatePrepay;

	@FindBy(xpath = "//span[text()='USA International MPA-PEPSICO (FRITOLAY)']")
	WebElement txt_usInterNationalPepsico;

	public void clickEstimatesTab() throws InterruptedException {
		expWaitToBeClickable(clk_estimations);
		clk_estimations.click();
		Thread.sleep(0, 2000);
		driver.findElement(By.xpath("//li//a[text()='Estimations']")).click();
		Thread.sleep(4000);
	}

	public void estimateFlowStep1(String pricebook, String estimatematrix, String estimatematrixoption,
			String estimateitem) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		expWaitToBeClickable(clk_priceBook);
		clk_priceBook.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='" + pricebook + "']")).click();
		driver.findElement(By.xpath("//*[text()='" + estimatematrix + "']/../..//button")).click();
		driver.findElement(By.xpath("//span[text()='" + estimatematrixoption + "']")).click();
		expWaitToBeClickable(clk_estimateItems);
		clk_estimateItems.click();;
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='" + estimateitem + "']")).click();
		Thread.sleep(3000);
		btn_next.click();
		Thread.sleep(0, 4000);
		}

	public boolean verifyPriceBookOption1() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		expWaitToBeClickable(clk_priceBook);
		clk_priceBook.click();
		Thread.sleep(1000);
		pricebookoption1 = txt_candaMarketRate.isDisplayed();
		return pricebookoption1;
		
	}

	public boolean verifyPriceBookOption2() throws InterruptedException {
		Thread.sleep(1000);
		return pricebookoption2 = txt_candaPepsico.isDisplayed();
	}

	public boolean verifyPriceBookOption3() throws InterruptedException {
		Thread.sleep(1000);
		pricebookoption3 = txt_usMarketRate.isDisplayed();
		return pricebookoption3;

	}

	public boolean verifyPriceBookOption4() throws InterruptedException {
		Thread.sleep(1000);
		return pricebookoption4 = txt_usMarketRatePrepay.isDisplayed();

	}

	public boolean verifyPriceBookOption5() throws InterruptedException {
		Thread.sleep(1000);
		pricebookoption5 = txt_usMarketRatePepsico.isDisplayed();
		return pricebookoption5;

	}

	public boolean verifyPriceBookOption6() throws InterruptedException {
		Thread.sleep(1000);
		pricebookoption6 = txt_usInterNationalMarketRatePrepay.isDisplayed();
		return pricebookoption6;

	}

	public boolean verifyPriceBookOption7() throws InterruptedException {
		Thread.sleep(1000);
		pricebookoption7 = txt_usInterNationalPepsico.isDisplayed();
		clk_priceBook.click();
		return pricebookoption7;
	}

}
