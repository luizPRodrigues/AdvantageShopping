package com.advantageonlineshopping.advantage_shopping.page_objects.search_order;

import org.openqa.selenium.By;

public class SearchOrderPage {

	private By myOrder = By.cssSelector("a[id='menuUserLink'] label:nth-child(2)");
	private By search = By.xpath("(//*[@id='menuSearch'])[2]");
	private By searchCmp = By.id("orderAutoComplete");

	public By getMyOrder() {
		return myOrder;
	}

	public By getSearch() {
		return search;
	}

	public By getSearchCmp() {
		return searchCmp;
	}

}
