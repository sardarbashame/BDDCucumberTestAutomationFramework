package PageObjects;

import java.time.Duration;
import java.util.List;

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
	
	@FindBy(xpath = "//h2[text() = 'Register Your Mobile Phone']//parent::div//following-sibling::div//a[contains(text(), 'My Phone')]")
	List<WebElement> registerPhonePrompt;


	public void goTo(String URL) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			loadBaseURL();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.get(URL);
		//driver.navigate().to(URL);
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
		
		int cnt = registerPhonePrompt.size();
		System.out.println("Before If Register mobile prompt is displayed " + cnt);
		if(cnt>=1)
		{
			System.out.println("Register mobile prompt is displayed " + cnt);
			registerPhonePrompt.get(0).click();			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

}
