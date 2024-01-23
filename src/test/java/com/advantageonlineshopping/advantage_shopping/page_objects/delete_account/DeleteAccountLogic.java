package com.advantageonlineshopping.advantage_shopping.page_objects.delete_account;

import org.openqa.selenium.WebElement;
import com.advantageonlineshopping.advantage_shopping.page_objects.generics.GenericPage;
import com.advantageonlineshopping.advantage_shopping.page_objects.login.LoginPage;
import com.advantageonlineshopping.advantage_shopping.utils.WebActions;
import com.advantageonlineshopping.advantage_shopping.utils.property.DynamicPropertiesManager;
import com.advantageonlineshopping.advantage_shopping.utils.property.Props;

public class DeleteAccountLogic extends WebActions {

	private DeleteAccountPage deleteAccountPage;
	private DynamicPropertiesManager dynamic;
	private LoginPage loginPage;
	private GenericPage genericPage;

	public DeleteAccountLogic() {
		deleteAccountPage = new DeleteAccountPage();
		loginPage = new LoginPage();
		dynamic = new DynamicPropertiesManager();
		genericPage = new GenericPage();
	}

	public void setMyUsername() {
		waitUntilElementToBeClickable(loginPage.getCmpUserName());
		writeText(dynamic.getInstance().getProperty(Props.USERDEL), loginPage.getCmpUserName());
	}

	public void setMyPassword() {
		waitUntilElementToBeClickable(loginPage.getCmpPassword());
		writeText(dynamic.getInstance().getProperty(Props.PWDDEL), loginPage.getCmpPassword());

	}

	public void selectMyAccount() {
		waitUntilElementToBeClickable(genericPage.getBtnUser());
		WebElement userClick = findElement(genericPage.getBtnUser());
		clickOnElement(userClick);

		waitUntilElementToBeClickable(deleteAccountPage.getMyAccount());
		WebElement myAccount = findElement(deleteAccountPage.getMyAccount());
		clickOnElement(myAccount);

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
	}

}
