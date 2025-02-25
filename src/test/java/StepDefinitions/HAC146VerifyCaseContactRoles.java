package StepDefinitions;

import java.io.IOException;

import PageObjects.CaseContactRoles;
import PageObjects.GlobalSearch;
import PageObjects.HomePage;
import PageObjects.Login;
import PageObjects.SelectApplication;
import commonutilities.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HAC146VerifyCaseContactRoles extends CommonFunctions {
	GlobalSearch globalSearch;
	Login loginPO;
	SelectApplication selectApplication;
	HomePage homePage;
	CaseContactRoles casecontactroles;

	@Given("^HAC146 user enters (.*) and (.*)$")
	public void HAC146_user_enters_username_and_password(String userName, String password) throws IOException {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		loginPO.LoginApp(userName, password);
	}

	@When("HAC146 select the applicaton")
	public void HAC146_select_the_applicaton() throws InterruptedException, IOException {
		selectApplication = new SelectApplication();
		selectApplication.selectApp(ppty.getProperty("APPNAME"));
	}

	@When("HAC146 close all the open tabs")
	public void HAC146_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs();
	}

	@When("HAC146 close the bottom bar")
	public void HAC146_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();
	}

	@When("HAC146 click on cases tab")
	public void HAC146_click_on_cases_tab() throws InterruptedException {
		homePage = new HomePage();
		homePage.clickCasesTab();
	}

	@When("HAC146 create new case")
	public void HAC146_create_new_case() throws InterruptedException, Exception {
		homePage = new HomePage();
		homePage.createNewCase(ppty.getProperty("CASECONTACT"), ppty.getProperty("CASEFIRSTNAME"));
	}

	@When("HAC146 add engineer contact role")
	public void HAC146_add_engineer_contact_role() throws InterruptedException, IOException {
		casecontactroles = new CaseContactRoles();
		casecontactroles.addContactRole(ppty.getProperty("CONTACTROLECONTACT"), ppty.getProperty("ROLEENGG"));

	}

	@When("HAC146 add engineering manager contact role")
	public void HAC146_add_engineer_manager_contact_role() throws InterruptedException, IOException {
		casecontactroles = new CaseContactRoles();
		casecontactroles.addContactRole(ppty.getProperty("CONTACTROLECONTACT"), ppty.getProperty("ROLEENGGMGR"));

	}

	@Then("HAC146 verify case contact roles")
	public void HAC146_verify_case_contact_roles() throws InterruptedException {
		casecontactroles = new CaseContactRoles();
		casecontactroles.verifyContactRoles();
	}

}
