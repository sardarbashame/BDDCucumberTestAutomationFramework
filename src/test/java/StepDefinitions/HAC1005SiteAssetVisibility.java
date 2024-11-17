package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import javax.annotation.processing.Completions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AccountDetailsTab;
import PageObjects.CaseDetailsTab;
import PageObjects.EstimateCreationFlowStep1;
import PageObjects.EstimateCreationFlowStep2;
import PageObjects.EstimateCreationFlowStep3;
import PageObjects.FieldServiceConsole;
import PageObjects.GlobalSearch;
import PageObjects.HomePage;
import PageObjects.Login;
import PageObjects.SelectApplication;
import commonutilities.BaseTest;
import commonutilities.CommonFunctions;

public class HAC1005SiteAssetVisibility extends CommonFunctions {
	Login loginPO;
	HomePage homePage;
	CaseDetailsTab caseDetailsTab;
	SelectApplication selectApplication;
	FieldServiceConsole fieldserviceconsole;

	@Given("^HAC1005 user enters (.*) and (.*)$")
	public void HAC1005_user_enters_username_and_password(String userName, String password) throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(userName, password);
	}

	@When("HAC1005 select the applicaton")
	public void HAC1005_select_the_application() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp("Field Service");
	}

	@When("HAC1005 close all the open tabs")
	public void HAC1005_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC1005 close the bottom bar")
	public void HAC387_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}
	
	@When("HAC1005 click on field service tab")
	public void HAC1005_click_on_field_service_tab() throws InterruptedException {
		homePage = new HomePage();
		homePage.ClickFieldServiceTab();
	}
	
	@When("HAC1005 select usa packaging policy")
	public void HAC1005_select_usa_packaging_policy() throws InterruptedException {
		fieldserviceconsole = new FieldServiceConsole();
		fieldserviceconsole.SelectPolicy("USA - Packaging");
	}
	
	@When("HAC1005 select service appointment filter")
	public void HAC1005_select_sa_type() throws InterruptedException {
		fieldserviceconsole = new FieldServiceConsole();
		fieldserviceconsole.SelectSAFilter("In Jeopardy");
	}
	
	@When("HAC1005 select service appointment")
	public void HAC1005_select_service_appointment() throws InterruptedException {
		fieldserviceconsole = new FieldServiceConsole();
		fieldserviceconsole.SelectSAFromFieldServiceConsole();
	}

	@When("HAC1005 click edit button from service appointment")
	public void HAC1005_click_edit_button_from_service_appointment() throws InterruptedException {
		fieldserviceconsole = new FieldServiceConsole();
		fieldserviceconsole.EditSAFromFieldServiceConsole();
	}
	
	@When("HAC1005 click related tab on service appointment")
	public void HAC1005_click_related_tab_on_service_appointment() throws InterruptedException {
		fieldserviceconsole = new FieldServiceConsole();
		fieldserviceconsole.ClickSARelatedTab();
	}
	
	@When("HAC1005 verify the assets on service appointment")
	public void HAC1005_verify_the_assets_on_service_appointment() throws InterruptedException {
		fieldserviceconsole = new FieldServiceConsole();
		fieldserviceconsole.VerifyAssetOnSARelatedTab();
	}
	
}
