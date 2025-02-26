package PageObjects;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import commonutilities.CommonFunctions;

public class AssetDetailsTab extends CommonFunctions {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@FindBy(xpath="//*[@name='header']//*[text()='Account']")
	WebElement headerfield_account;
	
	@FindBy(xpath="//*[@name='header']//*[text()='Serial Number']")
	WebElement headerfield_serialnumber;
	
	@FindBy(xpath="//*[@name='header']//*[text()='Status']")
	WebElement headerfield_status;
	
	@FindBy(xpath="//*[@name='header']//*[text()='SAP Sales Order']")
	WebElement headerfield_sapsalesorder;
	
	@FindBy(xpath="(//*[text()='Inquiry'])[last()]")
	WebElement headerfield_inquiry;
	
	@FindBy(xpath="//*[text()='Supplier']")
	WebElement label_supplier;
	
	@FindBy(xpath="//*[@title='Production Order Info']")
	WebElement heading_prodorderinfo;
	
	@FindBy(xpath="//*[@title='Supplier Purchase/Sales Info']")
	WebElement heading_purchasesalesinfo;
	
	@FindBy(xpath="//a[text()='Related Records']")
	WebElement tab_assetrelatedtab;
	
	@FindBy(xpath="//*[@aria-label='Asset Account Participants']//*[text()='New']")
	WebElement btn_newassetaccountparticipant;
	
	@FindBy(xpath="//button[@aria-label='Origin']")
	WebElement clk_origin;
	
	@FindBy(xpath="//*[text()='Information']")
	WebElement clk_focus;
	
	@FindBy(xpath="//span[text()='SAP']")
	WebElement option_sap;
	
	@FindBy(xpath="//span[text()='Non-SAP']")
	WebElement option_nonsap;
	
	@FindBy(xpath="//span[text()='OEM']")
	WebElement option_oem;
	
	@FindBy(xpath="//span[text()='Aftermarket']")
	WebElement option_aftermarket;

	public AssetDetailsTab() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	public void ClickAssetRelatedTab() throws InterruptedException {
		Thread.sleep(4000);
		tab_assetrelatedtab.click();
		Thread.sleep(4000);
	}
	
	public void CreateNewAssetAccountParticipant() throws InterruptedException {
		Thread.sleep(4000);
		btn_newassetaccountparticipant.click();
		Thread.sleep(4000);
		}
	
	public void VerifyOriginOnAssetAccountParticipant() throws InterruptedException {
		Thread.sleep(4000);
		clk_focus.click();
		Thread.sleep(2000);
		clk_origin.click();
		Thread.sleep(2000);
		option_sap.isDisplayed();
		option_nonsap.isDisplayed();
		option_oem.isDisplayed();
		option_aftermarket.isDisplayed();
		Thread.sleep(4000);
	}
	
	public void VerifyAsetCompactLayoutFields() throws InterruptedException {
		Thread.sleep(2000);
		headerfield_account.isDisplayed();
		headerfield_serialnumber.isDisplayed();
		headerfield_status.isDisplayed();
		headerfield_sapsalesorder.isDisplayed();
		headerfield_inquiry.isDisplayed();
		Thread.sleep(2000);
		
	}
	
	public void VerifySupplierField() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,2000)");
		label_supplier.isDisplayed();
		Thread.sleep(2000);
		
	}
	
	public void VerifyProductionOrderInfoSection() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,1000)");
		heading_prodorderinfo.isDisplayed();
		Thread.sleep(2000);
		
	}
	
	public void VerifyPurchaseSalesInfoSection() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,2000)");
		heading_purchasesalesinfo.isDisplayed();
		Thread.sleep(2000);
		
	}

}
