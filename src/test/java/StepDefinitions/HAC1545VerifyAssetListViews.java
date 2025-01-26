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

public class HAC1545VerifyAssetListViews extends CommonFunctions {
	HomePage homepage;
	AssetListViews assetListViews;
	
	@Then("HAC1545 verify assets list views")
	public void HAC1545_verify_assets_list_views() throws InterruptedException {
		assetListViews = new AssetListViews();
		assetListViews.clickAssetsLisViewButton();
		assetListViews.VerifyAssetListViews();
	}
	
	
}
