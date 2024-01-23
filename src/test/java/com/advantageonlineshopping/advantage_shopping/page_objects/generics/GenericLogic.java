package com.advantageonlineshopping.advantage_shopping.page_objects.generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.advantageonlineshopping.advantage_shopping.utils.WebActions;
import com.advantageonlineshopping.advantage_shopping.utils.property.Props;

public class GenericLogic extends WebActions {

	private GenericPage genericPage;

	public GenericLogic() {
		genericPage = new GenericPage();
	}

	public void navigateToTheHomepageOfTheBanksWebsite() {
		createChrome().get(Props.URL);
	}

	public void clickOnMenuUser() {
		waitUntilElementToBeClickable(genericPage.getBtnUser());
		WebElement userClick = findElement(genericPage.getBtnUser());
		clickOnElement(userClick);
	}

	public void validateTheFinalMessage(String msgFinal) {
		String message = String.format(genericPage.getMsgFinal(), msgFinal);
		WebElement xpathMessage = driver.findElement(By.xpath(message));
		try {
			wait.until(ExpectedConditions.visibilityOf(xpathMessage));
			System.out.println(msgFinal + "Final message validated successfully.");
			sleep(5);
		} catch (Exception e) {
			System.out.println("Error: Final message validation failed.");
		}

	}
}
