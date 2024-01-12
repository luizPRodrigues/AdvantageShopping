package com.advantageonlineshopping.advantage_shopping.page_objects.contact_us;

import org.openqa.selenium.WebElement;

import com.advantageonlineshopping.advantage_shopping.utils.WebActions;
import com.github.javafaker.Faker;

public class ContactUsLogic extends WebActions {

	ContactUsPage contactUsPage;
	Faker fakerData;

	public ContactUsLogic() {
		contactUsPage = new ContactUsPage();
		fakerData = new Faker();
	}

	public void selectContactUs() {
		waitUntilElementToBeClickable(contactUsPage.getBtnContactUs());
		WebElement contactUs = findElement(contactUsPage.getBtnContactUs());
		clickOnElement(contactUs);

	}

	public void chooseCategory(String category) {
		waitUntilElementToBeClickable(contactUsPage.getBtnCategory());
		selectComboByVisibleText(contactUsPage.getBtnCategory(), category);
	}

	public void selectProduct(String product) {
		waitUntilElementToBeClickable(contactUsPage.getBtnProductOpt());
		selectComboByVisibleText(contactUsPage.getBtnProductOpt(), product);
	}

	public void insertMyEmailAdress() {
		waitUntilElementToBeClickable(contactUsPage.getCmpEmailAdress());
		writeText(fakerData.internet().emailAddress(), contactUsPage.getCmpEmailAdress());
	}

	public void insertSubject() {
		waitUntilElementToBeClickable(contactUsPage.getCmpSubject());
		writeText(fakerData.lorem().sentence(), contactUsPage.getCmpSubject());
	}

	public void clickSendInformation() {
		waitUntilElementToBeClickable(contactUsPage.getBtnSend());
		WebElement btnSend = findElement(contactUsPage.getBtnSend());
		if (!btnSend.isEnabled()) {
			System.out.println(
					"************************The button is not enabled. It cannot be clicked.************************");
		} else {
			click(contactUsPage.getBtnSend());
		}
	}

	public void IValidateTheFinalMessageWithSuccess(String msgFinal) {
		checkMessage(contactUsPage.getMsgFinal(), msgFinal);
	}

}
