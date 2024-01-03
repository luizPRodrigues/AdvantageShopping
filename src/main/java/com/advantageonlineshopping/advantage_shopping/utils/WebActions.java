package com.advantageonlineshopping.advantage_shopping.utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.advantageonlineshopping.advantage_shopping.core.DriverFactory;

import io.cucumber.java.Status;
import static org.junit.Assert.assertEquals;

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

	public void waitUntilElementToBeClickable(By elemento) {
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

	public static void waitElementBeVisible(By element, Integer tempo) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

	public static void writeText(String text, By cmp) {
		if (findSomeElement(cmp).isDisplayed()) {
			findSomeElement(cmp).clear();
			sleep(500);
			findSomeElement(cmp).sendKeys(text);
		}
	}

	public static void selectComboByVisibleText(By by, String visibleText) {
		WebElement element = findSomeElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(visibleText);
	}

	public void screenShot(Status status, String testName) {
		try {
			TakesScreenshot fonte = (TakesScreenshot) DriverFactory.createChrome();
			File fnt = fonte.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fnt,
					new File("Evidences" + File.separator + status + File.separator + testName + ".jpg"));
		} catch (Exception e) {
			System.out.println("Error in writing file.");
		}
	}

	public void checkMessage(By element, String expectedessage) {
		String actualMessage = "";

		waitElementBeVisible(element, 10000);
		actualMessage = getWebDriver().findElement(element).getText();
		assertEquals("Error validating message! ", expectedessage, actualMessage);
	}

}
