package com.advantageonlineshopping.advantage_shopping.page_objects.search_order;

import io.cucumber.java.en.And;

public class SearchOrderStep {

	private SearchOrderLogic searchOrderLogic;

	public SearchOrderStep() {
		searchOrderLogic = new SearchOrderLogic();
	}

	@And("I click on the menu user log in")
	public void iClickOnTheMenuUserLogIn() {
		searchOrderLogic.clickMenuUser();
	}

	@And("search my purchased order by Order Number")
	public void searchMyPurchasedOrderByOrderNumber() {
		searchOrderLogic.searchOrderNumber();
	}

}
