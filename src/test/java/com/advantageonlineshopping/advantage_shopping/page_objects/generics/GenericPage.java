package com.advantageonlineshopping.advantage_shopping.page_objects.generics;

import org.openqa.selenium.By;

public class GenericPage {

	private String msgFinal = "//*[contains(text(),'%1$s')]";
	private By btnUser = By.cssSelector("#menuUserLink");
	private By userNameIcon = By.xpath("//span[@class='hi-user containMiniTitle ng-binding']");

	public String getMsgFinal() {
		return msgFinal;
	}

	public By getUserNameIcon() {
		return userNameIcon;
	}

	public By getBtnUser() {
		return btnUser;
	}
}
