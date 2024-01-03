package com.advantageonlineshopping.advantage_shopping.page_objects.generics;

import org.openqa.selenium.By;

public class GenericPage {

	private By btnUser = By.id("menuUserSVGPath");
	private By userNameIcon = By.xpath("//span[@class='hi-user containMiniTitle ng-binding']");

	public By getUserNameIcon() {
		return userNameIcon;
	}

	public By getBtnUser() {
		return btnUser;
	}
}
