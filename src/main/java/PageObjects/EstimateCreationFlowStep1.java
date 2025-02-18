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
	JavascriptExecutor	js = (JavascriptExecutor) driver;
	@FindBy(xpath="//button[@name='productFamily']")
	WebElement clk_productfamily;
	
	@FindBy(xpath="//button[@name='productCategory']")
	WebElement clk_productcategory;
	
	@FindBy(xpath="//button[@aria-label='Purpose']")
	WebElement clk_purpose;

	@FindBy(xpath="//*[text()='Processing Estimate Matrix']/../..//button")
	WebElement dropdownclick_processingestimatematrix;
	
	@FindBy(xpath="//*[text()='RAW Estimate Matrix']/../..//button")
	WebElement dropdownclick_rawestimatematrix;
	
	@FindBy(xpath="//*[text()='Packaging Estimate Matrix']/../..//button")
	WebElement dropdownclick_packagingstimatematrix;
	
	@FindBy(xpath="//*[text()='Inspection Estimate Matrix']/../..//button")
	WebElement dropdownclick_inspectionestimatematrix;
	
	@FindBy(xpath="//*[text()='SPRAY Estimate Matrix']/../..//button")
	WebElement dropdownclick_sprayestimatematrix;
	
	@FindBy(xpath = "//li//a[text()='Estimations']")
	WebElement clk_estimations;

	@FindBy(xpath = "//span[text()='Select Pricebook...']")
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
	
	@FindBy(xpath = "//a[text() = 'PKG']//parent::li")
	WebElement clk_PKG;

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


	public EstimateCreationFlowStep1() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	
	public void clickEstimatesTab() throws InterruptedException {
		expWaitToBeClickable(clk_estimations);
		clk_estimations.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li//a[text()='Estimations']")).click();
		Thread.sleep(4000);
	}

	public void estimateFlowStep1(String pricebook,String productfamily, String productcategory,
			String purpose) throws InterruptedException {
		expWaitToBeClickable(clk_priceBook);
		clk_priceBook.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='" + pricebook + "']")).click();
		
		clk_productfamily.click();
		driver.findElement(By.xpath("//span[text()='" + productfamily + "']")).click();
		
		clk_productcategory.click();
		driver.findElement(By.xpath("//span[text()='" + productcategory + "']")).click();
		
		expWaitToBeClickable(clk_purpose);
		clk_purpose.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='" + purpose + "']")).click();
		Thread.sleep(3000);
	}
	
	public void RAWestimateFlowStep1(String pricebook,String productfamily, String productcategory,
			String purpose) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		expWaitToBeClickable(clk_priceBook);
		clk_priceBook.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='" + pricebook + "']")).click();
		
		clk_productfamily.click();
		driver.findElement(By.xpath("//span[text()='" + productfamily + "']")).click();
		
		expWaitToBeClickable(clk_productcategory);
		clk_productcategory.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='" + productcategory + "']")).click();
		
		expWaitToBeClickable(clk_purpose);
		clk_purpose.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='" + purpose + "']")).click();
		Thread.sleep(3000);
	}
	
	public void PKGEstimateFlowStep1(String pricebook, String estimatematrixoption,
			String estimateitem) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		expWaitToBeClickable(clk_priceBook);
		clk_priceBook.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='" + pricebook + "']")).click();
		dropdownclick_packagingstimatematrix.click();
		driver.findElement(By.xpath("//span[text()='" + estimatematrixoption + "']")).click();
		expWaitToBeClickable(clk_estimateItems);
		clk_estimateItems.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='" + estimateitem + "']")).click();
		Thread.sleep(3000);
		btn_next.click();
		Thread.sleep(0, 4000);
	}
	
	public void PROCINSPEstimateFlowStep1(String pricebook, String productfamily1, String productfamily2, String processingestimatematrixoption, String inspectionestimatematrixoption,
			String purpose) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		expWaitToBeClickable(clk_priceBook);
		clk_priceBook.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='" + pricebook + "']")).click();
		clk_productfamily.click();
		driver.findElement(By.xpath("//span[text()='" + productfamily1 + "']")).click();
		clk_productfamily.click();
		driver.findElement(By.xpath("//span[text()='" + productfamily2 + "']")).click();
		clk_productcategory.click();
		driver.findElement(By.xpath("//span[text()='" + processingestimatematrixoption + "']")).click();
		Thread.sleep(2000);
		clk_productcategory.click();
		WebElement productcategory2 = driver.findElement(By.xpath("//span[text()='" + inspectionestimatematrixoption + "']"));
		javascriptClick(productcategory2);
		expWaitToBeClickable(clk_purpose);
		clk_purpose.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='" + purpose + "']")).click();
		Thread.sleep(3000);
	}
	
	public void PROCPKGEstimateFlowStep1(String pricebook, String productfamily1, String productfamily2, String processingestimatematrixoption, String packagingestimatematrixoption,
			String purpose) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		expWaitToBeClickable(clk_priceBook);
		clk_priceBook.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='" + pricebook + "']")).click();
		clk_productfamily.click();
		driver.findElement(By.xpath("//span[text()='" + productfamily1 + "']")).click();
		clk_productfamily.click();
		driver.findElement(By.xpath("//span[text()='" + productfamily2 + "']")).click();
		clk_productcategory.click();
		driver.findElement(By.xpath("//span[text()='" + processingestimatematrixoption + "']")).click();
		Thread.sleep(2000);
		clk_productcategory.click();
		WebElement productcategory2 = driver.findElement(By.xpath("//span[text()='" + packagingestimatematrixoption + "']"));
		javascriptClick(productcategory2);
		expWaitToBeClickable(clk_purpose);
		clk_purpose.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='" + purpose + "']")).click();
		Thread.sleep(3000);
	}
	
	public void PROCSPRAYEstimateFlowStep1(String pricebook, String processingestimatematrixoption, String sprayestimatematrixoption,
			String estimateitem) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		expWaitToBeClickable(clk_priceBook);
		clk_priceBook.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='" + pricebook + "']")).click();
		dropdownclick_processingestimatematrix.click();
		driver.findElement(By.xpath("//span[text()='" + processingestimatematrixoption + "']")).click();
		dropdownclick_sprayestimatematrix.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='" + sprayestimatematrixoption + "']")).click();
		expWaitToBeClickable(clk_estimateItems);
		clk_estimateItems.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='" + estimateitem + "']")).click();
		Thread.sleep(3000);
		btn_next.click();
		Thread.sleep(0, 4000);
	}

	public void VerifyPriceBookOptions() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		expWaitToBeClickable(clk_priceBook);
		clk_priceBook.click();
		Thread.sleep(2000);
		txt_candaMarketRate.isDisplayed();
		txt_candaPepsico.isDisplayed();
		txt_usMarketRate.isDisplayed();
		txt_usMarketRatePrepay.isDisplayed();
		txt_usMarketRatePepsico.isDisplayed();
		txt_usInterNationalMarketRatePrepay.isDisplayed();
		txt_usInterNationalPepsico.isDisplayed();
		clk_priceBook.click();
		Thread.sleep(2000);
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

	public void clickPKGTab() throws InterruptedException {
		expWaitToBeClickable(clk_PKG);
		clk_PKG.click();
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
