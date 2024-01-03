package com.advantageonlineshopping.advantage_shopping.page_objects.login;

import org.openqa.selenium.By;

public class LoginPage {

	private By cmpUserName = By.xpath("//input[@name='username']");
	private By cmpPassword = By.xpath("//input[@name='password']");
	private By btnLogar = By.xpath("(//*[contains(text(),'SIGN IN')])[2]");

	public By getCmpUserName() {
		return cmpUserName;
	}

	public By getCmpPassword() {
		return cmpPassword;
	}

	public By getBtnLogar() {
		return btnLogar;
	}
}
