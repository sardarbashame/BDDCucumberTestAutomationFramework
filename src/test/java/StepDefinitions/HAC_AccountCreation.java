package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.AccountDetailsTab;
import PageObjects.Login;
import commonutilities.CommonFunctions;

public class HAC_AccountCreation extends CommonFunctions {

	AccountDetailsTab accountDetailsTab;
	Login loginPO;
	@Given("Login as SERVICE REP USER NAME")
	public void login_as_service_rep_user_name() {
		loginPO = new Login();
		loginPO.goTo(ppty.getProperty("HAC_URL"));
		String Uname = ppty.getProperty("SERVICE_REP_USER_NAME");
		String pwd = ppty.getProperty("SERVICE_REP_PASSWORD");
		loginPO.LoginApp(Uname, pwd);
	   
	}
	
	@When("HAC145 create new Account based on Type {string}, {string}, {string}, {string}, {string}")
	public void hac145_create_new_account_based_on_type(String AccType, String AccName, String TradeName,
			String industryname, String dropDwnValues) throws Exception {
		accountDetailsTab = new AccountDetailsTab();
		accountDetailsTab.createNewAccount(AccType, AccName, TradeName, industryname, dropDwnValues);
	}

	@Then("HAC94 Verify Account type after new account created and displaying in the edit details page {string},{string}")
	public void hac94_verify_account_type_after_new_account_created_and_displaying_in_the_edit_details_page(
			String AccType, String accCnt) throws Exception {
		accountDetailsTab.validateNewAccountCreatedInDetailsAndAccType(AccType, accCnt);
	}

	@When("click on the Resource prefence link and add new Resource preference")
	public void click_on_the_resource_prefence_link_and_add_new_resource_preference() {
		throw new io.cucumber.java.PendingException();
	}

	@When("click on Log a call")
	public void click_on_log_a_call() throws Exception {
		accountDetailsTab = new AccountDetailsTab();
		accountDetailsTab.createdLogACall();
	}

	@When("click on Create New task")
	public void click_on_create_new_task() throws Exception {
		accountDetailsTab.createdNewTask();
	}

	@When("click on Create New Event")
	public void click_on_create_new_event() throws Exception {
		accountDetailsTab.createdNewEvent();
	}

}
