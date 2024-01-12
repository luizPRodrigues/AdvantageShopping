package com.advantageonlineshopping.advantage_shopping.page_objects.comprar_produto;

import org.openqa.selenium.WebElement;

import com.advantageonlineshopping.advantage_shopping.utils.RandomUtils;
import com.advantageonlineshopping.advantage_shopping.utils.WebActions;

public class ComprarProdutoLogic extends WebActions {

	private ComprarProdutoPage comprarProdutoPage;
	private RandomUtils randomUtils;

	public ComprarProdutoLogic() {
		comprarProdutoPage = new ComprarProdutoPage();
		randomUtils = new RandomUtils();
	}

	public void searchByProduct(String product) {
		waitUntilElementToBeClickable(comprarProdutoPage.getBtnMenuSearch());
		click(comprarProdutoPage.getBtnMenuSearch());
		waitUntilElementToBeClickable(comprarProdutoPage.getCmpSearch());
		writeText(product, comprarProdutoPage.getCmpSearch());
		waitUntilElementToBeClickable(comprarProdutoPage.getProduct());
		click(comprarProdutoPage.getProduct());
	}

	public void selectAddToCart() {
		waitUntilElementToBeClickable(comprarProdutoPage.getBtnAddToCart());
		click(comprarProdutoPage.getBtnAddToCart());
	}

	public void selectMenuCart() {
		waitUntilElementToBeClickable(comprarProdutoPage.getBtnMenuCart());
		click(comprarProdutoPage.getBtnMenuCart());
	}

	public void selectCheckOut() {
		waitUntilElementToBeClickable(comprarProdutoPage.getBtnCheckOut());
		click(comprarProdutoPage.getBtnCheckOut());
	}

	public void selectToNext() {
		waitUntilElementToBeClickable(comprarProdutoPage.getBtnNext());
		click(comprarProdutoPage.getBtnNext());
	}

	public void choosePaymentMethod(String paymentMethod) {
		System.out.println("************************selecting payment method************************");
		switch (paymentMethod) {
		case "SafePay":
			WebElement safePayOption = findElement(comprarProdutoPage.getSafePayOpt());
			if (!safePayOption.isSelected()) {
				System.out.println(
						"************************Condition for non-selection (SafePay) is met.************************");
				waitUntilElementToBeClickable(comprarProdutoPage.getSafePayOpt());
				click(comprarProdutoPage.getSafePayOpt());
				waitUntilElementToBeClickable(comprarProdutoPage.getCmpUserPay());
				writeText(randomUtils.generateRandomString(6), comprarProdutoPage.getCmpUserPay());
				waitUntilElementToBeClickable(comprarProdutoPage.getCmpPasswordPay());
				writeText("userPay", comprarProdutoPage.getCmpPasswordPay());
				waitUntilElementToBeClickable(comprarProdutoPage.getBtnSafePayNow());
				click(comprarProdutoPage.getBtnSafePayNow());
			} else {
				System.out.println("************************SafePay is already selected.************************");
				waitUntilElementToBeClickable(comprarProdutoPage.getCmpUserPay());
				writeText(randomUtils.generateRandomString(6), comprarProdutoPage.getCmpUserPay());
				waitUntilElementToBeClickable(comprarProdutoPage.getCmpPasswordPay());
				writeText("userPay12", comprarProdutoPage.getCmpPasswordPay());
				waitUntilElementToBeClickable(comprarProdutoPage.getBtnSafePayNow());
				click(comprarProdutoPage.getBtnSafePayNow());
			}
			break;
		case "MasterCredit":
			System.out.println(
					"************************Condition for non-selection (MasterCredit) is met.************************");
			waitForDesiredElementPresence(comprarProdutoPage.getMasterCreditOpt());
			click(comprarProdutoPage.getMasterCreditOpt());
			WebElement cardNumSaved = findElement(comprarProdutoPage.getCardNumSaved());
			if (!cardNumSaved.isDisplayed()) {
				waitUntilElementToBeClickable(comprarProdutoPage.getCmpcardNumber());
				writeText("1234 5678 9111", comprarProdutoPage.getCmpcardNumber());
				waitUntilElementToBeClickable(comprarProdutoPage.getCmpCvvNumber());
				writeText("1123", comprarProdutoPage.getCmpCvvNumber());
				selectComboByVisibleText(comprarProdutoPage.getOptMonth(), "12");
				selectComboByVisibleText(comprarProdutoPage.getOptYear(), "2024");
				writeText("Test Holder Name", comprarProdutoPage.getCmpCardName());
				waitUntilElementToBeClickable(comprarProdutoPage.getBtnMasterCreditPayNow());
				click(comprarProdutoPage.getBtnMasterCreditPayNow());
			} else {
				System.out.println("************************MasterCredit is already saved.************************");
				waitUntilElementToBeClickable(comprarProdutoPage.getBtnMasterCreditPayNow());
				click(comprarProdutoPage.getBtnMasterCreditPayNow());
			}
			break;
		default:
			System.err.println("************************Error: Unsupported payment method - ************************"
					+ paymentMethod);
			break;
		}
	}

}
