package com.advantageonlineshopping.advantage_shopping.page_objects.delete_account;

import io.cucumber.java.en.And;

public class DeleteAccountStep {

	DeleteAccountLogic deleteAccountLogic;

	public DeleteAccountStep() {
		deleteAccountLogic = new DeleteAccountLogic();
	}

	@And("I enter with my username")
	public void iEnterWithMyUsername() {
		deleteAccountLogic.setMyUsername();
	}

	@And("I enter with my password")
	public void iEnterWithMyPassword() {
		deleteAccountLogic.setMyPassword();
	}

	@And("I click on my account")
	public void iClickOnMyAccount() {
		deleteAccountLogic.selectMyAccount();
	}

	@And("click Delete Account option")
	public void clickDeleteAccountOption() {
		deleteAccountLogic.deleteAccount();
	}

}
