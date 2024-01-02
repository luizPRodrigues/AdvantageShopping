package com.advantageonlineshopping.advantage_shopping.core;

import com.advantageonlineshopping.advantage_shopping.utils.WebActions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends DriverFactory {
	@Before
    public void browserInitializer(Scenario test) {
        System.out.println("Starting test: " + test.getName());
    }

    @After
    public void endTest(Scenario test) {
        new WebActions().screenShot(test.getStatus(), test.getName());
        System.out.println("Test ended. Status of the test: " + test.getStatus());
        quitDriver();
    }

}
