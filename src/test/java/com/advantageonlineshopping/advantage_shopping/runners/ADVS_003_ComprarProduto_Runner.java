package com.advantageonlineshopping.advantage_shopping.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/advantageonlineshopping/advantage_shopping/features/ADVS_003_ComprarProduto.feature",
        glue = {""},
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        snippets = SnippetType.CAMELCASE,
        dryRun = false
        )

public class ADVS_003_ComprarProduto_Runner {

}
