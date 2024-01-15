package com.advantageonlineshopping.advantage_shopping.page_objects.comprar_produto;

import io.cucumber.java.en.And;

public class ComprarProdutoStep {

	ComprarProdutoLogic comprarProdutoLogic;

	public ComprarProdutoStep() {
		comprarProdutoLogic = new ComprarProdutoLogic();
	}

	@And("I search by a specific product {string}")
	public void iSearchByASpecificProduct(String product) {
		comprarProdutoLogic.searchByProduct(product);
	}

	@And("I select to add to cart")
	public void iSelectToAddToCart() {
		comprarProdutoLogic.selectAddToCart();

	}

	@And("I select menu cart")
	public void iSelectMenuCart() {
		comprarProdutoLogic.selectMenuCart();

	}

	@And("I select to checkout")
	public void iSelectToCheckout() {
		comprarProdutoLogic.selectCheckOut();

	}

	@And("I select to next")
	public void iSelectToNext() {
		comprarProdutoLogic.selectToNext();

	}

	@And("I choose the payment method {string}")
	public void iChooseThePaymentMethod(String paymentMethod) {
		comprarProdutoLogic.choosePaymentMethod(paymentMethod);
	}

	@And("I set the Order Number")
	public void setOrderNumber() {
		comprarProdutoLogic.setOrderNumber();
	}

}
