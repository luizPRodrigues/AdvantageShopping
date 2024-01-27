package com.advantageonlineshopping.advantage_shopping.page_objects.cadastro;

import static org.junit.Assert.assertTrue;

import com.advantageonlineshopping.advantage_shopping.page_objects.generics.GenericPage;
import com.advantageonlineshopping.advantage_shopping.utils.RandomUtils;
import com.advantageonlineshopping.advantage_shopping.utils.WebActions;
import com.advantageonlineshopping.advantage_shopping.utils.bd.DAO;
import com.advantageonlineshopping.advantage_shopping.utils.property.Props;

public class Cadastro_Logic extends WebActions {

	private CadastroPage cadastroPage;
	private RandomUtils randomUtils;
	private GenericPage genericPage;
	private DAO dao;

	public Cadastro_Logic() {
		cadastroPage = new CadastroPage();
		randomUtils = new RandomUtils();
		genericPage = new GenericPage();
		dao = new DAO();
	}

	public void clickOnCreateNewAccount() {
		waitUntilElementToBeClickable(cadastroPage.getBtnCreateAccount());
		click(cadastroPage.getBtnCreateAccount());
	}

	public void insertUserName() {
		waitUntilElementToBeClickable(cadastroPage.getCmpUserName());
		String randomicUser = "test" + randomUtils.generateRandomString(6);
		writeText(randomicUser, cadastroPage.getCmpUserName());
		dao.createData(randomicUser, null, null);

	}

	public void insertEmailAdress(String email) {
		waitUntilElementToBeClickable(cadastroPage.getCmpEmail());
		writeText(email, cadastroPage.getCmpEmail());
	}

	public void insertPassword() {
		waitUntilElementToBeClickable(cadastroPage.getCmpPassWord());
		String randomicPassword = "P12" + randomUtils.generateRandomString(6);
		writeText(randomicPassword, cadastroPage.getCmpPassWord());
		dao.createData(null, randomicPassword, null);
	}

	public void confirmPassword() {
		waitUntilElementToBeClickable(cadastroPage.getCmpConfirmPassWord());
		writeText(dao.readData(2, Props.PASSWORDCOLUMN, String.class), cadastroPage.getCmpConfirmPassWord());
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

	public void clickOnRegister() {
		waitUntilElementToBeClickable(cadastroPage.getBtnRegister());
		click(cadastroPage.getBtnRegister());
	}

	public void validateUserCreation() {
		waitForDesiredElementPresence(genericPage.getUserNameIcon());

		String user = driver.findElement(genericPage.getUserNameIcon()).getText();
		String userData = dao.readData(1, Props.USERCOLUMN, String.class);

		if (!user.isEmpty() && user.contains(userData)) {
			System.out.println("User was created successfully.");
			assertTrue(true);
		} else {
			System.out.println("The message of created user is either empty or doesn't match the expected data.");
			assertTrue(false);
			dao.truncateTable(Props.USERTABLE);
		}
	}
}
