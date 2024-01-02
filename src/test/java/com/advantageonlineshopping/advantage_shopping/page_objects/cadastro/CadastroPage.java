package com.advantageonlineshopping.advantage_shopping.page_objects.cadastro;

import org.openqa.selenium.By;

public class CadastroPage {

	private By btnUser = By.id("menuUserSVGPath");
	private By btnCreateAccount = By.xpath("//a[contains(text(),'CREATE NEW ACCOUNT')]");
	private By cmpUserName = By.xpath("//input[@name='usernameRegisterPage']");
	private By cmpEmail = By.xpath("//input[@name='emailRegisterPage']");
	private By cmpPassWord = By.xpath("//input[@name='passwordRegisterPage']");
	private By cmpConfirmPassWord = By.xpath("//input[@name='confirm_passwordRegisterPage']");
	private By cmpFirstName = By.xpath("//input[@name='first_nameRegisterPage']");
	private By cmpLastName = By.xpath("//input[@name='last_nameRegisterPage']");
	private By cmpPhoneNumber = By.xpath("//input[@name='phone_numberRegisterPage']");
	private By cmpCountry = By.xpath("//select[@name='countryListboxRegisterPage']");
	private By cmpCity = By.xpath("//input[@name='cityRegisterPage']");
	private By cmpAdress = By.xpath("//input[@name='addressRegisterPage']");
	private By cmpRegion = By.xpath("//input[@name='state_/_province_/_regionRegisterPage']");
	private By cmpPostalCode = By.xpath("//input[@name='postal_codeRegisterPage']");
	private By bxAgree = By.xpath("//input[@name='i_agree']");
	private By btnRegister = By.xpath("//*[text()='REGISTER']");
	private By userNameIcon = By.xpath("//span[@class='hi-user containMiniTitle ng-binding']");

	public By getBtnUser() {
		return btnUser;
	}

	public By getBtnCreateAccount() {
		return btnCreateAccount;
	}

	public By getCmpUserName() {
		return cmpUserName;
	}

	public By getCmpEmail() {
		return cmpEmail;
	}

	public By getCmpPassWord() {
		return cmpPassWord;
	}

	public By getCmpConfirmPassWord() {
		return cmpConfirmPassWord;
	}

	public By getCmpFirstName() {
		return cmpFirstName;
	}

	public By getCmpLastName() {
		return cmpLastName;
	}

	public By getCmpPhoneNumber() {
		return cmpPhoneNumber;
	}

	public By getCmpCountry() {
		return cmpCountry;
	}

	public By getCmpCity() {
		return cmpCity;
	}

	public By getCmpAdress() {
		return cmpAdress;
	}

	public By getCmpRegion() {
		return cmpRegion;
	}

	public By getCmpPostalCode() {
		return cmpPostalCode;
	}

	public By getBxAgree() {
		return bxAgree;
	}

	public By getBtnRegister() {
		return btnRegister;
	}

	public By getUserNameIcon() {
		return userNameIcon;
	}

	public By setUserNameIcon() {
		return userNameIcon;
	}

}
