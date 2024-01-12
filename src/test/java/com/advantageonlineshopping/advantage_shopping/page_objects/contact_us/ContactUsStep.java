package com.advantageonlineshopping.advantage_shopping.page_objects.contact_us;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsStep {

	ContactUsLogic contactUsLogic;

	public ContactUsStep() {
		contactUsLogic = new ContactUsLogic();
	}

	@When("I select the Contact Us option")
	public void iSelectTheContactUsOption() {
		contactUsLogic.selectContactUs();
	}

	@And("I choose a specific category from the available options {string}")
	public void iChooseASpecificCategoryFromTheAvailableOptions(String category) {
		contactUsLogic.chooseCategory(category);
	}

	@And("I select a product related to my inquiry {string}")
	public void iSelectAProductRelatedToMyInquiry(String product) {
		contactUsLogic.selectProduct(product);
	}

	@And("I input my email address")
	public void iInputMyEmailAddress() {
		contactUsLogic.insertMyEmailAdress();
	}

	@And("I provide a subject for my message")
	public void iProvideASubjectForMyMessage() {
		contactUsLogic.insertSubject();
	}

	@And("I click on the Send button")
	public void iClickOnTheSendButton() {
		contactUsLogic.clickSendInformation();
	}

	@Then("I validate the final message {string}")
	public void IValidateTheFinalMessageWithSuccess(String msgFinal) {
		contactUsLogic.IValidateTheFinalMessageWithSuccess(msgFinal);
	}

}
