package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
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
import org.testng.annotations.Test;
import com.google.gson.*;

import java.lang.reflect.Type;
import PageObjects.Login;
import PageObjects.SelectApplication;
import commonutilities.BaseTest;
import commonutilities.CommonFunctions;

public class hooksclass extends CommonFunctions{
	Login loginPO;
	SelectApplication selectApplication;

@Before(order=1)
public void setUp() throws IOException 
{
	intializeDriver(); 
	actionInit();
	webDriverWaitInit();
	javascriptInit();
}
	
@After()
public void tearDown() throws IOException 
{
	tearDownDriver();
}

}
