package com.advantageonlineshopping.advantage_shopping.page_objects.delete_account;

import org.openqa.selenium.WebElement;
import com.advantageonlineshopping.advantage_shopping.page_objects.generics.GenericPage;
import com.advantageonlineshopping.advantage_shopping.page_objects.login.LoginPage;
import com.advantageonlineshopping.advantage_shopping.utils.WebActions;
import com.advantageonlineshopping.advantage_shopping.utils.bd.DAO;
import com.advantageonlineshopping.advantage_shopping.utils.property.Props;

public class DeleteAccountLogic extends WebActions {

	private DeleteAccountPage deleteAccountPage;
	private DAO dao;
	private LoginPage loginPage;
	private GenericPage genericPage;

	public DeleteAccountLogic() {
		deleteAccountPage = new DeleteAccountPage();
		loginPage = new LoginPage();
		dao = new DAO();
		genericPage = new GenericPage();
	}

	public void setMyUsername() {
		waitUntilElementToBeClickable(loginPage.getCmpUserName());
		writeText(dao.readData(1, Props.USERCOLUMN, String.class), loginPage.getCmpUserName());
	}

	public void setMyPassword() {
		waitUntilElementToBeClickable(loginPage.getCmpPassword());
		writeText(dao.readData(2, Props.PASSWORDCOLUMN, String.class), loginPage.getCmpPassword());

	}

	public void selectMyAccount() {
		waitUntilElementToBeClickable(genericPage.getBtnUser());
		WebElement userClick = findElement(genericPage.getBtnUser());
		clickOnElement(userClick);
		try {
			waitUntilElementToBeClickable(deleteAccountPage.getMyAccount());
			WebElement myAccount = findElement(deleteAccountPage.getMyAccount());
			clickOnElement(myAccount);
		} catch (Exception e) {
			System.out.println("button to select account doesn't visible");
			dao.truncateTable(Props.USERTABLE);
		}

	}

	private void clickOnDeleteAccount() {
		waitElementBeVisible(deleteAccountPage.getAccountDetais(), 6);
		WebElement delAccount = findElement(deleteAccountPage.getBtnDeleteAccount());
		scroll(delAccount);
		if (delAccount.isDisplayed()) {
			click(deleteAccountPage.getBtnDeleteAccount());
		} else {
			System.out.println("button doesn't visible");
		}
	}

	private void acceptAlertDeleteAccount() {
		waitElementBeVisible(deleteAccountPage.getPopUpDelAlert(), 6);
		click(deleteAccountPage.getPopUpDelAlert());
	}

	public void deleteAccount() {
		clickOnDeleteAccount();
		acceptAlertDeleteAccount();
		dao.truncateTable(Props.USERTABLE);
	}

}
