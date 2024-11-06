package commonutilities;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.google.gson.*;
import java.lang.reflect.Type;

public class BaseTest {
	public static WebDriver driver;
	public FileReader reader;
	public static FileReader reader1;
	public static Properties ppty;

	public static WebDriver intializeDriver() throws IOException {
		String browserName = "chrome";
		if (browserName.equalsIgnoreCase("chrome")) {
			ppty = commonutilities.CommonFunctions.getObjDetails();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			/*
			 * FirefoxOptions options = new FirefoxOptions(); options.
			 * setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"
			 * ); System.setProperty("webdriver.gecko.driver",
			 * "C:\\GekoDriver\\geckodriver.exe"); driver = new
			 * FirefoxDriver(options);
			 */

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}

		else if (browserName.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		return driver;
	}

	public WebDriver tearDownDriver() {
		driver.quit();
		return driver;

	}
}