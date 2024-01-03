package com.advantageonlineshopping.advantage_shopping.page_objects.generics;

import com.advantageonlineshopping.advantage_shopping.utils.WebActions;
import com.advantageonlineshopping.advantage_shopping.utils.property.ExecutionProperties;

public class GenericLogic extends WebActions {

	static final ExecutionProperties execution = ExecutionProperties.createChrome();

	private GenericPage genericPage;

	public GenericLogic() {
		genericPage = new GenericPage();
	}

	public void navigateToTheHomepageOfTheBanksWebsite() {
		createChrome().get(execution.getExecutionUrl());
	}

	public void clickOnMenuUser() {
		waitUntilElementToBeClickable(genericPage.getBtnUser());
		click(genericPage.getBtnUser());
	}
}
