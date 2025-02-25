package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import commonutilities.CommonFunctions;

public class FieldServiceConsole extends CommonFunctions {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	Select select;

	@FindBy(xpath = "//div[contains(text() ,'Policy:')]//select")
	WebElement dropdwnclick_policy;

	@FindBy(xpath = "//a[contains(text(),'Related Records')]")
	WebElement SA_RelatedTab;

	@FindBy(xpath = "//a[contains(text(),'Related Records')]")
	WebElement Assets_RelatedTab;

	@FindBy(xpath = "//a[text() = 'Daily Notes & Punch List']")
	WebElement clk_dailyNotes;

	@FindBy(xpath = "//a[text() = 'Field Service Report']")
	WebElement clk_fieldServiceReport;

	@FindBy(xpath = "//span[text() = 'Select Item 1']//parent::label")
	WebElement chk_SelectCheckBox1;

	@FindBy(xpath = "//input[@name = 'Name']")
	WebElement ipt_name;

	@FindBy(xpath = "//service-list-column[text()='SA-0732']")
	WebElement click_serviceappointment;

	@FindBy(xpath = "//ul[@class='QuickActions']//li//span[text()='Edit']")
	WebElement click_SAEditbtn;

	@FindBy(xpath = "//select[@id='PredefinedFilterSelector']")
	WebElement dropdwn_predefinedfilter;

	@FindBy(xpath = "//span[text() = 'Punch List Items']//ancestor::header//following-sibling::div//a//div[text() = 'New']")
	WebElement btn_createPunchList;

	@FindBy(xpath = "//span[text() = 'Punch List']//ancestor::h2//following-sibling::slot//button[text() = 'New Punch List Item']")
	WebElement btn_createPunchListFA;

	@FindBy(xpath = "//span[text() = 'Daily Notes']//ancestor::h2//following-sibling::slot//button[text() = 'New Daily Note']")
	WebElement btn_CreateDailyNotesFA;

	@FindBy(xpath = "//span[text() = 'Create Punch List']//parent::label//span[@part = 'indicator']")
	WebElement chk_indicatorEnable;

	@FindBy(xpath = "//span[text() = 'Equipment Information']//ancestor::h2//following-sibling::slot//button[text() = 'New']")
	WebElement btn_EquipmentInformationFA;

	@FindBy(xpath = "//input[@name = 'Subject__c']")
	WebElement ipt_subject;

	@FindBy(xpath = "//textarea[@name = 'Todays_Activities__c']")
	WebElement ipt_Todays_Activities;

	@FindBy(xpath = "//textarea[@name = 'Planned_Activities_For_Tomorrow__c']")
	WebElement ipt_Planned_Activities;

	@FindBy(xpath = "//button[@name = 'next']")
	WebElement btn_nextDailyNoytes;

	@FindBy(xpath = "//label[text() = 'Title']")
	WebElement label_title;

	@FindBy(xpath = "//label[text() = 'Status']")
	WebElement label_status;

	@FindBy(xpath = "//label[text() = 'Assigned To']")
	WebElement label_AssignedTO;

	@FindBy(xpath = "//label[text() = 'Work Plan']")
	WebElement label_workPlan;

	@FindBy(xpath = "//label[text() = 'Work Order Line']")
	WebElement label_workOrderLine;

	@FindBy(xpath = "//label[text() = 'Priority']")
	WebElement label_priority;

	@FindBy(xpath = "//label[text() = 'Description']")
	WebElement label_description;

	@FindBy(xpath = "//label[text() = 'Proposed Solution/Comments']")
	WebElement label_proposedSoln;

	@FindBy(xpath = "//label[text() = 'Line']")
	WebElement label_line;

	@FindBy(xpath = "//label[text() = 'Plant Area']")
	WebElement label_plantArea;

	@FindBy(xpath = "//label[text() = 'LW']")
	WebElement label_LW;

	@FindBy(xpath = "//span[text() = 'Next']")
	WebElement btn_next;

	@FindBy(xpath = "(//button[text() = 'Next'])[last()]")
	WebElement btn_nextFA;

	@FindBy(xpath = "(//span[text() = 'Name']//parent::label//following::input)[1]")
	WebElement ipt_title;

	@FindBy(xpath = "(//span[text() = 'Work Plan']//parent::label//following::input)[1]")
	WebElement ipt_workPlan;

	@FindBy(xpath = "(//span[text() = 'Save'])[last()]")
	WebElement btn_save;

	@FindBy(xpath = "(//button[text() = 'Save'])[last()]")
	WebElement btn_saveFA;

	@FindBy(xpath = "//span[text() = 'Punch List Items']//ancestor::article//table//tbody//th")
	List<WebElement> lst_punchListItemsRecords;

	@FindBy(xpath = "(//span[text() = 'Punch List']//ancestor::h2)[last()]//parent::div//following-sibling::div//table//tbody//tr")
	List<WebElement> lst_punchListItemsRecordsUnderFA;

	@FindBy(xpath = "(//span[text() = 'Equipment Information']//ancestor::h2)[last()]//parent::div//following-sibling::div//table//tbody//tr")
	List<WebElement> lst_EquipmentInformationItemsRecordsUnderFA;

	By Wait_stageChange = By
			.xpath("//span[contains(@class, 'toastMessage slds-text-heading--small forceActionsText')]");

	@FindBy(xpath = "//iframe[@ng-show=\"selectedTab == 'relatedList' && urls.related\"]")
	WebElement frame1;

	@FindBy(xpath = "//h3[text()='Work Order Line Items']//ancestor::div//a[text()='Car']")
	WebElement saasset;

	By serviceAppoinmenttabAppear = By.xpath("//span[text() = 'Service Appointments']//parent::a");
	By equipmentAddedAppear = By.xpath("//slot[text()= 'Equipments added To FSR']");

	public FieldServiceConsole() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	public void SelectPolicy() throws InterruptedException {
		Thread.sleep(4000);
		Thread.sleep(4000);
		select = new Select(dropdwnclick_policy);
		Thread.sleep(4000);
		select.selectByVisibleText("USA - Packaging");
		Thread.sleep(3000);
	}

	public void SelectJeopardySA() throws InterruptedException {
		Thread.sleep(4000);
		expWaitToBeClickable(dropdwn_predefinedfilter);
		Thread.sleep(4000);
		select = new Select(dropdwn_predefinedfilter);
		Thread.sleep(4000);
		select.selectByVisibleText("In Jeopardy");

	}

	public void SelectPolicy(String policy) throws InterruptedException {
		Thread.sleep(2000);
		select = new Select(dropdwnclick_policy);
		Thread.sleep(2000);
		select.selectByVisibleText(policy);
		Thread.sleep(3000);
	}

	public void SelectSAPredefinedFilter(String filteroption) throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(dropdwn_predefinedfilter);
		Thread.sleep(2000);
		select = new Select(dropdwn_predefinedfilter);
		Thread.sleep(2000);
		select.selectByVisibleText(filteroption);
		Thread.sleep(3000);
	}

	public void SelectSAFromFieldServiceConsole() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(click_serviceappointment);
		Thread.sleep(2000);
		click_serviceappointment.click();
		Thread.sleep(3000);

	}

	public void EditSAFromFieldServiceConsole() throws InterruptedException {
		Thread.sleep(2000);
		expWaitToBeClickable(click_SAEditbtn);
		Thread.sleep(2000);
		click_SAEditbtn.click();
		Thread.sleep(3000);
	}

	public void ClickSARelatedTab() throws InterruptedException {

		Thread.sleep(4000);

		Thread.sleep(3000);
		expWaitToBeClickable(SA_RelatedTab);
		Thread.sleep(2000);
		SA_RelatedTab.click();
		Thread.sleep(3000);
	}

	public void ClickAssetsRelatedTab() throws InterruptedException {
		Thread.sleep(4000);
		expWaitToBeClickable(Assets_RelatedTab);
		Thread.sleep(4000);
		Assets_RelatedTab.click();
		Thread.sleep(2000);
	}

	public void ClickOnDaiyNotesTab() throws InterruptedException {
		Thread.sleep(4000);
		waitForElementToAppear(serviceAppoinmenttabAppear, 30);
		expWaitToBeClickable(clk_dailyNotes);
		javascriptClick(clk_dailyNotes);
		Thread.sleep(2000);
	}

	public void ClickOnFieldServiceReportTab() throws InterruptedException {
		Thread.sleep(4000);
		waitForElementToAppear(serviceAppoinmenttabAppear, 30);
		expWaitToBeClickable(clk_fieldServiceReport);
		javascriptClick(clk_fieldServiceReport);
		Thread.sleep(2000);
	}

	public void createNewPunchListItems() throws Exception {
		Thread.sleep(2000);
		expWaitToBeClickable(Assets_RelatedTab);
		Thread.sleep(4000);
		btn_createPunchList.click();
		Thread.sleep(3000);
		btn_next.click();
		ipt_title.sendKeys(ConcatCurrentDateTime("Auto"));
		clickDrpDownAndSelValue(ipt_workPlan, "Punchlist");
		btn_save.click();
		Thread.sleep(2000);
		elementToBePresent(Wait_stageChange, 30);
	}

	public void createNewPunchListItemsUnderFieldService() throws Exception {
		Thread.sleep(4000);
		expWaitToBeClickable(btn_createPunchListFA);
		btn_createPunchListFA.click();
		Thread.sleep(3000);
		ipt_name.sendKeys(ConcatCurrentDateTime("Auto"));
		btn_nextFA.click();
		Thread.sleep(4000);
		btn_saveFA.click();
		Thread.sleep(2000);
	}

	public void createNewEquipmentInformationInFieldService() throws Exception {
		Thread.sleep(4000);
		expWaitToBeClickable(btn_EquipmentInformationFA);
		btn_EquipmentInformationFA.click();
		Thread.sleep(3000);
		chk_SelectCheckBox1.click();
		Thread.sleep(4000);
		btn_saveFA.click();
		Thread.sleep(2000);
		waitForElementToAppear(equipmentAddedAppear, 30);

	}

	public void createDailyNotesUnderFieldService() throws Exception {
		Thread.sleep(4000);
		expWaitToBeClickable(btn_CreateDailyNotesFA);
		btn_CreateDailyNotesFA.click();
		expWaitToBeClickable(chk_indicatorEnable);
		chk_indicatorEnable.click();
		Thread.sleep(4000);
		ipt_subject.sendKeys("Test Automation Notes");
		ipt_Todays_Activities.sendKeys("Test Automation Activities");
		ipt_Planned_Activities.sendKeys("Test Automation Planned_Activities");
		btn_nextDailyNoytes.click();
		Thread.sleep(4000);
		expWaitToBeClickable(btn_nextDailyNoytes);
		btn_nextDailyNoytes.click();
		Assert.assertTrue(label_title.isDisplayed());
		Assert.assertTrue(label_status.isDisplayed());
		Assert.assertTrue(label_AssignedTO.isDisplayed());
		Assert.assertTrue(label_workPlan.isDisplayed());
		Assert.assertTrue(label_workOrderLine.isDisplayed());
		Assert.assertTrue(label_priority.isDisplayed());
		Assert.assertTrue(label_description.isDisplayed());
		Assert.assertTrue(label_proposedSoln.isDisplayed());
		Assert.assertTrue(label_line.isDisplayed());
		Assert.assertTrue(label_plantArea.isDisplayed());
		Assert.assertTrue(label_LW.isDisplayed());
		ipt_name.sendKeys("Mr");
		btn_nextDailyNoytes.click();
		Thread.sleep(4000);
	}

	public void verifyPunchListCreated() throws Exception {
		Thread.sleep(4000);
		expWaitToBeClickable(Assets_RelatedTab);
		int cnt = lst_punchListItemsRecords.size();
		Assert.assertTrue(cnt > 0);
	}

	public void verifyPunchListCreatedUnderFA() throws Exception {
		Thread.sleep(4000);
		int cnt = lst_punchListItemsRecordsUnderFA.size();
		Assert.assertTrue(cnt > 1);
	}

	public void verifyEquipmentInformationCreatedUnderFA() throws Exception {
		Thread.sleep(4000);
		int cnt = lst_EquipmentInformationItemsRecordsUnderFA.size();
		Assert.assertTrue(cnt >= 1);
	}

	public void VerifySiteAssetOnSA() throws InterruptedException {
		driver.switchTo().frame(frame1);
		Thread.sleep(2000);
		expWaitToBeClickable(saasset);
		Thread.sleep(4000);
		saasset.isDisplayed();
		Thread.sleep(3000);
	}

}
