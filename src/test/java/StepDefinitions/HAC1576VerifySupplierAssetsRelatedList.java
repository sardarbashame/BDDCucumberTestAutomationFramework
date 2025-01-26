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
import PageObjects.ContactDetailsTab;
import PageObjects.GlobalSearch;
import PageObjects.HomePage;
import PageObjects.Inquiries;
import PageObjects.Login;
import PageObjects.SelectApplication;
import commonutilities.BaseTest;
import commonutilities.CommonFunctions;

public class HAC1576VerifySupplierAssetsRelatedList extends CommonFunctions {
	AccountDetailsTab accountDetailsTab = new AccountDetailsTab();

	@Then("HAC1576 verify supplier assets related list")
	public void HAC_1576_verify_supplier_assets_related_list() throws Exception 	{	
		accountDetailsTab.ClickAccountRelatedTab();
		accountDetailsTab.VerifySupplierAssetsRelatedList();
	}
	
	
}
