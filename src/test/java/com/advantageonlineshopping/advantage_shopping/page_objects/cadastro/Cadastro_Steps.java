package com.advantageonlineshopping.advantage_shopping.page_objects.cadastro;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cadastro_Steps {

	private Cadastro_Logic cadastroLogic;

	public Cadastro_Steps() {
		cadastroLogic = new Cadastro_Logic();
	}

	@And("I click on the menu user")
	public void iClickOnTheMenuUser() {
		cadastroLogic.clickOnMenuUser();
	}

	@And("I should find and click on the create new account option")
	public void iShouldFindAndClickOnTheCreateNewAccountOption() {
		cadastroLogic.clickOnCreateNewAccount();
	}

	@And("I insert the user name")
	public void iInsertTheUserName() {
		cadastroLogic.insertUserName();
	}

	@And("I insert the email adress {string}")
	public void iInsertTheEmailAdress(String email) {
		cadastroLogic.insertEmailAdress(email);
	}

	@And("I insert password")
	public void iInsertPassword() {
		cadastroLogic.insertPassword();
	}

	@And("I insert confirmation of the password")
	public void iInsertConfirmationOfThePassword() {
		cadastroLogic.confirmPassword();
	}

	@And("I insert the first name {string}")
	public void iInsertTheFirstName(String fName) {
		cadastroLogic.insertFirstName(fName);
	}

	@And("I insert the last name {string}")
	public void iInsertTheLastName(String lName) {
		cadastroLogic.insertLastName(lName);
	}

	@And("I insert my phone number {string}")
	public void iInsertMyPhoneNumber(String phone) {
		cadastroLogic.insertPhoneNumber(phone);
	}

	@And("I select my country {string}")
	public void iSelectMyCountry(String country) {
		cadastroLogic.selectCountry(country);
	}

	@And("I insert my city {string}")
	public void iInsertMyCity(String city) {
		cadastroLogic.insertCity(city);
	}

	@And("I insert my address {string}")
	public void iInsertMyAddress(String address) {
		cadastroLogic.insertAdress(address);
	}

	@And("I insert my region {string}")
	public void iInsertMyRegion(String region) {
		cadastroLogic.insertRegion(region);
	}

	@And("I insert my postal code {string}")
	public void iInsertMyPostalCode(String postalCode) {
		cadastroLogic.insertPostalCode(postalCode);
	}

	@And("I select use conditions privacy")
	public void iSelectUseConditionsPrivacy() {
		cadastroLogic.selectUseConditions();
	}

	@When("I click on the register option")
	public void iClickOnTheRegisterOption() {
		cadastroLogic.clickOnRegister();
	}

	@Then("the final message should be displayed as expected")
	public void theFinalMessageShouldBeDisplayedAsExpected() {
		cadastroLogic.validateUserCreation();
	}

}
