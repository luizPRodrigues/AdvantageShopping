package com.advantageonlineshopping.advantage_shopping.page_objects.delete_account;

import org.openqa.selenium.By;

public class DeleteAccountPage {

	private By myAccount = By.cssSelector(".option.roboto-medium.ng-scope[translate='My_account']");
	private By btnDeleteAccount = By.cssSelector(".deleteBtnText");
	private By popUpDelAlert = By.cssSelector(".deletePopupBtn.deleteRed");
	private By accountDetais = By.cssSelector(".roboto-regular.sticky.fixedImportant.ng-scope");

	public By getMyAccount() {
		return myAccount;
	}

	public By getBtnDeleteAccount() {
		return btnDeleteAccount;
	}

	public By getPopUpDelAlert() {
		return popUpDelAlert;
	}

	public By getAccountDetais() {
		return accountDetais;
	}
}
