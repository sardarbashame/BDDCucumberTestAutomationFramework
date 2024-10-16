package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import commonutilities.ReusableUtility;

public class EstimateCreationFlowStep1 extends ReusableUtility {

	WebDriver driver;
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
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement webele;

	public EstimateCreationFlowStep1(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickEstimatesTab() throws InterruptedException {
		Thread.sleep(0, 2000);
		driver.findElement(By.xpath("//li//a[text()='Estimations']")).click();
		Thread.sleep(4000);
	}

	public void estimateFlowStep1(String pricebook, String estimatematrix, String estimatematrixoption,
			String estimateitem) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//*[text()='Price Book']/../..//button")).click();
		driver.findElement(By.xpath("//span[text()='" + pricebook + "']")).click();
		driver.findElement(By.xpath("//*[text()='" + estimatematrix + "']/../..//button")).click();
		driver.findElement(By.xpath("//span[text()='" + estimatematrixoption + "']")).click();
		driver.findElement(By.xpath("//*[text()='Estimate Items']/../..//button")).click();
		driver.findElement(By.xpath("//span[text()='" + estimateitem + "']")).click();
		driver.findElement(By.xpath("//button[text()='Next']")).click();
	}
	
	
	public boolean verifyPriceBookOption1() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//*[text()='Price Book']/../..//button")).click();
		pricebookoption1 =	driver.findElement(By.xpath("//span[text()='CANADA Domestic Market Rate']")).isDisplayed();
		return pricebookoption1;
		
	}
	public boolean verifyPriceBookOption2() throws InterruptedException {
		pricebookoption2 =	driver.findElement(By.xpath("//span[text()='CANADA Domestic MPA-PEPSICO (FRITOLAY)']")).isDisplayed();
		return pricebookoption2;
		
	}
	
	
	public boolean verifyPriceBookOption3() throws InterruptedException {
		pricebookoption3 =	driver.findElement(By.xpath("//span[text()='USA Domestic Market Rate']")).isDisplayed();
		return pricebookoption3;
		
	}
		
	public boolean verifyPriceBookOption4() throws InterruptedException {
		pricebookoption4 =	driver.findElement(By.xpath("//span[text()='USA Domestic Market Rate PRE-PAY / COD']")).isDisplayed();
		return pricebookoption4;
		
	}
	
	public boolean verifyPriceBookOption5() throws InterruptedException {
		pricebookoption5 =	driver.findElement(By.xpath("//span[text()='USA Domestic MPA-PEPSICO (FritoLay)']")).isDisplayed();
		Thread.sleep(0, 3000);
		return pricebookoption5;
		
	}
	
	public boolean verifyPriceBookOption6() throws InterruptedException {
		pricebookoption6 =	driver.findElement(By.xpath("//span[text()='USA International Market Rate']")).isDisplayed();
		return pricebookoption6;
		
	}
	
	public boolean verifyPriceBookOption7() throws InterruptedException {
		pricebookoption7 =	driver.findElement(By.xpath("//span[text()='USA International MPA-PEPSICO (FRITOLAY)']")).isDisplayed();
		driver.findElement(By.xpath("//*[text()='Price Book']/../..//button")).click();
		return pricebookoption7;
		
	}

}
