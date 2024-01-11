package com.advantageonlineshopping.advantage_shopping.page_objects.comprar_produto;

import org.openqa.selenium.By;

public class ComprarProdutoPage {

	private By btnMenuSearch = By.xpath("(//*[@id='menuSearch'])[1]");
	private By cmpSearch = By.cssSelector("#autoComplete");
	private By product = By.cssSelector("p[class='roboto-regular ng-binding']");
	private By btnAddToCart = By.name("save_to_cart");
	private By btnMenuCart = By.id("menuCart");
	private By btnCheckOut = By.id("checkOutButton");
	private By btnNext = By.id("next_btn");
	private By safePayOpt = By.cssSelector("input[name='safepay']");
	private By cmpUserPay = By.cssSelector("input[name='safepay_username']");
	private By cmpPasswordPay = By.cssSelector("input[name='safepay_password']");

	private By cardNumSaved = By.cssSelector("label[data-ng-click='toggleShowMasterCart()']");
	private By masterCreditOpt = By.xpath("//input[@name='masterCredit']");
	private By cmpcardNumber = By.cssSelector("#creditCard");
	private By cmpCvvNumber = By.name("cvv_number");

	private By optMonth = By.cssSelector("select[name='mmListbox']");
	private By optYear = By.cssSelector("select[name='yyyyListbox']");
	private By cmpCardName = By.cssSelector("input[name='cardholder_name']");

	private By btnSafePayNow = By.cssSelector("#pay_now_btn_SAFEPAY");

	private By btnMasterCreditPayNow = By.cssSelector("#pay_now_btn_MasterCredit");

	public By getBtnMenuSearch() {
		return btnMenuSearch;
	}

	public By getCardNumSaved() {
		return cardNumSaved;
	}

	public By getProduct() {
		return product;
	}

	public By getCmpSearch() {
		return cmpSearch;
	}

	public By getBtnAddToCart() {
		return btnAddToCart;
	}

	public By getBtnMenuCart() {
		return btnMenuCart;
	}

	public By getBtnCheckOut() {
		return btnCheckOut;
	}

	public By getBtnNext() {
		return btnNext;
	}

	public By getSafePayOpt() {
		return safePayOpt;
	}

	public By getCmpUserPay() {
		return cmpUserPay;
	}

	public By getCmpPasswordPay() {
		return cmpPasswordPay;
	}

	public By getMasterCreditOpt() {
		return masterCreditOpt;
	}

	public By getCmpcardNumber() {
		return cmpcardNumber;
	}

	public By getCmpCvvNumber() {
		return cmpCvvNumber;
	}

	public By getOptMonth() {
		return optMonth;
	}

	public By getOptYear() {
		return optYear;
	}

	public By getCmpCardName() {
		return cmpCardName;
	}

	public By getBtnSafePayNow() {
		return btnSafePayNow;
	}

	public By getBtnMasterCreditPayNow() {
		return btnMasterCreditPayNow;
	}

}
