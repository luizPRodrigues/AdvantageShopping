package com.advantageonlineshopping.advantage_shopping.core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	protected static ChromeDriver driver;
	protected static WebDriverWait wait;
	
	public static ChromeDriver createChrome() {
		if (driver == null) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			wait = new WebDriverWait(driver, 12);
		}
		return driver;
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
