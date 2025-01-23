package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class AssetListViews extends CommonFunctions {


	@FindBy(xpath = "//button[@title='Select a List View: Assets']")
	public WebElement btn_assetsListView;

	@FindBy(xpath = "//li//span[text()='All Active Assets']")
	public WebElement lstviewoption_allactivassets;
	
	@FindBy(xpath = "//li//span[text()='All Assets']")
	public WebElement lstviewoption_allassets;
	
	@FindBy(xpath = "//li//span[text()='My Assets']")
	public WebElement lstviewoption_myassets;
	
	@FindBy(xpath="(//*[@aria-label='All Active Assets']//tbody//a)[1]")
	WebElement firstasset;

	public AssetListViews() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}


	public void clickAssetsLisViewButton() throws InterruptedException {
		expWaitToBeClickable(btn_assetsListView);
		btn_assetsListView.click();
		Thread.sleep(4000);
	}

	public void clickAllActiveAssetsListView() throws InterruptedException {
		expWaitToBeClickable(lstviewoption_allactivassets);
		lstviewoption_allactivassets.click();
		Thread.sleep(4000);
	}
	
	public void VerifyAssetListViews() throws InterruptedException {
		expWaitToBeClickable(lstviewoption_allactivassets);
		lstviewoption_allactivassets.isDisplayed();
		lstviewoption_allassets.isDisplayed();
		lstviewoption_myassets.isDisplayed();
		Thread.sleep(4000);
	}
	
	public void SelectAsset() throws InterruptedException {
		expWaitToBeClickable(firstasset);
		firstasset.click();
		Thread.sleep(4000);
	}
	
	
}
