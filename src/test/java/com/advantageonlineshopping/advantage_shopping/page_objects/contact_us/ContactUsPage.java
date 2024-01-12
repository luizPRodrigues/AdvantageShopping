package com.advantageonlineshopping.advantage_shopping.page_objects.contact_us;

import org.openqa.selenium.By;

public class ContactUsPage {

	private By btnContactUs = By.cssSelector("li:nth-child(5) a:nth-child(1)");
	private By btnCategory = By.cssSelector("select[name='categoryListboxContactUs']");
	private By btnProductOpt = By.cssSelector("select[name='productListboxContactUs']");
	private By cmpEmailAdress = By.cssSelector("input[name='emailContactUs']");
	private By cmpSubject = By.cssSelector("textarea[name='subjectTextareaContactUs']");
	private By btnSend = By.id("send_btn");
	private By msgFinal = By.cssSelector(".roboto-regular.successMessage.ng-binding");

	public By getMsgFinal() {
		return msgFinal;
	}

	public By getBtnContactUs() {
		return btnContactUs;
	}

	public By getBtnCategory() {
		return btnCategory;
	}

	public By getBtnProductOpt() {
		return btnProductOpt;
	}

	public By getCmpEmailAdress() {
		return cmpEmailAdress;
	}

	public By getCmpSubject() {
		return cmpSubject;
	}

	public By getBtnSend() {
		return btnSend;
	}

}
