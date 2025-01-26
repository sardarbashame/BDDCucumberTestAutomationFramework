package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AccountDetailsTab;
import PageObjects.AssetDetailsTab;
import PageObjects.AssetListViews;
import PageObjects.ContactDetailsTab;
import PageObjects.GlobalSearch;
import PageObjects.HomePage;
import PageObjects.Login;
import PageObjects.SelectApplication;
import commonutilities.BaseTest;
import commonutilities.CommonFunctions;

public class HAC1548RenameICSupplierfield extends CommonFunctions {
	AssetListViews assetListViews;
	AssetDetailsTab assetDetailsTab;

	
	@Then("HAC1548 verify the supplier field")
	public void HAC1548_verify_the_supplier_field() throws InterruptedException {
		assetDetailsTab = new AssetDetailsTab();
		assetDetailsTab.VerifySupplierField();
	}
	
	@Then("HAC1548 verify the Prod Order Info Section")
	public void HAC1548_verify_the_prod_order_info_section() throws InterruptedException {
		assetDetailsTab = new AssetDetailsTab();
		assetDetailsTab.VerifyProductionOrderInfoSection();
	}
	
	@Then("HAC1548 verify the PurchaseSale Info Section")
	public void HAC1548_verify_the_purchasesale_info_section() throws InterruptedException {
		assetDetailsTab = new AssetDetailsTab();
		assetDetailsTab.VerifyPurchaseSalesInfoSection();
	}
	
}
