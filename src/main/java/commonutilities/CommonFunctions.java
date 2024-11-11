package commonutilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions extends BaseTest {
	public static WebDriverWait drvwait;
	public static int TimeOutValue = 40;
	public static JavascriptExecutor js;
	public static Actions actions;
	public static FileReader reader;
	public static ClassLoader basedir;


	public By waitForElementToAppear(By by, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return by;
	}

	public By waitForElementToDisAppear(By webele, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(webele));
		return webele;
	}

	public static void webDriverWaitInit() {
		drvwait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	public static void elementToBeClickable(String str, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(str)));
	}

	public static void expWaitToBeClickable(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeOutValue));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public static void elementToBePresent(By path, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeOutValue));
		wait.until(ExpectedConditions.presenceOfElementLocated(path));

	}

	public static void expWaitInvisibilityOf(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeOutValue));
		wait.until(ExpectedConditions.invisibilityOf(ele));

	}
	public static void moveToEle(WebElement to) {
		actions.moveToElement(to).click();
		buildPerform();
	}
	public static void buildPerform() {
		actions.build().perform();
	}
	public static void mouseHover(WebElement ele) {
		actions.moveToElement(ele).perform();
	}
	public static void drawHighlight(WebElement element) {
		js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}

	public static void javascriptClick(WebElement ele) {
		js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", ele);
	}

	public static void scrollIntoView(WebElement ele) {
		js = ((JavascriptExecutor) driver);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);
	}

	public static void javascriptInit() {
		js = ((JavascriptExecutor) driver);
	}

	public static void actionInit() {
		actions = new Actions(driver);
	}

	/*public static void moveToEle(WebElement to) {
		Actions actions = new Actions(driver);
		actions.moveToElement(to).click().keyDown(to, Keys.SHIFT).sendKeys(to, "W");
		actions.build().perform();
	}*/

	

	public void TypeInField(WebElement element, String value) {
		String val = value;
		element.clear();

		for (int i = 0; i < val.length(); i++) {
			char c = val.charAt(i);
			String s = new StringBuilder().append(c).toString();
			element.sendKeys(s);
		}
	}

	public JavascriptExecutor closeAllTabs() throws InterruptedException {
		// Closing all the open tabs
		Thread.sleep(1000);
		js = (JavascriptExecutor) driver;
		js.executeScript(
				"var elements = document.evaluate(\"//div[contains(@class,'tabsetHeader')]//button[starts-with(@title,'Close')]//lightning-primitive-icon\", document.body, null, XPathResult.ANY_TYPE, null); while(element = elements.iterateNext()){  element.click(); }");
		Thread.sleep(1000);
		return js;
	}

	public JavascriptExecutor closeBottomeBar() throws InterruptedException {
		// Closing all the open tabs
		By wait_appOpen = By.xpath("//div[contains(@class,'oneUtilityBar slds-utility-bar_container oneUtilityBarContent')]");
		waitForElementToAppear(wait_appOpen, 1000);
		Thread.sleep(2000);
		js = (JavascriptExecutor) driver;
		js.executeScript(
				"var node=document.evaluate(\"//div[contains(@class,'oneUtilityBar slds-utility-bar_container oneUtilityBarContent')]\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null ).singleNodeValue; node.parentNode.removeChild(node);");
		Thread.sleep(1000);
		return js;
	}

	public JavascriptExecutor markStageasComplete() throws InterruptedException {
		// Closing all the open tabs
		Thread.sleep(4000);
		js = (JavascriptExecutor) driver;
		// driver.findElement(By.xpath("//span[text()='Mark Stage as
		// Complete']")).click();
		js.executeScript(
				"var result = document.evaluate(\"//span[text()='Mark Stage as Complete']\", document.body, null, XPathResult.ANY_TYPE, null); var input = result.iterateNext();input.scrollIntoView();input.click()");
		Thread.sleep(4000);
		return js;
	}

	public String getScreenShot(String testCaseName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
	}

	
	  public static Properties getObjDetails() throws IOException { 
			reader = new FileReader(System.getProperty("user.dir") + "//src//test//resources//GlobalData.properties");
			Properties props = new Properties();
			props.load(reader);
			return props;
	  
	  }
	 

		/*
		 * public Properties getParameters() throws IOException { reader = new
		 * FileReader(System.getProperty("user.dir") +
		 * "//src//main//java//resources//GlobalData.properties"); Properties props =
		 * new Properties(); props.load(reader); return props; }
		 */

	public static InputStream loadFileAsStream(String file) {
		return CommonFunctions.class.getResourceAsStream(file);
	}
	public static String ConcatCurrentDateTime(String NameProvided) {		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		LocalDateTime now = LocalDateTime.now();
		String DistinctName = NameProvided.concat(dtf.format(now));
		return DistinctName;
	}
	public void clickDrpDownAndSelValue(WebElement ele, String value) throws Exception
	{
		expWaitToBeClickable(ele);
		javascriptClick(ele);
		Thread.sleep(1000);
		TypeInField(ele, value);
		WebElement clkEle = driver.findElement(By.xpath("(//*[@title = '"+value+"'])[last()]"));
		drawHighlight(clkEle);
		javascriptClick(clkEle);
	}
	public static void draganddrop(WebElement from, WebElement to) {
		// action.clickAndHold(From).moveToElement(To).release().build().perform();
		actions.dragAndDrop(from, to);
		buildPerform();
	}
	public static void loadClassLoader() {
		basedir = CommonFunctions.class.getClassLoader();
	}
	public static String getTargetFilePath(String filename) {
		String path = basedir.getResource(filename).getPath();
		if (System.getProperty("os.name").toLowerCase().contains("win")) {
			path = path.indexOf("/") == 0 ? path.substring(1, path.length()) : path;
		} else {
		}
		return path;
	}
	public static File getTargetFile(String filename) {
		File retFile = new File(getTargetFilePath(filename));
		return retFile;
	}
	public static void draganddropJscript(WebElement src, WebElement tgt) throws IOException {
		String path = getTargetFilePath("dragAndDropNw.js");
		Path fpath = Paths.get(path);
		String script = new String(Files.readAllBytes(fpath), StandardCharsets.UTF_8);
		script += "simulateHTML5DragAndDrop(arguments[0], arguments[1])";
		js.executeScript(script, src, tgt);
	}
}
