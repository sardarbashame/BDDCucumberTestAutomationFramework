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

public class HAC1546AssetCompactLayout extends CommonFunctions {
	HomePage homepage;
	AssetListViews assetListViews;
	AssetDetailsTab assetDetailsTab;

	
	@When("HAC1546 select assets tab")
	public void HAC1546_select_assets_tab() throws InterruptedException {
		homepage = new HomePage();
		homepage.clickAssetsTab();
	}
	
	@When("HAC1546 select all active assets list view")
	public void HAC1546_select_all_active_assets_list_view() throws InterruptedException {
		assetListViews = new AssetListViews();
		assetListViews.clickAssetsLisViewButton();
		assetListViews.clickAllActiveAssetsListView();
	}
	
	@When("HAC1546 select a asset")
	public void HAC1546_select_a_asset() throws InterruptedException {
		assetListViews = new AssetListViews();
		assetListViews.SelectAsset();
	}
	
	@Then("HAC1546 verify the compact layout fields")
	public void HAC1546_verify_the_compact_layout_fields() throws InterruptedException {
		assetDetailsTab = new AssetDetailsTab();
		assetDetailsTab.VerifyAsetCompactLayoutFields();
	}
	
	
}
