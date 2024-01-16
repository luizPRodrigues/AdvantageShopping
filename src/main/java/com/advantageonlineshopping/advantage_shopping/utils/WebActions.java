package com.advantageonlineshopping.advantage_shopping.utils;

import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import com.advantageonlineshopping.advantage_shopping.core.DriverFactory;
import io.cucumber.java.Status;
import lombok.extern.log4j.Log4j2;
import static org.junit.Assert.assertEquals;

@Log4j2
public class WebActions extends DriverFactory {

	private static final Integer MEDIUMSECONDS = Time._10.amount();
	private static final Integer DEFAULTPOLLINGSECONDS = Time._1.amount();
	private static final Integer DEFAULTTIMEOUTSECONDS = Time._60.amount();

	public static WebDriver getWebDriver() {
		return driver;
	}

	public static void click(By element) {
		findElement(element).click();
	}

	/**
	 * Click in element with differents attempts
	 * 
	 * @param webElement
	 */
	public void clickOnElement(WebElement webElement) {
		fluentlyWaitUntilClickable(webElement);
		try {
			executeJS("arguments[0].click();", webElement);
		} catch (StaleElementReferenceException ex) {
			webElement.click();
		} catch (WebDriverException ex) {
			WebActions.sleep(MEDIUMSECONDS);
			webElement.click();
			log.warn(ex.getMessage());
		}
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

	/**
	 * Sleep thread in seconds
	 * 
	 * @param seconds
	 */
	public static void sleep(Integer seconds) {
		try {
			Thread.sleep(seconds * 1000l);
		} catch (InterruptedException e) {
			log.error(e.getMessage());
			Thread.currentThread().interrupt();
		}

	}

	public void waitForDesiredElementPresence(By elemento) {
		wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
	}

	public static void waitElementBeVisible(By element, Integer tempo) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

	/**
	 * Return WebElement, after fluently wait element to be clickable
	 * 
	 * @param element
	 * @param timeoutInSeconds
	 * @param pollingInSeconds
	 * @return WebElement
	 */
	private WebElement fluentlyWaitUntilClickable(WebElement element, Integer timeoutInSeconds,
			Integer pollingInSeconds) {
		return (new FluentWait<WebDriver>(driver)) //
				.withTimeout(Duration.ofSeconds(timeoutInSeconds)) //
				.pollingEvery(Duration.ofSeconds(pollingInSeconds)) //
				.ignoring(StaleElementReferenceException.class) //
				.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void writeText(String text, By cmp) {
		if (findSomeElement(cmp).isDisplayed()) {
			findSomeElement(cmp).clear();
			sleep(5);
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

	/**
	 * Validated a message
	 * 
	 * @param element
	 * @param expectedessage
	 */

	public void checkMessage(By element, String expectedMessage) {
		String actualMessage = "";

		waitElementBeVisible(element, 10000);
		actualMessage = getWebDriver().findElement(element).getText();
		assertEquals("Error validating message! ", expectedMessage, actualMessage);
	}

//	/**
//	 * Return WebElement, after fluently wait element to be clickable
//	 * 
//	 * @param element
//	 * @return WebElement
//	 */
	private WebElement fluentlyWaitUntilClickable(WebElement element) {
		return fluentlyWaitUntilClickable(element, DEFAULTTIMEOUTSECONDS, DEFAULTPOLLINGSECONDS);
	}

//
//	/**
//	 * Click in element with selenium
//	 * 
//	 * @param webElement
//	 */
	public void clickSelenium(WebElement webElement) {
		fluentlyWaitUntilClickable(webElement);
		webElement.click();
	}

//	/**
//	 * Select element by index, after wait until to be clickable
//	 * 
//	 * @param element
//	 * @param index
//	 */
	public void selectElementByIndex(WebElement element, Integer index) {
		try {
			Select dropdown = new Select(fluentlyWaitUntilClickable(element));
			dropdown.selectByIndex(index);
		} catch (Exception ex) {
			log.error("Error selecting option by index");
		}
	}

	// ********************* JS ************************

	/**
	 * Execute Java Script
	 * 
	 * @param cmd
	 * @param param
	 * @return Object
	 */
	public Object executeJS(String cmd, Object... param) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(cmd, param);
	}

	/**
	 * Scroll to element
	 * 
	 * @param element
	 */
	public void scroll(WebElement element) {
		executeJS("arguments[0].scrollIntoView(true);", element);
	}

	/**
	 * Scroll to position
	 * 
	 * @param scroll
	 */
	public void scroll(int scroll) {
		executeJS("window.scrollBy(0," + scroll + ")", "");
	}

}
