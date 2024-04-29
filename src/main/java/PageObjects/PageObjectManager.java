package PageObjects;

import org.openqa.selenium.WebDriver;



public class PageObjectManager {
	public WebDriver driver;
	public CreateSalesNewOpportunity createSalesNewOpportunity;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public CreateSalesNewOpportunity createNewOppObj()
	{
	
	 createSalesNewOpportunity = new CreateSalesNewOpportunity(driver);
	 return createSalesNewOpportunity;
	}

}
