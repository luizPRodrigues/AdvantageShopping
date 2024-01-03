package com.advantageonlineshopping.advantage_shopping.page_objects.login;

import static org.junit.Assert.assertTrue;

import com.advantageonlineshopping.advantage_shopping.page_objects.generics.GenericPage;
import com.advantageonlineshopping.advantage_shopping.utils.WebActions;
import com.advantageonlineshopping.advantage_shopping.utils.property.ExecutionProperties;

public class LoginLogic extends WebActions {

	static final ExecutionProperties execution = ExecutionProperties.createChrome();

	private LoginPage loginPage;
	private GenericPage genericPage;

	public LoginLogic() {
		loginPage = new LoginPage();
		genericPage = new GenericPage();
	}

	public void enterUserName() {
		waitUntilElementToBeClickable(loginPage.getCmpUserName());
		writeText(execution.getUsername(), loginPage.getCmpUserName());
	}

	public void enterPassWord() {
		waitUntilElementToBeClickable(loginPage.getCmpPassword());
		writeText(execution.getPassword(), loginPage.getCmpPassword());
	}

	public void clickOnSignIn() {
		waitUntilElementToBeClickable(loginPage.getBtnLogar());
		click(loginPage.getBtnLogar());
	}

	public void validateLoginSuccessfully() {
		waitForDesiredElementPresence(genericPage.getUserNameIcon());

		String user = driver.findElement(genericPage.getUserNameIcon()).getText();
		String userData = execution.getUsername();

		if (!user.isEmpty() && user.contains(userData)) {
			System.out.println("The customer successfully logged in.");
			assertTrue(true);
		} else {
			System.out.println(
					"The message confirming the customer's successful login is either empty or does not match the expected data.");
			assertTrue(false);
		}
	}
}
