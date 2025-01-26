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

public class HAC1550AssetAccountParticipantObject extends CommonFunctions {

	AssetDetailsTab assetDetailsTab = new AssetDetailsTab();
	
	@When("HAC1550 click new button from the asset account participant related list")
	public void HAC1550_click_new_button_from_asset_account_participant_related_list() throws InterruptedException {
		assetDetailsTab.ClickAssetRelatedTab();
		
	}
	
	@Then("HAC1550 verify the orgin picklist options")
	public void HAC1550_verify_the_origin_picklist_options() throws InterruptedException {
		assetDetailsTab.ClickAssetRelatedTab();
		assetDetailsTab.CreateNewAssetAccountParticipant();
		assetDetailsTab.VerifyOriginOnAssetAccountParticipant();
		
	}
	
	
}
