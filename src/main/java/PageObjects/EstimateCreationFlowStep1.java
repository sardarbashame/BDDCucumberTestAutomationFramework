package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

	@FindBy(xpath = "//*[text()='Inspection Estimate Matrix']/../..//button")
	WebElement drpDown_inspectionEstMatrix;
	
	@FindBy(xpath = "//*[text()='SPRAY Estimate Matrix']/../..//button")
	WebElement drpDown_sprayEstMatrix;

	@FindBy(xpath = "//a[text() = 'INSP']//parent::li")
	WebElement clk_INSP;
	
	@FindBy(xpath = "//a[text() = 'SPRAY']//parent::li")
	WebElement clk_SPRAY;

	@FindBy(xpath = "//span[text() = 'Quote Line Items created successfully.']")
	WebElement msg_quoteLineCreated;

	@FindBy(xpath = "(//button[text()='Save'])[2]")
	WebElement btn_save;

	@FindBy(xpath = "(//lst-related-list-quick-links-grid//a)[last()]")
	WebElement lnk_showALL;
	
	@FindBy(xpath = "//button[text() = 'Search...']")
	WebElement ipt_search;

	@FindBy(xpath = "(//slot[contains(text() , 'Quotes /')]//parent::span)[last()]")
	WebElement lnk_quotes;

	@FindBy(xpath = "//h1[text() = 'Quotes / Estimates']//ancestor::lst-list-view-manager-header//following-sibling::div//th//lightning-primitive-cell-factory//a")
	WebElement lnk_quoteCreated;

	@FindBy(xpath = "//li[contains(@class, 'is-active')]//a[text() = 'Details']")
	WebElement clk_detailsTab;

	By Wait_toastMessage = By.xpath("//span[text() = 'Quote Line Items created successfully.']");

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
		clk_estimateItems.click();
		;
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

	public void createEstimationINSP(String pricebook, String InspectionEstimateMatrix, String Estimateitem)
			throws InterruptedException {
		expWaitToBeClickable(clk_priceBook);
		clk_priceBook.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='" + pricebook + "']")).click();
		expWaitToBeClickable(drpDown_inspectionEstMatrix);
		drpDown_inspectionEstMatrix.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='" + InspectionEstimateMatrix + "']")).click();
		expWaitToBeClickable(clk_estimateItems);
		clk_estimateItems.click();
		driver.findElement(By.xpath("//span[text()='" + Estimateitem + "']")).click();
		Thread.sleep(3000);
		btn_next.click();
		Thread.sleep(0, 4000);
	}

	public void createEstimationSPRAY(String pricebook, String SPRAYEstimateMatrix, String Estimateitem)
			throws InterruptedException {
		expWaitToBeClickable(clk_priceBook);
		clk_priceBook.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='" + pricebook + "']")).click();
		expWaitToBeClickable(drpDown_sprayEstMatrix);
		drpDown_sprayEstMatrix.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='" + SPRAYEstimateMatrix + "']")).click();
		expWaitToBeClickable(clk_estimateItems);
		clk_estimateItems.click();
		driver.findElement(By.xpath("//span[text()='" + Estimateitem + "']")).click();
		Thread.sleep(3000);
		btn_next.click();
		Thread.sleep(0, 4000);
	}
	public void clickOnINSPTab() throws InterruptedException {
		expWaitToBeClickable(clk_INSP);
		clk_INSP.click();
		Thread.sleep(1000);
	}
	public void clickSPRAYTab() throws InterruptedException {
		expWaitToBeClickable(clk_SPRAY);
		clk_SPRAY.click();
		Thread.sleep(1000);
	}

	public void clickSaveButton() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(btn_save);
		btn_save.click();
		msg_quoteLineCreated.isDisplayed();
		waitForElementToAppear(Wait_toastMessage, 2);
	}

	public void clickShowAllQuickLink() throws InterruptedException {
		expWaitToBeClickable(lnk_showALL);
		Thread.sleep(2000);
		scrollIntoView(ipt_search);
		drawHighlight(ipt_search);
		drawHighlight(lnk_showALL);
		mouseHover(lnk_showALL);
		lnk_showALL.sendKeys(Keys.ENTER);
		//moveToEle(lnk_showALL);
	}

	public void verifyQuoteIsCreatedInDetailsPage() throws InterruptedException {
		expWaitToBeClickable(lnk_quotes);
		Thread.sleep(4000);
		drawHighlight(lnk_quotes);
		javascriptClick(lnk_quotes);
		Thread.sleep(4000);
		String str = lnk_quoteCreated.getText();
		System.out.println("Quote is created - " + str);
		javascriptClick(lnk_quoteCreated);
		Thread.sleep(2000);
		expWaitToBeClickable(clk_detailsTab);
		clk_detailsTab.isDisplayed();
		clk_detailsTab.click();
		Thread.sleep(2000);
	}
}
