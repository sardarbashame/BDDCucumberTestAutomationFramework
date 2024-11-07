package StepDefinitions;

import java.io.IOException;

import PageObjects.CaseContactRoles;
import PageObjects.CaseDetailsTab;
import PageObjects.EstimateCreationFlowStep1;
import PageObjects.EstimateCreationFlowStep2;
import PageObjects.EstimateCreationFlowStep3;
import PageObjects.GlobalSearch;
import PageObjects.HomePage;
import PageObjects.Login;
import PageObjects.SelectApplication;
import commonutilities.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HAC316CreateViewEditTransferCase extends CommonFunctions {
	GlobalSearch globalSearch;
	Login loginPO;
	SelectApplication selectApplication;
	HomePage homePage;
	CaseContactRoles casecontactroles;
	CaseDetailsTab casedetails;

	@Given("^HAC316 user enters (.*) and (.*)$")
	public void HAC316_user_enters_username_and_password(String userName, String password) throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(userName, password);
	}

	@When("HAC316 select the applicaton")
	public void HAC316_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC316 close all the open tabs")
	public void HAC316_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC316 close the bottom bar")
	public void HAC316_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}

	@When("HAC316 click on cases tab")
	public void HAC316_click_on_cases_tab() throws InterruptedException  {
		homePage = new HomePage();
		homePage.clickCasesTab();
	}

	@When("HAC316 create new case")
	public void HAC316_create_new_case() throws InterruptedException, IOException  {
		homePage = new HomePage();
		homePage.createNewCase(
				ppty.getProperty("CASECONTACT"),
				ppty.getProperty("CASEFIRSTNAME"),
				ppty.getProperty("CASESUB")
				);
	}
	
	@Then("HAC316 update case status to In Progress")
	public void HAC316_update_case_status_to_In_Progress() throws InterruptedException, IOException  {
		casedetails = new CaseDetailsTab();
		casedetails.updateCaseStatus("In Progress");
	}
	
	@Then("HAC316 save the case")
	public void HAC316_save_the_case() throws InterruptedException, IOException  {
		casedetails = new CaseDetailsTab();
		casedetails.clickSaveButton();
	}
	
	@Then("HAC316 transfer the case")
	public void HAC316_transfer_the_case() throws InterruptedException, IOException  {
		casedetails = new CaseDetailsTab();
		casedetails.transferCase("Test Service Manager");
	}
	

}
