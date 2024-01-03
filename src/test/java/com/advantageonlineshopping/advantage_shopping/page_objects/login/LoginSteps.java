package com.advantageonlineshopping.advantage_shopping.page_objects.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {

	private LoginLogic loginLogic;

	public LoginSteps() {
		loginLogic = new LoginLogic();
	}

	@And("I enter my username")
	public void iEnterMyUsername() {
		loginLogic.enterUserName();
	}

	@And("I enter my password")
	public void iEnterMyPassword() {
		loginLogic.enterPassWord();
	}

	@When("I click on login")
	public void iClickOnLogin() {
		loginLogic.clickOnSignIn();
	}

	@Then("I validate that the login was successfully performed")
	public void iValidateThatTheLoginWasSuccessfullyPerformed() {
		loginLogic.validateLoginSuccessfully();
	}

}
