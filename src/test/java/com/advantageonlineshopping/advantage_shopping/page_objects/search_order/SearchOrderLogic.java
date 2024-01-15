package com.advantageonlineshopping.advantage_shopping.page_objects.search_order;

import org.openqa.selenium.WebElement;

import com.advantageonlineshopping.advantage_shopping.page_objects.generics.GenericPage;
import com.advantageonlineshopping.advantage_shopping.utils.WebActions;
import com.advantageonlineshopping.advantage_shopping.utils.property.DynamicPropertiesManager;

public class SearchOrderLogic extends WebActions {

	private SearchOrderPage searchOrderPage;
	private DynamicPropertiesManager dynamic;
	private GenericPage genericPage;

	public SearchOrderLogic() {
		searchOrderPage = new SearchOrderPage();
		dynamic = new DynamicPropertiesManager();
		genericPage = new GenericPage();
	}

	public void clickMenuUser() {
		waitUntilElementToBeClickable(genericPage.getBtnUser());
		WebElement userClick = findElement(genericPage.getBtnUser());
		clickOnElement(userClick);

		waitUntilElementToBeClickable(searchOrderPage.getMyOrder());
		WebElement orderClick = findElement(searchOrderPage.getMyOrder());
		clickOnElement(orderClick);
	}

	public void selectMyOrders() {
		waitUntilElementToBeClickable(searchOrderPage.getMyOrder());
		WebElement orderClick = findElement(searchOrderPage.getMyOrder());
		clickOnElement(orderClick);
	}

	public void searchOrderNumber() {
		waitUntilElementToBeClickable(searchOrderPage.getSearch());
		click(searchOrderPage.getSearch());
		waitUntilElementToBeClickable(searchOrderPage.getSearchCmp());
		System.out.println("************************Get order number on properties************************");
		writeText(dynamic.getInstance().getProperty("orderNumber"), searchOrderPage.getSearchCmp());
	}

}
