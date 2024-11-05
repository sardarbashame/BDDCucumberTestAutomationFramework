package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonutilities.CommonFunctions;

public class Login extends CommonFunctions {

	public Login() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	@FindBy(id = "username")
	WebElement usernameele;

	@FindBy(id = "password")
	WebElement passwordele;

	@FindBy(id = "Login")
	WebElement Loginele;

	public void goTo(String URL) {
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.get(URL);
		driver.navigate().to(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public void LoginApp(String username, String password) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		usernameele.sendKeys(username);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		passwordele.sendKeys(password);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Loginele.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

}
