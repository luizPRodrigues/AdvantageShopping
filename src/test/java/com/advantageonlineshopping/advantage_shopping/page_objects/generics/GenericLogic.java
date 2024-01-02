package com.advantageonlineshopping.advantage_shopping.page_objects.generics;

import com.advantageonlineshopping.advantage_shopping.utils.WebActions;
import com.advantageonlineshopping.advantage_shopping.utils.property.ExecutionProperties;

public class GenericLogic extends WebActions {

	static final ExecutionProperties execution = ExecutionProperties.createChrome();

	public void navigateToTheHomepageOfTheBanksWebsite() {
		createChrome().get(execution.getExecutionUrl());
	}

}
