package com.advantageonlineshopping.advantage_shopping.page_objects.cadastro;

import com.advantageonlineshopping.advantage_shopping.utils.RandomUtils;
import com.advantageonlineshopping.advantage_shopping.utils.WebActions;

public class Cadastro_Logic extends WebActions {

	private CadastroPage cadastroPage;
	private RandomUtils randomUtils;

	public Cadastro_Logic() {
		cadastroPage = new CadastroPage();
		randomUtils = new RandomUtils();
	}

	public void clickOnMenuUser() {
		waitUntilElementToBeClickable(cadastroPage.getBtnUser());
		click(cadastroPage.getBtnUser());
	}

	public void clickOnCreateNewAccount() {
		waitUntilElementToBeClickable(cadastroPage.getBtnCreateAccount());
		click(cadastroPage.getBtnCreateAccount());
	}

	public void insertUserName() {
		waitUntilElementToBeClickable(cadastroPage.getCmpUserName());
		String userRandomico = "test " + randomUtils.geraStringRandomica(6);
		writeText(userRandomico, cadastroPage.getCmpUserName());
	}

	public void insertEmailAdress(String email) {
		waitUntilElementToBeClickable(cadastroPage.getCmpEmail());
		writeText(email, cadastroPage.getCmpEmail());
	}

	public void insertPassword() {
		waitUntilElementToBeClickable(cadastroPage.getCmpPassWord());
		String randomicPassword = randomUtils.geraStringRandomica(6);
		writeText(randomicPassword, cadastroPage.getCmpPassWord());
	}

	public void confirmPassword() {
		waitUntilElementToBeClickable(cadastroPage.getCmpConfirmPassWord());
		String randomicPassword = randomUtils.geraStringRandomica(6);
		writeText(randomicPassword, cadastroPage.getCmpConfirmPassWord());
	}

	public void insertFirstName(String fName) {
		waitUntilElementToBeClickable(cadastroPage.getCmpFirstName());
		writeText(fName, cadastroPage.getCmpFirstName());
	}

	public void insertLastName(String lName) {
		waitUntilElementToBeClickable(cadastroPage.getCmpLastName());
		writeText(lName, cadastroPage.getCmpLastName());
	}

	public void insertPhoneNumber(String phone) {
		waitUntilElementToBeClickable(cadastroPage.getCmpPhoneNumber());
		writeText(phone, cadastroPage.getCmpPhoneNumber());
	}

	public void selectCountry(String country) {
		waitUntilElementToBeClickable(cadastroPage.getCmpCountry());
		selectComboByVisibleText(cadastroPage.getCmpCountry(), country);
	}

	public void insertCity(String city) {
		waitUntilElementToBeClickable(cadastroPage.getCmpCity());
		writeText(city, cadastroPage.getCmpCity());
	}

	public void insertAdress(String address) {
		waitUntilElementToBeClickable(cadastroPage.getCmpAdress());
		writeText(address, cadastroPage.getCmpAdress());
	}

	public void insertRegion(String region) {
		waitUntilElementToBeClickable(cadastroPage.getCmpRegion());
		writeText(region, cadastroPage.getCmpRegion());
	}

	public void insertPostalCode(String postalCode) {
		waitUntilElementToBeClickable(cadastroPage.getCmpPostalCode());
		writeText(postalCode, cadastroPage.getCmpPostalCode());
	}

	public void selectUseConditions() {
		waitUntilElementToBeClickable(cadastroPage.getBxAgree());
		click(cadastroPage.getBxAgree());
	}
}
