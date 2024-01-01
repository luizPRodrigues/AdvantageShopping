package com.advantageonlineshopping.advantage_shopping.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.advantageonlineshopping.advantage_shopping.core.DriverFactory;

public class WebActions extends DriverFactory {

	public static WebDriver getWebDriver() {
		return driver;
	}

	public static void click(By element) {
		findElement(element).click();
	}

	public static WebElement findElement(By elemento) {
		return driver.findElement(elemento);
	}

	public void waitUntilelementToBeClickable(By elemento) {
		wait.until(ExpectedConditions.elementToBeClickable(elemento));
	}

	public static WebElement findSomeElement(By elemento) {
		return driver.findElement(elemento);
	}

	public static void sleep(int iTimeInMillis) {
		try {
			Thread.sleep(iTimeInMillis);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	public void waitForDesiredElementPresence(By elemento) {
		wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
	}

	public static void writeText(String text, By cmp) {
		if (findSomeElement(cmp).isDisplayed()) {
			findSomeElement(cmp).clear();
			sleep(500);
			findSomeElement(cmp).sendKeys(text);
		}
	}

}
