package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.AccountDetailsTab;
import commonutilities.CommonFunctions;

public class HAC_AccountCreation extends CommonFunctions {

	AccountDetailsTab accountDetailsTab;

	@When("HAC145 create new Account based on Type {string}, {string}, {string}, {string}, {string}")
	public void hac145_create_new_account_based_on_type(String AccType, String AccName, String TradeName,
			String industryname, String dropDwnValues) throws Exception {
		accountDetailsTab = new AccountDetailsTab();
		accountDetailsTab.createNewAccount(AccType, AccName, TradeName, industryname, dropDwnValues);
	}

	
	@Then("HAC94 Verify Account type after new account created and displaying in the edit details page {string},{string}")
	public void hac94_verify_account_type_after_new_account_created_and_displaying_in_the_edit_details_page(String AccType, String accCnt) throws Exception {
		accountDetailsTab.validateNewAccountCreatedInDetailsAndAccType(AccType, accCnt);
	}
}
