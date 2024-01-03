package com.advantageonlineshopping.advantage_shopping.page_objects.generics;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class GenericStep {

	private GenericLogic genericLogic;

	public GenericStep() {
		genericLogic = new GenericLogic();
	}

	@Given("I am on the homepage of the Advantage Shopping website")
	public void iAmOnTheHomepageOfTheAdvantageShoppingWebsite() {
		genericLogic.navigateToTheHomepageOfTheBanksWebsite();
	}

	@And("I click on the menu user")
	public void iClickOnTheMenuUser() {
		genericLogic.clickOnMenuUser();
	}

}
