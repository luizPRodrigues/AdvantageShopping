package com.advantageonlineshopping.advantage_shopping.page_objects.search_order;

import org.openqa.selenium.WebElement;

import com.advantageonlineshopping.advantage_shopping.page_objects.generics.GenericPage;
import com.advantageonlineshopping.advantage_shopping.utils.WebActions;
import com.advantageonlineshopping.advantage_shopping.utils.bd.DAO;
import com.advantageonlineshopping.advantage_shopping.utils.property.Props;

public class SearchOrderLogic extends WebActions {

	private SearchOrderPage searchOrderPage;
	private GenericPage genericPage;
	private DAO dao;

	public SearchOrderLogic() {
		searchOrderPage = new SearchOrderPage();
		genericPage = new GenericPage();
		dao = new DAO();
	}

	public void clickMenuUser() {
		waitUntilElementToBeClickable(genericPage.getBtnUser());
		WebElement userClick = findElement(genericPage.getBtnUser());
		clickOnElement(userClick);

		waitUntilElementToBeClickable(searchOrderPage.getMyOrder());
		WebElement orderClick = findElement(searchOrderPage.getMyOrder());
		clickOnElement(orderClick);
	}

	public void searchOrderNumber() {

		waitUntilElementToBeClickable(searchOrderPage.getSearch());
		click(searchOrderPage.getSearch());
		waitUntilElementToBeClickable(searchOrderPage.getSearchCmp());

		String orderNumber = dao.readData(1, Props.ORDERNUMCOLUMN, String.class);

		if (orderNumber != null) {
			System.out.println("Value read from the database: " + orderNumber);
			writeText(orderNumber, searchOrderPage.getSearchCmp());
			dao.truncateTable(Props.USERTABLE);
		} else {
			System.out.println("Value read from the database is null.");
		}

	}
}
