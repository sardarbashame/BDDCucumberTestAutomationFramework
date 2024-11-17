package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import PageObjects.OrderPages;
import PageObjects.AppnavigatorTabsPages;
import PageObjects.SelectApplication;
import commonutilities.CommonFunctions;

public class OrdersStepDefn extends CommonFunctions {

	OrderPages ordersObj;
	SelectApplication selectApplication;

	@When("click on Orders tab")
	public void click_on_Order_tab() throws Exception {
		ordersObj = new OrderPages();
		ordersObj.clkordersTab();
	}

	@Then("verify TLI number displayed under Order details tab")
	public void verify_tli_number_displayed_under_Order_details_tab() throws Exception {
		ordersObj = new OrderPages();
		ordersObj.clkRecentOrder();
	}

	@When("click on Orders Related tab")
	public void click_on_OrderRelated_tab() throws Exception {
		ordersObj = new OrderPages();
		ordersObj.clkrelatedTab();
	}

	@Then("verify TLI number displayed under Order product details tab")
	public void verify_tli_number_displayed_under_OrderProduct_details_tab() throws Exception {
		ordersObj = new OrderPages();
		ordersObj.clkOrderProduct();
	}
	@When("Search order number {string}")
	public void search_order_number(String str) throws Exception {
		ordersObj = new OrderPages();
		ordersObj.searchOrder(str);
	}


}
